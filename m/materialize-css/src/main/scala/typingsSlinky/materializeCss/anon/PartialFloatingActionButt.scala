package typingsSlinky.materializeCss.anon

import typingsSlinky.materializeCss.materializeCssStrings.buttom
import typingsSlinky.materializeCss.materializeCssStrings.left
import typingsSlinky.materializeCss.materializeCssStrings.right
import typingsSlinky.materializeCss.materializeCssStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<materialize-css.M.FloatingActionButtonOptions> */
@js.native
trait PartialFloatingActionButt extends StObject {
  
  var direction: js.UndefOr[top | right | buttom | left] = js.native
  
  var hoverEnabled: js.UndefOr[Boolean] = js.native
  
  var toolbarEnabled: js.UndefOr[Boolean] = js.native
}
object PartialFloatingActionButt {
  
  @scala.inline
  def apply(): PartialFloatingActionButt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialFloatingActionButt]
  }
  
  @scala.inline
  implicit class PartialFloatingActionButtMutableBuilder[Self <: PartialFloatingActionButt] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirection(value: top | right | buttom | left): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    @scala.inline
    def setHoverEnabled(value: Boolean): Self = StObject.set(x, "hoverEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverEnabledUndefined: Self = StObject.set(x, "hoverEnabled", js.undefined)
    
    @scala.inline
    def setToolbarEnabled(value: Boolean): Self = StObject.set(x, "toolbarEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolbarEnabledUndefined: Self = StObject.set(x, "toolbarEnabled", js.undefined)
  }
}
