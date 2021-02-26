package typingsSlinky.reactBootstrapTableNext.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Props[T /* <: js.Object */] extends StObject {
  
  var props: Data[T] = js.native
}
object Props {
  
  @scala.inline
  def apply[T /* <: js.Object */](props: Data[T]): Props[T] = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props[T]]
  }
  
  @scala.inline
  implicit class PropsMutableBuilder[Self <: Props[_], T /* <: js.Object */] (val x: Self with Props[T]) extends AnyVal {
    
    @scala.inline
    def setProps(value: Data[T]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
