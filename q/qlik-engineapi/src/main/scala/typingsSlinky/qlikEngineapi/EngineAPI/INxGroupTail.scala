package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxGroupTail
  */
@js.native
trait INxGroupTail extends js.Object {
  /**
    * Number of elements that are part of the next tail.
    * This number depends on the paging, more particularly it depends on the values defined in qTop and qHeight
    * This parameter is optional. Is not shown if the value is 0.
    */
  var qDown: js.UndefOr[Double] = js.native
  /**
    * Number of elements that are part of the previous tail.
    * This number depends on the paging, more particularly it depends on the values defined in qTop and qHeight
    * This parameter is optional. Is not shown if the value is 0.
    */
  var qUp: js.UndefOr[Double] = js.native
}

object INxGroupTail {
  @scala.inline
  def apply(): INxGroupTail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[INxGroupTail]
  }
  @scala.inline
  implicit class INxGroupTailOps[Self <: INxGroupTail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQDown(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qDown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qDown")(js.undefined)
        ret
    }
    @scala.inline
    def withQUp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qUp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQUp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qUp")(js.undefined)
        ret
    }
  }
  
}

