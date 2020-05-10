package typingsSlinky.nextReduxWrapper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WrappedAppProps extends js.Object {
  var initialProps: js.Any = js.native
  var initialState: js.Any = js.native
  var isServer: Boolean = js.native
}

object WrappedAppProps {
  @scala.inline
  def apply(initialProps: js.Any, initialState: js.Any, isServer: Boolean): WrappedAppProps = {
    val __obj = js.Dynamic.literal(initialProps = initialProps.asInstanceOf[js.Any], initialState = initialState.asInstanceOf[js.Any], isServer = isServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrappedAppProps]
  }
  @scala.inline
  implicit class WrappedAppPropsOps[Self <: WrappedAppProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInitialProps(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialProps")(value.asInstanceOf[js.Any])
        ret
    }
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

