package typingsSlinky.jqueryCountto

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.jqueryCountto.jqueryCounttoStrings.start
    - typingsSlinky.jqueryCountto.jqueryCounttoStrings.stop
    - typingsSlinky.jqueryCountto.jqueryCounttoStrings.toggle
    - typingsSlinky.jqueryCountto.jqueryCounttoStrings.restart
  */
  trait Method extends StObject
  object Method {
    
    @scala.inline
    def restart: typingsSlinky.jqueryCountto.jqueryCounttoStrings.restart = "restart".asInstanceOf[typingsSlinky.jqueryCountto.jqueryCounttoStrings.restart]
    
    @scala.inline
    def start: typingsSlinky.jqueryCountto.jqueryCounttoStrings.start = "start".asInstanceOf[typingsSlinky.jqueryCountto.jqueryCounttoStrings.start]
    
    @scala.inline
    def stop: typingsSlinky.jqueryCountto.jqueryCounttoStrings.stop = "stop".asInstanceOf[typingsSlinky.jqueryCountto.jqueryCounttoStrings.stop]
    
    @scala.inline
    def toggle: typingsSlinky.jqueryCountto.jqueryCounttoStrings.toggle = "toggle".asInstanceOf[typingsSlinky.jqueryCountto.jqueryCounttoStrings.toggle]
  }
  
  /* Inlined std.Partial<{  from :number,   to :number,   speed :number,   refreshInterval :number,   decimals :number, formatter (value : number, options : jquery-countto.jquery-countto.Options): string, onUpdate (value : number): void, onComplete (value : number): void}> */
  @js.native
  trait Options extends StObject {
    
    var decimals: js.UndefOr[Double] = js.native
    
    var formatter: js.UndefOr[js.Function2[/* value */ Double, /* options */ this.type, String]] = js.native
    
    var from: js.UndefOr[Double] = js.native
    
    var onComplete: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.native
    
    var onUpdate: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.native
    
    var refreshInterval: js.UndefOr[Double] = js.native
    
    var speed: js.UndefOr[Double] = js.native
    
    var to: js.UndefOr[Double] = js.native
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
      def setDecimals(value: Double): Self = StObject.set(x, "decimals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecimalsUndefined: Self = StObject.set(x, "decimals", js.undefined)
      
      @scala.inline
      def setFormatter(value: (/* value */ Double, Options) => String): Self = StObject.set(x, "formatter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
      
      @scala.inline
      def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      @scala.inline
      def setOnComplete(value: /* value */ Double => Unit): Self = StObject.set(x, "onComplete", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
      
      @scala.inline
      def setOnUpdate(value: /* value */ Double => Unit): Self = StObject.set(x, "onUpdate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
      
      @scala.inline
      def setRefreshInterval(value: Double): Self = StObject.set(x, "refreshInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefreshIntervalUndefined: Self = StObject.set(x, "refreshInterval", js.undefined)
      
      @scala.inline
      def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
      
      @scala.inline
      def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    }
  }
  
  object global {
    
    @js.native
    trait JQuery extends StObject {
      
      def countTo(): JQuery = js.native
      def countTo(methodOrOptions: Method): JQuery = js.native
      def countTo(methodOrOptions: Options): JQuery = js.native
    }
  }
}
