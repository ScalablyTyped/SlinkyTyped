package typingsSlinky.documentdb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Index extends js.Object {
  var DataType: String = js.native
  var Kind: IndexKind = js.native
  var Precision: Double = js.native
}

object Index {
  @scala.inline
  def apply(DataType: String, Kind: IndexKind, Precision: Double): Index = {
    val __obj = js.Dynamic.literal(DataType = DataType.asInstanceOf[js.Any], Kind = Kind.asInstanceOf[js.Any], Precision = Precision.asInstanceOf[js.Any])
    __obj.asInstanceOf[Index]
  }
  @scala.inline
  implicit class IndexOps[Self <: Index] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: IndexKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrecision(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Precision")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

