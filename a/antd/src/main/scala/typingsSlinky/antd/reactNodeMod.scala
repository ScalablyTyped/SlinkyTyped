package typingsSlinky.antd

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antd/lib/_util/reactNode", JSImport.Namespace)
@js.native
object reactNodeMod extends js.Object {
  
  def cloneElement(element: ReactElement): ReactElement = js.native
  def cloneElement(element: ReactElement, props: js.Any): ReactElement = js.native
  
  def replaceElement(element: ReactElement, replacement: ReactElement, props: js.Any): ReactElement = js.native
  
  @js.native
  object isValidElement extends js.Object {
    
    def apply[P](): /* is react.react.ReactElement */ Boolean = js.native
    def apply[P](`object`: js.Object): /* is react.react.ReactElement */ Boolean = js.native
  }
}
