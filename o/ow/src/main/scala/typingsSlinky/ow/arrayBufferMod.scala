package typingsSlinky.ow

import typingsSlinky.ow.predicateMod.Predicate
import typingsSlinky.ow.predicateMod.PredicateOptions
import typingsSlinky.std.ArrayBufferLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arrayBufferMod {
  
  @JSImport("ow/dist/source/predicates/array-buffer", "ArrayBufferPredicate")
  @js.native
  class ArrayBufferPredicate[T /* <: ArrayBufferLike */] protected () extends Predicate[T] {
    def this(`type`: String) = this()
    def this(`type`: String, options: PredicateOptions) = this()
    
    /**
      Test an array buffer to have a specific byte length.
      @param byteLength - The byte length of the array buffer.
      */
    def byteLength(byteLength: Double): this.type = js.native
    
    /**
      Test an array buffer to have a minimum byte length.
      @param length - The minimum byte length of the array buffer.
      */
    def maxByteLength(byteLength: Double): this.type = js.native
    
    /**
      Test an array buffer to have a minimum byte length.
      @param byteLength - The minimum byte length of the array buffer.
      */
    def minByteLength(byteLength: Double): this.type = js.native
  }
}
