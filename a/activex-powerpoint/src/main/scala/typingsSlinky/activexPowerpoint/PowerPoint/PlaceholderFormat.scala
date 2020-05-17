package typingsSlinky.activexPowerpoint.PowerPoint

import typingsSlinky.activexOffice.Office.MsoShapeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlaceholderFormat extends js.Object {
  val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  val ContainedType: MsoShapeType = js.native
  var Name: String = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.PlaceholderFormat_typekey")
  var PowerPointDotPlaceholderFormat_typekey: PlaceholderFormat = js.native
  val Type: PpPlaceholderType = js.native
}

object PlaceholderFormat {
  @scala.inline
  def apply(
    Application: Application,
    ContainedType: MsoShapeType,
    Name: String,
    Parent: js.Any,
    PowerPointDotPlaceholderFormat_typekey: PlaceholderFormat,
    Type: PpPlaceholderType
  ): PlaceholderFormat = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], ContainedType = ContainedType.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.PlaceholderFormat_typekey")(PowerPointDotPlaceholderFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaceholderFormat]
  }
  @scala.inline
  implicit class PlaceholderFormatOps[Self <: PlaceholderFormat] (val x: Self) extends AnyVal {
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
    def withContainedType(value: MsoShapeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContainedType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPowerPointDotPlaceholderFormat_typekey(value: PlaceholderFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PowerPoint.PlaceholderFormat_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: PpPlaceholderType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

