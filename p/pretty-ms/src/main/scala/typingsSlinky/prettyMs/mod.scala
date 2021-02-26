package typingsSlinky.prettyMs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  Convert milliseconds to a human readable string: `1337000000` → `15d 11h 23m 20s`.
  @param milliseconds - Milliseconds to humanize.
  @example
  ```
  import prettyMilliseconds = require('pretty-ms');
  prettyMilliseconds(1337000000);
  //=> '15d 11h 23m 20s'
  prettyMilliseconds(1337);
  //=> '1.3s'
  prettyMilliseconds(133);
  //=> '133ms'
  // `compact` option
  prettyMilliseconds(1337, {compact: true});
  //=> '1s'
  // `verbose` option
  prettyMilliseconds(1335669000, {verbose: true});
  //=> '15 days 11 hours 1 minute 9 seconds'
  // `colonNotation` option
  prettyMilliseconds(95500, {colonNotation: true});
  //=> '1:35.5'
  // `formatSubMilliseconds` option
  prettyMilliseconds(100.400080, {formatSubMilliseconds: true})
  //=> '100ms 400µs 80ns'
  // Can be useful for time durations
  prettyMilliseconds(new Date(2014, 0, 1, 10, 40) - new Date(2014, 0, 1, 10, 5))
  //=> '35m'
  ```
  */
  @JSImport("pretty-ms", JSImport.Namespace)
  @js.native
  def apply(milliseconds: Double): String = js.native
  @JSImport("pretty-ms", JSImport.Namespace)
  @js.native
  def apply(milliseconds: Double, options: Options): String = js.native
  
  @js.native
  trait Options extends StObject {
    
    /**
    		Display time using colon notation: `5h 1m 45s` → `5:01:45`. Always shows time in at least minutes: `1s` → `0:01`
    		Useful when you want to display time without the time units, similar to a digital watch.
    		Setting `colonNotation` to `true` overrides the following options to `false`:
    		- `compact`
    		- `formatSubMilliseconds`
    		- `separateMilliseconds`
    		- `verbose`
    		@default false
    		*/
    val colonNotation: js.UndefOr[Boolean] = js.native
    
    /**
    		Only show the first unit: `1h 10m` → `1h`.
    		Also ensures that `millisecondsDecimalDigits` and `secondsDecimalDigits` are both set to `0`.
    		@default false
    		*/
    val compact: js.UndefOr[Boolean] = js.native
    
    /**
    		Show microseconds and nanoseconds.
    		@default false
    		*/
    val formatSubMilliseconds: js.UndefOr[Boolean] = js.native
    
    /**
    		Keep milliseconds on whole seconds: `13s` → `13.0s`.
    		Useful when you are showing a number of seconds spent on an operation and don't want the width of the output to change when hitting a whole number.
    		@default false
    		*/
    val keepDecimalsOnWholeSeconds: js.UndefOr[Boolean] = js.native
    
    /**
    		Number of digits to appear after the milliseconds decimal point.
    		Useful in combination with [`process.hrtime()`](https://nodejs.org/api/process.html#process_process_hrtime).
    		@default 0
    		*/
    val millisecondsDecimalDigits: js.UndefOr[Double] = js.native
    
    /**
    		Number of digits to appear after the seconds decimal point.
    		@default 1
    		*/
    val secondsDecimalDigits: js.UndefOr[Double] = js.native
    
    /**
    		Show milliseconds separately. This means they won't be included in the decimal part of the seconds.
    		@default false
    		*/
    val separateMilliseconds: js.UndefOr[Boolean] = js.native
    
    /**
    		Number of units to show. Setting `compact` to `true` overrides this option.
    		@default Infinity
    		*/
    val unitCount: js.UndefOr[Double] = js.native
    
    /**
    		Use full-length units: `5h 1m 45s` → `5 hours 1 minute 45 seconds`.
    		@default false
    		*/
    val verbose: js.UndefOr[Boolean] = js.native
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
      def setColonNotation(value: Boolean): Self = StObject.set(x, "colonNotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColonNotationUndefined: Self = StObject.set(x, "colonNotation", js.undefined)
      
      @scala.inline
      def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
      @scala.inline
      def setFormatSubMilliseconds(value: Boolean): Self = StObject.set(x, "formatSubMilliseconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatSubMillisecondsUndefined: Self = StObject.set(x, "formatSubMilliseconds", js.undefined)
      
      @scala.inline
      def setKeepDecimalsOnWholeSeconds(value: Boolean): Self = StObject.set(x, "keepDecimalsOnWholeSeconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepDecimalsOnWholeSecondsUndefined: Self = StObject.set(x, "keepDecimalsOnWholeSeconds", js.undefined)
      
      @scala.inline
      def setMillisecondsDecimalDigits(value: Double): Self = StObject.set(x, "millisecondsDecimalDigits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMillisecondsDecimalDigitsUndefined: Self = StObject.set(x, "millisecondsDecimalDigits", js.undefined)
      
      @scala.inline
      def setSecondsDecimalDigits(value: Double): Self = StObject.set(x, "secondsDecimalDigits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondsDecimalDigitsUndefined: Self = StObject.set(x, "secondsDecimalDigits", js.undefined)
      
      @scala.inline
      def setSeparateMilliseconds(value: Boolean): Self = StObject.set(x, "separateMilliseconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeparateMillisecondsUndefined: Self = StObject.set(x, "separateMilliseconds", js.undefined)
      
      @scala.inline
      def setUnitCount(value: Double): Self = StObject.set(x, "unitCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnitCountUndefined: Self = StObject.set(x, "unitCount", js.undefined)
      
      @scala.inline
      def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
}
