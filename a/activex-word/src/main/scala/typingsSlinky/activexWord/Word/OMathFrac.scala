package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OMathFrac extends js.Object {
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  val Creator: Double = js.native
  val Den: OMath = js.native
  val Num: OMath = js.native
  val Parent: js.Any = js.native
  var Type: WdOMathFracType = js.native
  @JSName("Word.OMathFrac_typekey")
  var WordDotOMathFrac_typekey: OMathFrac = js.native
}

object OMathFrac {
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Den: OMath,
    Num: OMath,
    Parent: js.Any,
    Type: WdOMathFracType,
    WordDotOMathFrac_typekey: OMathFrac
  ): OMathFrac = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Den = Den.asInstanceOf[js.Any], Num = Num.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.OMathFrac_typekey")(WordDotOMathFrac_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMathFrac]
  }
  @scala.inline
  implicit class OMathFracOps[Self <: OMathFrac] (val x: Self) extends AnyVal {
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
    def withDen(value: OMath): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Den")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNum(value: OMath): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Num")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: WdOMathFracType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordDotOMathFrac_typekey(value: OMathFrac): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.OMathFrac_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

