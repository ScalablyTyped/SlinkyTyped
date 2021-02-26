package typingsSlinky.isTypedarray

import typingsSlinky.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("is-typedarray", JSImport.Namespace)
  @js.native
  def apply(candidate: js.Any): /* is is-typedarray.is-typedarray.TypedArray */ Boolean = js.native
  
  @JSImport("is-typedarray", "loose")
  @js.native
  def loose(candidate: js.Any): /* is is-typedarray.is-typedarray.TypedArray */ Boolean = js.native
  
  @JSImport("is-typedarray", "strict")
  @js.native
  def strict(candidate: js.Any): /* is is-typedarray.is-typedarray.TypedArray */ Boolean = js.native
  
  type TypedArray = js.typedarray.Int8Array | js.typedarray.Int16Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | js.typedarray.Uint8ClampedArray | js.typedarray.Uint16Array | js.typedarray.Uint32Array | js.typedarray.Float32Array | js.typedarray.Float64Array | Buffer
}
