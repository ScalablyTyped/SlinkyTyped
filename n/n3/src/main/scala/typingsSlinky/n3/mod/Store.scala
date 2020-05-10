package typingsSlinky.n3.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("n3", "Store")
@js.native
class Store[Q_RDF /* <: typingsSlinky.rdfJs.mod.BaseQuad */, Q_N3 /* <: BaseQuad */] () extends N3Store[Q_RDF, Q_N3] {
  def this(triples: js.Array[Q_RDF]) = this()
  def this(triples: js.Array[Q_RDF], options: StoreOptions) = this()
}

@JSImport("n3", "Store")
@js.native
object Store extends TopLevel[StoreConstructor]

