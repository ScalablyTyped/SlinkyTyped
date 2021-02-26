package typingsSlinky.retryAsPromised

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.bluebird.mod.Thenable
import typingsSlinky.retryAsPromised.anon.Current
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("retry-as-promised", JSImport.Namespace)
  @js.native
  val ^ : RetryAsPromisedStatic = js.native
  
  type MatchOption = String | js.RegExp | js.Error
  
  @js.native
  trait Options extends StObject {
    
    @JSName("$current")
    var $current: js.UndefOr[Double] = js.native
    
    var backoffBase: js.UndefOr[Double] = js.native
    
    var backoffExponent: js.UndefOr[Double] = js.native
    
    var `match`: js.UndefOr[js.Array[MatchOption] | MatchOption] = js.native
    
    var max: js.UndefOr[Double] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var report: js.UndefOr[
        js.Function3[/* message */ String, /* obj */ this.type, /* err */ js.UndefOr[js.Any], Unit]
      ] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$current(value: Double): Self = StObject.set(x, "$current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$currentUndefined: Self = StObject.set(x, "$current", js.undefined)
      
      @scala.inline
      def setBackoffBase(value: Double): Self = StObject.set(x, "backoffBase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackoffBaseUndefined: Self = StObject.set(x, "backoffBase", js.undefined)
      
      @scala.inline
      def setBackoffExponent(value: Double): Self = StObject.set(x, "backoffExponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackoffExponentUndefined: Self = StObject.set(x, "backoffExponent", js.undefined)
      
      @scala.inline
      def setMatch(value: js.Array[MatchOption] | MatchOption): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchError(value: js.Error): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchRegExp(value: js.RegExp): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
      
      @scala.inline
      def setMatchVarargs(value: MatchOption*): Self = StObject.set(x, "match", js.Array(value :_*))
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setReport(value: (/* message */ String, Options, /* err */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "report", js.Any.fromFunction3(value))
      
      @scala.inline
      def setReportUndefined: Self = StObject.set(x, "report", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  type RetryAsPromisedStatic = js.Function2[
    /* callback */ RetryCallback[js.Any], 
    /* options */ Options | Double, 
    typingsSlinky.bluebird.mod.^[js.Any]
  ]
  
  type RetryCallback[T] = js.Function1[/* hasCurrent */ Current, Thenable[T]]
  
  type _To = RetryAsPromisedStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: RetryAsPromisedStatic = ^
}
