package typingsSlinky.antd

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/_util/reactNode", JSImport.Namespace)
@js.native
object reactNodeMod extends js.Object {
  def cloneElement(element: TagMod[Any]): ReactElement = js.native
  def cloneElement(element: TagMod[Any], props: js.Any): ReactElement = js.native
  def replaceElement(element: TagMod[Any], replacement: TagMod[Any], props: js.Any): TagMod[Any] = js.native
  @js.native
  object isValidElement extends js.Object {
    def apply[P](): /* is react.react.ReactElement */ Boolean = js.native
    def apply[P](`object`: js.Object): /* is react.react.ReactElement */ Boolean = js.native
  }
  
}

