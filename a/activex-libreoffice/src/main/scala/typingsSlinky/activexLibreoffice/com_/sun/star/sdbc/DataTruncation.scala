package typingsSlinky.activexLibreoffice.com_.sun.star.sdbc

import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * reports a {@link DataTruncation} warning, on reads, or is thrown as a {@link DataTruncation} exception, on writes, when a data value is unexpectedly
  * truncated.
  *
  * The SQL state for a `DataTruncation` is `01004` .
  */
@js.native
trait DataTruncation extends SQLException {
  /**
    * contains the number of bytes of data that should have been transferred. This number may be approximate if data conversions were being performed. The
    * value may be `-1` if the size is unknown.
    */
  var DataSize: Double = js.native
  /** is `TRUE` if a read was truncated. */
  var DuringRead: Boolean = js.native
  /** is the index of the parameter or column value. */
  var Index: Double = js.native
  /** is `TRUE` if a parameter value is truncated. */
  var IsParameter: Boolean = js.native
  /** contains the number of bytes of data actually transferred. The value may be `-1` if the size is unknown. */
  var TransferSize: Double = js.native
}

object DataTruncation {
  @scala.inline
  def apply(
    Context: XInterface,
    DataSize: Double,
    DuringRead: Boolean,
    ErrorCode: Double,
    Index: Double,
    IsParameter: Boolean,
    Message: String,
    NextException: js.Any,
    SQLState: String,
    TransferSize: Double
  ): DataTruncation = {
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], DataSize = DataSize.asInstanceOf[js.Any], DuringRead = DuringRead.asInstanceOf[js.Any], ErrorCode = ErrorCode.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], IsParameter = IsParameter.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], NextException = NextException.asInstanceOf[js.Any], SQLState = SQLState.asInstanceOf[js.Any], TransferSize = TransferSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTruncation]
  }
  @scala.inline
  implicit class DataTruncationOps[Self <: DataTruncation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDuringRead(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DuringRead")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsParameter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsParameter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransferSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransferSize")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

