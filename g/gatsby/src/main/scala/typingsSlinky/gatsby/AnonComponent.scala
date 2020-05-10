package typingsSlinky.gatsby

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonComponent[DataType, PageContextType] extends js.Object {
  var component: ReactComponentClass[js.Object] = js.native
  var json: AnonData[DataType, PageContextType] = js.native
  var page: AnonComponentChunkName = js.native
}

object AnonComponent {
  @scala.inline
  def apply[DataType, PageContextType](
    component: ReactComponentClass[js.Object],
    json: AnonData[DataType, PageContextType],
    page: AnonComponentChunkName
  ): AnonComponent[DataType, PageContextType] = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonComponent[DataType, PageContextType]]
  }
  @scala.inline
  implicit class AnonComponentOps[Self[datatype, pagecontexttype] <: AnonComponent[datatype, pagecontexttype], DataType, PageContextType] (val x: Self[DataType, PageContextType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[DataType, PageContextType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[DataType, PageContextType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[DataType, PageContextType]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[DataType, PageContextType]) with Other]
    @scala.inline
    def withComponent(value: ReactComponentClass[js.Object]): Self[DataType, PageContextType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJson(value: AnonData[DataType, PageContextType]): Self[DataType, PageContextType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("json")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPage(value: AnonComponentChunkName): Self[DataType, PageContextType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

