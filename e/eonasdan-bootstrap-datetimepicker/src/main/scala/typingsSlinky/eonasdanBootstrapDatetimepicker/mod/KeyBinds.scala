package typingsSlinky.eonasdanBootstrapDatetimepicker.mod

import typingsSlinky.eonasdanBootstrapDatetimepicker.mod._Global_.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyBinds extends js.Object {
  var `control down`: js.UndefOr[js.Function1[/* widget */ JQuery | Boolean, _]] = js.native
  var `control space`: js.UndefOr[js.Function1[/* widget */ JQuery, _]] = js.native
  var `control up`: js.UndefOr[js.Function1[/* widget */ JQuery | Boolean, _]] = js.native
  var delete: js.UndefOr[js.Function0[_]] = js.native
  var down: js.UndefOr[js.Function1[/* widget */ JQuery | Boolean, _]] = js.native
  var enter: js.UndefOr[js.Function0[_]] = js.native
  var escape: js.UndefOr[js.Function0[_]] = js.native
  var left: js.UndefOr[js.Function1[/* widget */ JQuery | Boolean, _]] = js.native
  var pageDown: js.UndefOr[js.Function1[/* widget */ JQuery | Boolean, _]] = js.native
  var pageUp: js.UndefOr[js.Function1[/* widget */ JQuery | Boolean, _]] = js.native
  var right: js.UndefOr[js.Function1[/* widget */ JQuery | Boolean, _]] = js.native
  var t: js.UndefOr[js.Function0[_]] = js.native
  var up: js.UndefOr[js.Function1[/* widget */ JQuery | Boolean, _]] = js.native
}

object KeyBinds {
  @scala.inline
  def apply(): KeyBinds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyBinds]
  }
  @scala.inline
  implicit class KeyBindsOps[Self <: KeyBinds] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withControl down`(value: /* widget */ JQuery | Boolean => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("control down")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withoutControl down`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("control down")(js.undefined)
        ret
    }
    @scala.inline
    def `withControl space`(value: /* widget */ JQuery => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("control space")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withoutControl space`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("control space")(js.undefined)
        ret
    }
    @scala.inline
    def `withControl up`(value: /* widget */ JQuery | Boolean => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("control up")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withoutControl up`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("control up")(js.undefined)
        ret
    }
    @scala.inline
    def withDelete(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutDelete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.undefined)
        ret
    }
    @scala.inline
    def withDown(value: /* widget */ JQuery | Boolean => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("down")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("down")(js.undefined)
        ret
    }
    @scala.inline
    def withEnter(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enter")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enter")(js.undefined)
        ret
    }
    @scala.inline
    def withEscape(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escape")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutEscape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escape")(js.undefined)
        ret
    }
    @scala.inline
    def withLeft(value: /* widget */ JQuery | Boolean => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(js.undefined)
        ret
    }
    @scala.inline
    def withPageDown(value: /* widget */ JQuery | Boolean => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageDown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPageDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageDown")(js.undefined)
        ret
    }
    @scala.inline
    def withPageUp(value: /* widget */ JQuery | Boolean => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageUp")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPageUp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageUp")(js.undefined)
        ret
    }
    @scala.inline
    def withRight(value: /* widget */ JQuery | Boolean => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(js.undefined)
        ret
    }
    @scala.inline
    def withT(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("t")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutT: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("t")(js.undefined)
        ret
    }
    @scala.inline
    def withUp(value: /* widget */ JQuery | Boolean => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("up")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutUp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("up")(js.undefined)
        ret
    }
  }
  
}

