package typingsSlinky.nextServer.anon

import typingsSlinky.nextServer.libUtilsMod.BaseContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInitialProps[C /* <: BaseContext */, IP] extends js.Object {
  var getInitialProps: js.UndefOr[js.Function1[/* context */ C, IP | js.Promise[IP]]] = js.native
}

object GetInitialProps {
  @scala.inline
  def apply[C, IP](): GetInitialProps[C, IP] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetInitialProps[C, IP]]
  }
  @scala.inline
  implicit class GetInitialPropsOps[Self[c, ip] <: GetInitialProps[c, ip], C, IP] (val x: Self[C, IP]) extends AnyVal {
    @scala.inline
    def duplicate: Self[C, IP] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[C, IP]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[C, IP]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[C, IP]) with Other]
    @scala.inline
    def withGetInitialProps(value: /* context */ C => IP | js.Promise[IP]): Self[C, IP] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInitialProps")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetInitialProps: Self[C, IP] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInitialProps")(js.undefined)
        ret
    }
  }
  
}

