package typingsSlinky.activexWord.Word

import typingsSlinky.activexOffice.Office.MsoCalloutAngleType
import typingsSlinky.activexOffice.Office.MsoCalloutDropType
import typingsSlinky.activexOffice.Office.MsoCalloutType
import typingsSlinky.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CalloutFormat extends js.Object {
  var Accent: MsoTriState = js.native
  var Angle: MsoCalloutAngleType = js.native
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  var AutoAttach: MsoTriState = js.native
  val AutoLength: MsoTriState = js.native
  var Border: MsoTriState = js.native
  val Creator: Double = js.native
  val Drop: Double = js.native
  val DropType: MsoCalloutDropType = js.native
  var Gap: Double = js.native
  val Length: Double = js.native
  val Parent: js.Any = js.native
  var Type: MsoCalloutType = js.native
  @JSName("Word.CalloutFormat_typekey")
  var WordDotCalloutFormat_typekey: CalloutFormat = js.native
  def AutomaticLength(): Unit = js.native
  def CustomDrop(Drop: Double): Unit = js.native
  def CustomLength(Length: Double): Unit = js.native
  def PresetDrop(DropType: MsoCalloutDropType): Unit = js.native
}

object CalloutFormat {
  @scala.inline
  def apply(
    Accent: MsoTriState,
    Angle: MsoCalloutAngleType,
    Application: Application,
    AutoAttach: MsoTriState,
    AutoLength: MsoTriState,
    AutomaticLength: () => Unit,
    Border: MsoTriState,
    Creator: Double,
    CustomDrop: Double => Unit,
    CustomLength: Double => Unit,
    Drop: Double,
    DropType: MsoCalloutDropType,
    Gap: Double,
    Length: Double,
    Parent: js.Any,
    PresetDrop: MsoCalloutDropType => Unit,
    Type: MsoCalloutType,
    WordDotCalloutFormat_typekey: CalloutFormat
  ): CalloutFormat = {
    val __obj = js.Dynamic.literal(Accent = Accent.asInstanceOf[js.Any], Angle = Angle.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], AutoAttach = AutoAttach.asInstanceOf[js.Any], AutoLength = AutoLength.asInstanceOf[js.Any], AutomaticLength = js.Any.fromFunction0(AutomaticLength), Border = Border.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], CustomDrop = js.Any.fromFunction1(CustomDrop), CustomLength = js.Any.fromFunction1(CustomLength), Drop = Drop.asInstanceOf[js.Any], DropType = DropType.asInstanceOf[js.Any], Gap = Gap.asInstanceOf[js.Any], Length = Length.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PresetDrop = js.Any.fromFunction1(PresetDrop), Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.CalloutFormat_typekey")(WordDotCalloutFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalloutFormat]
  }
  @scala.inline
  implicit class CalloutFormatOps[Self <: CalloutFormat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccent(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Accent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAngle(value: MsoCalloutAngleType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Angle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplication(value: Application): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoAttach(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoAttach")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoLength(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutomaticLength(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutomaticLength")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withBorder(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Border")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomDrop(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomDrop")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCustomLength(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomLength")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDrop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Drop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDropType(value: MsoCalloutDropType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DropType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGap(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Gap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPresetDrop(value: MsoCalloutDropType => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PresetDrop")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withType(value: MsoCalloutType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordDotCalloutFormat_typekey(value: CalloutFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.CalloutFormat_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

