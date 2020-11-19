package typingsSlinky.rdflib

import typingsSlinky.rdflib.factoryTypesMod._Comparable
import typingsSlinky.rdflib.factoryTypesMod._TFIDFactoryTypes
import typingsSlinky.rdflib.rdflibStrings._empty
import typingsSlinky.rdflib.tfTypesMod.QuadGraph
import typingsSlinky.rdflib.tfTypesMod.QuadObject
import typingsSlinky.rdflib.typesMod.GraphType
import typingsSlinky.rdflib.typesMod._FromValueReturns
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rdflib/lib/default-graph", JSImport.Namespace)
@js.native
object defaultGraphMod extends js.Object {
  
  def isDefaultGraph(`object`: js.Any): /* is rdflib.rdflib/lib/default-graph.DefaultGraph */ Boolean = js.native
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.rdflib.typesMod._ValueType because Already inherited
  - typingsSlinky.rdflib.tfTypesMod.Term because var conflicts: termType, value. Inlined 
  - typingsSlinky.rdflib.tfTypesMod.DefaultGraph because var conflicts: termType, value. Inlined  */ @js.native
  trait DefaultGraph
    extends typingsSlinky.rdflib.nodeInternalMod.default
       with QuadGraph
       with QuadObject
       with _Comparable
       with _FromValueReturns[js.Any]
       with _TFIDFactoryTypes {
    
    @JSName("termType")
    var termType_DefaultGraph: typingsSlinky.rdflib.rdflibStrings.DefaultGraph = js.native
    
    var uri: String = js.native
    
    @JSName("value")
    var value_DefaultGraph: _empty = js.native
  }
  
  @js.native
  class default ()
    extends DefaultGraph
       with GraphType
}
