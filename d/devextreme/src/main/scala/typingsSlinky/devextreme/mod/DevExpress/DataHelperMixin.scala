package typingsSlinky.devextreme.mod.DevExpress

import typingsSlinky.devextreme.mod.DevExpress.data.DataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataHelperMixin extends js.Object {
  /** Gets the DataSource instance. */
  def getDataSource(): DataSource = js.native
}

object DataHelperMixin {
  @scala.inline
  def apply(getDataSource: () => DataSource): DataHelperMixin = {
    val __obj = js.Dynamic.literal(getDataSource = js.Any.fromFunction0(getDataSource))
    __obj.asInstanceOf[DataHelperMixin]
  }
  @scala.inline
  implicit class DataHelperMixinOps[Self <: DataHelperMixin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetDataSource(value: () => DataSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDataSource")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

