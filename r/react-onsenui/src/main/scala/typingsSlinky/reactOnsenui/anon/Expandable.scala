package typingsSlinky.reactOnsenui.anon

import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.MouseEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Expandable extends StObject {
  
  var expandable: js.UndefOr[Boolean] = js.native
  
  var expanded: js.UndefOr[Boolean] = js.native
  
  var lockOnDrag: js.UndefOr[Boolean] = js.native
  
  var modifier: js.UndefOr[String] = js.native
  
  var onClick: js.UndefOr[MouseEventHandler[_]] = js.native
  
  var tapBackgroundColor: js.UndefOr[String] = js.native
  
  var tappable: js.UndefOr[Boolean] = js.native
}
object Expandable {
  
  @scala.inline
  def apply(): Expandable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Expandable]
  }
  
  @scala.inline
  implicit class ExpandableMutableBuilder[Self <: Expandable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpandable(value: Boolean): Self = StObject.set(x, "expandable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandableUndefined: Self = StObject.set(x, "expandable", js.undefined)
    
    @scala.inline
    def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
    
    @scala.inline
    def setLockOnDrag(value: Boolean): Self = StObject.set(x, "lockOnDrag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLockOnDragUndefined: Self = StObject.set(x, "lockOnDrag", js.undefined)
    
    @scala.inline
    def setModifier(value: String): Self = StObject.set(x, "modifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifierUndefined: Self = StObject.set(x, "modifier", js.undefined)
    
    @scala.inline
    def setOnClick(value: SyntheticMouseEvent[_] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    @scala.inline
    def setTapBackgroundColor(value: String): Self = StObject.set(x, "tapBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTapBackgroundColorUndefined: Self = StObject.set(x, "tapBackgroundColor", js.undefined)
    
    @scala.inline
    def setTappable(value: Boolean): Self = StObject.set(x, "tappable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTappableUndefined: Self = StObject.set(x, "tappable", js.undefined)
  }
}
