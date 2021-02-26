package typingsSlinky.activexPowerpoint.PowerPoint

import typingsSlinky.activexOffice.Office.MsoFillType
import typingsSlinky.activexOffice.Office.MsoGradientColorType
import typingsSlinky.activexOffice.Office.MsoGradientStyle
import typingsSlinky.activexOffice.Office.MsoPatternType
import typingsSlinky.activexOffice.Office.MsoPresetGradientType
import typingsSlinky.activexOffice.Office.MsoPresetTexture
import typingsSlinky.activexOffice.Office.MsoTextureType
import typingsSlinky.activexOffice.Office.MsoTriState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartFillFormat extends StObject {
  
  val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  
  val BackColor: ChartColorFormat = js.native
  
  val Creator: Double = js.native
  
  val ForeColor: ChartColorFormat = js.native
  
  val GradientColorType: MsoGradientColorType = js.native
  
  val GradientDegree: Double = js.native
  
  val GradientStyle: MsoGradientStyle = js.native
  
  val GradientVariant: Double = js.native
  
  def OneColorGradient(Style: MsoGradientStyle, Variant: Double, Degree: Double): Unit = js.native
  
  val Parent: js.Any = js.native
  
  val Pattern: MsoPatternType = js.native
  
  def Patterned(Pattern: MsoPatternType): Unit = js.native
  
  @JSName("PowerPoint.ChartFillFormat_typekey")
  var PowerPointDotChartFillFormat_typekey: ChartFillFormat = js.native
  
  def PresetGradient(Style: MsoGradientStyle, Variant: Double, PresetGradientType: MsoPresetGradientType): Unit = js.native
  
  val PresetGradientType: MsoPresetGradientType = js.native
  
  val PresetTexture: MsoPresetTexture = js.native
  
  def PresetTextured(PresetTexture: MsoPresetTexture): Unit = js.native
  
  def Solid(): Unit = js.native
  
  val TextureName: String = js.native
  
  val TextureType: MsoTextureType = js.native
  
  def TwoColorGradient(Style: MsoGradientStyle, Variant: Double): Unit = js.native
  
  val Type: MsoFillType = js.native
  
  def UserPicture(): Unit = js.native
  def UserPicture(
    PictureFile: js.UndefOr[scala.Nothing],
    PictureFormat: js.UndefOr[scala.Nothing],
    PictureStackUnit: js.UndefOr[scala.Nothing],
    PicturePlacement: js.Any
  ): Unit = js.native
  def UserPicture(
    PictureFile: js.UndefOr[scala.Nothing],
    PictureFormat: js.UndefOr[scala.Nothing],
    PictureStackUnit: js.Any
  ): Unit = js.native
  def UserPicture(
    PictureFile: js.UndefOr[scala.Nothing],
    PictureFormat: js.UndefOr[scala.Nothing],
    PictureStackUnit: js.Any,
    PicturePlacement: js.Any
  ): Unit = js.native
  def UserPicture(PictureFile: js.UndefOr[scala.Nothing], PictureFormat: js.Any): Unit = js.native
  def UserPicture(
    PictureFile: js.UndefOr[scala.Nothing],
    PictureFormat: js.Any,
    PictureStackUnit: js.UndefOr[scala.Nothing],
    PicturePlacement: js.Any
  ): Unit = js.native
  def UserPicture(PictureFile: js.UndefOr[scala.Nothing], PictureFormat: js.Any, PictureStackUnit: js.Any): Unit = js.native
  def UserPicture(
    PictureFile: js.UndefOr[scala.Nothing],
    PictureFormat: js.Any,
    PictureStackUnit: js.Any,
    PicturePlacement: js.Any
  ): Unit = js.native
  def UserPicture(PictureFile: js.Any): Unit = js.native
  def UserPicture(
    PictureFile: js.Any,
    PictureFormat: js.UndefOr[scala.Nothing],
    PictureStackUnit: js.UndefOr[scala.Nothing],
    PicturePlacement: js.Any
  ): Unit = js.native
  def UserPicture(PictureFile: js.Any, PictureFormat: js.UndefOr[scala.Nothing], PictureStackUnit: js.Any): Unit = js.native
  def UserPicture(
    PictureFile: js.Any,
    PictureFormat: js.UndefOr[scala.Nothing],
    PictureStackUnit: js.Any,
    PicturePlacement: js.Any
  ): Unit = js.native
  def UserPicture(PictureFile: js.Any, PictureFormat: js.Any): Unit = js.native
  def UserPicture(
    PictureFile: js.Any,
    PictureFormat: js.Any,
    PictureStackUnit: js.UndefOr[scala.Nothing],
    PicturePlacement: js.Any
  ): Unit = js.native
  def UserPicture(PictureFile: js.Any, PictureFormat: js.Any, PictureStackUnit: js.Any): Unit = js.native
  def UserPicture(PictureFile: js.Any, PictureFormat: js.Any, PictureStackUnit: js.Any, PicturePlacement: js.Any): Unit = js.native
  
  def UserTextured(TextureFile: String): Unit = js.native
  
  var Visible: MsoTriState = js.native
}
