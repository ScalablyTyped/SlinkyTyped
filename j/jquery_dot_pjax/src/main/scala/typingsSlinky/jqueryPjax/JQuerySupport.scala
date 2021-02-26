package typingsSlinky.jqueryPjax

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuerySupport extends StObject {
  
  /**
    * A boolean value indicates if pjax is supported by the browser.
    */
  var pjax: Boolean = js.native
}
object JQuerySupport {
  
  @scala.inline
  def apply(pjax: Boolean): JQuerySupport = {
    val __obj = js.Dynamic.literal(pjax = pjax.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQuerySupport]
  }
  
  @scala.inline
  implicit class JQuerySupportMutableBuilder[Self <: JQuerySupport] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPjax(value: Boolean): Self = StObject.set(x, "pjax", value.asInstanceOf[js.Any])
  }
}
