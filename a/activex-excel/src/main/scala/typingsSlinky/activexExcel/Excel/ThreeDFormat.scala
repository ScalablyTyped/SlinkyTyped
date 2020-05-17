package typingsSlinky.activexExcel.Excel

import typingsSlinky.activexOffice.Office.MsoBevelType
import typingsSlinky.activexOffice.Office.MsoExtrusionColorType
import typingsSlinky.activexOffice.Office.MsoLightRigType
import typingsSlinky.activexOffice.Office.MsoPresetCamera
import typingsSlinky.activexOffice.Office.MsoPresetExtrusionDirection
import typingsSlinky.activexOffice.Office.MsoPresetLightingDirection
import typingsSlinky.activexOffice.Office.MsoPresetLightingSoftness
import typingsSlinky.activexOffice.Office.MsoPresetMaterial
import typingsSlinky.activexOffice.Office.MsoPresetThreeDFormat
import typingsSlinky.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThreeDFormat extends js.Object {
  val Application: js.Any = js.native
  var BevelBottomDepth: Double = js.native
  var BevelBottomInset: Double = js.native
  var BevelBottomType: MsoBevelType = js.native
  var BevelTopDepth: Double = js.native
  var BevelTopInset: Double = js.native
  var BevelTopType: MsoBevelType = js.native
  val ContourColor: ColorFormat = js.native
  var ContourWidth: Double = js.native
  val Creator: Double = js.native
  var Depth: Double = js.native
  @JSName("Excel.ThreeDFormat_typekey")
  var ExcelDotThreeDFormat_typekey: ThreeDFormat = js.native
  val ExtrusionColor: ColorFormat = js.native
  var ExtrusionColorType: MsoExtrusionColorType = js.native
  var FieldOfView: Double = js.native
  var LightAngle: Double = js.native
  val Parent: js.Any = js.native
  var Perspective: MsoTriState = js.native
  val PresetCamera: MsoPresetCamera = js.native
  val PresetExtrusionDirection: MsoPresetExtrusionDirection = js.native
  var PresetLighting: MsoLightRigType = js.native
  var PresetLightingDirection: MsoPresetLightingDirection = js.native
  var PresetLightingSoftness: MsoPresetLightingSoftness = js.native
  var PresetMaterial: MsoPresetMaterial = js.native
  val PresetThreeDFormat: MsoPresetThreeDFormat = js.native
  var ProjectText: MsoTriState = js.native
  var RotationX: Double = js.native
  var RotationY: Double = js.native
  var RotationZ: Double = js.native
  var Visible: MsoTriState = js.native
  var Z: Double = js.native
  def IncrementRotationHorizontal(Increment: Double): Unit = js.native
  def IncrementRotationVertical(Increment: Double): Unit = js.native
  def IncrementRotationX(Increment: Double): Unit = js.native
  def IncrementRotationY(Increment: Double): Unit = js.native
  def IncrementRotationZ(Increment: Double): Unit = js.native
  def ResetRotation(): Unit = js.native
  def SetExtrusionDirection(PresetExtrusionDirection: MsoPresetExtrusionDirection): Unit = js.native
  def SetPresetCamera(PresetCamera: MsoPresetCamera): Unit = js.native
  def SetThreeDFormat(PresetThreeDFormat: MsoPresetThreeDFormat): Unit = js.native
}

