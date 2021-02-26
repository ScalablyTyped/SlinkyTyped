package typingsSlinky.plantumlEncoder

import typingsSlinky.node.Buffer
import typingsSlinky.std.BigInt64Array
import typingsSlinky.std.BigUint64Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Wrapper object for the encode and decode functions.
  */
object mod {
  
  /**
    * Decodes encoded PlantUML code.
    * @param encodedPuml The encoded PlantUML code that should be decoded.
    * @returns The decoded PlantUML code.
    */
  @JSImport("plantuml-encoder", "decode")
  @js.native
  def decode(encodedPuml: String): String = js.native
  
  /**
    * Encodes PlantUML code.
    * @param puml The PlantUML code that should be encoded.
    * @returns The encoded PlantUML code.
    */
  @JSImport("plantuml-encoder", "encode")
  @js.native
  def encode(puml: String): String = js.native
  @JSImport("plantuml-encoder", "encode")
  @js.native
  def encode(puml: js.typedarray.ArrayBuffer): String = js.native
  @JSImport("plantuml-encoder", "encode")
  @js.native
  def encode(puml: js.typedarray.DataView): String = js.native
  @JSImport("plantuml-encoder", "encode")
  @js.native
  def encode(puml: Buffer): String = js.native
  @JSImport("plantuml-encoder", "encode")
  @js.native
  def encode(puml: TypedArray): String = js.native
  
  /**
    * Union type for possible typed arrays.
    */
  type TypedArray = js.typedarray.Int8Array | js.typedarray.Uint8Array | js.typedarray.Uint8ClampedArray | js.typedarray.Int16Array | js.typedarray.Uint16Array | js.typedarray.Int32Array | js.typedarray.Uint32Array | js.typedarray.Float32Array | js.typedarray.Float64Array | BigInt64Array | BigUint64Array
}
