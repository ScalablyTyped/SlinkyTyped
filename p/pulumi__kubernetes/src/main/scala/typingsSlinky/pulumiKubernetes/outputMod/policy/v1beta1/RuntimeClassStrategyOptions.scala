package typingsSlinky.pulumiKubernetes.outputMod.policy.v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * RuntimeClassStrategyOptions define the strategy that will dictate the allowable
  * RuntimeClasses for a pod.
  */
@js.native
trait RuntimeClassStrategyOptions extends js.Object {
  /**
    * allowedRuntimeClassNames is a whitelist of RuntimeClass names that may be specified on a
    * pod. A value of "*" means that any RuntimeClass name is allowed, and must be the only item
    * in the list. An empty list requires the RuntimeClassName field to be unset.
    */
  val allowedRuntimeClassNames: js.Array[String] = js.native
  /**
    * defaultRuntimeClassName is the default RuntimeClassName to set on the pod. The default MUST
    * be allowed by the allowedRuntimeClassNames list. A value of nil does not mutate the Pod.
    */
  val defaultRuntimeClassName: String = js.native
}

object RuntimeClassStrategyOptions {
  @scala.inline
  def apply(allowedRuntimeClassNames: js.Array[String], defaultRuntimeClassName: String): RuntimeClassStrategyOptions = {
    val __obj = js.Dynamic.literal(allowedRuntimeClassNames = allowedRuntimeClassNames.asInstanceOf[js.Any], defaultRuntimeClassName = defaultRuntimeClassName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuntimeClassStrategyOptions]
  }
  @scala.inline
  implicit class RuntimeClassStrategyOptionsOps[Self <: RuntimeClassStrategyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowedRuntimeClassNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedRuntimeClassNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultRuntimeClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultRuntimeClassName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

