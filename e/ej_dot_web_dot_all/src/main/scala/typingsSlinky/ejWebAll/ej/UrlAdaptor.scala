package typingsSlinky.ejWebAll.ej

import typingsSlinky.ejWebAll.anon.Data
import typingsSlinky.ejWebAll.anon.Url
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UrlAdaptor extends Adaptor {
  
  def batchRequest(dm: DataManager, changes: Changes, e: js.Any): Unit = js.native
  
  def beforeSend(dm: DataManager, request: js.Any): Unit = js.native
  def beforeSend(dm: DataManager, request: js.Any, settings: js.Any): Unit = js.native
  
  def getFiltersFrom(data: js.Any, query: Query): Predicate = js.native
  
  def insert(dm: DataManager, data: js.Any, tableName: String): Data = js.native
  
  def onAggregates(e: js.Any): Unit = js.native
  
  def onGroup(e: js.Any): Unit = js.native
  
  def processQuery(dm: DataManager, query: Query, hierarchyFilters: js.Any): typingsSlinky.ejWebAll.anon.ContentType = js.native
  
  def remove(dm: DataManager, keyField: String, value: js.Any, tableName: String): typingsSlinky.ejWebAll.anon.Type = js.native
  
  def update(dm: DataManager, keyField: String, value: js.Any, tableName: String): Url = js.native
}