object ThreeDFormat {
  @scala.inline
  def apply(
    Application: js.Any,
    BevelBottomDepth: Double,
    BevelBottomInset: Double,
    BevelBottomType: MsoBevelType,
    BevelTopDepth: Double,
    BevelTopInset: Double,
    BevelTopType: MsoBevelType,
    ContourColor: ColorFormat,
    ContourWidth: Double,
    Creator: Double,
    Depth: Double,
    ExcelDotThreeDFormat_typekey: ThreeDFormat,
    ExtrusionColor: ColorFormat,
    ExtrusionColorType: MsoExtrusionColorType,
    FieldOfView: Double,
    IncrementRotationHorizontal: Double => Unit,
    IncrementRotationVertical: Double => Unit,
    IncrementRotationX: Double => Unit,
    IncrementRotationY: Double => Unit,
    IncrementRotationZ: Double => Unit,
    LightAngle: Double,
    Parent: js.Any,
    Perspective: MsoTriState,
    PresetCamera: MsoPresetCamera,
    PresetExtrusionDirection: MsoPresetExtrusionDirection,
    PresetLighting: MsoLightRigType,
    PresetLightingDirection: MsoPresetLightingDirection,
    PresetLightingSoftness: MsoPresetLightingSoftness,
    PresetMaterial: MsoPresetMaterial,
    PresetThreeDFormat: MsoPresetThreeDFormat,
    ProjectText: MsoTriState,
    ResetRotation: () => Unit,
    RotationX: Double,
    RotationY: Double,
    RotationZ: Double,
    SetExtrusionDirection: MsoPresetExtrusionDirection => Unit,
    SetPresetCamera: MsoPresetCamera => Unit,
    SetThreeDFormat: MsoPresetThreeDFormat => Unit,
    Visible: MsoTriState,
    Z: Double
  ): ThreeDFormat = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], BevelBottomDepth = BevelBottomDepth.asInstanceOf[js.Any], BevelBottomInset = BevelBottomInset.asInstanceOf[js.Any], BevelBottomType = BevelBottomType.asInstanceOf[js.Any], BevelTopDepth = BevelTopDepth.asInstanceOf[js.Any], BevelTopInset = BevelTopInset.asInstanceOf[js.Any], BevelTopType = BevelTopType.asInstanceOf[js.Any], ContourColor = ContourColor.asInstanceOf[js.Any], ContourWidth = ContourWidth.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Depth = Depth.asInstanceOf[js.Any], ExtrusionColor = ExtrusionColor.asInstanceOf[js.Any], ExtrusionColorType = ExtrusionColorType.asInstanceOf[js.Any], FieldOfView = FieldOfView.asInstanceOf[js.Any], IncrementRotationHorizontal = js.Any.fromFunction1(IncrementRotationHorizontal), IncrementRotationVertical = js.Any.fromFunction1(IncrementRotationVertical), IncrementRotationX = js.Any.fromFunction1(IncrementRotationX), IncrementRotationY = js.Any.fromFunction1(IncrementRotationY), IncrementRotationZ = js.Any.fromFunction1(IncrementRotationZ), LightAngle = LightAngle.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Perspective = Perspective.asInstanceOf[js.Any], PresetCamera = PresetCamera.asInstanceOf[js.Any], PresetExtrusionDirection = PresetExtrusionDirection.asInstanceOf[js.Any], PresetLighting = PresetLighting.asInstanceOf[js.Any], PresetLightingDirection = PresetLightingDirection.asInstanceOf[js.Any], PresetLightingSoftness = PresetLightingSoftness.asInstanceOf[js.Any], PresetMaterial = PresetMaterial.asInstanceOf[js.Any], PresetThreeDFormat = PresetThreeDFormat.asInstanceOf[js.Any], ProjectText = ProjectText.asInstanceOf[js.Any], ResetRotation = js.Any.fromFunction0(ResetRotation), RotationX = RotationX.asInstanceOf[js.Any], RotationY = RotationY.asInstanceOf[js.Any], RotationZ = RotationZ.asInstanceOf[js.Any], SetExtrusionDirection = js.Any.fromFunction1(SetExtrusionDirection), SetPresetCamera = js.Any.fromFunction1(SetPresetCamera), SetThreeDFormat = js.Any.fromFunction1(SetThreeDFormat), Visible = Visible.asInstanceOf[js.Any], Z = Z.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.ThreeDFormat_typekey")(ExcelDotThreeDFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThreeDFormat]
  }
  @scala.inline
  implicit class ThreeDFormatOps[Self <: ThreeDFormat] (val x: Self) extends AnyVal {
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
    def withBevelBottomDepth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BevelBottomDepth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBevelBottomInset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BevelBottomInset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBevelBottomType(value: MsoBevelType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BevelBottomType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBevelTopDepth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BevelTopDepth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBevelTopInset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BevelTopInset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBevelTopType(value: MsoBevelType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BevelTopType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContourColor(value: ColorFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContourColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContourWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContourWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDepth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Depth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExcelDotThreeDFormat_typekey(value: ThreeDFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Excel.ThreeDFormat_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtrusionColor(value: ColorFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExtrusionColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtrusionColorType(value: MsoExtrusionColorType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExtrusionColorType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFieldOfView(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FieldOfView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncrementRotationHorizontal(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncrementRotationHorizontal")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIncrementRotationVertical(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncrementRotationVertical")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIncrementRotationX(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncrementRotationX")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIncrementRotationY(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncrementRotationY")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIncrementRotationZ(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncrementRotationZ")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLightAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LightAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPerspective(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Perspective")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPresetCamera(value: MsoPresetCamera): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PresetCamera")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPresetExtrusionDirection(value: MsoPresetExtrusionDirection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PresetExtrusionDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPresetLighting(value: MsoLightRigType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PresetLighting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPresetLightingDirection(value: MsoPresetLightingDirection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PresetLightingDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPresetLightingSoftness(value: MsoPresetLightingSoftness): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PresetLightingSoftness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPresetMaterial(value: MsoPresetMaterial): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PresetMaterial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPresetThreeDFormat(value: MsoPresetThreeDFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PresetThreeDFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProjectText(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProjectText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResetRotation(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResetRotation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRotationX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RotationX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRotationY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RotationY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRotationZ(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RotationZ")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetExtrusionDirection(value: MsoPresetExtrusionDirection => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetExtrusionDirection")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetPresetCamera(value: MsoPresetCamera => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetPresetCamera")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetThreeDFormat(value: MsoPresetThreeDFormat => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetThreeDFormat")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withVisible(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZ(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Z")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

