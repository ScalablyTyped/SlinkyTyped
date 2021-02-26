package typingsSlinky.arcgisRestApi.mod

import typingsSlinky.arcgisRestApi.arcgisRestApiStrings.`line-through`
import typingsSlinky.arcgisRestApi.arcgisRestApiStrings.bold
import typingsSlinky.arcgisRestApi.arcgisRestApiStrings.bolder
import typingsSlinky.arcgisRestApi.arcgisRestApiStrings.italic
import typingsSlinky.arcgisRestApi.arcgisRestApiStrings.lighter
import typingsSlinky.arcgisRestApi.arcgisRestApiStrings.none
import typingsSlinky.arcgisRestApi.arcgisRestApiStrings.normal
import typingsSlinky.arcgisRestApi.arcgisRestApiStrings.oblique
import typingsSlinky.arcgisRestApi.arcgisRestApiStrings.underline
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Font extends StObject {
  
  var decoration: js.UndefOr[`line-through` | underline | none] = js.native
  
  var family: js.UndefOr[String] = js.native
  
  // "<fontFamily>";
  var size: js.UndefOr[Double] = js.native
  
  // <fontSize>;
  var style: js.UndefOr[italic | normal | oblique] = js.native
  
  var weight: js.UndefOr[bold | bolder | lighter | normal] = js.native
}
object Font {
  
  @scala.inline
  def apply(): Font = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Font]
  }
  
  @scala.inline
  implicit class FontMutableBuilder[Self <: Font] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDecoration(value: `line-through` | underline | none): Self = StObject.set(x, "decoration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecorationUndefined: Self = StObject.set(x, "decoration", js.undefined)
    
    @scala.inline
    def setFamily(value: String): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setStyle(value: italic | normal | oblique): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setWeight(value: bold | bolder | lighter | normal): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
