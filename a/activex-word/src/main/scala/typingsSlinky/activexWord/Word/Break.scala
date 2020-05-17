package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Break extends js.Object {
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  val Creator: Double = js.native
  val PageIndex: Double = js.native
  val Parent: js.Any = js.native
  val Range: typingsSlinky.activexWord.Word.Range = js.native
  @JSName("Word.Break_typekey")
  var WordDotBreak_typekey: Break = js.native
}

object Break {
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    PageIndex: Double,
    Parent: js.Any,
    Range: Range,
    WordDotBreak_typekey: Break
  ): Break = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], PageIndex = PageIndex.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Range = Range.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Break_typekey")(WordDotBreak_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Break]
  }
  @scala.inline
  implicit class BreakOps[Self <: Break] (val x: Self) extends AnyVal {
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
    def withPageIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PageIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRange(value: Range): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordDotBreak_typekey(value: Break): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.Break_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

