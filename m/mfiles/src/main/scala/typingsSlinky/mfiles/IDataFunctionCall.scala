package typingsSlinky.mfiles

import typingsSlinky.mfiles.MFiles.MFDataFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDataFunctionCall extends js.Object {
  val DataFunction: MFDataFunction = js.native
  def SetDataDate(): Unit = js.native
  def SetDataDaysFrom(): Unit = js.native
  def SetDataDaysTo(): Unit = js.native
  def SetDataInitialCharGroup(Locale: Double): Unit = js.native
  def SetDataIntegerSegment(SegmentSize: Double): Unit = js.native
  def SetDataLeftChars(Characters: Double): Unit = js.native
  def SetDataMonth(): Unit = js.native
  def SetDataNoOp(): Unit = js.native
  def SetDataYear(): Unit = js.native
  def SetDataYearAndMonth(): Unit = js.native
}

object IDataFunctionCall {
  @scala.inline
  def apply(
    DataFunction: MFDataFunction,
    SetDataDate: () => Unit,
    SetDataDaysFrom: () => Unit,
    SetDataDaysTo: () => Unit,
    SetDataInitialCharGroup: Double => Unit,
    SetDataIntegerSegment: Double => Unit,
    SetDataLeftChars: Double => Unit,
    SetDataMonth: () => Unit,
    SetDataNoOp: () => Unit,
    SetDataYear: () => Unit,
    SetDataYearAndMonth: () => Unit
  ): IDataFunctionCall = {
    val __obj = js.Dynamic.literal(DataFunction = DataFunction.asInstanceOf[js.Any], SetDataDate = js.Any.fromFunction0(SetDataDate), SetDataDaysFrom = js.Any.fromFunction0(SetDataDaysFrom), SetDataDaysTo = js.Any.fromFunction0(SetDataDaysTo), SetDataInitialCharGroup = js.Any.fromFunction1(SetDataInitialCharGroup), SetDataIntegerSegment = js.Any.fromFunction1(SetDataIntegerSegment), SetDataLeftChars = js.Any.fromFunction1(SetDataLeftChars), SetDataMonth = js.Any.fromFunction0(SetDataMonth), SetDataNoOp = js.Any.fromFunction0(SetDataNoOp), SetDataYear = js.Any.fromFunction0(SetDataYear), SetDataYearAndMonth = js.Any.fromFunction0(SetDataYearAndMonth))
    __obj.asInstanceOf[IDataFunctionCall]
  }
  @scala.inline
  implicit class IDataFunctionCallOps[Self <: IDataFunctionCall] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataFunction(value: MFDataFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataFunction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetDataDate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetDataDate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetDataDaysFrom(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetDataDaysFrom")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetDataDaysTo(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetDataDaysTo")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetDataInitialCharGroup(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetDataInitialCharGroup")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetDataIntegerSegment(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetDataIntegerSegment")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetDataLeftChars(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetDataLeftChars")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetDataMonth(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetDataMonth")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetDataNoOp(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetDataNoOp")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetDataYear(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetDataYear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetDataYearAndMonth(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetDataYearAndMonth")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

