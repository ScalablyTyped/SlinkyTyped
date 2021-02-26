package typingsSlinky.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextStyle extends StObject {
  
  val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  
  val Levels: TextStyleLevels = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("PowerPoint.TextStyle_typekey")
  var PowerPointDotTextStyle_typekey: TextStyle = js.native
  
  val Ruler: typingsSlinky.activexPowerpoint.PowerPoint.Ruler = js.native
  
  val TextFrame: typingsSlinky.activexPowerpoint.PowerPoint.TextFrame = js.native
}
object TextStyle {
  
  @scala.inline
  def apply(
    Application: Application,
    Levels: TextStyleLevels,
    Parent: js.Any,
    PowerPointDotTextStyle_typekey: TextStyle,
    Ruler: Ruler,
    TextFrame: TextFrame
  ): TextStyle = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Levels = Levels.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Ruler = Ruler.asInstanceOf[js.Any], TextFrame = TextFrame.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.TextStyle_typekey")(PowerPointDotTextStyle_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextStyle]
  }
  
  @scala.inline
  implicit class TextStyleMutableBuilder[Self <: TextStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevels(value: TextStyleLevels): Self = StObject.set(x, "Levels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotTextStyle_typekey(value: TextStyle): Self = StObject.set(x, "PowerPoint.TextStyle_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuler(value: Ruler): Self = StObject.set(x, "Ruler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextFrame(value: TextFrame): Self = StObject.set(x, "TextFrame", value.asInstanceOf[js.Any])
  }
}
