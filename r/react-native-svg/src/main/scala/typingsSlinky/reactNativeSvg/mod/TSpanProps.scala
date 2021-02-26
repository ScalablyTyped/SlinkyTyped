package typingsSlinky.reactNativeSvg.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSpanProps
  extends CommonPathProps
     with FontProps {
  
  var dx: js.UndefOr[NumberArray] = js.native
  
  var dy: js.UndefOr[NumberArray] = js.native
  
  var inlineSize: js.UndefOr[NumberProp] = js.native
  
  var rotate: js.UndefOr[NumberArray] = js.native
}
object TSpanProps {
  
  @scala.inline
  def apply(): TSpanProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TSpanProps]
  }
  
  @scala.inline
  implicit class TSpanPropsMutableBuilder[Self <: TSpanProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDx(value: NumberArray): Self = StObject.set(x, "dx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDxUndefined: Self = StObject.set(x, "dx", js.undefined)
    
    @scala.inline
    def setDxVarargs(value: NumberProp*): Self = StObject.set(x, "dx", js.Array(value :_*))
    
    @scala.inline
    def setDy(value: NumberArray): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDyUndefined: Self = StObject.set(x, "dy", js.undefined)
    
    @scala.inline
    def setDyVarargs(value: NumberProp*): Self = StObject.set(x, "dy", js.Array(value :_*))
    
    @scala.inline
    def setInlineSize(value: NumberProp): Self = StObject.set(x, "inlineSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInlineSizeUndefined: Self = StObject.set(x, "inlineSize", js.undefined)
    
    @scala.inline
    def setRotate(value: NumberArray): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
    
    @scala.inline
    def setRotateVarargs(value: NumberProp*): Self = StObject.set(x, "rotate", js.Array(value :_*))
  }
}
