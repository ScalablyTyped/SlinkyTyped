package typingsSlinky.reactNativeSvg.mod

import typingsSlinky.reactNative.mod.GestureResponderHandlers
import typingsSlinky.reactNativeSvg.reactNativeSvgStrings.`box-none`
import typingsSlinky.reactNativeSvg.reactNativeSvgStrings.`box-only`
import typingsSlinky.reactNativeSvg.reactNativeSvgStrings.auto
import typingsSlinky.reactNativeSvg.reactNativeSvgStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResponderProps extends GestureResponderHandlers {
  
  var pointerEvents: js.UndefOr[`box-none` | none | `box-only` | auto] = js.native
}
object ResponderProps {
  
  @scala.inline
  def apply(): ResponderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponderProps]
  }
  
  @scala.inline
  implicit class ResponderPropsMutableBuilder[Self <: ResponderProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPointerEvents(value: `box-none` | none | `box-only` | auto): Self = StObject.set(x, "pointerEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointerEventsUndefined: Self = StObject.set(x, "pointerEvents", js.undefined)
  }
}
