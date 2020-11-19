package typingsSlinky.clownface.mod

import typingsSlinky.clownface.contextMod.Context
import typingsSlinky.rdfJs.mod.BlankNode
import typingsSlinky.rdfJs.mod.DatasetCore
import typingsSlinky.rdfJs.mod.Literal
import typingsSlinky.rdfJs.mod.NamedNode
import typingsSlinky.rdfJs.mod.Quad
import typingsSlinky.rdfJs.mod.Term
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Clownface[T /* <: AnyContext */, D /* <: DatasetCore[Quad, Quad] */] extends js.Object {
  
  val _context: js.Array[Context[D, Term]] = js.native
  
  def addIn(predicates: SingleOrArrayOfTerms[Term]): Clownface[T, D] = js.native
  def addIn(predicates: SingleOrArrayOfTerms[Term], callback: AddCallback[D, BlankNode]): Clownface[T, D] = js.native
  def addIn[X /* <: Term */](predicates: SingleOrArrayOfTerms[Term], subjects: SingleOrArrayOfTermsOrLiterals[X]): Clownface[T, D] = js.native
  def addIn[X /* <: Term */](
    predicates: SingleOrArrayOfTerms[Term],
    subjects: SingleOrArrayOfTermsOrLiterals[X],
    callback: AddCallback[D, X]
  ): Clownface[T, D] = js.native
  
  def addList[X /* <: Term */](predicates: SingleOrArrayOfTerms[Term]): Clownface[T, D] = js.native
  def addList[X /* <: Term */](
    predicates: SingleOrArrayOfTerms[Term],
    objects: js.UndefOr[SingleOrArrayOfTermsOrLiterals[X]],
    callback: AddCallback[D, X]
  ): Clownface[T, D] = js.native
  def addList[X /* <: Term */](predicates: SingleOrArrayOfTerms[Term], objects: SingleOrArrayOfTermsOrLiterals[X]): Clownface[T, D] = js.native
  
  def addOut(predicates: SingleOrArrayOfTerms[Term]): Clownface[T, D] = js.native
  def addOut(predicates: SingleOrArrayOfTerms[Term], callback: AddCallback[D, BlankNode]): Clownface[T, D] = js.native
  def addOut[X /* <: Term */](predicates: SingleOrArrayOfTerms[Term], objects: SingleOrArrayOfTermsOrLiterals[X]): Clownface[T, D] = js.native
  def addOut[X /* <: Term */](
    predicates: SingleOrArrayOfTerms[Term],
    objects: SingleOrArrayOfTermsOrLiterals[X],
    callback: AddCallback[D, X]
  ): Clownface[T, D] = js.native
  
  def blankNode(): Clownface[BlankNode, D] = js.native
  def blankNode(values: js.Array[String]): Clownface[js.Array[BlankNode], D] = js.native
  def blankNode(value: SingleOrOneElementArray[String]): Clownface[BlankNode, D] = js.native
  
  val dataset: D = js.native
  
  val datasets: js.Array[D] = js.native
  
  def deleteIn(): Clownface[T, D] = js.native
  def deleteIn(predicates: SingleOrArrayOfTerms[Term]): Clownface[T, D] = js.native
  
  def deleteList(predicates: SingleOrArrayOfTerms[Term]): Clownface[T, D] = js.native
  
  def deleteOut(): Clownface[T, D] = js.native
  def deleteOut(predicates: SingleOrArrayOfTerms[Term]): Clownface[T, D] = js.native
  
  def filter(cb: js.Function1[/* quad */ Iteratee[T, D], Boolean]): Clownface[T, D] = js.native
  
  def forEach(cb: js.Function1[/* quad */ Iteratee[T, D], Unit]): Unit = js.native
  
  def has(predicates: SingleOrArrayOfTerms[Term]): Clownface[js.Array[NamedNode[String] | BlankNode], D] = js.native
  def has(predicates: SingleOrArrayOfTerms[Term], objects: SingleOrArrayOfTermsOrLiterals[Term]): Clownface[js.Array[NamedNode[String] | BlankNode], D] = js.native
  
  def in(): SafeClownface[NamedNode[String] | BlankNode, D] = js.native
  def in(predicates: SingleOrArrayOfTerms[Term]): SafeClownface[NamedNode[String] | BlankNode, D] = js.native
  
  def list(): js.Iterable[Iteratee[T, D]] = js.native
  
  def literal(values: js.Array[Boolean | String | Double | Term | Null]): Clownface[js.Array[Literal], D] = js.native
  def literal(values: js.Array[Boolean | String | Double | Term | Null], languageOrDatatype: String): Clownface[js.Array[Literal], D] = js.native
  def literal(values: js.Array[Boolean | String | Double | Term | Null], languageOrDatatype: NamedNode[String]): Clownface[js.Array[Literal], D] = js.native
  def literal(value: SingleOrOneElementArray[Boolean | String | Double | Term | Null]): Clownface[Literal, D] = js.native
  def literal(
    value: SingleOrOneElementArray[Boolean | String | Double | Term | Null],
    languageOrDatatype: String
  ): Clownface[Literal, D] = js.native
  def literal(
    value: SingleOrOneElementArray[Boolean | String | Double | Term | Null],
    languageOrDatatype: NamedNode[String]
  ): Clownface[Literal, D] = js.native
  
  def map[X](cb: js.Function2[/* quad */ Iteratee[T, D], /* index */ Double, X]): js.Array[X] = js.native
  
  def namedNode(values: js.Array[String | NamedNode[String]]): Clownface[js.Array[NamedNode[String]], D] = js.native
  def namedNode(value: SingleOrOneElementArray[String | NamedNode[String]]): Clownface[NamedNode[String], D] = js.native
  
  def node(): Clownface[BlankNode, D] = js.native
  def node(value: Null, options: NodeOptions): Clownface[BlankNode, D] = js.native
  def node(values: js.Array[Boolean | Double | Null | String | Term]): Clownface[js.Array[Literal], D] = js.native
  def node(values: js.Array[Boolean | Double | Null | String | Term], options: NodeOptions): Clownface[js.Array[Literal], D] = js.native
  def node(value: SingleOrOneElementArray[Boolean | String | Double]): Clownface[Literal, D] = js.native
  def node(value: SingleOrOneElementArray[Boolean | String | Double], options: NodeOptions): Clownface[Literal, D] = js.native
  def node[X /* <: js.Array[Term] */](values: X): Clownface[X, D] = js.native
  def node[X /* <: js.Array[Term] */](values: X, options: NodeOptions): Clownface[X, D] = js.native
  @JSName("node")
  def node_X_Term[X /* <: Term */](value: SingleOrOneElementArray[X]): Clownface[X, D] = js.native
  @JSName("node")
  def node_X_Term[X /* <: Term */](value: SingleOrOneElementArray[X], options: NodeOptions): Clownface[X, D] = js.native
  
  def out(): SafeClownface[Term, D] = js.native
  def out(predicates: SingleOrArrayOfTerms[Term]): SafeClownface[Term, D] = js.native
  
  val term: js.UndefOr[
    T | (/* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any)
  ] = js.native
  
  val terms: (js.Array[T | Term]) | T = js.native
  
  def toArray(): js.Array[
    Clownface[
      T | (/* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any), 
      D
    ]
  ] = js.native
  
  val value: js.UndefOr[
    String | (/* import warning: importer.ImportType#apply Failed type conversion: string[0] */ js.Any)
  ] = js.native
  
  val values: js.Array[String] = js.native
}
