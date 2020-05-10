package typingsSlinky.ractive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinkOpts extends js.Object {
  /**
  	 * The ractive instance in which to find the source keypath.
  	 */
  var instance: js.UndefOr[Ractive[Ractive[_]]] = js.native
  /**
  	 * The keypath to use for the link when handling a shuffle. For instance foo.1.bar will not shuffle with foo, but .bar will.
  	 */
  var keypath: js.UndefOr[String] = js.native
  /**
  	 * The ractive instance in which to find the source keypath.
  	 */
  var ractive: js.UndefOr[Ractive[Ractive[_]]] = js.native
}

object LinkOpts {
  @scala.inline
  def apply(): LinkOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinkOpts]
  }
  @scala.inline
  implicit class LinkOptsOps[Self <: LinkOpts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstance(value: Ractive[Ractive[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instance")(js.undefined)
        ret
    }
    @scala.inline
    def withKeypath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keypath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeypath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keypath")(js.undefined)
        ret
    }
    @scala.inline
    def withRactive(value: Ractive[Ractive[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ractive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRactive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ractive")(js.undefined)
        ret
    }
  }
  
}

