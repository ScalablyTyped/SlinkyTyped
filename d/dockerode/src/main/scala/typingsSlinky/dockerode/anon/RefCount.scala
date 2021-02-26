package typingsSlinky.dockerode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RefCount extends StObject {
  
  var RefCount: Double = js.native
  
  var Size: Double = js.native
}
object RefCount {
  
  @scala.inline
  def apply(RefCount: Double, Size: Double): RefCount = {
    val __obj = js.Dynamic.literal(RefCount = RefCount.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefCount]
  }
  
  @scala.inline
  implicit class RefCountMutableBuilder[Self <: RefCount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRefCount(value: Double): Self = StObject.set(x, "RefCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
  }
}
