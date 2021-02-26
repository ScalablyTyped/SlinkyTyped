package typingsSlinky.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorScheme extends StObject {
  
  val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  
  def Colors(SchemeColor: PpColorSchemeIndex): RGBColor = js.native
  
  val Count: Double = js.native
  
  def Delete(): Unit = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("PowerPoint.ColorScheme_typekey")
  var PowerPointDotColorScheme_typekey: ColorScheme = js.native
}
object ColorScheme {
  
  @scala.inline
  def apply(
    Application: Application,
    Colors: PpColorSchemeIndex => RGBColor,
    Count: Double,
    Delete: () => Unit,
    Parent: js.Any,
    PowerPointDotColorScheme_typekey: ColorScheme
  ): ColorScheme = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Colors = js.Any.fromFunction1(Colors), Count = Count.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.ColorScheme_typekey")(PowerPointDotColorScheme_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorScheme]
  }
  
  @scala.inline
  implicit class ColorSchemeMutableBuilder[Self <: ColorScheme] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColors(value: PpColorSchemeIndex => RGBColor): Self = StObject.set(x, "Colors", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotColorScheme_typekey(value: ColorScheme): Self = StObject.set(x, "PowerPoint.ColorScheme_typekey", value.asInstanceOf[js.Any])
  }
}
