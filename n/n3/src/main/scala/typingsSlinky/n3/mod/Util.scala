package typingsSlinky.n3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("n3", "Util")
@js.native
object Util extends js.Object {
  
  def inDefaultGraph(value: typingsSlinky.rdfJs.mod.Quad): Boolean = js.native
  
  def isBlankNode(): Boolean = js.native
  def isBlankNode(value: typingsSlinky.rdfJs.mod.Term): Boolean = js.native
  
  def isDefaultGraph(): Boolean = js.native
  def isDefaultGraph(value: typingsSlinky.rdfJs.mod.Term): Boolean = js.native
  
  def isLiteral(): Boolean = js.native
  def isLiteral(value: typingsSlinky.rdfJs.mod.Term): Boolean = js.native
  
  def isNamedNode(): Boolean = js.native
  def isNamedNode(value: typingsSlinky.rdfJs.mod.Term): Boolean = js.native
  
  def isVariable(): Boolean = js.native
  def isVariable(value: typingsSlinky.rdfJs.mod.Term): Boolean = js.native
  
  def prefix(iri: String): PrefixedToIri = js.native
  def prefix(
    iri: String,
    factory: typingsSlinky.rdfJs.mod.DataFactory[typingsSlinky.rdfJs.mod.Quad, typingsSlinky.rdfJs.mod.Quad]
  ): PrefixedToIri = js.native
  def prefix(iri: typingsSlinky.rdfJs.mod.NamedNode[String]): PrefixedToIri = js.native
  def prefix(
    iri: typingsSlinky.rdfJs.mod.NamedNode[String],
    factory: typingsSlinky.rdfJs.mod.DataFactory[typingsSlinky.rdfJs.mod.Quad, typingsSlinky.rdfJs.mod.Quad]
  ): PrefixedToIri = js.native
  
  def prefixes(defaultPrefixes: Prefixes[typingsSlinky.rdfJs.mod.NamedNode[String] | String]): js.Function1[/* prefix */ String, PrefixedToIri] = js.native
  def prefixes(
    defaultPrefixes: Prefixes[typingsSlinky.rdfJs.mod.NamedNode[String] | String],
    factory: typingsSlinky.rdfJs.mod.DataFactory[typingsSlinky.rdfJs.mod.Quad, typingsSlinky.rdfJs.mod.Quad]
  ): js.Function1[/* prefix */ String, PrefixedToIri] = js.native
}
