package typingsSlinky.jsdom

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.jsdom.anon.Instantiable
import typingsSlinky.jsdom.anon.InstantiableExternal
import typingsSlinky.jsdom.anon.InstantiableShadowRoot
import typingsSlinky.std.BigInt64ArrayConstructor
import typingsSlinky.std.BigIntConstructor
import typingsSlinky.std.BigUint64ArrayConstructor
import typingsSlinky.std.SharedArrayBufferConstructor
import typingsSlinky.std.global.External_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line: no-declare-current-package no-single-declare-module
// tslint:disable-next-line: no-single-declare-module
// tslint:disable-next-line: no-single-declare-module
@JSImport("jsdom", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  trait DOMWindow extends js.Object {
    
    var Atomics: typingsSlinky.std.Atomics = js.native
    
    def BigInt(): js.BigInt = js.native
    def BigInt(value: js.Any): js.BigInt = js.native
    
    var BigInt64Array: BigInt64ArrayConstructor with Instantiable0[typingsSlinky.std.global.BigInt64Array] = js.native
    
    @JSName("BigInt")
    var BigInt_Original: BigIntConstructor = js.native
    
    var BigUint64Array: BigUint64ArrayConstructor with Instantiable0[typingsSlinky.std.global.BigUint64Array] = js.native
    
    var External: InstantiableExternal with Instantiable0[External_] = js.native
    
    var InputEvent: Instantiable with (Instantiable1[/* type */ String, typingsSlinky.std.global.InputEvent]) = js.native
    
    var ShadowRoot: InstantiableShadowRoot with Instantiable0[typingsSlinky.std.global.ShadowRoot] = js.native
    
    var SharedArrayBuffer: SharedArrayBufferConstructor with (Instantiable1[/* byteLength */ Double, typingsSlinky.std.global.SharedArrayBuffer]) = js.native
    
    var WebAssembly: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof WebAssembly */ js.Any = js.native
  }
}
