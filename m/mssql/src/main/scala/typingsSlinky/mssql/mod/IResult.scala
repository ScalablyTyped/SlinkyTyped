package typingsSlinky.mssql.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IResult[T] extends js.Object {
  var output: StringDictionary[js.Any] = js.native
  var recordset: IRecordSet[T] = js.native
  var recordsets: js.Array[IRecordSet[T]] = js.native
  var rowsAffected: js.Array[Double] = js.native
}

object IResult {
  @scala.inline
  def apply[T](
    output: StringDictionary[js.Any],
    recordset: IRecordSet[T],
    recordsets: js.Array[IRecordSet[T]],
    rowsAffected: js.Array[Double]
  ): IResult[T] = {
    val __obj = js.Dynamic.literal(output = output.asInstanceOf[js.Any], recordset = recordset.asInstanceOf[js.Any], recordsets = recordsets.asInstanceOf[js.Any], rowsAffected = rowsAffected.asInstanceOf[js.Any])
    __obj.asInstanceOf[IResult[T]]
  }
  @scala.inline
  implicit class IResultOps[Self[t] <: IResult[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withOutput(value: StringDictionary[js.Any]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecordset(value: IRecordSet[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecordsets(value: js.Array[IRecordSet[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordsets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowsAffected(value: js.Array[Double]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowsAffected")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

