package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OMathGroupChar extends js.Object {
  var AlignTop: Boolean = js.native
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  var Char: Double = js.native
  var CharTop: Boolean = js.native
  val Creator: Double = js.native
  val E: OMath = js.native
  val Parent: js.Any = js.native
  @JSName("Word.OMathGroupChar_typekey")
  var WordDotOMathGroupChar_typekey: OMathGroupChar = js.native
}

object OMathGroupChar {
  @scala.inline
  def apply(
    AlignTop: Boolean,
    Application: Application,
    Char: Double,
    CharTop: Boolean,
    Creator: Double,
    E: OMath,
    Parent: js.Any,
    WordDotOMathGroupChar_typekey: OMathGroupChar
  ): OMathGroupChar = {
    val __obj = js.Dynamic.literal(AlignTop = AlignTop.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Char = Char.asInstanceOf[js.Any], CharTop = CharTop.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], E = E.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.OMathGroupChar_typekey")(WordDotOMathGroupChar_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMathGroupChar]
  }
  @scala.inline
  implicit class OMathGroupCharOps[Self <: OMathGroupChar] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlignTop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AlignTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplication(value: Application): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChar(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Char")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharTop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharTop")(value.asInstanceOf[js.Any])
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
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordDotOMathGroupChar_typekey(value: OMathGroupChar): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.OMathGroupChar_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

