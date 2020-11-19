package typingsSlinky.rdflib

import typingsSlinky.rdflib.factoryTypesMod._Comparable
import typingsSlinky.rdflib.factoryTypesMod._TFIDFactoryTypes
import typingsSlinky.rdflib.tfTypesMod.QuadObject
import typingsSlinky.rdflib.typesMod.FromValueReturns
import typingsSlinky.rdflib.typesMod.ValueType
import typingsSlinky.rdflib.typesMod._FromValueReturns
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rdflib/lib/collection", JSImport.Namespace)
@js.native
object collectionMod extends js.Object {
  
  def fromValue[T /* <: FromValueReturns[C] */, C /* <: typingsSlinky.rdflib.nodeInternalMod.default */](value: ValueType): T = js.native
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.rdflib.typesMod._ValueType because Already inherited
  - typingsSlinky.rdflib.tfTypesMod.Term because var conflicts: termType, value. Inlined  */ @js.native
  trait Collection[T /* <: typingsSlinky.rdflib.nodeInternalMod.default */]
    extends typingsSlinky.rdflib.nodeInternalMod.default
       with QuadObject
       with _Comparable
       with _FromValueReturns[js.Any]
       with _TFIDFactoryTypes {
    
    /**
      * Appends an element to this collection
      * @param element - The new element
      */
    def append(element: T): Double = js.native
    
    /**
      * Closes this collection
      */
    def close(): Boolean = js.native
    
    var closed: Boolean = js.native
    
    def compareTerm(other: typingsSlinky.rdflib.blankNodeMod.default): Double = js.native
    
    /**
      * The nodes in this collection
      */
    var elements: js.Array[T] = js.native
    
    def id: String = js.native
    def id_=(value: String): Unit = js.native
    
    var isVar: Double = js.native
    
    /**
      * Removes the first element from the collection (and return it)
      */
    def shift(): js.UndefOr[T] = js.native
    
    @JSName("termType")
    var termType_Collection: typingsSlinky.rdflib.rdflibStrings.Collection = js.native
    
    /**
      * Prepends the specified element to the collection's front
      * @param element - The element to prepend
      */
    def unshift(element: T): Double = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.rdflib.typesMod._FromValueReturns because Already inherited */ @js.native
  class default[T /* <: typingsSlinky.rdflib.nodeInternalMod.default */] () extends Collection[T] {
    def this(initial: js.Array[ValueType]) = this()
  }
  /* static members */
  @js.native
  object default extends js.Object {
    
    var termType: typingsSlinky.rdflib.rdflibStrings.Collection = js.native
    
    def toNT(collection: js.Any): String = js.native
  }
}
