package typingsSlinky.baseui.anon

import typingsSlinky.baseui.baseuiStrings.backdrop
import typingsSlinky.baseui.baseuiStrings.closeButton
import typingsSlinky.baseui.baseuiStrings.escape_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloseSource extends StObject {
  
  var closeSource: js.UndefOr[closeButton | backdrop | escape_] = js.native
}
object CloseSource {
  
  @scala.inline
  def apply(): CloseSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloseSource]
  }
  
  @scala.inline
  implicit class CloseSourceMutableBuilder[Self <: CloseSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloseSource(value: closeButton | backdrop | escape_): Self = StObject.set(x, "closeSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseSourceUndefined: Self = StObject.set(x, "closeSource", js.undefined)
  }
}
