package typingsSlinky.gestalt.mod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import typingsSlinky.gestalt.gestaltStrings.blue
import typingsSlinky.gestalt.gestaltStrings.darkGray
import typingsSlinky.gestalt.gestaltStrings.down
import typingsSlinky.gestalt.gestaltStrings.flexible
import typingsSlinky.gestalt.gestaltStrings.left
import typingsSlinky.gestalt.gestaltStrings.lg
import typingsSlinky.gestalt.gestaltStrings.md
import typingsSlinky.gestalt.gestaltStrings.orange
import typingsSlinky.gestalt.gestaltStrings.red
import typingsSlinky.gestalt.gestaltStrings.right
import typingsSlinky.gestalt.gestaltStrings.sm
import typingsSlinky.gestalt.gestaltStrings.up
import typingsSlinky.gestalt.gestaltStrings.white
import typingsSlinky.gestalt.gestaltStrings.xl
import typingsSlinky.gestalt.gestaltStrings.xs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlyoutProps extends StObject {
  
  var anchor: HTMLElement = js.native
  
  var children: js.UndefOr[ReactElement] = js.native
  
  var color: js.UndefOr[blue | orange | red | white | darkGray] = js.native
  
  var idealDirection: js.UndefOr[up | right | down | left] = js.native
  
  // ideally a HTMLAnchorElement
  def onDismiss(): Unit = js.native
  
  var positionRelativeToAnchor: js.UndefOr[Boolean] = js.native
  
  var shouldFocus: js.UndefOr[Boolean] = js.native
  
  var showCaret: js.UndefOr[Boolean] = js.native
  
  var size: js.UndefOr[xs | sm | md | lg | xl | flexible | Double] = js.native
}
object FlyoutProps {
  
  @scala.inline
  def apply(anchor: HTMLElement, onDismiss: () => Unit): FlyoutProps = {
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], onDismiss = js.Any.fromFunction0(onDismiss))
    __obj.asInstanceOf[FlyoutProps]
  }
  
  @scala.inline
  implicit class FlyoutPropsMutableBuilder[Self <: FlyoutProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnchor(value: HTMLElement): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setColor(value: blue | orange | red | white | darkGray): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setIdealDirection(value: up | right | down | left): Self = StObject.set(x, "idealDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdealDirectionUndefined: Self = StObject.set(x, "idealDirection", js.undefined)
    
    @scala.inline
    def setOnDismiss(value: () => Unit): Self = StObject.set(x, "onDismiss", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPositionRelativeToAnchor(value: Boolean): Self = StObject.set(x, "positionRelativeToAnchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionRelativeToAnchorUndefined: Self = StObject.set(x, "positionRelativeToAnchor", js.undefined)
    
    @scala.inline
    def setShouldFocus(value: Boolean): Self = StObject.set(x, "shouldFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShouldFocusUndefined: Self = StObject.set(x, "shouldFocus", js.undefined)
    
    @scala.inline
    def setShowCaret(value: Boolean): Self = StObject.set(x, "showCaret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowCaretUndefined: Self = StObject.set(x, "showCaret", js.undefined)
    
    @scala.inline
    def setSize(value: xs | sm | md | lg | xl | flexible | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
