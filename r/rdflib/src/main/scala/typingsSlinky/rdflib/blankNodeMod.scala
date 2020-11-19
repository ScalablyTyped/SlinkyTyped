package typingsSlinky.rdflib

import typingsSlinky.rdflib.factoryTypesMod._Comparable
import typingsSlinky.rdflib.factoryTypesMod._DefaultFactoryTypes
import typingsSlinky.rdflib.factoryTypesMod._TFIDFactoryTypes
import typingsSlinky.rdflib.rdflibStrings._Colon
import typingsSlinky.rdflib.tfTypesMod.QuadGraph
import typingsSlinky.rdflib.tfTypesMod.QuadObject
import typingsSlinky.rdflib.tfTypesMod.QuadSubject
import typingsSlinky.rdflib.typesMod.SubjectType
import typingsSlinky.rdflib.typesMod._FromValueReturns
import typingsSlinky.rdflib.typesMod._ObjectType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rdflib/lib/blank-node", JSImport.Namespace)
@js.native
object blankNodeMod extends js.Object {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.rdflib.typesMod._ValueType because Already inherited
  - typingsSlinky.rdflib.tfTypesMod.Term because var conflicts: termType, value. Inlined 
  - typingsSlinky.rdflib.tfTypesMod.BlankNode because var conflicts: termType, value. Inlined  */ @js.native
  trait BlankNode
    extends typingsSlinky.rdflib.nodeInternalMod.default
       with QuadGraph
       with QuadObject
       with QuadSubject
       with _Comparable
       with _TFIDFactoryTypes
       with _FromValueReturns[js.Any] {
    
    def compareTerm(other: BlankNode): Double = js.native
    
    /**
      * Gets a copy of this blank node in the specified formula
      * @param formula The formula
      */
    def copy(formula: typingsSlinky.rdflib.storeMod.default): BlankNode = js.native
    
    /**
      * The identifier for the blank node
      */
    def id: String = js.native
    def id_=(value: String): Unit = js.native
    
    /** Whether this is a blank node */
    var isBlank: Double = js.native
    
    /**
      * This type of node is a variable.
      *
      * Note that the existence of this property already indicates that it is a variable.
      */
    var isVar: Double = js.native
    
    @JSName("termType")
    var termType_BlankNode: typingsSlinky.rdflib.rdflibStrings.BlankNode = js.native
  }
  
  @js.native
  /**
    * Initializes this node
    * @param [id] The identifier for the blank node
    */
  class default ()
    extends BlankNode
       with SubjectType
       with _DefaultFactoryTypes
       with _ObjectType {
    def this(id: String) = this()
    def this(id: js.Any) = this()
  }
  /* static members */
  @js.native
  object default extends js.Object {
    
    var NTAnonymousNodePrefix: _Colon = js.native
    
    var getId: js.Any = js.native
    
    /**
      * The next unique identifier for blank nodes
      */
    var nextId: Double = js.native
  }
}
