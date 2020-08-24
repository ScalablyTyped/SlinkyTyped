package typingsSlinky.rdflib.typesMod

import typingsSlinky.rdflib.collectionMod.Collection
import typingsSlinky.rdflib.factoryTypesMod.DataFactory
import typingsSlinky.rdflib.factoryTypesMod.Indexable
import typingsSlinky.rdflib.namedNodeMod.default
import typingsSlinky.rdflib.tfTypesMod.NamedNode
import typingsSlinky.rdflib.tfTypesMod.QuadGraph
import typingsSlinky.rdflib.tfTypesMod.QuadObject
import typingsSlinky.rdflib.tfTypesMod.QuadPredicate
import typingsSlinky.rdflib.tfTypesMod.QuadSubject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRDFlibDataFactory
  extends DataFactory[
      default | typingsSlinky.rdflib.blankNodeMod.default | typingsSlinky.rdflib.literalMod.default | (typingsSlinky.rdflib.collectionMod.default[
        typingsSlinky.rdflib.nodeInternalMod.default | typingsSlinky.rdflib.blankNodeMod.default | Collection[js.Any] | typingsSlinky.rdflib.literalMod.default | typingsSlinky.rdflib.variableMod.default
      ]) | (typingsSlinky.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType]), 
      Indexable
    ] {
  def fetcher(store: typingsSlinky.rdflib.storeMod.default, options: js.Any): typingsSlinky.rdflib.fetcherMod.default = js.native
  def graph(): typingsSlinky.rdflib.storeMod.default = js.native
  def graph(features: js.UndefOr[scala.Nothing], opts: js.Any): typingsSlinky.rdflib.storeMod.default = js.native
  def graph(features: js.Any): typingsSlinky.rdflib.storeMod.default = js.native
  def graph(features: js.Any, opts: js.Any): typingsSlinky.rdflib.storeMod.default = js.native
  def lit(`val`: String): typingsSlinky.rdflib.literalMod.default = js.native
  def lit(`val`: String, lang: js.UndefOr[scala.Nothing], dt: NamedNode): typingsSlinky.rdflib.literalMod.default = js.native
  def lit(`val`: String, lang: String): typingsSlinky.rdflib.literalMod.default = js.native
  def lit(`val`: String, lang: String, dt: NamedNode): typingsSlinky.rdflib.literalMod.default = js.native
  def st(subject: QuadSubject, predicate: QuadPredicate, `object`: QuadObject): typingsSlinky.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType] = js.native
  def st(subject: QuadSubject, predicate: QuadPredicate, `object`: QuadObject, graph: QuadGraph): typingsSlinky.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType] = js.native
}

