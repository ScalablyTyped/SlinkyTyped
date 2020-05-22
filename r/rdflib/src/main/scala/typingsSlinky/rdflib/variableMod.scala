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

@JSImport("rdflib/lib/variable", JSImport.Namespace)
@js.native
object variableMod extends js.Object {
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.rdflib.typesMod._ValueType because Already inherited
  - typingsSlinky.rdflib.tfTypesMod.Term because var conflicts: termType, value. Inlined 
  - typingsSlinky.rdflib.tfTypesMod.Variable because var conflicts: termType, value. Inlined  */ @js.native
  trait Variable
    extends typingsSlinky.rdflib.nodeInternalMod.default
       with QuadGraph
       with QuadObject
       with QuadPredicate
       with QuadSubject
       with _TFIDFactoryTypes
       with _Comparable
       with _FromValueReturns[js.Any] {
    /** The base string for a variable's name */
    var base: String = js.native
    var isVar: Double = js.native
    @JSName("termType")
    var termType_Variable: typingsSlinky.rdflib.rdflibStrings.Variable = js.native
    /** The unique identifier of this variable */
    var uri: String = js.native
    def equals(other: js.Any): Boolean = js.native
    def substitute(bindings: js.Any): js.Any = js.native
  }
  
  @js.native
  /**
    * Initializes this variable
    * @param name The variable's name
    */
  class default ()
    extends Variable
       with GraphType
       with PredicateType
       with SubjectType
       with _DefaultFactoryTypes
       with _ObjectType {
    def this(name: String) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    def toString(variable: js.Any): String = js.native
  }
  
}

