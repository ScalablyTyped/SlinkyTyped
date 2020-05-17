package typingsSlinky.jointjs.mod.routers

import typingsSlinky.jointjs.mod.dia.Sides
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrthogonalRouterArguments extends js.Object {
  var elementPadding: js.UndefOr[Double] = js.native
  var padding: js.UndefOr[Sides] = js.native
}

object OrthogonalRouterArguments {
  @scala.inline
  def apply(): OrthogonalRouterArguments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrthogonalRouterArguments]
  }
  @scala.inline
  implicit class OrthogonalRouterArgumentsOps[Self <: OrthogonalRouterArguments] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withElementPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElementPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementPadding")(js.undefined)
        ret
    }
    @scala.inline
    def withPadding(value: Sides): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(js.undefined)
        ret
    }
  }
  
}

