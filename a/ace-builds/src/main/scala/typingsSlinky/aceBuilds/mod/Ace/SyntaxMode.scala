package typingsSlinky.aceBuilds.mod.Ace

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SyntaxMode extends StObject {
  
  def autoOutdent(state: js.Any, doc: Document, row: Double): Unit = js.native
  
  def checkOutdent(state: js.Any, line: String, input: String): Boolean = js.native
  
  def createModeDelegates(mapping: StringDictionary[String]): Unit = js.native
  
  // TODO implement WorkerClient types
  def createWorker(session: EditSession): js.Any = js.native
  
  def getCompletions(state: String, session: EditSession, pos: Point, prefix: String): js.Array[Completion] = js.native
  
  def getKeywords(): js.Array[String | js.RegExp] = js.native
  def getKeywords(append: Boolean): js.Array[String | js.RegExp] = js.native
  
  def getNextLineIndent(state: js.Any, line: String, tab: String): String = js.native
  
  def getTokenizer(): Tokenizer = js.native
  
  def toggleBlockComment(state: js.Any, session: EditSession, range: Range, cursor: Point): Unit = js.native
  
  def toggleCommentLines(state: js.Any, session: EditSession, startRow: Double, endRow: Double): Unit = js.native
  
  def transformAction(state: String, action: String, editor: Editor, session: EditSession, text: String): js.Any = js.native
}
