package typingsSlinky.rdflib

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.rdflib.literalMod.default
import typingsSlinky.rdflib.tfTypesMod.NamedNode
import typingsSlinky.rdflib.tfTypesMod.Quad
import typingsSlinky.rdflib.tfTypesMod.QuadGraph
import typingsSlinky.rdflib.tfTypesMod.QuadObject
import typingsSlinky.rdflib.tfTypesMod.QuadPredicate
import typingsSlinky.rdflib.tfTypesMod.QuadSubject
import typingsSlinky.rdflib.tfTypesMod.RdfJsDataFactory
import typingsSlinky.rdflib.tfTypesMod.Term
import typingsSlinky.rdflib.typesMod.GraphType
import typingsSlinky.rdflib.typesMod.ObjectType
import typingsSlinky.rdflib.typesMod.PredicateType
import typingsSlinky.rdflib.typesMod.SubjectType
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdflib/lib/factories/factory-types", JSImport.Namespace)
@js.native
object factoryTypesMod extends js.Object {
  @js.native
  trait DataFactory[FactoryTypes, IndexType] extends RdfJsDataFactory {
    /**
      * BlankNode index
      * @private
      */
    var bnIndex: js.UndefOr[Double] = js.native
    def equals(a: Comparable, b: Comparable): Boolean = js.native
    def id(obj: FactoryTypes): IndexType = js.native
    /**
      * Generates a unique session-idempotent identifier for the given object.
      *
      * @example NQ serialization (reversible from value)
      * @example MD5 hash of termType + value (irreversible from value, map needed)
      *
      * @return {Indexable} A unique value which must also be a valid JS object key type.
      */
    def id(obj: Term): IndexType = js.native
    def isQuad(obj: js.Any): /* is rdflib.rdflib/lib/statement.default<rdflib.rdflib/lib/types.SubjectType, rdflib.rdflib/lib/types.PredicateType, rdflib.rdflib/lib/types.ObjectType, rdflib.rdflib/lib/types.GraphType> */ Boolean = js.native
    def literal(value: String): default = js.native
    def quadToNQ(term: typingsSlinky.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType]): String = js.native
    def quadToNQ(term: Quad[QuadSubject, QuadPredicate, QuadObject, QuadGraph]): String = js.native
    def termToNQ(term: Term): String = js.native
    def toNQ(term: FactoryTypes): String = js.native
    def toNQ(term: Term): String = js.native
    @JSName("variable")
    def variable_MDataFactory(value: String): typingsSlinky.rdflib.variableMod.default = js.native
  }
  
  @js.native
  sealed trait Feature extends js.Object
  
  trait _Comparable extends js.Object
  
  trait _DefaultFactoryTypes extends js.Object
  
  trait _TFIDFactoryTypes extends js.Object
  
  @js.native
  object Feature extends js.Object {
    /** Whether the factory supports termType:Collection terms */
    @js.native
    sealed trait collections extends Feature
    
    /** Whether the factory supports termType:DefaultGraph terms */
    @js.native
    sealed trait defaultGraphType extends Feature
    
    /** Whether the factory supports equals on produced instances */
    @js.native
    sealed trait equalsMethod extends Feature
    
    /** Whether the factory can create a unique idempotent identifier for the given term. */
    @js.native
    sealed trait id extends Feature
    
    /**
      * Whether the factory will return the same instance for subsequent calls.
      * This implies `===`, which means methods like `indexOf` can be used.
      */
    @js.native
    sealed trait identity extends Feature
    
    /** Whether the factory supports mapping ids back to instances (should adhere to the identity setting) */
    @js.native
    sealed trait reversibleId extends Feature
    
    /** Whether the factory supports termType:Variable terms */
    @js.native
    sealed trait variableType extends Feature
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Feature with String] = js.native
    /* "COLLECTIONS" */ @js.native
    object collections extends TopLevel[collections with String]
    
    /* "DEFAULT_GRAPH_TYPE" */ @js.native
    object defaultGraphType extends TopLevel[defaultGraphType with String]
    
    /* "EQUALS_METHOD" */ @js.native
    object equalsMethod extends TopLevel[equalsMethod with String]
    
    /* "ID" */ @js.native
    object id extends TopLevel[id with String]
    
    /* "IDENTITY" */ @js.native
    object identity extends TopLevel[identity with String]
    
    /* "REVERSIBLE_ID" */ @js.native
    object reversibleId extends TopLevel[reversibleId with String]
    
    /* "VARIABLE_TYPE" */ @js.native
    object variableType extends TopLevel[variableType with String]
    
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.rdflib.tfTypesMod.Term
    - typingsSlinky.rdflib.tfTypesMod.NamedNode
    - typingsSlinky.rdflib.tfTypesMod.BlankNode
    - typingsSlinky.rdflib.tfTypesMod.Literal
    - typingsSlinky.rdflib.tfTypesMod.Quad[
  typingsSlinky.rdflib.tfTypesMod.QuadSubject, 
  typingsSlinky.rdflib.tfTypesMod.QuadPredicate, 
  typingsSlinky.rdflib.tfTypesMod.QuadObject, 
  typingsSlinky.rdflib.tfTypesMod.QuadGraph]
    - js.UndefOr[scala.Nothing]
    - scala.Null
  */
  type Comparable = js.UndefOr[_Comparable | (Quad[QuadSubject, QuadPredicate, QuadObject, QuadGraph]) | Null]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.rdflib.namedNodeMod.default
    - typingsSlinky.rdflib.blankNodeMod.default
    - typingsSlinky.rdflib.literalMod.default
    - typingsSlinky.rdflib.variableMod.default
    - typingsSlinky.rdflib.statementMod.default[
  typingsSlinky.rdflib.typesMod.SubjectType, 
  typingsSlinky.rdflib.typesMod.PredicateType, 
  typingsSlinky.rdflib.typesMod.ObjectType, 
  typingsSlinky.rdflib.typesMod.GraphType]
  */
  type DefaultFactoryTypes = _DefaultFactoryTypes | (typingsSlinky.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType])
  type Indexable = Double | String
  type Namespace = js.Function1[/* term */ String, NamedNode]
  type SupportTable = Record[Feature, Boolean]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.rdflib.tfTypesMod.NamedNode
    - typingsSlinky.rdflib.tfTypesMod.BlankNode
    - typingsSlinky.rdflib.tfTypesMod.Literal
    - typingsSlinky.rdflib.tfTypesMod.Quad[
  typingsSlinky.rdflib.tfTypesMod.QuadSubject, 
  typingsSlinky.rdflib.tfTypesMod.QuadPredicate, 
  typingsSlinky.rdflib.tfTypesMod.QuadObject, 
  typingsSlinky.rdflib.tfTypesMod.QuadGraph]
    - typingsSlinky.rdflib.tfTypesMod.Variable
    - typingsSlinky.rdflib.tfTypesMod.Term
  */
  type TFIDFactoryTypes = _TFIDFactoryTypes | (Quad[QuadSubject, QuadPredicate, QuadObject, QuadGraph])
}

