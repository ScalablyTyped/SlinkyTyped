package typingsSlinky.codemirror.mod

import typingsSlinky.codemirror.codemirrorStrings.`after-top`
import typingsSlinky.codemirror.codemirrorStrings.`before-bottom`
import typingsSlinky.codemirror.codemirrorStrings.bottom
import typingsSlinky.codemirror.codemirrorStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShowPanelOptions extends StObject {
  
  /**The new panel will be added after the given panel. */
  var after: js.UndefOr[Panel] = js.native
  
  /**The new panel will be added before the given panel. */
  var before: js.UndefOr[Panel] = js.native
  
  /**Controls the position of the newly added panel. The following values are recognized:
    * `top` (default): Adds the panel at the very top.
    *  `after-top`: Adds the panel at the bottom of the top panels.
    *  `bottom`: Adds the panel at the very bottom.
    *  `before-bottom`: Adds the panel at the top of the bottom panels.
    */
  var position: js.UndefOr[top | `after-top` | bottom | `before-bottom`] = js.native
  
  /**The new panel will replace the given panel. */
  var replace: js.UndefOr[Panel] = js.native
  
  /**Whether to scroll the editor to keep the text's vertical position stable, when adding a panel above it. Defaults to false. */
  var stable: js.UndefOr[Boolean] = js.native
}
object ShowPanelOptions {
  
  @scala.inline
  def apply(): ShowPanelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShowPanelOptions]
  }
  
  @scala.inline
  implicit class ShowPanelOptionsMutableBuilder[Self <: ShowPanelOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfter(value: Panel): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
    
    @scala.inline
    def setBefore(value: Panel): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
    
    @scala.inline
    def setPosition(value: top | `after-top` | bottom | `before-bottom`): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setReplace(value: Panel): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
    
    @scala.inline
    def setStable(value: Boolean): Self = StObject.set(x, "stable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStableUndefined: Self = StObject.set(x, "stable", js.undefined)
  }
}
