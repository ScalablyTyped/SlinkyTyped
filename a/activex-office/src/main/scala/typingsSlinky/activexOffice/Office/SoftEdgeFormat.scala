package typingsSlinky.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SoftEdgeFormat extends js.Object {
  val Application: js.Any = js.native
  val Creator: Double = js.native
  @JSName("Office.SoftEdgeFormat_typekey")
  var OfficeDotSoftEdgeFormat_typekey: SoftEdgeFormat = js.native
  var Radius: Double = js.native
  var Type: MsoSoftEdgeType = js.native
}

object SoftEdgeFormat {
  @scala.inline
  def apply(
    Application: js.Any,
    Creator: Double,
    OfficeDotSoftEdgeFormat_typekey: SoftEdgeFormat,
    Radius: Double,
    Type: MsoSoftEdgeType
  ): SoftEdgeFormat = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Radius = Radius.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.SoftEdgeFormat_typekey")(OfficeDotSoftEdgeFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SoftEdgeFormat]
  }
  @scala.inline
  implicit class SoftEdgeFormatOps[Self <: SoftEdgeFormat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplication(value: js.Any): Self = {
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
    def withOfficeDotSoftEdgeFormat_typekey(value: SoftEdgeFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Office.SoftEdgeFormat_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Radius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: MsoSoftEdgeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

