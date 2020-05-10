package typingsSlinky.rrule.iterresultMod

import typingsSlinky.rrule.PartialIterArgs
import typingsSlinky.rrule.typesMod.IterResultType
import typingsSlinky.rrule.typesMod.QueryMethodTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IterResult[M /* <: QueryMethodTypes */] extends js.Object {
  var _result: js.Array[js.Date] = js.native
  val args: PartialIterArgs = js.native
  val maxDate: js.Date | Null = js.native
  val method: M = js.native
  val minDate: js.Date | Null = js.native
  var total: Double = js.native
  /**
    * Possibly adds a date into the result.
    *
    * @param {Date} date - the date isn't necessarly added to the result
    *                      list (if it is too late/too early)
    * @return {Boolean} true if it makes sense to continue the iteration
    *                   false if we're done.
    */
  def accept(date: js.Date): Boolean = js.native
  /**
    *
    * @param {Date} date that is part of the result.
    * @return {Boolean} whether we are interested in more values.
    */
  def add(date: js.Date): Boolean = js.native
  /**
    * 'before' and 'after' return only one date, whereas 'all'
    * and 'between' an array.
    * @return {Date,Array?}
    */
  def getValue(): IterResultType[M] = js.native
}

object IterResult {
  @scala.inline
  def apply[M](
    _result: js.Array[js.Date],
    accept: js.Date => Boolean,
    add: js.Date => Boolean,
    args: PartialIterArgs,
    getValue: () => IterResultType[M],
    method: M,
    total: Double
  ): IterResult[M] = {
    val __obj = js.Dynamic.literal(_result = _result.asInstanceOf[js.Any], accept = js.Any.fromFunction1(accept), add = js.Any.fromFunction1(add), args = args.asInstanceOf[js.Any], getValue = js.Any.fromFunction0(getValue), method = method.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[IterResult[M]]
  }
  @scala.inline
  implicit class IterResultOps[Self[m] <: IterResult[m], M] (val x: Self[M]) extends AnyVal {
    @scala.inline
    def duplicate: Self[M] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[M]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[M] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[M] with Other]
    @scala.inline
    def with_result(value: js.Array[js.Date]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_result")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccept(value: js.Date => Boolean): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accept")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAdd(value: js.Date => Boolean): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withArgs(value: PartialIterArgs): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetValue(value: () => IterResultType[M]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMethod(value: M): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal(value: Double): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxDate(value: js.Date): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxDateNull: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDate")(null)
        ret
    }
    @scala.inline
    def withMinDate(value: js.Date): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinDateNull: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDate")(null)
        ret
    }
  }
  
}

