package typingsSlinky.quadstore.mod

import typingsSlinky.abstractLeveldown.mod.AbstractLevelDOWN
import typingsSlinky.node.NodeJS.ReadableStream
import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.quadstore.quadstoreStrings.graph
import typingsSlinky.rdfJs.mod.BaseQuad
import typingsSlinky.rdfJs.mod.QuadGraph
import typingsSlinky.rdfJs.mod.Term
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("quadstore", "RdfStore")
@js.native
class RdfStore[Q /* <: BaseQuad */] protected () extends quadstore[graph, Q, Term] {
  def this(abstractLevelDOWN: AbstractLevelDOWN[_, _], opts: js.Any) = this()
  
  def deleteGraph(graph: QuadGraph): EventEmitter = js.native
  
  def `match`(subject: Term, predicate: Term, `object`: Term, graph: Term): ReadableStream = js.native
  
  def remove(source: ReadableStream): Unit = js.native
  def remove(source: ReadableStream, opts: js.Any): Unit = js.native
  
  def removeMatches(subject: Term, predicate: Term, `object`: Term, graph: Term): ReadableStream = js.native
}
