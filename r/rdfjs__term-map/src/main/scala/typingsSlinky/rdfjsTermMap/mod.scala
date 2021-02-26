package typingsSlinky.rdfjsTermMap

import typingsSlinky.rdfJs.mod.Term
import typingsSlinky.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@rdfjs/term-map", JSImport.Namespace)
  @js.native
  class ^[T /* <: Term */, V] () extends Map[T, V] {
    def this(entries: js.Array[js.Tuple2[Term, V]]) = this()
  }
  
  type TermMap[T /* <: Term */, V] = Map[T, V]
}
