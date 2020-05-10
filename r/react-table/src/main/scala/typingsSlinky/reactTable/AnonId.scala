package typingsSlinky.reactTable

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.reactTable.mod.HeaderProps
import typingsSlinky.reactTable.mod.IdType
import typingsSlinky.reactTable.mod.Renderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonId[D /* <: js.Object */] extends js.Object {
  var Header: Renderer[HeaderProps[D]] = js.native
  var id: IdType[D] = js.native
}

object AnonId {
  @scala.inline
  def apply[D](Header: Renderer[HeaderProps[D]], id: IdType[D]): AnonId[D] = {
    val __obj = js.Dynamic.literal(Header = Header.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonId[D]]
  }
  @scala.inline
  implicit class AnonIdOps[Self[d] <: AnonId[d], D] (val x: Self[D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[D] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[D] with Other]
    @scala.inline
    def withHeaderReactElement(value: ReactElement): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderFunctionComponent(value: ReactComponentClass[HeaderProps[D]]): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderComponentClass(value: ReactComponentClass[HeaderProps[D]]): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeader(value: Renderer[HeaderProps[D]]): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: IdType[D]): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

