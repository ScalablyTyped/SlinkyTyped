package typingsSlinky.rdfDashExt

import typingsSlinky.rdfDashExt.libQuadMod.QuadExt
import typingsSlinky.rdfDashExt.libUnderscorePropTypeMod.PropType
import typingsSlinky.rdfDashExt.rdfDashExtStrings.has
import typingsSlinky.rdfDashJs.rdfDashJsMod.Dataset
import typingsSlinky.rdfDashJs.rdfDashJsMod.Quad
import typingsSlinky.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdf-ext/lib/Dataset", JSImport.Namespace)
@js.native
object libDatasetMod extends js.Object {
  @js.native
  trait DatasetExt extends Dataset[Quad] {
    val includes: PropType[Dataset[Quad], has] = js.native
    val length: Double = js.native
    def merge(other: Dataset[Quad]): DatasetExt = js.native
    def removeMatches(subject: js.Any, predicate: js.Any, `object`: js.Any, graph: js.Any): this.type = js.native
    def toJSON(): js.Array[ReturnType[PropType[QuadExt, typingsSlinky.rdfDashExt.rdfDashExtStrings.toJSON]]] = js.native
  }
  
}

