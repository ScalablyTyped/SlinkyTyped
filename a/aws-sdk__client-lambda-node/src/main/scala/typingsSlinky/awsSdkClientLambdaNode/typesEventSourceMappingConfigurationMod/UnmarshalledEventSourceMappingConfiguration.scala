package typingsSlinky.awsSdkClientLambdaNode.typesEventSourceMappingConfigurationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledEventSourceMappingConfiguration extends EventSourceMappingConfiguration {
  /**
    * <p>The UTC time string indicating the last time the event mapping was updated.</p>
    */
  @JSName("LastModified")
  var LastModified_UnmarshalledEventSourceMappingConfiguration: js.UndefOr[js.Date] = js.native
}

object UnmarshalledEventSourceMappingConfiguration {
  @scala.inline
  def apply(): UnmarshalledEventSourceMappingConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledEventSourceMappingConfiguration]
  }
  @scala.inline
  implicit class UnmarshalledEventSourceMappingConfigurationOps[Self <: UnmarshalledEventSourceMappingConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLastModified(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModified: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModified")(js.undefined)
        ret
    }
  }
  
}

