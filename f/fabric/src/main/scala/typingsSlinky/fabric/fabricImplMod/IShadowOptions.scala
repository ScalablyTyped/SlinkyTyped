package typingsSlinky.fabric.fabricImplMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IShadowOptions extends StObject {
  
  /**
    * Whether the shadow should affect stroke operations
    */
  var affectStroke: js.UndefOr[Boolean] = js.native
  
  /**
    * Shadow blur
    */
  var blur: js.UndefOr[Double] = js.native
  
  /**
    * Shadow color
    */
  var color: js.UndefOr[String] = js.native
  
  /**
    * Indicates whether toObject should include default values
    */
  var includeDefaultValues: js.UndefOr[Boolean] = js.native
  
  /**
    * When `false`, the shadow will scale with the object.
    * When `true`, the shadow's offsetX, offsetY, and blur will not be affected by the object's scale.
    * default to false
    * @type Boolean
    * @default
    */
  var nonScaling: js.UndefOr[Boolean] = js.native
  
  /**
    * Shadow horizontal offset
    */
  var offsetX: js.UndefOr[Double] = js.native
  
  /**
    * Shadow vertical offset
    */
  var offsetY: js.UndefOr[Double] = js.native
}
object IShadowOptions {
  
  @scala.inline
  def apply(): IShadowOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IShadowOptions]
  }
  
  @scala.inline
  implicit class IShadowOptionsMutableBuilder[Self <: IShadowOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAffectStroke(value: Boolean): Self = StObject.set(x, "affectStroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAffectStrokeUndefined: Self = StObject.set(x, "affectStroke", js.undefined)
    
    @scala.inline
    def setBlur(value: Double): Self = StObject.set(x, "blur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlurUndefined: Self = StObject.set(x, "blur", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setIncludeDefaultValues(value: Boolean): Self = StObject.set(x, "includeDefaultValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeDefaultValuesUndefined: Self = StObject.set(x, "includeDefaultValues", js.undefined)
    
    @scala.inline
    def setNonScaling(value: Boolean): Self = StObject.set(x, "nonScaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonScalingUndefined: Self = StObject.set(x, "nonScaling", js.undefined)
    
    @scala.inline
    def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
    
    @scala.inline
    def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
  }
}
