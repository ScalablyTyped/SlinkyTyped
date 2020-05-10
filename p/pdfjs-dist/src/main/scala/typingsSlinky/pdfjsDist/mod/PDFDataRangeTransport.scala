package typingsSlinky.pdfjsDist.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PDFDataRangeTransport extends js.Object {
  def abort(): Unit = js.native
  def addProgressListener(listener: PDFDataRangeTransportListener): Unit = js.native
  def addProgressiveDoneListener(listener: PDFDataRangeTransportListener): Unit = js.native
  def addProgressiveReadListener(listener: PDFDataRangeTransportListener): Unit = js.native
  def addRangeListener(listener: PDFDataRangeTransportListener): Unit = js.native
  def onDataProgress(loaded: Double, total: Double): Unit = js.native
  def onDataProgressiveDone(): Unit = js.native
  def onDataProgressiveRead(chunk: js.Any): Unit = js.native
  def onDataRange(begin: Double, chunk: js.Any): Unit = js.native
  def requestDataRange(begin: Double, end: Double): Unit = js.native
  def transportReady(): Unit = js.native
}

object PDFDataRangeTransport {
  @scala.inline
  def apply(
    abort: () => Unit,
    addProgressListener: PDFDataRangeTransportListener => Unit,
    addProgressiveDoneListener: PDFDataRangeTransportListener => Unit,
    addProgressiveReadListener: PDFDataRangeTransportListener => Unit,
    addRangeListener: PDFDataRangeTransportListener => Unit,
    onDataProgress: (Double, Double) => Unit,
    onDataProgressiveDone: () => Unit,
    onDataProgressiveRead: js.Any => Unit,
    onDataRange: (Double, js.Any) => Unit,
    requestDataRange: (Double, Double) => Unit,
    transportReady: () => Unit
  ): PDFDataRangeTransport = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), addProgressListener = js.Any.fromFunction1(addProgressListener), addProgressiveDoneListener = js.Any.fromFunction1(addProgressiveDoneListener), addProgressiveReadListener = js.Any.fromFunction1(addProgressiveReadListener), addRangeListener = js.Any.fromFunction1(addRangeListener), onDataProgress = js.Any.fromFunction2(onDataProgress), onDataProgressiveDone = js.Any.fromFunction0(onDataProgressiveDone), onDataProgressiveRead = js.Any.fromFunction1(onDataProgressiveRead), onDataRange = js.Any.fromFunction2(onDataRange), requestDataRange = js.Any.fromFunction2(requestDataRange), transportReady = js.Any.fromFunction0(transportReady))
    __obj.asInstanceOf[PDFDataRangeTransport]
  }
  @scala.inline
  implicit class PDFDataRangeTransportOps[Self <: PDFDataRangeTransport] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbort(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abort")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAddProgressListener(value: PDFDataRangeTransportListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addProgressListener")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddProgressiveDoneListener(value: PDFDataRangeTransportListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addProgressiveDoneListener")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddProgressiveReadListener(value: PDFDataRangeTransportListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addProgressiveReadListener")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddRangeListener(value: PDFDataRangeTransportListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addRangeListener")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnDataProgress(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDataProgress")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOnDataProgressiveDone(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDataProgressiveDone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnDataProgressiveRead(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDataProgressiveRead")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnDataRange(value: (Double, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDataRange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRequestDataRange(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestDataRange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withTransportReady(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transportReady")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

