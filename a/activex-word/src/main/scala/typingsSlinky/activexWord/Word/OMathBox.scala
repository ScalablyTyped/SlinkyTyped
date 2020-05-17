package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OMathBox extends js.Object {
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  val Creator: Double = js.native
  var Diff: Boolean = js.native
  val E: OMath = js.native
  var NoBreak: Boolean = js.native
  var OpEmu: Boolean = js.native
  val Parent: js.Any = js.native
  @JSName("Word.OMathBox_typekey")
  var WordDotOMathBox_typekey: OMathBox = js.native
}

object OMathBox {
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Diff: Boolean,
    E: OMath,
    NoBreak: Boolean,
    OpEmu: Boolean,
    Parent: js.Any,
    WordDotOMathBox_typekey: OMathBox
  ): OMathBox = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Diff = Diff.asInstanceOf[js.Any], E = E.asInstanceOf[js.Any], NoBreak = NoBreak.asInstanceOf[js.Any], OpEmu = OpEmu.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.OMathBox_typekey")(WordDotOMathBox_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMathBox]
  }
  @scala.inline
  implicit class OMathBoxOps[Self <: OMathBox] (val x: Self) extends AnyVal {
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
    def withDiff(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Diff")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withE(value: OMath): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("E")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoBreak(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoBreak")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpEmu(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OpEmu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordDotOMathBox_typekey(value: OMathBox): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.OMathBox_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

