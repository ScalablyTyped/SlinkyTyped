package typingsSlinky.reactDataGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIndexes extends js.Object {
  var indexes: js.UndefOr[js.Array[Double]] = js.native
  var isSelectedKey: js.UndefOr[String] = js.native
  var keys: js.UndefOr[AnonRowKey] = js.native
}

object AnonIndexes {
  @scala.inline
  def apply(): AnonIndexes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonIndexes]
  }
  @scala.inline
  implicit class AnonIndexesOps[Self <: AnonIndexes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndexes(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndexes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexes")(js.undefined)
        ret
    }
    @scala.inline
    def withIsSelectedKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSelectedKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsSelectedKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSelectedKey")(js.undefined)
        ret
    }
    @scala.inline
    def withKeys(value: AnonRowKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keys")(js.undefined)
        ret
    }
  }
  
}

