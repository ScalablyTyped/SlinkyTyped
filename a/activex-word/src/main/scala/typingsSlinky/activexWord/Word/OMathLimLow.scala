package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OMathLimLow extends js.Object {
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  val Creator: Double = js.native
  val E: OMath = js.native
  val Lim: OMath = js.native
  val Parent: js.Any = js.native
  @JSName("Word.OMathLimLow_typekey")
  var WordDotOMathLimLow_typekey: OMathLimLow = js.native
  def ToLimUpp(): OMathFunction = js.native
}

object OMathLimLow {
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    E: OMath,
    Lim: OMath,
    Parent: js.Any,
    ToLimUpp: () => OMathFunction,
    WordDotOMathLimLow_typekey: OMathLimLow
  ): OMathLimLow = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], E = E.asInstanceOf[js.Any], Lim = Lim.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], ToLimUpp = js.Any.fromFunction0(ToLimUpp))
    __obj.updateDynamic("Word.OMathLimLow_typekey")(WordDotOMathLimLow_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMathLimLow]
  }
  @scala.inline
  implicit class OMathLimLowOps[Self <: OMathLimLow] (val x: Self) extends AnyVal {
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
    def withLim(value: OMath): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Lim")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToLimUpp(value: () => OMathFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ToLimUpp")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withWordDotOMathLimLow_typekey(value: OMathLimLow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.OMathLimLow_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

