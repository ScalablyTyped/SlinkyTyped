package typingsSlinky.fabric.fabricImplMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITextboxOptions extends ITextOptions {
  
  /**
    * Minimum calculated width of a textbox, in pixels.
    * fixed to 2 so that an empty textbox cannot go to 0
    * and is still selectable without text.
    * @type Number
    */
  var dynamicMinWidth: js.UndefOr[Double] = js.native
  
  /**
    * Is the text wrapping
    * @type Boolean
    */
  var isWrapping: js.UndefOr[Boolean] = js.native
  
  /**
    * Minimum width of textbox, in pixels.
    * @type Number
    */
  var minWidth: js.UndefOr[Double] = js.native
  
  /**
    * Use this boolean property in order to split strings that have no white space concept.
    * this is a cheap way to help with chinese/japaense
    * @type Boolean
    * @since 2.6.0
    */
  var splitByGrapheme: js.UndefOr[Boolean] = js.native
}
object ITextboxOptions {
  
  @scala.inline
  def apply(): ITextboxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITextboxOptions]
  }
  
  @scala.inline
  implicit class ITextboxOptionsMutableBuilder[Self <: ITextboxOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDynamicMinWidth(value: Double): Self = StObject.set(x, "dynamicMinWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamicMinWidthUndefined: Self = StObject.set(x, "dynamicMinWidth", js.undefined)
    
    @scala.inline
    def setIsWrapping(value: Boolean): Self = StObject.set(x, "isWrapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsWrappingUndefined: Self = StObject.set(x, "isWrapping", js.undefined)
    
    @scala.inline
    def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    
    @scala.inline
    def setSplitByGrapheme(value: Boolean): Self = StObject.set(x, "splitByGrapheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSplitByGraphemeUndefined: Self = StObject.set(x, "splitByGrapheme", js.undefined)
  }
}
