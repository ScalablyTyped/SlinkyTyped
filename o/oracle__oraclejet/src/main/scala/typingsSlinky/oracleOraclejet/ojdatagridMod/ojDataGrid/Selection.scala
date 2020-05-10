package typingsSlinky.oracleOraclejet.ojdatagridMod.ojDataGrid

import typingsSlinky.oracleOraclejet.AnonColumnNumber
import typingsSlinky.oracleOraclejet.AnonRowK
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
@js.native
trait Selection[K] extends js.Object {
  var endIndex: js.UndefOr[AnonColumnNumber] = js.native
  var endKey: js.UndefOr[AnonRowK[K]] = js.native
  var startIndex: js.UndefOr[AnonColumnNumber] = js.native
  var startKey: js.UndefOr[AnonRowK[K]] = js.native
}

object Selection {
  @scala.inline
  def apply[K](): Selection[K] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Selection[K]]
  }
  @scala.inline
  implicit class SelectionOps[Self[k] <: Selection[k], K] (val x: Self[K]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[K] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[K] with Other]
    @scala.inline
    def withEndIndex(value: AnonColumnNumber): Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndIndex: Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withEndKey(value: AnonRowK[K]): Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndKey: Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endKey")(js.undefined)
        ret
    }
    @scala.inline
    def withStartIndex(value: AnonColumnNumber): Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartIndex: Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withStartKey(value: AnonRowK[K]): Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartKey: Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startKey")(js.undefined)
        ret
    }
  }
  
}

