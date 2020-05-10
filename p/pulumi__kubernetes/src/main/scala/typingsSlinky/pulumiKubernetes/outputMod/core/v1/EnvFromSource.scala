package typingsSlinky.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * EnvFromSource represents the source of a set of ConfigMaps
  */
@js.native
trait EnvFromSource extends js.Object {
  /**
    * The ConfigMap to select from
    */
  val configMapRef: ConfigMapEnvSource = js.native
  /**
    * An optional identifier to prepend to each key in the ConfigMap. Must be a C_IDENTIFIER.
    */
  val prefix: String = js.native
  /**
    * The Secret to select from
    */
  val secretRef: SecretEnvSource = js.native
}

object EnvFromSource {
  @scala.inline
  def apply(configMapRef: ConfigMapEnvSource, prefix: String, secretRef: SecretEnvSource): EnvFromSource = {
    val __obj = js.Dynamic.literal(configMapRef = configMapRef.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], secretRef = secretRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvFromSource]
  }
  @scala.inline
  implicit class EnvFromSourceOps[Self <: EnvFromSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfigMapRef(value: ConfigMapEnvSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configMapRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecretRef(value: SecretEnvSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secretRef")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

