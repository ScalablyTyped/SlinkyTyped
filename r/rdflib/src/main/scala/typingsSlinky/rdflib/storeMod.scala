package typingsSlinky.rdflib

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.rdflib.anon.Delete
import typingsSlinky.rdflib.formulaMod.FormulaOpts
import typingsSlinky.rdflib.rdflibStrings.FunctionalProperty
import typingsSlinky.rdflib.rdflibStrings.InverseFunctionalProperty
import typingsSlinky.rdflib.rdflibStrings.`two-direction`
import typingsSlinky.rdflib.rdflibStrings.delete_
import typingsSlinky.rdflib.rdflibStrings.sameAs
import typingsSlinky.rdflib.tfTypesMod.NamedNode
import typingsSlinky.rdflib.tfTypesMod.Quad
import typingsSlinky.rdflib.tfTypesMod.QuadGraph
import typingsSlinky.rdflib.tfTypesMod.QuadObject
import typingsSlinky.rdflib.tfTypesMod.QuadPredicate
import typingsSlinky.rdflib.tfTypesMod.QuadSubject
import typingsSlinky.rdflib.tfTypesMod.Term
import typingsSlinky.rdflib.typesMod.Bindings
import typingsSlinky.rdflib.typesMod.GraphType
import typingsSlinky.rdflib.typesMod.ObjectType
import typingsSlinky.rdflib.typesMod.PredicateType
import typingsSlinky.rdflib.typesMod.SubjectType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rdflib/lib/store", JSImport.Namespace)
@js.native
object storeMod extends js.Object {
  
  val defaultGraphURI: /* "chrome:theSession" */ String = js.native
  
  @js.native
  trait IndexedFormula
    extends typingsSlinky.rdflib.formulaMod.default {
    
    /** Redirections we got from HTTP */
    var HTTPRedirects: js.Array[
        typingsSlinky.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType]
      ] = js.native
    
    var _existentialVariables: js.UndefOr[js.Array[typingsSlinky.rdflib.blankNodeMod.default]] = js.native
    
    var _universalVariables: js.UndefOr[js.Array[typingsSlinky.rdflib.namedNodeMod.default]] = js.native
    
