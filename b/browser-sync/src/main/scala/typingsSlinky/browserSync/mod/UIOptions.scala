package typingsSlinky.browserSync.mod

import typingsSlinky.browserSync.anon.Port
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UIOptions extends StObject {
  
  /** set the default port */
  var port: js.UndefOr[Double] = js.native
  
  /** set the default weinre port */
  var weinre: js.UndefOr[Port] = js.native
}
object UIOptions {
  
  @scala.inline
  def apply(): UIOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIOptions]
  }
  
  @scala.inline
  implicit class UIOptionsMutableBuilder[Self <: UIOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    @scala.inline
    def setWeinre(value: Port): Self = StObject.set(x, "weinre", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeinreUndefined: Self = StObject.set(x, "weinre", js.undefined)
  }
}
