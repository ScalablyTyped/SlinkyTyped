package typingsSlinky.igniteUi.Infragistics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeParser extends js.Object {
  def empty(): Unit = js.native
  def isNullOrUndefined(obj: js.Object): Unit = js.native
  def num(): Unit = js.native
  def toBool(obj: js.Object): Unit = js.native
  /**
  	 * L.A. 18 June 2012 Fixing bug #113265 Column 'date' shows empty values as 'NaN'
  	 *
  	 * @param obj
  	 */
  def toDate(obj: js.Object): Unit = js.native
  def toNumber(obj: js.Object): Unit = js.native
  def toStr(obj: js.Object): Unit = js.native
  def toTime(obj: js.Object): Unit = js.native
}

object TypeParser {
  @scala.inline
  def apply(
    empty: () => Unit,
    isNullOrUndefined: js.Object => Unit,
    num: () => Unit,
    toBool: js.Object => Unit,
    toDate: js.Object => Unit,
    toNumber: js.Object => Unit,
    toStr: js.Object => Unit,
    toTime: js.Object => Unit
  ): TypeParser = {
    val __obj = js.Dynamic.literal(empty = js.Any.fromFunction0(empty), isNullOrUndefined = js.Any.fromFunction1(isNullOrUndefined), num = js.Any.fromFunction0(num), toBool = js.Any.fromFunction1(toBool), toDate = js.Any.fromFunction1(toDate), toNumber = js.Any.fromFunction1(toNumber), toStr = js.Any.fromFunction1(toStr), toTime = js.Any.fromFunction1(toTime))
    __obj.asInstanceOf[TypeParser]
  }
  @scala.inline
  implicit class TypeParserOps[Self <: TypeParser] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmpty(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("empty")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsNullOrUndefined(value: js.Object => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNullOrUndefined")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNum(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("num")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToBool(value: js.Object => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toBool")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withToDate(value: js.Object => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toDate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withToNumber(value: js.Object => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toNumber")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withToStr(value: js.Object => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toStr")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withToTime(value: js.Object => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toTime")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