    /**
      * Adds a triple (quad) to the store.
      *
      * @param subj - The thing about which the fact a relationship is asserted.
      *        Also accepts a statement or an array of Statements.
      * @param pred - The relationship which is asserted
      * @param obj - The object of the relationship, e.g. another thing or avalue. If passed a string, this will become a literal.
      * @param why - The document in which the triple (S,P,O) was or will be stored on the web
      * @returns The statement added to the store, or the store
      */
    def add(
      subj: QuadSubject | (Quad[QuadSubject, QuadPredicate, QuadObject, QuadGraph]) | (js.Array[
          (Quad[QuadSubject, QuadPredicate, QuadObject, QuadGraph]) | (typingsSlinky.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType])
        ]) | (typingsSlinky.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType]),
      pred: js.UndefOr[QuadPredicate],
      obj: js.UndefOr[Term | String],
      why: js.UndefOr[QuadGraph]
    ): (typingsSlinky.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType]) | Null | this.type | Double = js.native
    
    /**
      * Add a callback which will be triggered after a statement has been added to the store.
      * @param cb
      */
    def addDataCallback(cb: js.Function1[/* q */ Quad[QuadSubject, QuadPredicate, QuadObject, QuadGraph], Unit]): Unit = js.native
    
    /** Reverse mapping to redirection: aliases for this */
    var aliases: js.Array[_] = js.native
    
    /**
      * Return all equivalent URIs by which this is known
      * @param x A named node
      */
    def allAliases(x: typingsSlinky.rdflib.namedNodeMod.default): js.Array[typingsSlinky.rdflib.namedNodeMod.default] = js.native
    
    /**
      * Apply a set of statements to be deleted and to be inserted
      *
      * @param patch - The set of statements to be deleted and to be inserted
      * @param target - The name of the document to patch
      * @param patchCallback - Callback to be called when patching is complete
      */
    def applyPatch(
      patch: Delete,
      target: NamedNode,
      patchCallback: js.Function1[/* errorString */ js.UndefOr[String], Unit]
    ): Unit = js.native
    
    /**
      * Returns the symbol with canonical URI as smushed
      * @param term - An RDF node
      */
    def canon(): typingsSlinky.rdflib.nodeMod.default = js.native
    def canon(term: Term): typingsSlinky.rdflib.nodeMod.default = js.native
    
    /**
      * Checks this formula for consistency
      */
    def check(): Unit = js.native
    
    /**
      * Checks a list of statements for consistency
      * @param sts - The list of statements to check
      * @param from - An index with the array ['subject', 'predicate', 'object', 'why']
      */
    def checkStatementList(sts: js.Array[Quad[QuadSubject, QuadPredicate, QuadObject, QuadGraph]]): Boolean | Unit = js.native
    def checkStatementList(sts: js.Array[Quad[QuadSubject, QuadPredicate, QuadObject, QuadGraph]], from: Double): Boolean | Unit = js.native
    
    /** Map of iri predicates to functions to call when adding { s type X } */
    var classActions: StringDictionary[js.Array[js.Function]] = js.native
    
    /**
      * Closes this formula (and return it)
      */
    def close(): IndexedFormula = js.native
    
    def compareTerms(u1: Term, u2: Term): Double = js.native
    
    /**
      * replaces @template with @target and add appropriate triples
      * removes no triples by default and is a one-direction replication
      * @param template node to copy
      * @param target node to copy to
      * @param flags Whether or not to do a two-directional copy and/or delete triples
      */
    def copyTo(template: QuadSubject, target: QuadSubject): Unit = js.native
    def copyTo(template: QuadSubject, target: QuadSubject, flags: js.Array[`two-direction` | delete_]): Unit = js.native
    
    /** Callbacks which are triggered after a statement has been added to the store */
    var dataCallbacks: js.Any = js.native
    
    /**
      * N3 allows for declaring blank nodes, this function enables that support
      *
      * @param x The blank node to be declared, supported in N3
      */
    def declareExistential(x: typingsSlinky.rdflib.blankNodeMod.default): typingsSlinky.rdflib.blankNodeMod.default = js.native
    
    /**
      * Simplify graph in store when we realize two identifiers are equivalent
      * We replace the bigger with the smaller.
      * @param u1in The first node
      * @param u2in The second node
      */
    def equate(u1in: Term, u2in: Term): Boolean = js.native
    
    var features: FeaturesType = js.native
    
    /**
      * Creates a new empty indexed formula
      * Only applicable for IndexedFormula, but TypeScript won't allow a subclass to override a property
      * @param features The list of features
      */
    def formula(features: FeaturesType): IndexedFormula = js.native
    
    var index: js.Tuple4[
        js.Array[
          typingsSlinky.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType]
        ], 
        js.Array[
          typingsSlinky.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType]
        ], 
        js.Array[
          typingsSlinky.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType]
        ], 
        js.Array[
          typingsSlinky.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType]
        ]
      ] = js.native
    
    /**
      * @param features
      */
    def initPropertyActions(features: FeaturesType): Unit = js.native
    
    /**
      * Returns the number of statements contained in this IndexedFormula.
      * (Getter proxy to this.statements).
      * Usage:
      *    ```
      *    var kb = rdf.graph()
      *    kb.length  // -> 0
      *    ```
      * @returns {Number}
      */
    def length: Double = js.native
    
    /**
      * Returns any quads matching the given arguments.
      * Standard RDFJS spec method for Source objects, implemented as an
      * alias to `statementsMatching()`
      * @param subject The subject
      * @param predicate The predicate
      * @param object The object
      * @param graph The graph that contains the statement
      */
    def `match`(
      subject: js.UndefOr[QuadSubject | Null],
      predicate: js.UndefOr[QuadPredicate | Null],
      `object`: js.UndefOr[QuadObject | Null],
      graph: js.UndefOr[QuadGraph | Null]
    ): js.Array[Quad[QuadSubject, QuadPredicate, QuadObject, QuadGraph]] = js.native
    
    /**
      * Find out whether a given URI is used as symbol in the formula
      * @param uri The URI to look for
      */
    def mentionsURI(uri: String): Boolean = js.native
    
    /**
      * Dictionary of namespace prefixes
      */
    var namespaces: StringDictionary[String] = js.native
    
    /**
      * Existentials are BNodes - something exists without naming
      * @param uri An URI
      */
    def newExistential(uri: String): Term = js.native
    
    /**
      * Adds a new property action
      * @param pred the predicate that the function should be triggered on
      * @param action the function that should trigger
      */
    def newPropertyAction(
      pred: QuadPredicate,
      action: js.Function4[
          /* store */ this.type, 
          /* subject */ QuadSubject, 
          /* predicate */ QuadPredicate, 
          /* object */ QuadObject, 
          Boolean
        ]
    ): Boolean = js.native
    
    /**
      * Creates a new universal node
      * Universals are Variables
      * @param uri An URI
      */
    def newUniversal(uri: String): NamedNode = js.native
    
    /**
      * Find an unused id for a file being edited: return a symbol
      * (Note: Slow iff a lot of them -- could be O(log(k)) )
      * @param doc A document named node
      */
    def nextSymbol(doc: NamedNode): NamedNode = js.native
    
    /** Array of statements with this X as object */
    var objectIndex: js.Array[
        typingsSlinky.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType]
      ] = js.native
    
    /** Array of statements with this X as predicate */
    var predicateIndex: js.Array[
        typingsSlinky.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType]
      ] = js.native
    
    /** Map of iri predicates to functions to call when getting statement with {s X o} */
    var propertyActions: StringDictionary[js.Array[js.Function]] = js.native
    
    /**
      * Query this store asynchronously, return bindings in callback
      *
      * @param myQuery The query to be run
      * @param callback Function to call when bindings
      * @param Fetcher | null  If you want the query to do link following
      * @param onDone OBSOLETE - do not use this // @@ Why not ?? Called when query complete
      */
    def query(
      myQuery: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Query */ js.Any,
      callback: js.Function1[/* bindings */ Bindings, Unit]
    ): Unit = js.native
    def query(
      myQuery: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Query */ js.Any,
      callback: js.Function1[/* bindings */ Bindings, Unit],
      fetcher: js.UndefOr[scala.Nothing],
      onDone: js.Function0[Unit]
    ): Unit = js.native
    def query(
      myQuery: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Query */ js.Any,
      callback: js.Function1[/* bindings */ Bindings, Unit],
      fetcher: Null,
      onDone: js.Function0[Unit]
    ): Unit = js.native
    def query(
      myQuery: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Query */ js.Any,
      callback: js.Function1[/* bindings */ Bindings, Unit],
      fetcher: typingsSlinky.rdflib.fetcherMod.default
    ): Unit = js.native
    def query(
      myQuery: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Query */ js.Any,
      callback: js.Function1[/* bindings */ Bindings, Unit],
      fetcher: typingsSlinky.rdflib.fetcherMod.default,
      onDone: js.Function0[Unit]
    ): Unit = js.native
    
    /**
      * Query this store synchronously and return bindings
      *
      * @param myQuery The query to be run
      */
    def querySync(
      myQuery: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Query */ js.Any
    ): js.Array[_] = js.native
    
    /** Function to remove quads from the store arrays with */
    var rdfArrayRemove: js.Any = js.native
    
    /** Redirect to lexically smaller equivalent symbol */
    var redirections: js.Array[_] = js.native
    
    def remove(st: js.Array[Quad[QuadSubject, QuadPredicate, QuadObject, QuadGraph]]): IndexedFormula = js.native
    /**
      * Removes one or multiple statement(s) from this formula
      * @param st - A Statement or array of Statements to remove
      */
    def remove(st: Quad[QuadSubject, QuadPredicate, QuadObject, QuadGraph]): IndexedFormula = js.native
    
    /**
      * Removes all statemnts in a doc
      * @param doc - The document / graph
      */
    def removeDocument(doc: QuadGraph): IndexedFormula = js.native
    
    /**
      * Remove all statements matching args (within limit) *
      * @param subj The subject
      * @param pred The predicate
      * @param obj The object
      * @param why The graph that contains the statement
      * @param limit The number of statements to remove
      */
    def removeMany(
      subj: js.UndefOr[QuadSubject | Null],
      pred: js.UndefOr[QuadPredicate | Null],
      obj: js.UndefOr[QuadObject | Null],
      why: js.UndefOr[QuadGraph | Null],
      limit: js.UndefOr[Double]
    ): Unit = js.native
    
    /**
      * Remove all matching statements
      * @param subject The subject
      * @param predicate The predicate
      * @param object The object
      * @param graph The graph that contains the statement
      */
    def removeMatches(
      subject: js.UndefOr[QuadSubject | Null],
      predicate: js.UndefOr[QuadPredicate | Null],
      `object`: js.UndefOr[QuadObject | Null],
      graph: js.UndefOr[QuadGraph | Null]
    ): IndexedFormula = js.native
    
    /**
      * Remove a particular statement object from the store
      *
      * @param st - a statement which is already in the store and indexed.
      *        Make sure you only use this for these.
      *        Otherwise, you should use remove() above.
      */
    def removeStatement(st: Quad[QuadSubject, QuadPredicate, QuadObject, QuadGraph]): IndexedFormula = js.native
    
    /**
      * Removes statements
      * @param sts The statements to remove
      */
    def removeStatements(sts: js.Array[Quad[QuadSubject, QuadPredicate, QuadObject, QuadGraph]]): IndexedFormula = js.native
    
    /**
      * Replace big with small, obsoleted with obsoleting.
      */
    def replaceWith(big: QuadSubject, small: QuadSubject): Boolean = js.native
    
    /**
      * Compare by canonical URI as smushed
      * @param x A named node
      * @param y Another named node
      */
    def sameThings(x: typingsSlinky.rdflib.namedNodeMod.default, y: typingsSlinky.rdflib.namedNodeMod.default): Boolean = js.native
    
    def setPrefixForURI(prefix: String, nsuri: String): Unit = js.native
    
    /** Array of statements with this X as subject */
    var subjectIndex: js.Array[
        typingsSlinky.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType]
      ] = js.native
    
    /**
      * An UpdateManager initialised to this store
      */
    var updater: js.UndefOr[typingsSlinky.rdflib.updateManagerMod.default] = js.native
    
    /**
      * A list of all the URIs by which this thing is known
      * @param term
      */
    def uris(term: QuadSubject): js.Array[String] = js.native
    
    /** Array of statements with X as provenance */
    var whyIndex: js.Array[
        typingsSlinky.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType]
      ] = js.native
  }
  
  @js.native
  /**
    * Creates a new formula
    * @param features - What sort of autmatic processing to do? Array of string
    * @param features.sameAs - Smush together A and B nodes whenever { A sameAs B }
    * @param opts
    * @param [opts.rdfFactory] - The data factory that should be used by the store
    * @param [opts.rdfArrayRemove] - Function which removes statements from the store
    * @param [opts.dataCallback] - Callback when a statement is added to the store, will not trigger when adding duplicates
    */
  class default () extends IndexedFormula {
    def this(features: FeaturesType) = this()
    def this(features: js.UndefOr[FeaturesType], opts: FormulaOpts) = this()
  }
  /* static members */
  @js.native
  object default extends js.Object {
    
    /**
      * Gets the URI of the default graph
      */
    def defaultGraphURI: String = js.native
    
    var handleRDFType: js.Function = js.native
  }
  
  type FeaturesType = js.UndefOr[js.Array[sameAs | InverseFunctionalProperty | FunctionalProperty]]
}
