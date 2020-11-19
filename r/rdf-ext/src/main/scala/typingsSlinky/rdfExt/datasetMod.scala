package typingsSlinky.rdfExt

import typingsSlinky.rdfDatasetIndexed.datasetMod.DatasetIndexed
import typingsSlinky.rdfExt.propTypeMod.PropType
import typingsSlinky.rdfExt.quadMod.QuadExt
import typingsSlinky.rdfJs.mod.Quad
import typingsSlinky.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rdf-ext/lib/Dataset", JSImport.Namespace)
@js.native
object datasetMod extends js.Object {
  
  @js.native
  trait DatasetExt extends DatasetIndexed[QuadExt, Quad] {
    
    def equals(other: this.type): Boolean = js.native
    
    def toCanonical(): String = js.native
    
    def toJSON(): js.Array[ReturnType[PropType[QuadExt, typingsSlinky.rdfExt.rdfExtStrings.toJSON]]] = js.native
  }
}
