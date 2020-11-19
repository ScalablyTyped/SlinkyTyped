package typingsSlinky.elasticlunr.mod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.elasticlunr.elasticlunrStrings.AND
import typingsSlinky.elasticlunr.elasticlunrStrings.OR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("elasticlunr", "Index")
@js.native
class Index[T] () extends js.Object {
  
  def addDoc(doc: T): Unit = js.native
  def addDoc(doc: T, emitEvent: Boolean): Unit = js.native
  
  def addField(fieldName: /* keyof T */ String): Index[T] = js.native
  
  def coordNorm(scores: SearchScores, docTokens: IndexTokens, n: Double): SearchScores = js.native
  
  var documentStore: DocumentStore[T] = js.native
  
  var eventEmitter: EventEmitter = js.native
  
  def fieldSearch(queryTokens: js.Array[String], fieldName: /* keyof T */ String, config: FieldSearchConfig[T]): SearchScores = js.native
  
  def fieldSearchStats(docTokens: IndexTokens, token: String, docs: IndexDocuments[T]): Unit = js.native
  
  def getFields(): js.Array[/* keyof T */ String] = js.native
  
  def idf(term: String, field: /* keyof T */ String): Double = js.native
  
  var index: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]:? elasticlunr.elasticlunr.InvertedIndexNode}
    */ typingsSlinky.elasticlunr.elasticlunrStrings.Index with TopLevel[js.Any] = js.native
  
  @JSName("mergeScores")
  def mergeScores_AND(accumScores: Null, scores: SearchScores, op: AND): SearchScores = js.native
  @JSName("mergeScores")
  def mergeScores_AND(accumScores: SearchScores, scores: SearchScores, op: AND): SearchScores = js.native
  @JSName("mergeScores")
  def mergeScores_OR(accumScores: Null, scores: SearchScores, op: OR): SearchScores = js.native
  @JSName("mergeScores")
  def mergeScores_OR(accumScores: SearchScores, scores: SearchScores, op: OR): SearchScores = js.native
  
  def off(name: EventType, fn: EventHandler): Unit = js.native
  
  def on(e1: EventType, e2: EventType, e3: EventType, fn: EventHandler): Unit = js.native
  def on(e1: EventType, e2: EventType, fn: EventHandler): Unit = js.native
  def on(e1: EventType, fn: EventHandler): Unit = js.native
  
  var pipeline: Pipeline = js.native
  
  def removeDoc(doc: T): Unit = js.native
  def removeDoc(doc: T, emitEvent: Boolean): Unit = js.native
  
  def removeDocByRef(docRef: DocumentReference): Unit = js.native
  def removeDocByRef(docRef: DocumentReference, emitEvent: Boolean): Unit = js.native
  
  def saveDocument(save: Boolean): Index[T] = js.native
  
  def search(query: String): js.Array[SearchResults] = js.native
  def search(query: String, userConfig: SearchConfig[T]): js.Array[SearchResults] = js.native
  
  def setRef(refName: /* keyof T */ String): Index[T] = js.native
  
  def toJSON(): SerialisedIndexData[T] = js.native
  
  def updateDoc(doc: T): Unit = js.native
  def updateDoc(doc: T, emitEvent: Boolean): Unit = js.native
  
  def use(plugin: js.Function1[/* repeated */ js.Any, _], args: js.Any*): Unit = js.native
}
/* static members */
@JSImport("elasticlunr", "Index")
@js.native
object Index extends js.Object {
  
  def load[T](serialisedData: SerialisedIndexData[T]): Index[T] = js.native
}
