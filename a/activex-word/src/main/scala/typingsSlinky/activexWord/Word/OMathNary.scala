package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OMathNary extends js.Object {
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  var Char: Double = js.native
  val Creator: Double = js.native
  val E: OMath = js.native
  var Grow: Boolean = js.native
  var HideSub: Boolean = js.native
  var HideSup: Boolean = js.native
  val Parent: js.Any = js.native
  val Sub: OMath = js.native
  var SubSupLim: Boolean = js.native
  val Sup: OMath = js.native
  @JSName("Word.OMathNary_typekey")
  var WordDotOMathNary_typekey: OMathNary = js.native
}

object OMathNary {
  @scala.inline
  def apply(
    Application: Application,
    Char: Double,
    Creator: Double,
    E: OMath,
    Grow: Boolean,
    HideSub: Boolean,
    HideSup: Boolean,
    Parent: js.Any,
    Sub: OMath,
    SubSupLim: Boolean,
    Sup: OMath,
    WordDotOMathNary_typekey: OMathNary
  ): OMathNary = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Char = Char.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], E = E.asInstanceOf[js.Any], Grow = Grow.asInstanceOf[js.Any], HideSub = HideSub.asInstanceOf[js.Any], HideSup = HideSup.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Sub = Sub.asInstanceOf[js.Any], SubSupLim = SubSupLim.asInstanceOf[js.Any], Sup = Sup.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.OMathNary_typekey")(WordDotOMathNary_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMathNary]
  }
  @scala.inline
  implicit class OMathNaryOps[Self <: OMathNary] (val x: Self) extends AnyVal {
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
    def withChar(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Char")(value.asInstanceOf[js.Any])
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
    def withGrow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Grow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHideSub(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HideSub")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHideSup(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HideSup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSub(value: OMath): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sub")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubSupLim(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubSupLim")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSup(value: OMath): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordDotOMathNary_typekey(value: OMathNary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.OMathNary_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

