package typingsSlinky.activexLibreoffice.com_.sun.star.table

import typingsSlinky.activexLibreoffice.com_.sun.star.util.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** describes the settings of a cell shadow. */
@js.native
trait ShadowFormat extends StObject {
  
  /** contains the color value of the shadow. */
  var Color: typingsSlinky.activexLibreoffice.com_.sun.star.util.Color = js.native
  
  /** is `TRUE` , if shadow is transparent. */
  var IsTransparent: Boolean = js.native
  
  /** contains the location of the shadow. */
  var Location: ShadowLocation = js.native
  
  /** contains the size of the shadow. */
  var ShadowWidth: Double = js.native
}
object ShadowFormat {
  
  @scala.inline
  def apply(Color: Color, IsTransparent: Boolean, Location: ShadowLocation, ShadowWidth: Double): ShadowFormat = {
    val __obj = js.Dynamic.literal(Color = Color.asInstanceOf[js.Any], IsTransparent = IsTransparent.asInstanceOf[js.Any], Location = Location.asInstanceOf[js.Any], ShadowWidth = ShadowWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShadowFormat]
  }
  
  @scala.inline
  implicit class ShadowFormatMutableBuilder[Self <: ShadowFormat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: Color): Self = StObject.set(x, "Color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsTransparent(value: Boolean): Self = StObject.set(x, "IsTransparent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: ShadowLocation): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowWidth(value: Double): Self = StObject.set(x, "ShadowWidth", value.asInstanceOf[js.Any])
  }
}
