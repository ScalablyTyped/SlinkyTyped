package typingsSlinky.rdflib

import typingsSlinky.rdflib.factoryTypesMod._Comparable
import typingsSlinky.rdflib.factoryTypesMod._DefaultFactoryTypes
import typingsSlinky.rdflib.factoryTypesMod._TFIDFactoryTypes
import typingsSlinky.rdflib.tfTypesMod.NamedNode
import typingsSlinky.rdflib.tfTypesMod.QuadObject
import typingsSlinky.rdflib.typesMod.FromValueReturns
import typingsSlinky.rdflib.typesMod.ValueType
import typingsSlinky.rdflib.typesMod._FromValueReturns
import typingsSlinky.rdflib.typesMod._ObjectType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdflib/lib/literal", JSImport.Namespace)
@js.native
object literalMod extends js.Object {
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.rdflib.typesMod._ValueType because Already inherited
  - typingsSlinky.rdflib.tfTypesMod.Term because var conflicts: termType, value. Inlined 
  - typingsSlinky.rdflib.tfTypesMod.Literal because var conflicts: termType, value. Inlined language, datatype */ @js.native
  trait Literal
    extends typingsSlinky.rdflib.nodeInternalMod.default
       with QuadObject
       with _Comparable
       with _TFIDFactoryTypes
       with _FromValueReturns[js.Any] {
    /**
      * The literal's datatype as a named node
      */
    var datatype: NamedNode | typingsSlinky.rdflib.namedNodeMod.default = js.native
    var isVar: Double = js.native
    /**
      * The language for the literal
      */
    var language: String = js.native
    @JSName("termType")
    var termType_Literal: typingsSlinky.rdflib.rdflibStrings.Literal = js.native
    /**
      * Gets a copy of this literal
      */
    def copy(): Literal = js.native
    /**
      * The language for the literal
      * @deprecated use {language} instead
      */
    def lang: String = js.native
    def lang(language: String): js.Any = js.native
  }
  
  @js.native
  class default protected ()
    extends Literal
       with _DefaultFactoryTypes
       with _ObjectType {
    /**
      * Initializes a literal
      * @param value - The literal's lexical value
      * @param language - The language for the literal. Defaults to ''.
      * @param datatype - The literal's datatype as a named node. Defaults to xsd:string.
      */
    def this(value: String) = this()
    def this(value: String, language: String) = this()
    def this(value: String, language: String, datatype: js.Any) = this()
    def this(value: String, language: Null, datatype: js.Any) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    /**
      * Builds a literal node from a boolean value
      * @param value - The value
      */
    def fromBoolean(value: Boolean): Literal = js.native
    /**
      * Builds a literal node from a date value
      * @param value The value
      */
    def fromDate(value: js.Date): Literal = js.native
    /**
      * Builds a literal node from a number value
      * @param value - The value
      */
    def fromNumber(value: Double): Literal = js.native
    /**
      * Builds a literal node from an input value
      * @param value - The input value
      */
    def fromValue[T /* <: FromValueReturns[_] */](value: ValueType): T = js.native
    /** Serializes a literal to an N-Triples string */
    def toNT(literal: Literal): String = js.native
  }
  
}

