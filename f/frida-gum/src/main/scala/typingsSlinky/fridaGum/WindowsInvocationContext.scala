package typingsSlinky.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.fridaGum.InvocationContext because Already inherited */ @js.native
trait WindowsInvocationContext extends PortableInvocationContext {
  
  /**
    * Current OS error value (you may replace it).
    */
  var lastError: Double = js.native
}
object WindowsInvocationContext {
  
  @scala.inline
  def apply(
    context: CpuContext,
    depth: Double,
    lastError: Double,
    returnAddress: NativePointer,
    threadId: ThreadId
  ): WindowsInvocationContext = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], lastError = lastError.asInstanceOf[js.Any], returnAddress = returnAddress.asInstanceOf[js.Any], threadId = threadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowsInvocationContext]
  }
  
  @scala.inline
  implicit class WindowsInvocationContextMutableBuilder[Self <: WindowsInvocationContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLastError(value: Double): Self = StObject.set(x, "lastError", value.asInstanceOf[js.Any])
  }
}
