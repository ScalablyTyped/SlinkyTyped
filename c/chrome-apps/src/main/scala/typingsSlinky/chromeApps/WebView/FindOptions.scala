package typingsSlinky.chromeApps.WebView

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FindOptions extends StObject {
  
  /**
    * Flag to find matches in reverse order.
    * @default false
    */
  var backward: js.UndefOr[Boolean] = js.native
  
  /**
    * Flag to match with case-sensitivity.
    * @default false
    */
  var matchCase: js.UndefOr[Boolean] = js.native
}
object FindOptions {
  
  @scala.inline
  def apply(): FindOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindOptions]
  }
  
  @scala.inline
  implicit class FindOptionsMutableBuilder[Self <: FindOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackward(value: Boolean): Self = StObject.set(x, "backward", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackwardUndefined: Self = StObject.set(x, "backward", js.undefined)
    
    @scala.inline
    def setMatchCase(value: Boolean): Self = StObject.set(x, "matchCase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchCaseUndefined: Self = StObject.set(x, "matchCase", js.undefined)
  }
}
