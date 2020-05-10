package typingsSlinky.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NgContentDef extends js.Object {
  /**
    * this index is checked against NodeDef.ngContentIndex to find the nodes
    * that are matched by this ng-content.
    * Note that a NodeDef with an ng-content can be reprojected, i.e.
    * have a ngContentIndex on its own.
    */
  var index: Double = js.native
}

object NgContentDef {
  @scala.inline
  def apply(index: Double): NgContentDef = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[NgContentDef]
  }
  @scala.inline
  implicit class NgContentDefOps[Self <: NgContentDef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

