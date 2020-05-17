package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OMathPhantom extends js.Object {
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  val Creator: Double = js.native
  val E: OMath = js.native
  val Parent: js.Any = js.native
  var Show: Boolean = js.native
  var Smash: Boolean = js.native
  var Transp: Boolean = js.native
  @JSName("Word.OMathPhantom_typekey")
  var WordDotOMathPhantom_typekey: OMathPhantom = js.native
  var ZeroAsc: Boolean = js.native
  var ZeroDesc: Boolean = js.native
  var ZeroWid: Boolean = js.native
}

object OMathPhantom {
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    E: OMath,
    Parent: js.Any,
    Show: Boolean,
    Smash: Boolean,
    Transp: Boolean,
    WordDotOMathPhantom_typekey: OMathPhantom,
    ZeroAsc: Boolean,
    ZeroDesc: Boolean,
    ZeroWid: Boolean
  ): OMathPhantom = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], E = E.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Show = Show.asInstanceOf[js.Any], Smash = Smash.asInstanceOf[js.Any], Transp = Transp.asInstanceOf[js.Any], ZeroAsc = ZeroAsc.asInstanceOf[js.Any], ZeroDesc = ZeroDesc.asInstanceOf[js.Any], ZeroWid = ZeroWid.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.OMathPhantom_typekey")(WordDotOMathPhantom_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMathPhantom]
  }
  @scala.inline
  implicit class OMathPhantomOps[Self <: OMathPhantom] (val x: Self) extends AnyVal {
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
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Show")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSmash(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Smash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Transp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordDotOMathPhantom_typekey(value: OMathPhantom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.OMathPhantom_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZeroAsc(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ZeroAsc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZeroDesc(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ZeroDesc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZeroWid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ZeroWid")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

