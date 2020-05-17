package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineNumbering extends js.Object {
  var Active: Double = js.native
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  var CountBy: Double = js.native
  val Creator: Double = js.native
  var DistanceFromText: Double = js.native
  val Parent: js.Any = js.native
  var RestartMode: WdNumberingRule = js.native
  var StartingNumber: Double = js.native
  @JSName("Word.LineNumbering_typekey")
  var WordDotLineNumbering_typekey: LineNumbering = js.native
}

object LineNumbering {
  @scala.inline
  def apply(
    Active: Double,
    Application: Application,
    CountBy: Double,
    Creator: Double,
    DistanceFromText: Double,
    Parent: js.Any,
    RestartMode: WdNumberingRule,
    StartingNumber: Double,
    WordDotLineNumbering_typekey: LineNumbering
  ): LineNumbering = {
    val __obj = js.Dynamic.literal(Active = Active.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], CountBy = CountBy.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], DistanceFromText = DistanceFromText.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], RestartMode = RestartMode.asInstanceOf[js.Any], StartingNumber = StartingNumber.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.LineNumbering_typekey")(WordDotLineNumbering_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineNumbering]
  }
  @scala.inline
  implicit class LineNumberingOps[Self <: LineNumbering] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActive(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplication(value: Application): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCountBy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CountBy")(value.asInstanceOf[js.Any])
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
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRestartMode(value: WdNumberingRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RestartMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartingNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartingNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordDotLineNumbering_typekey(value: LineNumbering): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.LineNumbering_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

