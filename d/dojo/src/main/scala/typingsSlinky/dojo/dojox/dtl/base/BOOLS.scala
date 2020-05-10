package typingsSlinky.dojo.dojox.dtl.base

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/dtl/_base.BOOLS.html
  *
  *
  */
@js.native
trait BOOLS extends js.Object {
  /**
    *
    */
  var checked: Double = js.native
  /**
    *
    */
  var disabled: Double = js.native
  /**
    *
    */
  var readonly: Double = js.native
}

object BOOLS {
  @scala.inline
  def apply(checked: Double, disabled: Double, readonly: Double): BOOLS = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any])
    __obj.asInstanceOf[BOOLS]
  }
  @scala.inline
  implicit class BOOLSOps[Self <: BOOLS] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChecked(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisabled(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReadonly(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readonly")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

