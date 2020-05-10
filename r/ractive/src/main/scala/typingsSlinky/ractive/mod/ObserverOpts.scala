package typingsSlinky.ractive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObserverOpts extends ObserverBaseOpts {
  /**
  	 * Whether or not to follow any links when observing.
  	 */
  var links: js.UndefOr[Boolean] = js.native
  /**
  	 * The function called to get an old value for the observer. This can be used to do things like freeze the initial value as the old value for all future callbacks.
  	 */
  var old: js.UndefOr[ObserverCallback[Ractive[Ractive[_]]]] = js.native
  /**
  	 * Whether or not to use strict equality when checking to see if a value has changed. Defaults to false.
  	 */
  var strict: js.UndefOr[Boolean] = js.native
}

object ObserverOpts {
  @scala.inline
  def apply(): ObserverOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObserverOpts]
  }
  @scala.inline
  implicit class ObserverOptsOps[Self <: ObserverOpts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLinks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("links")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("links")(js.undefined)
        ret
    }
    @scala.inline
    def withOld(value: ObserverCallback[Ractive[Ractive[_]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("old")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOld: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("old")(js.undefined)
        ret
    }
    @scala.inline
    def withStrict(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrict: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strict")(js.undefined)
        ret
    }
  }
  
}

