package typingsSlinky.rdfExt

import typingsSlinky.rdfExt.propTypeMod.PropType
import typingsSlinky.rdfExt.quadMod.QuadExt
import typingsSlinky.rdfExt.rdfExtStrings.has
import typingsSlinky.rdfJs.mod.Dataset
import typingsSlinky.rdfJs.mod.Quad
import typingsSlinky.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdf-ext/lib/Dataset", JSImport.Namespace)
@js.native
object datasetMod extends js.Object {
  @js.native
  trait DatasetExt extends Dataset[QuadExt, Quad] {
    val includes: PropType[Dataset[Quad, Quad], has] = js.native
    val length: Double = js.native
    def merge(other: js.Array[Quad]): this.type = js.native
    def merge(other: Dataset[Quad, Quad]): this.type = js.native
    def removeMatches(subject: js.Any, predicate: js.Any, `object`: js.Any, graph: js.Any): this.type = js.native
    def toJSON(): js.Array[ReturnType[PropType[QuadExt, typingsSlinky.rdfExt.rdfExtStrings.toJSON]]] = js.native
  }
  
}

