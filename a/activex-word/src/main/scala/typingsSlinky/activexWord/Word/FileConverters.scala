package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileConverters extends js.Object {
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  var ConvertMacWordChevrons: WdChevronConvertRule = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  @JSName("Word.FileConverters_typekey")
  var WordDotFileConverters_typekey: FileConverters = js.native
  def Item(Index: js.Any): FileConverter = js.native
}

object FileConverters {
  @scala.inline
  def apply(
    Application: Application,
    ConvertMacWordChevrons: WdChevronConvertRule,
    Count: Double,
    Creator: Double,
    Item: js.Any => FileConverter,
    Parent: js.Any,
    WordDotFileConverters_typekey: FileConverters
  ): FileConverters = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], ConvertMacWordChevrons = ConvertMacWordChevrons.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.FileConverters_typekey")(WordDotFileConverters_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileConverters]
  }
  @scala.inline
  implicit class FileConvertersOps[Self <: FileConverters] (val x: Self) extends AnyVal {
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
    def withConvertMacWordChevrons(value: WdChevronConvertRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConvertMacWordChevrons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItem(value: js.Any => FileConverter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Item")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordDotFileConverters_typekey(value: FileConverters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.FileConverters_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

