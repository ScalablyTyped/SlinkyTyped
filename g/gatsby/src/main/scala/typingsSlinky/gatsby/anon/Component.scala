package typingsSlinky.gatsby.anon

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Component[DataType, PageContextType] extends js.Object {
  var component: ReactComponentClass[js.Object]
  var json: Data[DataType, PageContextType]
  var page: ComponentChunkName
}

object Component {
  @scala.inline
  def apply[DataType, PageContextType](
    component: ReactComponentClass[js.Object],
    json: Data[DataType, PageContextType],
    page: ComponentChunkName
  ): Component[DataType, PageContextType] = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any])
    __obj.asInstanceOf[Component[DataType, PageContextType]]
  }
}

