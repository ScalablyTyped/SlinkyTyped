package typingsSlinky.activexPowerpoint.PowerPoint

import typingsSlinky.activexOffice.Office.GradientStop
import typingsSlinky.activexOffice.Office.GradientStops
import typingsSlinky.activexOffice.Office.MsoFillType
import typingsSlinky.activexOffice.Office.MsoGradientColorType
import typingsSlinky.activexOffice.Office.MsoGradientStyle
import typingsSlinky.activexOffice.Office.MsoPatternType
import typingsSlinky.activexOffice.Office.MsoPresetGradientType
import typingsSlinky.activexOffice.Office.MsoPresetTexture
import typingsSlinky.activexOffice.Office.MsoTextureAlignment
import typingsSlinky.activexOffice.Office.MsoTextureType
import typingsSlinky.activexOffice.Office.MsoTriState
import typingsSlinky.activexOffice.Office.PictureEffect
import typingsSlinky.activexOffice.Office.PictureEffects
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FillFormat extends StObject {
  
  val Application: js.Any = js.native
  
  var BackColor: ColorFormat = js.native
  
  def Background(): Unit = js.native
  
  val Creator: Double = js.native
  
  var ForeColor: ColorFormat = js.native
  
  var GradientAngle: Double = js.native
  
  val GradientColorType: MsoGradientColorType = js.native
  
  val GradientDegree: Double = js.native
  
  def GradientStops(Index: Double): GradientStop = js.native
  @JSName("GradientStops")
  val GradientStops_Original: GradientStops = js.native
  
  val GradientStyle: MsoGradientStyle = js.native
  
  val GradientVariant: Double = js.native
  
  def OneColorGradient(Style: MsoGradientStyle, Variant: Double, Degree: Double): Unit = js.native
  
  val Parent: js.Any = js.native
  
  val Pattern: MsoPatternType = js.native
  
  def Patterned(Pattern: MsoPatternType): Unit = js.native
  
  def PictureEffects(Index: Double): PictureEffect = js.native
  @JSName("PictureEffects")
  val PictureEffects_Original: PictureEffects = js.native
  
  @JSName("PowerPoint.FillFormat_typekey")
  var PowerPointDotFillFormat_typekey: FillFormat = js.native
  
  def PresetGradient(Style: MsoGradientStyle, Variant: Double, PresetGradientType: MsoPresetGradientType): Unit = js.native
  
  val PresetGradientType: MsoPresetGradientType = js.native
  
  val PresetTexture: MsoPresetTexture = js.native
  
  def PresetTextured(PresetTexture: MsoPresetTexture): Unit = js.native
  
  var RotateWithObject: MsoTriState = js.native
  
  def Solid(): Unit = js.native
  
  var TextureAlignment: MsoTextureAlignment = js.native
  
  var TextureHorizontalScale: Double = js.native
  
  val TextureName: String = js.native
  
  var TextureOffsetX: Double = js.native
  
  var TextureOffsetY: Double = js.native
  
  var TextureTile: MsoTriState = js.native
  
  val TextureType: MsoTextureType = js.native
  
  var TextureVerticalScale: Double = js.native
  
  var Transparency: Double = js.native
  
  def TwoColorGradient(Style: MsoGradientStyle, Variant: Double): Unit = js.native
  
  val Type: MsoFillType = js.native
  
  def UserPicture(PictureFile: String): Unit = js.native
  
  def UserTextured(TextureFile: String): Unit = js.native
  
  var Visible: MsoTriState = js.native
}
