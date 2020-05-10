package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaInstanceGroupManagerStatusVersionTarget extends js.Object {
  /**
    * [Output Only] A bit indicating whether version target has been reached in
    * this managed instance group, i.e. all instances are in their target
    * version. Instances&#39; target version are specified by version field on
    * Instance Group Manager.
    */
  var isReached: js.UndefOr[Boolean] = js.native
}

object SchemaInstanceGroupManagerStatusVersionTarget {
  @scala.inline
  def apply(): SchemaInstanceGroupManagerStatusVersionTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceGroupManagerStatusVersionTarget]
  }
  @scala.inline
  implicit class SchemaInstanceGroupManagerStatusVersionTargetOps[Self <: SchemaInstanceGroupManagerStatusVersionTarget] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsReached(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isReached")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsReached: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isReached")(js.undefined)
        ret
    }
  }
  
}

