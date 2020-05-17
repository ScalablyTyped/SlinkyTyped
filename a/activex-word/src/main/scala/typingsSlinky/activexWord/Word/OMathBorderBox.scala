package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OMathBorderBox extends js.Object {
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  val Creator: Double = js.native
  val E: OMath = js.native
  var HideBot: Boolean = js.native
  var HideLeft: Boolean = js.native
  var HideRight: Boolean = js.native
  var HideTop: Boolean = js.native
  val Parent: js.Any = js.native
  var StrikeBLTR: Boolean = js.native
  var StrikeH: Boolean = js.native
  var StrikeTLBR: Boolean = js.native
  var StrikeV: Boolean = js.native
  @JSName("Word.OMathBorderBox_typekey")
  var WordDotOMathBorderBox_typekey: OMathBorderBox = js.native
}

object OMathBorderBox {
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    E: OMath,
    HideBot: Boolean,
    HideLeft: Boolean,
    HideRight: Boolean,
    HideTop: Boolean,
    Parent: js.Any,
    StrikeBLTR: Boolean,
    StrikeH: Boolean,
    StrikeTLBR: Boolean,
    StrikeV: Boolean,
    WordDotOMathBorderBox_typekey: OMathBorderBox
  ): OMathBorderBox = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], E = E.asInstanceOf[js.Any], HideBot = HideBot.asInstanceOf[js.Any], HideLeft = HideLeft.asInstanceOf[js.Any], HideRight = HideRight.asInstanceOf[js.Any], HideTop = HideTop.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], StrikeBLTR = StrikeBLTR.asInstanceOf[js.Any], StrikeH = StrikeH.asInstanceOf[js.Any], StrikeTLBR = StrikeTLBR.asInstanceOf[js.Any], StrikeV = StrikeV.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.OMathBorderBox_typekey")(WordDotOMathBorderBox_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMathBorderBox]
  }
  @scala.inline
  implicit class OMathBorderBoxOps[Self <: OMathBorderBox] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplication(value: Application): Self = {
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
    def withE(value: OMath): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("E")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHideBot(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HideBot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHideLeft(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HideLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHideRight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HideRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHideTop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HideTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrikeBLTR(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StrikeBLTR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrikeH(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StrikeH")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrikeTLBR(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StrikeTLBR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrikeV(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StrikeV")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordDotOMathBorderBox_typekey(value: OMathBorderBox): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.OMathBorderBox_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

