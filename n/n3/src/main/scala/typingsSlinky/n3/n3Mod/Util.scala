package typingsSlinky.n3.n3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("n3", "Util")
@js.native
object Util extends js.Object {
  def inDefaultGraph(value: typingsSlinky.rdfDashJs.rdfDashJsMod.Quad): Boolean = js.native
  def isBlankNode(): Boolean = js.native
  def isBlankNode(value: typingsSlinky.rdfDashJs.rdfDashJsMod.Term): Boolean = js.native
  def isDefaultGraph(): Boolean = js.native
  def isDefaultGraph(value: typingsSlinky.rdfDashJs.rdfDashJsMod.Term): Boolean = js.native
  def isLiteral(): Boolean = js.native
  def isLiteral(value: typingsSlinky.rdfDashJs.rdfDashJsMod.Term): Boolean = js.native
  def isNamedNode(): Boolean = js.native
  def isNamedNode(value: typingsSlinky.rdfDashJs.rdfDashJsMod.Term): Boolean = js.native
  def isVariable(): Boolean = js.native
  def isVariable(value: typingsSlinky.rdfDashJs.rdfDashJsMod.Term): Boolean = js.native
  def prefix(iri: String): PrefixedToIri = js.native
  def prefix(iri: String, factory: typingsSlinky.rdfDashJs.rdfDashJsMod.DataFactory): PrefixedToIri = js.native
  def prefix(iri: typingsSlinky.rdfDashJs.rdfDashJsMod.NamedNode): PrefixedToIri = js.native
  def prefix(
    iri: typingsSlinky.rdfDashJs.rdfDashJsMod.NamedNode,
    factory: typingsSlinky.rdfDashJs.rdfDashJsMod.DataFactory
  ): PrefixedToIri = js.native
  def prefixes(defaultPrefixes: Prefixes[typingsSlinky.rdfDashJs.rdfDashJsMod.NamedNode | String]): js.Function1[/* prefix */ String, PrefixedToIri] = js.native
  def prefixes(
    defaultPrefixes: Prefixes[typingsSlinky.rdfDashJs.rdfDashJsMod.NamedNode | String],
    factory: typingsSlinky.rdfDashJs.rdfDashJsMod.DataFactory
  ): js.Function1[/* prefix */ String, PrefixedToIri] = js.native
}

