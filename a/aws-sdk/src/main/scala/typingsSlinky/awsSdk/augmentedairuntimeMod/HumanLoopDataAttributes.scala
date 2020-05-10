package typingsSlinky.awsSdk.augmentedairuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HumanLoopDataAttributes extends js.Object {
  /**
    * Declares that your content is free of personally identifiable information or adult content. Amazon SageMaker can restrict the Amazon Mechanical Turk workers who can view your task based on this information.
    */
  var ContentClassifiers: typingsSlinky.awsSdk.augmentedairuntimeMod.ContentClassifiers = js.native
}

object HumanLoopDataAttributes {
  @scala.inline
  def apply(ContentClassifiers: ContentClassifiers): HumanLoopDataAttributes = {
    val __obj = js.Dynamic.literal(ContentClassifiers = ContentClassifiers.asInstanceOf[js.Any])
    __obj.asInstanceOf[HumanLoopDataAttributes]
  }
  @scala.inline
  implicit class HumanLoopDataAttributesOps[Self <: HumanLoopDataAttributes] (val x: Self) extends AnyVal {
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
  }
  
}

