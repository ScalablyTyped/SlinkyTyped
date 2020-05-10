package typingsSlinky.awsSdk.autoscalingplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationSource extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of a AWS CloudFormation stack.
    */
  var CloudFormationStackARN: js.UndefOr[XmlString] = js.native
  /**
    * A set of tags (up to 50).
    */
  var TagFilters: js.UndefOr[typingsSlinky.awsSdk.autoscalingplansMod.TagFilters] = js.native
}

object ApplicationSource {
  @scala.inline
  def apply(): ApplicationSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationSource]
  }
  @scala.inline
  implicit class ApplicationSourceOps[Self <: ApplicationSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloudFormationStackARN(value: XmlString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloudFormationStackARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloudFormationStackARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloudFormationStackARN")(js.undefined)
        ret
    }
    @scala.inline
    def withTagFilters(value: TagFilters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TagFilters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TagFilters")(js.undefined)
        ret
    }
  }
  
}

