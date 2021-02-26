package typingsSlinky.azdata.mod.nb

import typingsSlinky.vscode.mod.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationResult extends StObject {
  
  var hasNavigation: Boolean = js.native
  
  var next: js.UndefOr[Uri] = js.native
  
  var previous: js.UndefOr[Uri] = js.native
}
object NavigationResult {
  
  @scala.inline
  def apply(hasNavigation: Boolean): NavigationResult = {
    val __obj = js.Dynamic.literal(hasNavigation = hasNavigation.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationResult]
  }
  
  @scala.inline
  implicit class NavigationResultMutableBuilder[Self <: NavigationResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHasNavigation(value: Boolean): Self = StObject.set(x, "hasNavigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext(value: Uri): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    
    @scala.inline
    def setPrevious(value: Uri): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousUndefined: Self = StObject.set(x, "previous", js.undefined)
  }
}
