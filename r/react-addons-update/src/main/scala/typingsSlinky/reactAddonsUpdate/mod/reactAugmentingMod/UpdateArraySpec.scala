package typingsSlinky.reactAddonsUpdate.mod.reactAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateArraySpec extends UpdateSpecCommand {
  @JSName("$push")
  var $push: js.UndefOr[js.Array[_]] = js.native
  @JSName("$splice")
  var $splice: js.UndefOr[js.Array[js.Array[_]]] = js.native
  @JSName("$unshift")
  var $unshift: js.UndefOr[js.Array[_]] = js.native
}

object UpdateArraySpec {
  @scala.inline
  def apply(): UpdateArraySpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateArraySpec]
  }
  @scala.inline
  implicit class UpdateArraySpecOps[Self <: UpdateArraySpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$push(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$push")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$push: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$push")(js.undefined)
        ret
    }
    @scala.inline
    def with$splice(value: js.Array[js.Array[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$splice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$splice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$splice")(js.undefined)
        ret
    }
    @scala.inline
    def with$unshift(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$unshift")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$unshift: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$unshift")(js.undefined)
        ret
    }
  }
  
}

