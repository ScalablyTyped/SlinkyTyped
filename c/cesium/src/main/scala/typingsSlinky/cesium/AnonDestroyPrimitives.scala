package typingsSlinky.cesium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDestroyPrimitives extends js.Object {
  var destroyPrimitives: js.UndefOr[Boolean] = js.native
  var show: js.UndefOr[Boolean] = js.native
}

object AnonDestroyPrimitives {
  @scala.inline
  def apply(): AnonDestroyPrimitives = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonDestroyPrimitives]
  }
  @scala.inline
  implicit class AnonDestroyPrimitivesOps[Self <: AnonDestroyPrimitives] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestroyPrimitives(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroyPrimitives")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestroyPrimitives: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroyPrimitives")(js.undefined)
        ret
    }
    @scala.inline
    def withShow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.undefined)
        ret
    }
  }
  
}

