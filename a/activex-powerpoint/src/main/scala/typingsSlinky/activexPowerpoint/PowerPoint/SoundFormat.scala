package typingsSlinky.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SoundFormat extends js.Object {
  @JSName("PowerPoint.SoundFormat_typekey")
  var PowerPointDotSoundFormat_typekey: SoundFormat = js.native
  val SourceFullName: String = js.native
  val Type: PpSoundFormatType = js.native
  def Export(FileName: String): PpSoundFormatType = js.native
  def Import(FileName: String): Unit = js.native
  def Play(): Unit = js.native
}

object SoundFormat {
  @scala.inline
  def apply(
    Export: String => PpSoundFormatType,
    Import: String => Unit,
    Play: () => Unit,
    PowerPointDotSoundFormat_typekey: SoundFormat,
    SourceFullName: String,
    Type: PpSoundFormatType
  ): SoundFormat = {
    val __obj = js.Dynamic.literal(Export = js.Any.fromFunction1(Export), Import = js.Any.fromFunction1(Import), Play = js.Any.fromFunction0(Play), SourceFullName = SourceFullName.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.SoundFormat_typekey")(PowerPointDotSoundFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SoundFormat]
  }
  @scala.inline
  implicit class SoundFormatOps[Self <: SoundFormat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExport(value: String => PpSoundFormatType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Export")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withImport(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Import")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPlay(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Play")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPowerPointDotSoundFormat_typekey(value: SoundFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PowerPoint.SoundFormat_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceFullName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceFullName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: PpSoundFormatType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

