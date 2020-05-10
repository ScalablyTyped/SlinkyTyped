package typingsSlinky.officeUiFabricReact.listTypesMod

import org.scalajs.dom.raw.HTMLDivElement
import typingsSlinky.react.mod.ClassAttributes
import typingsSlinky.react.mod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPageProps[T]
  extends HTMLAttributes[HTMLDivElement]
     with ClassAttributes[HTMLDivElement] {
  /**
    * The allocation data for the page.
    */
  var page: IPage[T] = js.native
}

object IPageProps {
  @scala.inline
  def apply[T](page: IPage[T]): IPageProps[T] = {
    val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPageProps[T]]
  }
  @scala.inline
  implicit class IPagePropsOps[Self[t] <: IPageProps[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withPage(value: IPage[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

