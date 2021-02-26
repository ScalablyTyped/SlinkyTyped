package typingsSlinky.fabric.fabricImplMod

import org.scalajs.dom.raw.HTMLImageElement
import typingsSlinky.fabric.fabricStrings._empty
import typingsSlinky.fabric.fabricStrings.`use-credentials`
import typingsSlinky.fabric.fabricStrings.anonymous
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPatternOptions extends StObject {
  
  /**
    * crossOrigin value (one of "", "anonymous", "use-credentials")
    * @see https://developer.mozilla.org/en-US/docs/HTML/CORS_settings_attributes
    * @type String
    */
  var crossOrigin: js.UndefOr[_empty | anonymous | `use-credentials`] = js.native
  
  /**
    * Pattern horizontal offset from object's left/top corner
    */
  var offsetX: js.UndefOr[Double] = js.native
  
  /**
    * Pattern vertical offset from object's left/top corner
    */
  var offsetY: js.UndefOr[Double] = js.native
  
  /**
    * Transform matrix to change the pattern, imported from svgs
    */
  var patternTransform: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * Repeat property of a pattern (one of repeat, repeat-x, repeat-y or no-repeat)
    */
  var repeat: js.UndefOr[String] = js.native
  
  /**
    * The source for the pattern
    */
  var source: String | HTMLImageElement = js.native
}
object IPatternOptions {
  
  @scala.inline
  def apply(source: String | HTMLImageElement): IPatternOptions = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPatternOptions]
  }
  
  @scala.inline
  implicit class IPatternOptionsMutableBuilder[Self <: IPatternOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCrossOrigin(value: _empty | anonymous | `use-credentials`): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
    
    @scala.inline
    def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
    
    @scala.inline
    def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
    
    @scala.inline
    def setPatternTransform(value: js.Array[Double]): Self = StObject.set(x, "patternTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternTransformUndefined: Self = StObject.set(x, "patternTransform", js.undefined)
    
    @scala.inline
    def setPatternTransformVarargs(value: Double*): Self = StObject.set(x, "patternTransform", js.Array(value :_*))
    
    @scala.inline
    def setRepeat(value: String): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepeatUndefined: Self = StObject.set(x, "repeat", js.undefined)
    
    @scala.inline
    def setSource(value: String | HTMLImageElement): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceHTMLImageElement(value: HTMLImageElement): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
