package typingsSlinky.rabinWasm

import typingsSlinky.rabinWasm.mod.ASModule.i32
import typingsSlinky.rabinWasm.mod.ASModule.u32
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("rabin-wasm/dist/rabin-wasm", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rabin-wasm/dist/rabin-wasm", "default.Int32Array_ID")
    @js.native
    def Int32ArrayID: u32 = js.native
    
    @scala.inline
    def Int32ArrayID_=(x: u32): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Int32Array_ID")(x.asInstanceOf[js.Any])
    
    @JSImport("rabin-wasm/dist/rabin-wasm", "default.Rabin")
    @js.native
    class Rabin protected ()
      extends typingsSlinky.rabinWasm.mod.ASModule.Rabin {
      def this(average_bits: u32, minsize: u32, maxsize: u32, window_size: i32) = this()
    }
    
    @JSImport("rabin-wasm/dist/rabin-wasm", "default.Uint8Array_ID")
    @js.native
    def Uint8ArrayID: u32 = js.native
    
    @scala.inline
    def Uint8ArrayID_=(x: u32): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Uint8Array_ID")(x.asInstanceOf[js.Any])
    
    @JSImport("rabin-wasm/dist/rabin-wasm", "default.__alloc")
    @js.native
    def alloc(size: u32, id: u32): u32 = js.native
    
    @JSImport("rabin-wasm/dist/rabin-wasm", "default.__collect")
    @js.native
    def collect(): Unit = js.native
    
    @JSImport("rabin-wasm/dist/rabin-wasm", "default.degree")
    @js.native
    def degree(
      polynom: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify U64 */ js.Any
    ): i32 = js.native
    
    @JSImport("rabin-wasm/dist/rabin-wasm", "default.mod")
    @js.native
    def mod(
      x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify U64 */ js.Any,
      p: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify U64 */ js.Any
    ): js.Any = js.native
    
    @JSImport("rabin-wasm/dist/rabin-wasm", "default.__release")
    @js.native
    def release(ptr: u32): Unit = js.native
    
    @JSImport("rabin-wasm/dist/rabin-wasm", "default.__retain")
    @js.native
    def retain(ptr: u32): u32 = js.native
    
    @JSImport("rabin-wasm/dist/rabin-wasm", "default.__rtti_base")
    @js.native
    def rttiBase: u32 = js.native
    
    @scala.inline
    def rttiBase_=(x: u32): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("__rtti_base")(x.asInstanceOf[js.Any])
  }
  
  object ASModule {
    
    @js.native
    trait Rabin extends StObject {
      
      var chunk_cut_fingerprint: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify U64 */ js.Any = js.native
      
      var chunk_length: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify U64 */ js.Any = js.native
      
      var chunk_start: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify U64 */ js.Any = js.native
      
      var count: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify U64 */ js.Any = js.native
      
      var digest: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify U64 */ js.Any = js.native
      
      def fingerprint(buf: u32, lengths: u32): u32 = js.native
      
      var mask: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify U64 */ js.Any = js.native
      
      var maxsize: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify U64 */ js.Any = js.native
      
      var minsize: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify U64 */ js.Any = js.native
      
      var polynomial: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify U64 */ js.Any = js.native
      
      var pos: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify U64 */ js.Any = js.native
      
      var start: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify U64 */ js.Any = js.native
      
      var window: u32 = js.native
      
      var window_size: i32 = js.native
      
      var wpos: i32 = js.native
    }
    object Rabin {
      
      @scala.inline
      def apply(
        chunk_cut_fingerprint: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify U64 */ js.Any,
        chunk_length: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify U64 */ js.Any,
        chunk_start: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify U64 */ js.Any,
        count: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify U64 */ js.Any,
        digest: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify U64 */ js.Any,
        fingerprint: (u32, u32) => u32,
        mask: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify U64 */ js.Any,
        maxsize: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify U64 */ js.Any,
        minsize: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify U64 */ js.Any,
        polynomial: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify U64 */ js.Any,
        pos: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify U64 */ js.Any,
        start: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify U64 */ js.Any,
        window: u32,
        window_size: i32,
        wpos: i32
      ): Rabin = {
        val __obj = js.Dynamic.literal(chunk_cut_fingerprint = chunk_cut_fingerprint.asInstanceOf[js.Any], chunk_length = chunk_length.asInstanceOf[js.Any], chunk_start = chunk_start.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], digest = digest.asInstanceOf[js.Any], fingerprint = js.Any.fromFunction2(fingerprint), mask = mask.asInstanceOf[js.Any], maxsize = maxsize.asInstanceOf[js.Any], minsize = minsize.asInstanceOf[js.Any], polynomial = polynomial.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any], window_size = window_size.asInstanceOf[js.Any], wpos = wpos.asInstanceOf[js.Any])
        __obj.asInstanceOf[Rabin]
      }
      
      @scala.inline
      implicit class RabinMutableBuilder[Self <: Rabin] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setChunk_cut_fingerprint(
          value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify U64 */ js.Any
        ): Self = StObject.set(x, "chunk_cut_fingerprint", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setChunk_length(
          value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify U64 */ js.Any
        ): Self = StObject.set(x, "chunk_length", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setChunk_start(
          value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify U64 */ js.Any
        ): Self = StObject.set(x, "chunk_start", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCount(
          value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify U64 */ js.Any
        ): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDigest(
          value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify U64 */ js.Any
        ): Self = StObject.set(x, "digest", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFingerprint(value: (u32, u32) => u32): Self = StObject.set(x, "fingerprint", js.Any.fromFunction2(value))
        
        @scala.inline
        def setMask(
          value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify U64 */ js.Any
        ): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMaxsize(
          value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify U64 */ js.Any
        ): Self = StObject.set(x, "maxsize", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMinsize(
          value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify U64 */ js.Any
        ): Self = StObject.set(x, "minsize", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPolynomial(
          value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify U64 */ js.Any
        ): Self = StObject.set(x, "polynomial", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPos(
          value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify U64 */ js.Any
        ): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStart(
          value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify U64 */ js.Any
        ): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWindow(value: u32): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWindow_size(value: i32): Self = StObject.set(x, "window_size", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWpos(value: i32): Self = StObject.set(x, "wpos", value.asInstanceOf[js.Any])
      }
    }
    
    type bool = js.Any
    
    type f32 = Double
    
    type f64 = Double
    
    type i16 = Double
    
    type i32 = Double
    
    type i8 = Double
    
    type u16 = Double
    
    type u32 = Double
    
    type u8 = Double
  }
}
