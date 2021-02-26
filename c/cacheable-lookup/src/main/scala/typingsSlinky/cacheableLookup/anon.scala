package typingsSlinky.cacheableLookup

import typingsSlinky.cacheableLookup.cacheableLookupBooleans.`true`
import typingsSlinky.cacheableLookup.mod.IPFamily
import typingsSlinky.node.NodeJS.ErrnoException
import typingsSlinky.node.dnsMod.LookupAddress
import typingsSlinky.node.dnsMod.LookupAllOptions
import typingsSlinky.node.dnsMod.LookupOneOptions
import typingsSlinky.node.dnsMod.LookupOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined cacheable-lookup.cacheable-lookup.LookupOptions & {  all :true} */
  @js.native
  trait LookupOptionsalltrue extends StObject {
    
    /**
    	 * When `true`, the callback returns all resolved addresses in an array. Otherwise, returns a single address.
    	 * @default false
    	 */
    var all: js.UndefOr[Boolean] with `true` = js.native
    
    /**
    	 * The record family. Must be `4` or `6`. IPv4 and IPv6 addresses are both returned by default.
    	 */
    var family: js.UndefOr[IPFamily] = js.native
    
    /**
    	 * One or more supported getaddrinfo flags. Multiple flags may be passed by bitwise ORing their values.
    	 */
    var hints: js.UndefOr[Double] = js.native
  }
  object LookupOptionsalltrue {
    
    @scala.inline
    def apply(all: js.UndefOr[Boolean] with `true`): LookupOptionsalltrue = {
      val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any])
      __obj.asInstanceOf[LookupOptionsalltrue]
    }
    
    @scala.inline
    implicit class LookupOptionsalltrueMutableBuilder[Self <: LookupOptionsalltrue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAll(value: js.UndefOr[Boolean] with `true`): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFamily(value: IPFamily): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
      
      @scala.inline
      def setHints(value: Double): Self = StObject.set(x, "hints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHintsUndefined: Self = StObject.set(x, "hints", js.undefined)
    }
  }
  
  @js.native
  trait Typeoflookup extends StObject {
    
    def apply(
      hostname: String,
      callback: js.Function3[/* err */ ErrnoException | Null, /* address */ String, /* family */ Double, Unit]
    ): Unit = js.native
    def apply(
      hostname: String,
      family: Double,
      callback: js.Function3[/* err */ ErrnoException | Null, /* address */ String, /* family */ Double, Unit]
    ): Unit = js.native
    def apply(
      hostname: String,
      options: LookupAllOptions,
      callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[LookupAddress], Unit]
    ): Unit = js.native
    def apply(
      hostname: String,
      options: LookupOneOptions,
      callback: js.Function3[/* err */ ErrnoException | Null, /* address */ String, /* family */ Double, Unit]
    ): Unit = js.native
    def apply(
      hostname: String,
      options: LookupOptions,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* address */ String | js.Array[LookupAddress], 
          /* family */ Double, 
          Unit
        ]
    ): Unit = js.native
  }
}
