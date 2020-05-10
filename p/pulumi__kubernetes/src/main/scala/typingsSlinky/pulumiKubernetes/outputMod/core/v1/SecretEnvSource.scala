package typingsSlinky.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SecretEnvSource selects a Secret to populate the environment variables with.
  *
  * The contents of the target Secret's Data field will represent the key-value pairs as
  * environment variables.
  */
@js.native
trait SecretEnvSource extends js.Object {
  /**
    * Name of the referent. More info:
    * https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
    */
  val name: String = js.native
  /**
    * Specify whether the Secret must be defined
    */
  val optional: Boolean = js.native
}

object SecretEnvSource {
  @scala.inline
  def apply(name: String, optional: Boolean): SecretEnvSource = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecretEnvSource]
  }
  @scala.inline
  implicit class SecretEnvSourceOps[Self <: SecretEnvSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptional(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optional")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

