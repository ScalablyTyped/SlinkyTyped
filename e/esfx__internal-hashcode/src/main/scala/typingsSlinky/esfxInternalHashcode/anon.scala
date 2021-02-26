package typingsSlinky.esfxInternalHashcode

import typingsSlinky.esfxInternalHashcode.mod.Counter
import typingsSlinky.std.Map
import typingsSlinky.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait BigIntSeed extends StObject {
    
    var bigIntSeed: Double = js.native
    
    var globalSymbolHashes: js.UndefOr[Map[js.Symbol, Double]] = js.native
    
    var globalSymbolSeed: Double = js.native
    
    var localSymbolCounter: js.UndefOr[Counter] = js.native
    
    var localSymbolHashes: js.UndefOr[Map[js.Symbol, Double]] = js.native
    
    var localSymbolSeed: Double = js.native
    
    var nullPrototypeCounter: js.UndefOr[Counter] = js.native
    
    var objectSeed: Double = js.native
    
    var stringSeed: Double = js.native
    
    var weakObjectHashes: js.UndefOr[WeakMap[js.Object, Double]] = js.native
    
    var weakPrototypeCounters: js.UndefOr[WeakMap[js.Object, Counter]] = js.native
  }
  object BigIntSeed {
    
    @scala.inline
    def apply(
      bigIntSeed: Double,
      globalSymbolSeed: Double,
      localSymbolSeed: Double,
      objectSeed: Double,
      stringSeed: Double
    ): BigIntSeed = {
      val __obj = js.Dynamic.literal(bigIntSeed = bigIntSeed.asInstanceOf[js.Any], globalSymbolSeed = globalSymbolSeed.asInstanceOf[js.Any], localSymbolSeed = localSymbolSeed.asInstanceOf[js.Any], objectSeed = objectSeed.asInstanceOf[js.Any], stringSeed = stringSeed.asInstanceOf[js.Any])
      __obj.asInstanceOf[BigIntSeed]
    }
    
    @scala.inline
    implicit class BigIntSeedMutableBuilder[Self <: BigIntSeed] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBigIntSeed(value: Double): Self = StObject.set(x, "bigIntSeed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalSymbolHashes(value: Map[js.Symbol, Double]): Self = StObject.set(x, "globalSymbolHashes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalSymbolHashesUndefined: Self = StObject.set(x, "globalSymbolHashes", js.undefined)
      
      @scala.inline
      def setGlobalSymbolSeed(value: Double): Self = StObject.set(x, "globalSymbolSeed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalSymbolCounter(value: Counter): Self = StObject.set(x, "localSymbolCounter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalSymbolCounterUndefined: Self = StObject.set(x, "localSymbolCounter", js.undefined)
      
      @scala.inline
      def setLocalSymbolHashes(value: Map[js.Symbol, Double]): Self = StObject.set(x, "localSymbolHashes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalSymbolHashesUndefined: Self = StObject.set(x, "localSymbolHashes", js.undefined)
      
      @scala.inline
      def setLocalSymbolSeed(value: Double): Self = StObject.set(x, "localSymbolSeed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNullPrototypeCounter(value: Counter): Self = StObject.set(x, "nullPrototypeCounter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNullPrototypeCounterUndefined: Self = StObject.set(x, "nullPrototypeCounter", js.undefined)
      
      @scala.inline
      def setObjectSeed(value: Double): Self = StObject.set(x, "objectSeed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStringSeed(value: Double): Self = StObject.set(x, "stringSeed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeakObjectHashes(value: WeakMap[js.Object, Double]): Self = StObject.set(x, "weakObjectHashes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeakObjectHashesUndefined: Self = StObject.set(x, "weakObjectHashes", js.undefined)
      
      @scala.inline
      def setWeakPrototypeCounters(value: WeakMap[js.Object, Counter]): Self = StObject.set(x, "weakPrototypeCounters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeakPrototypeCountersUndefined: Self = StObject.set(x, "weakPrototypeCounters", js.undefined)
    }
  }
}
