package typingsSlinky.navigationReact.mod

import typingsSlinky.navigation.mod.FluentNavigator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FluentLinkProps extends LinkProps {
  /**
    * Indicates whether to inherit the current context
    */
  var withContext: js.UndefOr[Boolean] = js.native
  /**
    * The function that fluently navigates to a State
    */
  def navigate(fluentNavigator: FluentNavigator): FluentNavigator = js.native
}

object FluentLinkProps {
  @scala.inline
  def apply(navigate: FluentNavigator => FluentNavigator): FluentLinkProps = {
    val __obj = js.Dynamic.literal(navigate = js.Any.fromFunction1(navigate))
    __obj.asInstanceOf[FluentLinkProps]
  }
  @scala.inline
  implicit class FluentLinkPropsOps[Self <: FluentLinkProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNavigate(value: FluentNavigator => FluentNavigator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWithContext(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWithContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withContext")(js.undefined)
        ret
    }
  }
  
}

