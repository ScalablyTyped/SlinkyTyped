package typingsSlinky.rdfJs.mod

import typingsSlinky.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Store[Q /* <: BaseQuad */]
  extends Source[Q]
     with Sink[Stream[Q], EventEmitter] {
  
  def deleteGraph(graph: String): EventEmitter = js.native
  /**
    * Deletes the given named graph.
    *
    * The `end` and `error` events are used like described in the Stream interface.
    * @see Stream
    *
    * @param graph The graph term or string to match.
    * @return The resulting event emitter.
    */
  @JSName("deleteGraph")
  def deleteGraph_graph(graph: /* import warning: importer.ImportType#apply Failed type conversion: Q['graph'] */ js.Any): EventEmitter = js.native
  
  /**
    * Removes all streamed quads.
    *
    * The end and error events are used like described in the Stream interface.
    * @see Stream
    *
    * @param stream The stream that will be consumed.
    * @return The resulting event emitter.
    */
  def remove(stream: Stream[Q]): EventEmitter = js.native
  
  /**
    * All quads matching the pattern will be removed.
    *
    * The `end` and `error` events are used like described in the Stream interface.
    * @see Stream
    *
    * @param subject   The optional exact subject or subject regex to match.
    * @param predicate The optional exact predicate or predicate regex to match.
    * @param object    The optional exact object or object regex to match.
    * @param graph     The optional exact graph or graph regex to match.
    * @return The resulting event emitter.
    */
  def removeMatches(
    subject: js.UndefOr[Term | js.RegExp],
    predicate: js.UndefOr[Term | js.RegExp],
    `object`: js.UndefOr[Term | js.RegExp],
    graph: js.UndefOr[Term | js.RegExp]
  ): EventEmitter = js.native
}
