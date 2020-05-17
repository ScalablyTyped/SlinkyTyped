package typingsSlinky.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MsoDebugOptions extends js.Object {
  val Application: js.Any = js.native
  val Creator: Double = js.native
  var FeatureReports: Double = js.native
  @JSName("Office.MsoDebugOptions_typekey")
  var OfficeDotMsoDebugOptions_typekey: MsoDebugOptions = js.native
  var OutputToDebugger: Boolean = js.native
  var OutputToFile: Boolean = js.native
  var OutputToMessageBox: Boolean = js.native
  val UnitTestManager: js.Any = js.native
  def AddIgnoredAssertTag(bstrTagToIgnore: String): Unit = js.native
  def RemoveIgnoredAssertTag(bstrTagToIgnore: String): Unit = js.native
}

object MsoDebugOptions {
  @scala.inline
  def apply(
    AddIgnoredAssertTag: String => Unit,
    Application: js.Any,
    Creator: Double,
    FeatureReports: Double,
    OfficeDotMsoDebugOptions_typekey: MsoDebugOptions,
    OutputToDebugger: Boolean,
    OutputToFile: Boolean,
    OutputToMessageBox: Boolean,
    RemoveIgnoredAssertTag: String => Unit,
    UnitTestManager: js.Any
  ): MsoDebugOptions = {
    val __obj = js.Dynamic.literal(AddIgnoredAssertTag = js.Any.fromFunction1(AddIgnoredAssertTag), Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], FeatureReports = FeatureReports.asInstanceOf[js.Any], OutputToDebugger = OutputToDebugger.asInstanceOf[js.Any], OutputToFile = OutputToFile.asInstanceOf[js.Any], OutputToMessageBox = OutputToMessageBox.asInstanceOf[js.Any], RemoveIgnoredAssertTag = js.Any.fromFunction1(RemoveIgnoredAssertTag), UnitTestManager = UnitTestManager.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.MsoDebugOptions_typekey")(OfficeDotMsoDebugOptions_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[MsoDebugOptions]
  }
  @scala.inline
  implicit class MsoDebugOptionsOps[Self <: MsoDebugOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddIgnoredAssertTag(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddIgnoredAssertTag")(js.Any.fromFunction1(value))
        ret
    }
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
    def withFeatureReports(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FeatureReports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOfficeDotMsoDebugOptions_typekey(value: MsoDebugOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Office.MsoDebugOptions_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutputToDebugger(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputToDebugger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutputToFile(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputToFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutputToMessageBox(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputToMessageBox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveIgnoredAssertTag(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemoveIgnoredAssertTag")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUnitTestManager(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnitTestManager")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

