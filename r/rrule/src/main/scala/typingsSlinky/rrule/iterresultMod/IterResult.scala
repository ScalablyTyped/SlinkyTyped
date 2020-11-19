package typingsSlinky.rrule.iterresultMod

import typingsSlinky.rrule.anon.PartialIterArgs
import typingsSlinky.rrule.typesMod.IterResultType
import typingsSlinky.rrule.typesMod.QueryMethodTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IterResult[M /* <: QueryMethodTypes */] extends js.Object {
  
  var _result: js.Array[js.Date] = js.native
  
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
  
  val args: PartialIterArgs = js.native
  
  /**
    * 'before' and 'after' return only one date, whereas 'all'
    * and 'between' an array.
    * @return {Date,Array?}
    */
  def getValue(): IterResultType[M] = js.native
  
  val maxDate: js.Date | Null = js.native
  
  val method: M = js.native
  
  val minDate: js.Date | Null = js.native
  
  var total: Double = js.native
}
object IterResult {
  
  @scala.inline
  def apply[M /* <: QueryMethodTypes */](
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
  implicit class IterResultOps[Self <: IterResult[_], M /* <: QueryMethodTypes */] (val x: Self with IterResult[M]) extends AnyVal {
    
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
    def set_resultVarargs(value: js.Date*): Self = this.set("_result", js.Array(value :_*))
    
    @scala.inline
    def set_result(value: js.Array[js.Date]): Self = this.set("_result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccept(value: js.Date => Boolean): Self = this.set("accept", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAdd(value: js.Date => Boolean): Self = this.set("add", js.Any.fromFunction1(value))
    
    @scala.inline
    def setArgs(value: PartialIterArgs): Self = this.set("args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetValue(value: () => IterResultType[M]): Self = this.set("getValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMethod(value: M): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal(value: Double): Self = this.set("total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDate(value: js.Date): Self = this.set("maxDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDateNull: Self = this.set("maxDate", null)
    
    @scala.inline
    def setMinDate(value: js.Date): Self = this.set("minDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinDateNull: Self = this.set("minDate", null)
  }
}
