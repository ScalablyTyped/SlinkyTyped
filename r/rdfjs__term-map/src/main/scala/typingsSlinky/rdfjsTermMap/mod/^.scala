package typingsSlinky.rdfjsTermMap.mod

import typingsSlinky.rdfJs.mod.Term
import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@rdfjs/term-map", JSImport.Namespace)
@js.native
class ^[T /* <: Term */, V] () extends Map[T, V] {
  def this(entries: js.Array[js.Tuple2[Term, V]]) = this()
}

