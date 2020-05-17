package typingsSlinky.activexLibreoffice.com_.sun.star.awt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a set of properties to describe the model of an {@link UnoControl} which is embedded in a {@link UnoControlDialogModel} . */
@js.native
trait UnoControlDialogElement extends js.Object {
  /** specifies the height of the control. */
  var Height: Double = js.native
  /** specifies the name of the control. */
  var Name: String = js.native
  /** specifies the horizontal position of the control. */
  var PositionX: String = js.native
  /** specifies the vertical position of the control. */
  var PositionY: String = js.native
  /** specifies the step of the control. */
  var Step: Double = js.native
  /** specifies the tabindex of the control. */
  var TabIndex: Double = js.native
  /** specifies the tag of the control. */
  var Tag: String = js.native
  /** specifies the width of the control. */
  var Width: Double = js.native
}

object UnoControlDialogElement {
  @scala.inline
  def apply(
    Height: Double,
    Name: String,
    PositionX: String,
    PositionY: String,
    Step: Double,
    TabIndex: Double,
    Tag: String,
    Width: Double
  ): UnoControlDialogElement = {
    val __obj = js.Dynamic.literal(Height = Height.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PositionX = PositionX.asInstanceOf[js.Any], PositionY = PositionY.asInstanceOf[js.Any], Step = Step.asInstanceOf[js.Any], TabIndex = TabIndex.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnoControlDialogElement]
  }
  @scala.inline
  implicit class UnoControlDialogElementOps[Self <: UnoControlDialogElement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPositionX(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PositionX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPositionY(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PositionY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Step")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTabIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TabIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

