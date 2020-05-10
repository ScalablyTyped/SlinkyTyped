package typingsSlinky.blueprintjsDatetime.shortcutsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDateShortcutBase extends js.Object {
  /**
    * Set this prop to `true` to allow this shortcut to change the selected
    * times as well as the dates. By default, time components of a shortcut are
    * ignored; clicking a shortcut takes the date components of the `dateRange`
    * and combines them with the currently selected time.
    * @default false
    */
  var includeTime: js.UndefOr[Boolean] = js.native
  /** Shortcut label that appears in the list. */
  var label: String = js.native
}

object IDateShortcutBase {
  @scala.inline
  def apply(label: String): IDateShortcutBase = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDateShortcutBase]
  }
  @scala.inline
  implicit class IDateShortcutBaseOps[Self <: IDateShortcutBase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeTime(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeTime")(js.undefined)
        ret
    }
  }
  
}

