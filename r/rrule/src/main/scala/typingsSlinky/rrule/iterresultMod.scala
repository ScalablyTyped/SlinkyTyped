package typingsSlinky.rrule

import typingsSlinky.rrule.anon.PartialIterArgs
import typingsSlinky.rrule.typesMod.IterResultType
import typingsSlinky.rrule.typesMod.QueryMethodTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iterresultMod {
  
  @JSImport("rrule/dist/esm/src/iterresult", JSImport.Default)
  @js.native
  class default[M /* <: QueryMethodTypes */] protected () extends IterResult[M] {
    def this(method: M, args: PartialIterArgs) = this()
  }
  
  @js.native
  trait IterArgs extends StObject {
    
    var _value: js.Date | js.Array[js.Date] | Null = js.native
    
    var after: js.Date = js.native
    
    var before: js.Date = js.native
    
    var dt: js.Date = js.native
    
    var inc: Boolean = js.native
  }
  object IterArgs {
    
    @scala.inline
    def apply(after: js.Date, before: js.Date, dt: js.Date, inc: Boolean): IterArgs = {
      val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any], dt = dt.asInstanceOf[js.Any], inc = inc.asInstanceOf[js.Any])
      __obj.asInstanceOf[IterArgs]
    }
    
    @scala.inline
    implicit class IterArgsMutableBuilder[Self <: IterArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfter(value: js.Date): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBefore(value: js.Date): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDt(value: js.Date): Self = StObject.set(x, "dt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInc(value: Boolean): Self = StObject.set(x, "inc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_value(value: js.Date | js.Array[js.Date]): Self = StObject.set(x, "_value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_valueDate(value: js.Date): Self = StObject.set(x, "_value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_valueNull: Self = StObject.set(x, "_value", null)
      
      @scala.inline
      def set_valueVarargs(value: js.Date*): Self = StObject.set(x, "_value", js.Array(value :_*))
    }
  }
  
  @js.native
  trait IterResult[M /* <: QueryMethodTypes */] extends StObject {
    
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
    implicit class IterResultMutableBuilder[Self <: IterResult[_], M /* <: QueryMethodTypes */] (val x: Self with IterResult[M]) extends AnyVal {
      
      @scala.inline
      def setAccept(value: js.Date => Boolean): Self = StObject.set(x, "accept", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAdd(value: js.Date => Boolean): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
      
      @scala.inline
      def setArgs(value: PartialIterArgs): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetValue(value: () => IterResultType[M]): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
      
      @scala.inline
      def setMaxDate(value: js.Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxDateNull: Self = StObject.set(x, "maxDate", null)
      
      @scala.inline
      def setMethod(value: M): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinDate(value: js.Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinDateNull: Self = StObject.set(x, "minDate", null)
      
      @scala.inline
      def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_result(value: js.Array[js.Date]): Self = StObject.set(x, "_result", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_resultVarargs(value: js.Date*): Self = StObject.set(x, "_result", js.Array(value :_*))
    }
  }
}
