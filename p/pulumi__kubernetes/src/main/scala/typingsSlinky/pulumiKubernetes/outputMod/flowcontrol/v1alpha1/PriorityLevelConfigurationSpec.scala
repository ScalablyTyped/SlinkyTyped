package typingsSlinky.pulumiKubernetes.outputMod.flowcontrol.v1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PriorityLevelConfigurationSpec specifies the configuration of a priority level.
  */
@js.native
trait PriorityLevelConfigurationSpec extends js.Object {
  /**
    * `limited` specifies how requests are handled for a Limited priority level. This field must
    * be non-empty if and only if `type` is `"Limited"`.
    */
  val limited: LimitedPriorityLevelConfiguration = js.native
  /**
    * `type` indicates whether this priority level is subject to limitation on request execution.
    * A value of `"Exempt"` means that requests of this priority level are not subject to a limit
    * (and thus are never queued) and do not detract from the capacity made available to other
    * priority levels.  A value of `"Limited"` means that (a) requests of this priority level
    * _are_ subject to limits and (b) some of the server's limited capacity is made available
    * exclusively to this priority level. Required.
    */
  val `type`: String = js.native
}

object PriorityLevelConfigurationSpec {
  @scala.inline
  def apply(limited: LimitedPriorityLevelConfiguration, `type`: String): PriorityLevelConfigurationSpec = {
    val __obj = js.Dynamic.literal(limited = limited.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PriorityLevelConfigurationSpec]
  }
  @scala.inline
  implicit class PriorityLevelConfigurationSpecOps[Self <: PriorityLevelConfigurationSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLimited(value: LimitedPriorityLevelConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limited")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

