package typingsSlinky.googleapis.v41Mod.adsensehostV41

import typingsSlinky.googleapis.anon.Background
import typingsSlinky.googleapis.anon.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaAdStyle extends StObject {
  
  /**
    * The colors included in the style. These are represented as six
    * hexadecimal characters, similar to HTML color codes, but without the
    * leading hash.
    */
  var colors: js.UndefOr[Background] = js.native
  
  /**
    * The style of the corners in the ad (deprecated: never populated,
    * ignored).
    */
  var corners: js.UndefOr[String] = js.native
  
  /**
    * The font which is included in the style.
    */
  var font: js.UndefOr[Size] = js.native
  
  /**
    * Kind this is, in this case adsensehost#adStyle.
    */
  var kind: js.UndefOr[String] = js.native
}
object SchemaAdStyle {
  
  @scala.inline
  def apply(): SchemaAdStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAdStyle]
  }
  
  @scala.inline
  implicit class SchemaAdStyleMutableBuilder[Self <: SchemaAdStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColors(value: Background): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    @scala.inline
    def setCorners(value: String): Self = StObject.set(x, "corners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCornersUndefined: Self = StObject.set(x, "corners", js.undefined)
    
    @scala.inline
    def setFont(value: Size): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
