package typingsSlinky.googleapis.betaMod.computeBeta

import typingsSlinky.googleapis.AnonCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaAcceleratorTypesScopedList extends js.Object {
  /**
    * [Output Only] A list of accelerator types contained in this scope.
    */
  var acceleratorTypes: js.UndefOr[js.Array[SchemaAcceleratorType]] = js.native
  /**
    * [Output Only] An informational warning that appears when the accelerator
    * types list is empty.
    */
  var warning: js.UndefOr[AnonCode] = js.native
}

object SchemaAcceleratorTypesScopedList {
  @scala.inline
  def apply(): SchemaAcceleratorTypesScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAcceleratorTypesScopedList]
  }
  @scala.inline
  implicit class SchemaAcceleratorTypesScopedListOps[Self <: SchemaAcceleratorTypesScopedList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcceleratorTypes(value: js.Array[SchemaAcceleratorType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceleratorTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcceleratorTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceleratorTypes")(js.undefined)
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

