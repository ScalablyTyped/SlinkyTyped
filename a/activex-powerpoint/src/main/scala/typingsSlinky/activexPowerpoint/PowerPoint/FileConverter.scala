package typingsSlinky.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileConverter extends js.Object {
  val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  val CanOpen: Boolean = js.native
  val CanSave: Boolean = js.native
  val ClassName: String = js.native
  val Creator: FileConverters = js.native
  val Extensions: String = js.native
  val FormatName: String = js.native
  val Name: String = js.native
  val OpenFormat: Double = js.native
  val Parent: FileConverters = js.native
  val Path: String = js.native
  @JSName("PowerPoint.FileConverter_typekey")
  var PowerPointDotFileConverter_typekey: FileConverter = js.native
  val SaveFormat: Double = js.native
}

object FileConverter {
  @scala.inline
  def apply(
    Application: Application,
    CanOpen: Boolean,
    CanSave: Boolean,
    ClassName: String,
    Creator: FileConverters,
    Extensions: String,
    FormatName: String,
    Name: String,
    OpenFormat: Double,
    Parent: FileConverters,
    Path: String,
    PowerPointDotFileConverter_typekey: FileConverter,
    SaveFormat: Double
  ): FileConverter = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], CanOpen = CanOpen.asInstanceOf[js.Any], CanSave = CanSave.asInstanceOf[js.Any], ClassName = ClassName.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Extensions = Extensions.asInstanceOf[js.Any], FormatName = FormatName.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], OpenFormat = OpenFormat.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Path = Path.asInstanceOf[js.Any], SaveFormat = SaveFormat.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.FileConverter_typekey")(PowerPointDotFileConverter_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileConverter]
  }
  @scala.inline
  implicit class FileConverterOps[Self <: FileConverter] (val x: Self) extends AnyVal {
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
    def withCanOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CanOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanSave(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CanSave")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreator(value: FileConverters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtensions(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Extensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormatName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FormatName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpenFormat(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OpenFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: FileConverters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPowerPointDotFileConverter_typekey(value: FileConverter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PowerPoint.FileConverter_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSaveFormat(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SaveFormat")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

