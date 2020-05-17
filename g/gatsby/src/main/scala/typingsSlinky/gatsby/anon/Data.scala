package typingsSlinky.gatsby.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Data[DataType, PageContextType] extends js.Object {
  var data: DataType = js.native
  var pageContext: PageContextType = js.native
}

object Data {
  @scala.inline
  def apply[DataType, PageContextType](data: DataType, pageContext: PageContextType): Data[DataType, PageContextType] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], pageContext = pageContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data[DataType, PageContextType]]
  }
  @scala.inline
  implicit class DataOps[Self[datatype, pagecontexttype] <: Data[datatype, pagecontexttype], DataType, PageContextType] (val x: Self[DataType, PageContextType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[DataType, PageContextType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[DataType, PageContextType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[DataType, PageContextType]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[DataType, PageContextType]) with Other]
    @scala.inline
    def withData(value: DataType): Self[DataType, PageContextType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageContext(value: PageContextType): Self[DataType, PageContextType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageContext")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

