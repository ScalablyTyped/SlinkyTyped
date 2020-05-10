package typingsSlinky.datatablesNetColreorder.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColReorderSettings extends js.Object {
  /*
    * Number of columns (counting from the left) to disallow reordering of, '0' in default
    */
  var fixedColumnsLeft: js.UndefOr[Double] = js.native
  /*
    * Number of columns (counting from the right) to disallow reordering of, '0' in default
    */
  var fixedColumnsRight: js.UndefOr[Double] = js.native
  /*
    * Set a default order for the columns in the table
    */
  var order: js.UndefOr[js.Array[Double]] = js.native
  /*
    * Enable / disable live reordering of columns during a drag, 'true' in default
    */
  var realtime: js.UndefOr[Boolean] = js.native
  /*
    * Callback after reorder
    */
  def reorderCallback(): Unit = js.native
}

object ColReorderSettings {
  @scala.inline
  def apply(reorderCallback: () => Unit): ColReorderSettings = {
    val __obj = js.Dynamic.literal(reorderCallback = js.Any.fromFunction0(reorderCallback))
    __obj.asInstanceOf[ColReorderSettings]
  }
  @scala.inline
  implicit class ColReorderSettingsOps[Self <: ColReorderSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReorderCallback(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reorderCallback")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFixedColumnsLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedColumnsLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixedColumnsLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedColumnsLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withFixedColumnsRight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedColumnsRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixedColumnsRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedColumnsRight")(js.undefined)
        ret
    }
    @scala.inline
    def withOrder(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(js.undefined)
        ret
    }
    @scala.inline
    def withRealtime(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("realtime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRealtime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("realtime")(js.undefined)
        ret
    }
  }
  
}

