package typingsSlinky.pulumiKubernetes.inputMod.core.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
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
  var configMapRef: js.UndefOr[Input[ConfigMapEnvSource]] = js.native
  /**
    * An optional identifier to prepend to each key in the ConfigMap. Must be a C_IDENTIFIER.
    */
  var prefix: js.UndefOr[Input[String]] = js.native
  /**
    * The Secret to select from
    */
  var secretRef: js.UndefOr[Input[SecretEnvSource]] = js.native
}

object EnvFromSource {
  @scala.inline
  def apply(): EnvFromSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvFromSource]
  }
  @scala.inline
  implicit class EnvFromSourceOps[Self <: EnvFromSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfigMapRef(value: Input[ConfigMapEnvSource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configMapRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigMapRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configMapRef")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefix(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(js.undefined)
        ret
    }
    @scala.inline
    def withSecretRef(value: Input[SecretEnvSource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secretRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecretRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secretRef")(js.undefined)
        ret
    }
  }
  
}

