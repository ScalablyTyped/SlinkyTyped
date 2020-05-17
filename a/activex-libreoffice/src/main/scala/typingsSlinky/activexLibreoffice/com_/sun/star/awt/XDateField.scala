package typingsSlinky.activexLibreoffice.com_.sun.star.awt

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.activexLibreoffice.com_.sun.star.util.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** gives access to the value and settings of a date field. */
@js.native
trait XDateField extends XInterface {
  /** returns the date value which is currently displayed in the date field. */
  var Date: typingsSlinky.activexLibreoffice.com_.sun.star.util.Date = js.native
  /** returns the currently set first value which is set on POS1 key. */
  var First: Date = js.native
  /** returns the currently set last value which is set on END key. */
  var Last: Date = js.native
  /** returns the currently set maximum date value that can be entered by the user. */
  var Max: Date = js.native
  /** returns the currently set minimum date value that can be entered by the user. */
  var Min: Date = js.native
  /** returns the date value which is currently displayed in the date field. */
  def getDate(): Date = js.native
  /** returns the currently set first value which is set on POS1 key. */
  def getFirst(): Date = js.native
  /** returns the currently set last value which is set on END key. */
  def getLast(): Date = js.native
  /** returns the currently set maximum date value that can be entered by the user. */
  def getMax(): Date = js.native
  /** returns the currently set minimum date value that can be entered by the user. */
  def getMin(): Date = js.native
  /** returns whether currently an empty value is set for the date. */
  def isEmpty(): Boolean = js.native
  /** determines if the long date format is currently used. */
  def isLongFormat(): Boolean = js.native
  /** returns whether the format is currently checked during user input. */
  def isStrictFormat(): Boolean = js.native
  /** sets the date value which is displayed in the date field. */
  def setDate(Date: Date): Unit = js.native
  /** sets an empty value for the date. */
  def setEmpty(): Unit = js.native
  /** sets the first value to be set on POS1 key. */
  def setFirst(Date: Date): Unit = js.native
  /** sets the last value to be set on END key. */
  def setLast(Date: Date): Unit = js.native
  /** determines if the long date format is to be used. */
  def setLongFormat(bLong: Boolean): Unit = js.native
  /** sets the maximum date value that can be entered by the user. */
  def setMax(Date: Date): Unit = js.native
  /** sets the minimum date value that can be entered by the user. */
  def setMin(Date: Date): Unit = js.native
  /** determines if the format is checked during user input. */
  def setStrictFormat(bStrict: Boolean): Unit = js.native
}

object XDateField {
  @scala.inline
  def apply(
    Date: Date,
    First: Date,
    Last: Date,
    Max: Date,
    Min: Date,
    acquire: () => Unit,
    getDate: () => Date,
    getFirst: () => Date,
    getLast: () => Date,
    getMax: () => Date,
    getMin: () => Date,
    isEmpty: () => Boolean,
    isLongFormat: () => Boolean,
    isStrictFormat: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setDate: Date => Unit,
    setEmpty: () => Unit,
    setFirst: Date => Unit,
    setLast: Date => Unit,
    setLongFormat: Boolean => Unit,
    setMax: Date => Unit,
    setMin: Date => Unit,
    setStrictFormat: Boolean => Unit
  ): XDateField = {
    val __obj = js.Dynamic.literal(Date = Date.asInstanceOf[js.Any], First = First.asInstanceOf[js.Any], Last = Last.asInstanceOf[js.Any], Max = Max.asInstanceOf[js.Any], Min = Min.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getDate = js.Any.fromFunction0(getDate), getFirst = js.Any.fromFunction0(getFirst), getLast = js.Any.fromFunction0(getLast), getMax = js.Any.fromFunction0(getMax), getMin = js.Any.fromFunction0(getMin), isEmpty = js.Any.fromFunction0(isEmpty), isLongFormat = js.Any.fromFunction0(isLongFormat), isStrictFormat = js.Any.fromFunction0(isStrictFormat), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setDate = js.Any.fromFunction1(setDate), setEmpty = js.Any.fromFunction0(setEmpty), setFirst = js.Any.fromFunction1(setFirst), setLast = js.Any.fromFunction1(setLast), setLongFormat = js.Any.fromFunction1(setLongFormat), setMax = js.Any.fromFunction1(setMax), setMin = js.Any.fromFunction1(setMin), setStrictFormat = js.Any.fromFunction1(setStrictFormat))
    __obj.asInstanceOf[XDateField]
  }
  @scala.inline
  implicit class XDateFieldOps[Self <: XDateField] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDate(value: Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirst(value: Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("First")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLast(value: Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Last")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMax(value: Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMin(value: Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetDate(value: () => Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetFirst(value: () => Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFirst")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetLast(value: () => Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLast")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMax(value: () => Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMax")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMin(value: () => Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMin")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsEmpty(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEmpty")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsLongFormat(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLongFormat")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsStrictFormat(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isStrictFormat")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetDate(value: Date => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetEmpty(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setEmpty")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetFirst(value: Date => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFirst")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetLast(value: Date => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLast")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetLongFormat(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLongFormat")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetMax(value: Date => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMax")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetMin(value: Date => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMin")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetStrictFormat(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStrictFormat")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

