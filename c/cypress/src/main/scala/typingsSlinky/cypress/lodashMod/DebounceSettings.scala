package typingsSlinky.cypress.lodashMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// debounce
@js.native
trait DebounceSettings extends js.Object {
  /**
    * Specify invoking on the leading edge of the timeout.
    */
  var leading: js.UndefOr[Boolean] = js.native
  /**
    * The maximum time func is allowed to be delayed before it’s invoked.
    */
  var maxWait: js.UndefOr[Double] = js.native
  /**
    * Specify invoking on the trailing edge of the timeout.
    */
  var trailing: js.UndefOr[Boolean] = js.native
}

object DebounceSettings {
  @scala.inline
  def apply(): DebounceSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DebounceSettings]
  }
  @scala.inline
  implicit class DebounceSettingsOps[Self <: DebounceSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLeading(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leading")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxWait(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWait")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxWait: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWait")(js.undefined)
        ret
    }
    @scala.inline
    def withTrailing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trailing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrailing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trailing")(js.undefined)
        ret
    }
  }
  
}

