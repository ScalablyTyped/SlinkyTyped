package typingsSlinky.node.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Once extends StObject {
  
  var once: Boolean = js.native
}
object Once {
  
  @scala.inline
  def apply(once: Boolean): Once = {
    val __obj = js.Dynamic.literal(once = once.asInstanceOf[js.Any])
    __obj.asInstanceOf[Once]
  }
  
  @scala.inline
  implicit class OnceMutableBuilder[Self <: Once] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnce(value: Boolean): Self = StObject.set(x, "once", value.asInstanceOf[js.Any])
  }
}
