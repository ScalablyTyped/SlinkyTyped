package typingsSlinky.rdflib

import typingsSlinky.rdflib.factoryTypesMod._Comparable
import typingsSlinky.rdflib.factoryTypesMod._TFIDFactoryTypes
import typingsSlinky.rdflib.tfTypesMod.QuadObject
import typingsSlinky.rdflib.typesMod._FromValueReturns
import typingsSlinky.rdflib.typesMod._ObjectType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdflib/lib/empty", JSImport.Namespace)
@js.native
object emptyMod extends js.Object {
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.rdflib.typesMod._ValueType because Already inherited
  - typingsSlinky.rdflib.tfTypesMod.Term because var conflicts: termType, value. Inlined  */ @js.native
  trait Empty
    extends typingsSlinky.rdflib.nodeInternalMod.default
       with QuadObject
       with _Comparable
       with _FromValueReturns[js.Any]
       with _TFIDFactoryTypes {
    @JSName("termType")
    var termType_Empty: typingsSlinky.rdflib.rdflibStrings.Empty = js.native
  }
  
  @js.native
  class default ()
    extends Empty
       with _ObjectType
  
}

