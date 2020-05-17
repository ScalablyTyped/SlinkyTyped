package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropCap extends js.Object {
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  val Creator: Double = js.native
  var DistanceFromText: Double = js.native
  var FontName: String = js.native
  var LinesToDrop: Double = js.native
  val Parent: js.Any = js.native
  var Position: WdDropPosition = js.native
  @JSName("Word.DropCap_typekey")
  var WordDotDropCap_typekey: DropCap = js.native
  def Clear(): Unit = js.native
  def Enable(): Unit = js.native
}

object DropCap {
  @scala.inline
  def apply(
    Application: Application,
    Clear: () => Unit,
    Creator: Double,
    DistanceFromText: Double,
    Enable: () => Unit,
    FontName: String,
    LinesToDrop: Double,
    Parent: js.Any,
    Position: WdDropPosition,
    WordDotDropCap_typekey: DropCap
  ): DropCap = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Clear = js.Any.fromFunction0(Clear), Creator = Creator.asInstanceOf[js.Any], DistanceFromText = DistanceFromText.asInstanceOf[js.Any], Enable = js.Any.fromFunction0(Enable), FontName = FontName.asInstanceOf[js.Any], LinesToDrop = LinesToDrop.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.DropCap_typekey")(WordDotDropCap_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropCap]
  }
  @scala.inline
  implicit class DropCapOps[Self <: DropCap] (val x: Self) extends AnyVal {
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
    def withClear(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCreator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDistanceFromText(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DistanceFromText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnable(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFontName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FontName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinesToDrop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LinesToDrop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: WdDropPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordDotDropCap_typekey(value: DropCap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.DropCap_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

