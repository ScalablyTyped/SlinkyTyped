package typingsSlinky.rdflib

import typingsSlinky.rdflib.factoryTypesMod._Comparable
import typingsSlinky.rdflib.factoryTypesMod._DefaultFactoryTypes
import typingsSlinky.rdflib.factoryTypesMod._TFIDFactoryTypes
import typingsSlinky.rdflib.tfTypesMod.QuadGraph
import typingsSlinky.rdflib.tfTypesMod.QuadObject
import typingsSlinky.rdflib.tfTypesMod.QuadPredicate
import typingsSlinky.rdflib.tfTypesMod.QuadSubject
import typingsSlinky.rdflib.typesMod.GraphType
import typingsSlinky.rdflib.typesMod.PredicateType
import typingsSlinky.rdflib.typesMod.SubjectType
import typingsSlinky.rdflib.typesMod._FromValueReturns
import typingsSlinky.rdflib.typesMod._ObjectType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdflib/lib/named-node", JSImport.Namespace)
@js.native
object namedNodeMod extends js.Object {
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.rdflib.typesMod._ValueType because Already inherited
  - typingsSlinky.rdflib.tfTypesMod.Term because var conflicts: termType, value. Inlined 
  - typingsSlinky.rdflib.tfTypesMod.NamedNode because var conflicts: termType, value. Inlined  */ @js.native
  trait NamedNode
    extends typingsSlinky.rdflib.nodeInternalMod.default
       with QuadGraph
       with QuadObject
       with QuadPredicate
       with QuadSubject
       with _Comparable
       with _TFIDFactoryTypes
       with _FromValueReturns[js.Any] {
    @JSName("termType")
    var termType_NamedNode: typingsSlinky.rdflib.rdflibStrings.NamedNode = js.native
    /**
      * Returns an $rdf node for the containing directory, ending in slash.
      */
    def dir(): NamedNode | Null = js.native
    /**
      * Creates the fetchable named node for the document.
      * Removes everything from the # anchor tag.
      */
    def doc(): NamedNode = js.native
    /** The local identifier with the document */
    def id(): String = js.native
    /**
      * Returns an NN for the whole web site, ending in slash.
      * Contrast with the "origin" which does NOT have a trailing slash
      */
    def site(): NamedNode = js.native
    /** Alias for value, favored by Tim */
    def uri: String = js.native
    def uri(uri: String): js.Any = js.native
  }
  
  @js.native
  class default protected ()
    extends NamedNode
       with GraphType
       with PredicateType
       with SubjectType
       with _DefaultFactoryTypes
       with _ObjectType {
    /**
      * Create a named (IRI) RDF Node
      * @constructor
      * @param iri - The IRI for this node
      */
    def this(iri: String) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    /**
      * Creates a named node from the specified input value
      * @param value - An input value
      */
    def fromValue(value: js.Any): js.Any = js.native
  }
  
}

