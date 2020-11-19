package typingsSlinky.jsSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("js-search", "Search")
@js.native
class Search protected () extends js.Object {
  def this(uidFieldName: String) = this()
  def this(uidFieldName: js.Array[String]) = this()
  
  def addDocument(document: js.Object): Unit = js.native
  
  def addDocuments(documents: js.Array[js.Object]): Unit = js.native
  
  def addIndex(field: String): Unit = js.native
  def addIndex(field: js.Array[String]): Unit = js.native
  
  var indexStrategy: IIndexStrategy = js.native
  
  var sanitizer: ISanitizer = js.native
  
  def search(query: String): js.Array[js.Object] = js.native
  
  var searchIndex: ISearchIndex = js.native
  
  var tokenizer: ITokenizer = js.native
}
