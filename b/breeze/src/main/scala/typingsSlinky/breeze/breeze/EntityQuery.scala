package typingsSlinky.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EntityQuery extends js.Object {
  
  var entityManager: EntityManager = js.native
  
  def execute(): js.Promise[QueryResult] = js.native
  def execute(callback: js.UndefOr[scala.Nothing], errorCallback: ExecuteQueryErrorCallback): js.Promise[QueryResult] = js.native
  def execute(callback: ExecuteQuerySuccessCallback): js.Promise[QueryResult] = js.native
  def execute(callback: ExecuteQuerySuccessCallback, errorCallback: ExecuteQueryErrorCallback): js.Promise[QueryResult] = js.native
  
  def executeLocally(): js.Array[Entity] = js.native
  
  def expand(propertyPaths: String): EntityQuery = js.native
  def expand(propertyPaths: js.Array[String]): EntityQuery = js.native
  
  def from(resourceName: String): EntityQuery = js.native
  
  def inlineCount(): EntityQuery = js.native
  def inlineCount(enabled: Boolean): EntityQuery = js.native
  
  def noTracking(): EntityQuery = js.native
  def noTracking(enabled: Boolean): EntityQuery = js.native
  
  def orderBy(propertyPaths: String): EntityQuery = js.native
  def orderBy(propertyPaths: String, isDescending: Boolean): EntityQuery = js.native
  def orderBy(propertyPaths: js.Array[String]): EntityQuery = js.native
  def orderBy(propertyPaths: js.Array[String], isDescending: Boolean): EntityQuery = js.native
  
  var orderByClause: OrderByClause = js.native
  
  def orderByDesc(propertyPaths: String): EntityQuery = js.native
  def orderByDesc(propertyPaths: js.Array[String]): EntityQuery = js.native
  
  var parameters: js.Object = js.native
  
  var queryOptions: QueryOptions = js.native
  
  var resourceName: String = js.native
  
  var resultEntityType: EntityType = js.native
  
  def select(propertyPaths: String): EntityQuery = js.native
  def select(propertyPaths: js.Array[String]): EntityQuery = js.native
  
  def skip(count: Double): EntityQuery = js.native
  
  var skipCount: Double = js.native
  
  def take(count: Double): EntityQuery = js.native
  
  var takeCount: Double = js.native
  
  def toJSON(): String = js.native
  
  def toType(typeName: String): EntityQuery = js.native
  def toType(`type`: EntityType): EntityQuery = js.native
  
  def top(count: Double): EntityQuery = js.native
  
  def using(obj: DataService): EntityQuery = js.native
  def using(obj: EntityManager): EntityQuery = js.native
  def using(obj: FetchStrategySymbol): EntityQuery = js.native
  def using(obj: JsonResultsAdapter): EntityQuery = js.native
  def using(obj: MergeStrategySymbol): EntityQuery = js.native
  def using(obj: QueryOptions): EntityQuery = js.native
  
  def where(anArray: IRecursiveArray[String | Double | FilterQueryOpSymbol | Predicate]): EntityQuery = js.native
    // for any/all clauses
  def where(predicate: FilterQueryOpSymbol): EntityQuery = js.native
  def where(predicate: Predicate): EntityQuery = js.native
    // for any/all clauses
  def where(property: String, filterop: String, property2: String, filterop2: String, value: js.Any): EntityQuery = js.native
  def where(
    property: String,
    filterop: FilterQueryOpSymbol,
    property2: String,
    filterop2: FilterQueryOpSymbol,
    value: js.Any
  ): EntityQuery = js.native
  def where(property: String, operator: String, value: js.Any): EntityQuery = js.native
  def where(property: String, operator: FilterQueryOpSymbol, value: js.Any): EntityQuery = js.native
  
  var wherePredicate: Predicate = js.native
  
  def withParameters(params: js.Object): EntityQuery = js.native
}
