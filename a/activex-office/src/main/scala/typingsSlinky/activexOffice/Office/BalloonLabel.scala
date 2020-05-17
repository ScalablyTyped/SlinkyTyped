package typingsSlinky.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BalloonLabel extends js.Object {
  val Application: js.Any = js.native
  val Creator: Double = js.native
  val Item: String = js.native
  val Name: String = js.native
  @JSName("Office.BalloonLabel_typekey")
  var OfficeDotBalloonLabel_typekey: BalloonLabel = js.native
  val Parent: js.Any = js.native
  var Text: String = js.native
}

object BalloonLabel {
  @scala.inline
  def apply(
    Application: js.Any,
    Creator: Double,
    Item: String,
    Name: String,
    OfficeDotBalloonLabel_typekey: BalloonLabel,
    Parent: js.Any,
    Text: String
  ): BalloonLabel = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = Item.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.BalloonLabel_typekey")(OfficeDotBalloonLabel_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[BalloonLabel]
  }
  @scala.inline
  implicit class BalloonLabelOps[Self <: BalloonLabel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplication(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItem(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOfficeDotBalloonLabel_typekey(value: BalloonLabel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Office.BalloonLabel_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Text")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

