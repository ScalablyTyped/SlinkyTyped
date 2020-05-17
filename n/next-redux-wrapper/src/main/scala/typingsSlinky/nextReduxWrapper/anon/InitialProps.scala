package typingsSlinky.nextReduxWrapper.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InitialProps extends js.Object {
  var initialState: js.Any = js.native
  var isServer: Boolean = js.native
}

object InitialProps {
  @scala.inline
  def apply(initialState: js.Any, isServer: Boolean): InitialProps = {
    val __obj = js.Dynamic.literal(initialState = initialState.asInstanceOf[js.Any], isServer = isServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitialProps]
  }
  @scala.inline
  implicit class InitialPropsOps[Self <: InitialProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInitialState(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsServer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isServer")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

