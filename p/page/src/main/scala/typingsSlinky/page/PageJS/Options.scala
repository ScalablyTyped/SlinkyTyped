package typingsSlinky.page.PageJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * bind to click events (default = true)
    */
  var click: Boolean = js.native
  /**
    * remove URL encoding frfrom path components
    */
  var decodeURLComponents: Boolean = js.native
  /**
    * perform initial dispatch (default = true)
    */
  var dispatch: Boolean = js.native
  /**
    * add #!before urls (default = false)
    */
  var hashbang: Boolean = js.native
  /**
    * bind to popstate (default = true)
    */
  var popstate: Boolean = js.native
}

object Options {
  @scala.inline
  def apply(
    click: Boolean,
    decodeURLComponents: Boolean,
    dispatch: Boolean,
    hashbang: Boolean,
    popstate: Boolean
  ): Options = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], decodeURLComponents = decodeURLComponents.asInstanceOf[js.Any], dispatch = dispatch.asInstanceOf[js.Any], hashbang = hashbang.asInstanceOf[js.Any], popstate = popstate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDecodeURLComponents(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decodeURLComponents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDispatch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHashbang(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashbang")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPopstate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popstate")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

