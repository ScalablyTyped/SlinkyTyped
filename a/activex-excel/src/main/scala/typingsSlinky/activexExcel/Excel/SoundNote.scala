package typingsSlinky.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SoundNote extends js.Object {
  val Application: typingsSlinky.activexExcel.Excel.Application = js.native
  val Creator: XlCreator = js.native
  @JSName("Excel.SoundNote_typekey")
  var ExcelDotSoundNote_typekey: SoundNote = js.native
  val Parent: js.Any = js.native
  def Delete(): js.Any = js.native
  def Import(Filename: String): js.Any = js.native
  def Play(): js.Any = js.native
  def Record(): js.Any = js.native
}

object SoundNote {
  @scala.inline
  def apply(
    Application: Application,
    Creator: XlCreator,
    Delete: () => js.Any,
    ExcelDotSoundNote_typekey: SoundNote,
    Import: String => js.Any,
    Parent: js.Any,
    Play: () => js.Any,
    Record: () => js.Any
  ): SoundNote = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Import = js.Any.fromFunction1(Import), Parent = Parent.asInstanceOf[js.Any], Play = js.Any.fromFunction0(Play), Record = js.Any.fromFunction0(Record))
    __obj.updateDynamic("Excel.SoundNote_typekey")(ExcelDotSoundNote_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SoundNote]
  }
  @scala.inline
  implicit class SoundNoteOps[Self <: SoundNote] (val x: Self) extends AnyVal {
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
    def withCreator(value: XlCreator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelete(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Delete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withExcelDotSoundNote_typekey(value: SoundNote): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Excel.SoundNote_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImport(value: String => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Import")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlay(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Play")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRecord(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Record")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

