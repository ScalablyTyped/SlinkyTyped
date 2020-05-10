package typingsSlinky.next.utilsMod

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.ReactFragment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined next.next/dist/next-server/lib/utils.RenderPageResult & {  styles ? :std.Array<react.react.ReactElement> | react.react.ReactFragment} */
@js.native
trait DocumentInitialProps extends js.Object {
  var head: js.UndefOr[js.Array[ReactElement | Null]] = js.native
  var html: String = js.native
  var styles: js.UndefOr[js.Array[ReactElement] | ReactFragment] = js.native
}

object DocumentInitialProps {
  @scala.inline
  def apply(html: String): DocumentInitialProps = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentInitialProps]
  }
  @scala.inline
  implicit class DocumentInitialPropsOps[Self <: DocumentInitialProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHtml(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHead(value: js.Array[ReactElement | Null]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("head")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHead: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("head")(js.undefined)
        ret
    }
    @scala.inline
    def withStyles(value: js.Array[ReactElement] | ReactFragment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.undefined)
        ret
    }
  }
  
}

