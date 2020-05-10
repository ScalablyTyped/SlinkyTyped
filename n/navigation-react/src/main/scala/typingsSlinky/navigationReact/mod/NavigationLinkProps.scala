package typingsSlinky.navigationReact.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationLinkProps extends RefreshLinkProps {
  /**
    * The key of the State to navigate to
    */
  var stateKey: String = js.native
}

object NavigationLinkProps {
  @scala.inline
  def apply(stateKey: String): NavigationLinkProps = {
    val __obj = js.Dynamic.literal(stateKey = stateKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationLinkProps]
  }
  @scala.inline
  implicit class NavigationLinkPropsOps[Self <: NavigationLinkProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStateKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateKey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

