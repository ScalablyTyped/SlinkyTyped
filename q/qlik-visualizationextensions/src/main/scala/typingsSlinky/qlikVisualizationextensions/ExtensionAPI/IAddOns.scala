package typingsSlinky.qlikVisualizationextensions.ExtensionAPI

import typingsSlinky.qlikVisualizationextensions.qlikVisualizationextensionsStrings.addons
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAddOns extends js.Object {
  var uses: addons = js.native
}

object IAddOns {
  @scala.inline
  def apply(uses: addons): IAddOns = {
    val __obj = js.Dynamic.literal(uses = uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAddOns]
  }
  @scala.inline
  implicit class IAddOnsOps[Self <: IAddOns] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUses(value: addons): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uses")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

