package typingsSlinky.activexWord.Word

import typingsSlinky.activexOffice.Office.MsoShadowStyle
import typingsSlinky.activexOffice.Office.MsoShadowType
import typingsSlinky.activexOffice.Office.MsoTriState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShadowFormat extends StObject {
  
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  
  var Blur: Double = js.native
  
  val Creator: Double = js.native
  
  val ForeColor: ColorFormat = js.native
  
  def IncrementOffsetX(Increment: Double): Unit = js.native
  
  def IncrementOffsetY(Increment: Double): Unit = js.native
  
  var Obscured: MsoTriState = js.native
  
  var OffsetX: Double = js.native
  
  var OffsetY: Double = js.native
  
  val Parent: js.Any = js.native
  
  var RotateWithShape: MsoTriState = js.native
  
  var Size: Double = js.native
  
  var Style: MsoShadowStyle = js.native
  
  var Transparency: Double = js.native
  
  var Type: MsoShadowType = js.native
  
  var Visible: MsoTriState = js.native
  
  @JSName("Word.ShadowFormat_typekey")
  var WordDotShadowFormat_typekey: ShadowFormat = js.native
}
object ShadowFormat {
  
  @scala.inline
  def apply(
    Application: Application,
    Blur: Double,
    Creator: Double,
    ForeColor: ColorFormat,
    IncrementOffsetX: Double => Unit,
    IncrementOffsetY: Double => Unit,
    Obscured: MsoTriState,
    OffsetX: Double,
    OffsetY: Double,
    Parent: js.Any,
    RotateWithShape: MsoTriState,
    Size: Double,
    Style: MsoShadowStyle,
    Transparency: Double,
    Type: MsoShadowType,
    Visible: MsoTriState,
    WordDotShadowFormat_typekey: ShadowFormat
  ): ShadowFormat = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Blur = Blur.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], ForeColor = ForeColor.asInstanceOf[js.Any], IncrementOffsetX = js.Any.fromFunction1(IncrementOffsetX), IncrementOffsetY = js.Any.fromFunction1(IncrementOffsetY), Obscured = Obscured.asInstanceOf[js.Any], OffsetX = OffsetX.asInstanceOf[js.Any], OffsetY = OffsetY.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], RotateWithShape = RotateWithShape.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], Style = Style.asInstanceOf[js.Any], Transparency = Transparency.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.ShadowFormat_typekey")(WordDotShadowFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShadowFormat]
  }
  
  @scala.inline
  implicit class ShadowFormatMutableBuilder[Self <: ShadowFormat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlur(value: Double): Self = StObject.set(x, "Blur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForeColor(value: ColorFormat): Self = StObject.set(x, "ForeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncrementOffsetX(value: Double => Unit): Self = StObject.set(x, "IncrementOffsetX", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIncrementOffsetY(value: Double => Unit): Self = StObject.set(x, "IncrementOffsetY", js.Any.fromFunction1(value))
    
    @scala.inline
    def setObscured(value: MsoTriState): Self = StObject.set(x, "Obscured", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetX(value: Double): Self = StObject.set(x, "OffsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetY(value: Double): Self = StObject.set(x, "OffsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotateWithShape(value: MsoTriState): Self = StObject.set(x, "RotateWithShape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: MsoShadowStyle): Self = StObject.set(x, "Style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransparency(value: Double): Self = StObject.set(x, "Transparency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: MsoShadowType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: MsoTriState): Self = StObject.set(x, "Visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotShadowFormat_typekey(value: ShadowFormat): Self = StObject.set(x, "Word.ShadowFormat_typekey", value.asInstanceOf[js.Any])
  }
}
