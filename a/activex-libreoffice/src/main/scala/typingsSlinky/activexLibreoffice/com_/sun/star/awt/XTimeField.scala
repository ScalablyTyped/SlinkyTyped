package typingsSlinky.activexLibreoffice.com_.sun.star.awt

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.activexLibreoffice.com_.sun.star.util.Time
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** gives access to the value and settings of a time field. */
@js.native
trait XTimeField extends XInterface {
  
  /** returns the currently set first value which is set on POS1 key. */
  var First: Time = js.native
  
  /** returns the currently set last value which is set on END key. */
  var Last: Time = js.native
  
  /** returns the currently set maximum time value that can be entered by the user. */
  var Max: Time = js.native
  
  /** returns the currently set minimum time value that can be entered by the user. */
  var Min: Time = js.native
  
  /** returns the time value which is currently displayed in the time field. */
  var Time: typingsSlinky.activexLibreoffice.com_.sun.star.util.Time = js.native
  
  /** returns the currently set first value which is set on POS1 key. */
  def getFirst(): Time = js.native
  
  /** returns the currently set last value which is set on END key. */
  def getLast(): Time = js.native
  
  /** returns the currently set maximum time value that can be entered by the user. */
  def getMax(): Time = js.native
  
  /** returns the currently set minimum time value that can be entered by the user. */
  def getMin(): Time = js.native
  
  /** returns the time value which is currently displayed in the time field. */
  def getTime(): Time = js.native
  
  /** returns whether currently an empty value is set for the time. */
  def isEmpty(): Boolean = js.native
  
  /** returns whether the format is currently checked during user input. */
  def isStrictFormat(): Boolean = js.native
  
  /** sets an empty value for the time. */
  def setEmpty(): Unit = js.native
  
  /** sets the first value to be set on POS1 key. */
  def setFirst(Time: Time): Unit = js.native
  
  /** sets the last value to be set on END key. */
  def setLast(Time: Time): Unit = js.native
  
  /** sets the maximum time value that can be entered by the user. */
  def setMax(Time: Time): Unit = js.native
  
  /** sets the minimum time value that can be entered by the user. */
  def setMin(Time: Time): Unit = js.native
  
  /** determines if the format is checked during user input. */
  def setStrictFormat(bStrict: Boolean): Unit = js.native
  
  /** sets the time value which is displayed in the time field. */
  def setTime(Time: Time): Unit = js.native
}
object XTimeField {
  
  @scala.inline
  def apply(
    First: Time,
    Last: Time,
    Max: Time,
    Min: Time,
    Time: Time,
    acquire: () => Unit,
    getFirst: () => Time,
    getLast: () => Time,
    getMax: () => Time,
    getMin: () => Time,
    getTime: () => Time,
    isEmpty: () => Boolean,
    isStrictFormat: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setEmpty: () => Unit,
    setFirst: Time => Unit,
    setLast: Time => Unit,
    setMax: Time => Unit,
    setMin: Time => Unit,
    setStrictFormat: Boolean => Unit,
    setTime: Time => Unit
  ): XTimeField = {
    val __obj = js.Dynamic.literal(First = First.asInstanceOf[js.Any], Last = Last.asInstanceOf[js.Any], Max = Max.asInstanceOf[js.Any], Min = Min.asInstanceOf[js.Any], Time = Time.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getFirst = js.Any.fromFunction0(getFirst), getLast = js.Any.fromFunction0(getLast), getMax = js.Any.fromFunction0(getMax), getMin = js.Any.fromFunction0(getMin), getTime = js.Any.fromFunction0(getTime), isEmpty = js.Any.fromFunction0(isEmpty), isStrictFormat = js.Any.fromFunction0(isStrictFormat), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setEmpty = js.Any.fromFunction0(setEmpty), setFirst = js.Any.fromFunction1(setFirst), setLast = js.Any.fromFunction1(setLast), setMax = js.Any.fromFunction1(setMax), setMin = js.Any.fromFunction1(setMin), setStrictFormat = js.Any.fromFunction1(setStrictFormat), setTime = js.Any.fromFunction1(setTime))
    __obj.asInstanceOf[XTimeField]
  }
  
  @scala.inline
  implicit class XTimeFieldOps[Self <: XTimeField] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFirst(value: Time): Self = this.set("First", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast(value: Time): Self = this.set("Last", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax(value: Time): Self = this.set("Max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin(value: Time): Self = this.set("Min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime(value: Time): Self = this.set("Time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetFirst(value: () => Time): Self = this.set("getFirst", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLast(value: () => Time): Self = this.set("getLast", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMax(value: () => Time): Self = this.set("getMax", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMin(value: () => Time): Self = this.set("getMin", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTime(value: () => Time): Self = this.set("getTime", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsEmpty(value: () => Boolean): Self = this.set("isEmpty", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsStrictFormat(value: () => Boolean): Self = this.set("isStrictFormat", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetEmpty(value: () => Unit): Self = this.set("setEmpty", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetFirst(value: Time => Unit): Self = this.set("setFirst", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetLast(value: Time => Unit): Self = this.set("setLast", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetMax(value: Time => Unit): Self = this.set("setMax", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetMin(value: Time => Unit): Self = this.set("setMin", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetStrictFormat(value: Boolean => Unit): Self = this.set("setStrictFormat", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTime(value: Time => Unit): Self = this.set("setTime", js.Any.fromFunction1(value))
  }
}
