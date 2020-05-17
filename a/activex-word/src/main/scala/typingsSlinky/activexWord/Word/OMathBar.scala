package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OMathBar extends js.Object {
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  var BarTop: Boolean = js.native
  val Creator: Double = js.native
  val E: OMath = js.native
  val Parent: js.Any = js.native
  @JSName("Word.OMathBar_typekey")
  var WordDotOMathBar_typekey: OMathBar = js.native
}

object OMathBar {
  @scala.inline
  def apply(
    Application: Application,
    BarTop: Boolean,
    Creator: Double,
    E: OMath,
    Parent: js.Any,
    WordDotOMathBar_typekey: OMathBar
  ): OMathBar = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], BarTop = BarTop.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], E = E.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.OMathBar_typekey")(WordDotOMathBar_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMathBar]
  }
  @scala.inline
  implicit class OMathBarOps[Self <: OMathBar] (val x: Self) extends AnyVal {
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
    def withBarTop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BarTop")(value.asInstanceOf[js.Any])
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
    def withWordDotOMathBar_typekey(value: OMathBar): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.OMathBar_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

