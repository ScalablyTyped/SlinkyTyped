package typingsSlinky.pulumiAws.inputMod.cloudtrail

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrailEventSelectorDataResource extends js.Object {
  /**
    * The resource type in which you want to log data events. You can specify only the following value: "AWS::S3::Object", "AWS::Lambda::Function"
    */
  var `type`: Input[String] = js.native
  /**
    * A list of ARN for the specified S3 buckets and object prefixes..
    */
  var values: Input[js.Array[Input[String]]] = js.native
}

object TrailEventSelectorDataResource {
  @scala.inline
  def apply(`type`: Input[String], values: Input[js.Array[Input[String]]]): TrailEventSelectorDataResource = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrailEventSelectorDataResource]
  }
  @scala.inline
  implicit class TrailEventSelectorDataResourceOps[Self <: TrailEventSelectorDataResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValues(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

