package typingsSlinky.googleapis.alphaMod.computeAlpha

import typingsSlinky.googleapis.AnonCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaAutoscalersScopedList extends js.Object {
  /**
    * [Output Only] A list of autoscalers contained in this scope.
    */
  var autoscalers: js.UndefOr[js.Array[SchemaAutoscaler]] = js.native
  /**
    * [Output Only] Informational warning which replaces the list of
    * autoscalers when the list is empty.
    */
  var warning: js.UndefOr[AnonCode] = js.native
}

object SchemaAutoscalersScopedList {
  @scala.inline
  def apply(): SchemaAutoscalersScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAutoscalersScopedList]
  }
  @scala.inline
  implicit class SchemaAutoscalersScopedListOps[Self <: SchemaAutoscalersScopedList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoscalers(value: js.Array[SchemaAutoscaler]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoscalers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoscalers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoscalers")(js.undefined)
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

