package typingsSlinky.p2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PoolOptions extends StObject {
  
  var size: js.UndefOr[Double] = js.native
}
object PoolOptions {
  
  @scala.inline
  def apply(): PoolOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PoolOptions]
  }
  
  @scala.inline
  implicit class PoolOptionsMutableBuilder[Self <: PoolOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
