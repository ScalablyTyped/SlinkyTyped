package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OMathFunc extends js.Object {
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  val Creator: Double = js.native
  val E: OMath = js.native
  val FName: OMath = js.native
  val Parent: js.Any = js.native
  @JSName("Word.OMathFunc_typekey")
  var WordDotOMathFunc_typekey: OMathFunc = js.native
}

object OMathFunc {
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    E: OMath,
    FName: OMath,
    Parent: js.Any,
    WordDotOMathFunc_typekey: OMathFunc
  ): OMathFunc = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], E = E.asInstanceOf[js.Any], FName = FName.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.OMathFunc_typekey")(WordDotOMathFunc_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMathFunc]
  }
  @scala.inline
  implicit class OMathFuncOps[Self <: OMathFunc] (val x: Self) extends AnyVal {
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
    def withFName(value: OMath): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordDotOMathFunc_typekey(value: OMathFunc): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.OMathFunc_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

