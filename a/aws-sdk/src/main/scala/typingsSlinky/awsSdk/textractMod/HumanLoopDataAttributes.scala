package typingsSlinky.awsSdk.textractMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HumanLoopDataAttributes extends js.Object {
  /**
    * Sets whether the input image is free of personally identifiable information or adult content.
    */
  var ContentClassifiers: js.UndefOr[typingsSlinky.awsSdk.textractMod.ContentClassifiers] = js.native
}

object HumanLoopDataAttributes {
  @scala.inline
  def apply(): HumanLoopDataAttributes = {
    val __obj = js.Dynamic.literal()
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
    @scala.inline
    def withoutContentClassifiers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContentClassifiers")(js.undefined)
        ret
    }
  }
  
}

