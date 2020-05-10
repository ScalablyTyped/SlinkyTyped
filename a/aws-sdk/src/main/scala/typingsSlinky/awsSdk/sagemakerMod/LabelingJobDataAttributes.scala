package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabelingJobDataAttributes extends js.Object {
  /**
    * Declares that your content is free of personally identifiable information or adult content. Amazon SageMaker may restrict the Amazon Mechanical Turk workers that can view your task based on this information.
    */
  var ContentClassifiers: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.ContentClassifiers] = js.native
}

object LabelingJobDataAttributes {
  @scala.inline
  def apply(): LabelingJobDataAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelingJobDataAttributes]
  }
  @scala.inline
  implicit class LabelingJobDataAttributesOps[Self <: LabelingJobDataAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentClassifiers(value: ContentClassifiers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContentClassifiers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentClassifiers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContentClassifiers")(js.undefined)
        ret
    }
  }
  
}

