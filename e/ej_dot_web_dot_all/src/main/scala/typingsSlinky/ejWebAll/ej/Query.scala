package typingsSlinky.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Query extends StObject {
  
  def addParams(key: String, value: String): Query = js.native
  
  def execute(dataManager: DataManager, done: js.Any): js.Any = js.native
  def execute(dataManager: DataManager, done: js.Any, fail: js.UndefOr[scala.Nothing], always: String): js.Any = js.native
  def execute(dataManager: DataManager, done: js.Any, fail: String): js.Any = js.native
  def execute(dataManager: DataManager, done: js.Any, fail: String, always: String): js.Any = js.native
  
  def executeLocal(dataManager: DataManager): DataManager = js.native
  
  def expand(tables: js.Any): Query = js.native
  
  def foreignKey(key: String): Query = js.native
  
  def from(tableName: js.Any): Query = js.native
  
  def group(fieldName: String): Query = js.native
  
  def hierarchy(query: Query, selectorFn: js.Any): Query = js.native
  
  def key(field: String): Query = js.native
  
  def page(pageIndex: Double, pageSize: Double): Query = js.native
  
  def range(start: Double, end: Double): Query = js.native
  
  def requiresCount(): Query = js.native
  
  def search(searchKey: js.Any): Query = js.native
  def search(
    searchKey: js.Any,
    fieldNames: js.UndefOr[scala.Nothing],
    operator: js.UndefOr[scala.Nothing],
    ignoreCase: js.UndefOr[scala.Nothing],
    ignoreAccent: Boolean
  ): Query = js.native
  def search(
    searchKey: js.Any,
    fieldNames: js.UndefOr[scala.Nothing],
    operator: js.UndefOr[scala.Nothing],
    ignoreCase: Boolean
  ): Query = js.native
  def search(
    searchKey: js.Any,
    fieldNames: js.UndefOr[scala.Nothing],
    operator: js.UndefOr[scala.Nothing],
    ignoreCase: Boolean,
    ignoreAccent: Boolean
  ): Query = js.native
  def search(searchKey: js.Any, fieldNames: js.UndefOr[scala.Nothing], operator: String): Query = js.native
  def search(
    searchKey: js.Any,
    fieldNames: js.UndefOr[scala.Nothing],
    operator: String,
    ignoreCase: js.UndefOr[scala.Nothing],
    ignoreAccent: Boolean
  ): Query = js.native
  def search(searchKey: js.Any, fieldNames: js.UndefOr[scala.Nothing], operator: String, ignoreCase: Boolean): Query = js.native
  def search(
    searchKey: js.Any,
    fieldNames: js.UndefOr[scala.Nothing],
    operator: String,
    ignoreCase: Boolean,
    ignoreAccent: Boolean
  ): Query = js.native
  def search(searchKey: js.Any, fieldNames: js.Any): Query = js.native
  def search(
    searchKey: js.Any,
    fieldNames: js.Any,
    operator: js.UndefOr[scala.Nothing],
    ignoreCase: js.UndefOr[scala.Nothing],
    ignoreAccent: Boolean
  ): Query = js.native
  def search(searchKey: js.Any, fieldNames: js.Any, operator: js.UndefOr[scala.Nothing], ignoreCase: Boolean): Query = js.native
  def search(
    searchKey: js.Any,
    fieldNames: js.Any,
    operator: js.UndefOr[scala.Nothing],
    ignoreCase: Boolean,
    ignoreAccent: Boolean
  ): Query = js.native
  def search(searchKey: js.Any, fieldNames: js.Any, operator: String): Query = js.native
  def search(
    searchKey: js.Any,
    fieldNames: js.Any,
    operator: String,
    ignoreCase: js.UndefOr[scala.Nothing],
    ignoreAccent: Boolean
  ): Query = js.native
  def search(searchKey: js.Any, fieldNames: js.Any, operator: String, ignoreCase: Boolean): Query = js.native
  def search(
    searchKey: js.Any,
    fieldNames: js.Any,
    operator: String,
    ignoreCase: Boolean,
    ignoreAccent: Boolean
  ): Query = js.native
  
  def select(fieldNames: js.Any): Query = js.native
  
  def skip(nos: Double): Query = js.native
  
  def sortBy(fieldName: String): Query = js.native
  def sortBy(fieldName: String, comparer: js.UndefOr[scala.Nothing], isFromGroup: Boolean): Query = js.native
  def sortBy(fieldName: String, comparer: SortOrder_): Query = js.native
  def sortBy(fieldName: String, comparer: SortOrder_, isFromGroup: Boolean): Query = js.native
  
  def sortByDesc(fieldName: String): Query = js.native
  
  def take(nos: Double): Query = js.native
  
  def using(dataManager: DataManager): Query = js.native
  
  def where(fieldName: String, operator: FilterOperators, value: js.Any): Query = js.native
  def where(
    fieldName: String,
    operator: FilterOperators,
    value: js.Any,
    ignoreCase: js.UndefOr[scala.Nothing],
    ignoreAccent: Boolean
  ): Query = js.native
  def where(fieldName: String, operator: FilterOperators, value: js.Any, ignoreCase: Boolean): Query = js.native
  def where(
    fieldName: String,
    operator: FilterOperators,
    value: js.Any,
    ignoreCase: Boolean,
    ignoreAccent: Boolean
  ): Query = js.native
  def where(predicate: Predicate): Query = js.native
}
