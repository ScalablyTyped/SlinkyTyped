package typingsSlinky.handsontable.mod.Handsontable.plugins

import typingsSlinky.handsontable.mod.Handsontable
import typingsSlinky.handsontable.mod.Handsontable.CellProperties
import typingsSlinky.handsontable.mod.Handsontable.search.SearchCallback
import typingsSlinky.handsontable.mod.Handsontable.search.SearchQueryMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Search extends Base {
  
  def callback(
    instance: Handsontable,
    row: Double,
    column: Double,
    value: typingsSlinky.handsontable.mod.Handsontable.CellValue,
    result: Boolean
  ): Unit = js.native
  @JSName("callback")
  var callback_Original: SearchCallback = js.native
  
  def getCallback(): SearchCallback = js.native
  
  def getQueryMethod(): SearchQueryMethod = js.native
  
  def getSearchResultClass(): String = js.native
  
  def query(queryStr: String): js.Array[SearchResult] = js.native
  def query(queryStr: String, callback: js.UndefOr[scala.Nothing], queryMethod: SearchQueryMethod): js.Array[SearchResult] = js.native
  def query(queryStr: String, callback: SearchCallback): js.Array[SearchResult] = js.native
  def query(queryStr: String, callback: SearchCallback, queryMethod: SearchQueryMethod): js.Array[SearchResult] = js.native
  
  def queryMethod(
    queryStr: String,
    value: typingsSlinky.handsontable.mod.Handsontable.CellValue,
    cellProperties: CellProperties
  ): Boolean = js.native
  @JSName("queryMethod")
  var queryMethod_Original: SearchQueryMethod = js.native
  
  var searchResultClass: String = js.native
  
  def setCallback(newCallback: SearchCallback): Unit = js.native
  
  def setQueryMethod(newQueryMethod: SearchQueryMethod): Unit = js.native
  
  def setSearchResultClass(newElementClass: String): Unit = js.native
}
