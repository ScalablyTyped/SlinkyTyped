package typingsSlinky.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CenterOptions extends js.Object {
  var eles: CollectionArgument | Selector = js.native
}

object CenterOptions {
  @scala.inline
  def apply(eles: CollectionArgument | Selector): CenterOptions = {
    val __obj = js.Dynamic.literal(eles = eles.asInstanceOf[js.Any])
    __obj.asInstanceOf[CenterOptions]
  }
  @scala.inline
  implicit class CenterOptionsOps[Self <: CenterOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEles(value: CollectionArgument | Selector): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eles")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

