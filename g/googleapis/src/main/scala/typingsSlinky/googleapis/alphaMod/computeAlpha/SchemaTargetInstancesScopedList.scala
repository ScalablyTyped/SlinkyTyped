package typingsSlinky.googleapis.alphaMod.computeAlpha

import typingsSlinky.googleapis.AnonCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaTargetInstancesScopedList extends js.Object {
  /**
    * A list of target instances contained in this scope.
    */
  var targetInstances: js.UndefOr[js.Array[SchemaTargetInstance]] = js.native
  /**
    * Informational warning which replaces the list of addresses when the list
    * is empty.
    */
  var warning: js.UndefOr[AnonCode] = js.native
}

object SchemaTargetInstancesScopedList {
  @scala.inline
  def apply(): SchemaTargetInstancesScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetInstancesScopedList]
  }
  @scala.inline
  implicit class SchemaTargetInstancesScopedListOps[Self <: SchemaTargetInstancesScopedList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTargetInstances(value: js.Array[SchemaTargetInstance]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetInstances")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetInstances: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetInstances")(js.undefined)
        ret
    }
    @scala.inline
    def withWarning(value: AnonCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWarning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warning")(js.undefined)
        ret
    }
  }
  
}

