package typingsSlinky.protonNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stretchy extends js.Object {
  /**
    * Whether the component should stretch to fill the available space. Defaults to true.
    *
    * Excluded on:
    * - Tabs
    * - Grid children
    * - Combobox/RadioButton Items
    * - MenuBar
    */
  var stretchy: js.UndefOr[Boolean] = js.native
}

object Stretchy {
  @scala.inline
  def apply(): Stretchy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Stretchy]
  }
  @scala.inline
  implicit class StretchyOps[Self <: Stretchy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStretchy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stretchy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStretchy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stretchy")(js.undefined)
        ret
    }
  }
  
}

