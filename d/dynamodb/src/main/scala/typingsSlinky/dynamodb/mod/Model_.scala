package typingsSlinky.dynamodb.mod

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.bunyan.mod.^
import typingsSlinky.dynamodb.anon.Dynamodb
import typingsSlinky.dynamodb.anon.TypeofModel
import typingsSlinky.dynamodb.callbackMod.Callback
import typingsSlinky.dynamodb.modelMod.Model
import typingsSlinky.dynamodb.modelMod.Model.CreateOperation
import typingsSlinky.dynamodb.modelMod.Model.DestroyOperation
import typingsSlinky.dynamodb.modelMod.Model.GetItemsOperation
import typingsSlinky.dynamodb.modelMod.Model.GetOperation
import typingsSlinky.dynamodb.modelMod.Model.UpdateOperation
import typingsSlinky.dynamodb.queryMod.Query
import typingsSlinky.dynamodb.scanMod.ParallelScan
import typingsSlinky.dynamodb.scanMod.Scan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dynamodb", "Model")
@js.native
class Model_ protected () extends Model {
  def this(attrs: js.Any) = this()
}
@JSImport("dynamodb", "Model")
@js.native
object Model_ extends js.Object {
  
  val after: js.Any = js.native
  
  def batchGetItems(hashKey: String, rangeKey: String, options: js.Any): js.Promise[_] | Unit = js.native
  def batchGetItems(hashKey: String, rangeKey: String, options: js.Any, callback: Callback): js.Promise[_] | Unit = js.native
  
  val before: js.Any = js.native
  
  def config(config: Dynamodb): js.Any = js.native
  
  val create: CreateOperation = js.native
  
  def createTable(hashKey: String, rangeKey: String, options: js.Any): js.Promise[_] | Unit = js.native
  def createTable(hashKey: String, rangeKey: String, options: js.Any, callback: Callback): js.Promise[_] | Unit = js.native
  
  def deleteTable(): js.Promise[_] = js.native
  def deleteTable(callback: Callback): Unit = js.native
  
  def describeTable(hashKey: String, rangeKey: String, options: js.Any): js.Promise[_] | Unit = js.native
  def describeTable(hashKey: String, rangeKey: String, options: js.Any, callback: Callback): js.Promise[_] | Unit = js.native
  
  val destroy: DestroyOperation = js.native
  
  val get: GetOperation = js.native
  
  val getItems: GetItemsOperation = js.native
  
  val itemFactory: TypeofModel with (Instantiable1[/* attrs */ js.Any, Model]) = js.native
  
  val log: ^ = js.native
  
  def parallelScan(totalSegments: Double): ParallelScan = js.native
  
  def query(hashKey: String): Query = js.native
  
  def scan(): Scan = js.native
  
  def tableName(hashKey: String, rangeKey: String, options: js.Any): js.Promise[_] = js.native
  def tableName(hashKey: String, rangeKey: String, options: js.Any, callback: Callback): Unit = js.native
  
  val update: UpdateOperation = js.native
  
  def updateTable(hashKey: String, rangeKey: String, options: js.Any): js.Promise[_] | Unit = js.native
  def updateTable(hashKey: String, rangeKey: String, options: js.Any, callback: Callback): js.Promise[_] | Unit = js.native
}
