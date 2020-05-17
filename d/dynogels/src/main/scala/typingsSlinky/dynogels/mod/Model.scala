package typingsSlinky.dynogels.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.awsSdk.dynamodbMod.CreateTableOutput
import typingsSlinky.awsSdk.dynamodbMod.DescribeTableOutput
import typingsSlinky.awsSdk.dynamodbMod.UpdateTableOutput
import typingsSlinky.dynogels.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model
  extends Instantiable1[/* attrs */ StringDictionary[js.Any], Item] {
  def after(action: LifeCycleAction, listner: js.Function1[/* item */ Item, Unit]): Unit = js.native
  def batchGetItems(
    items: js.Array[String | StringDictionary[String]],
    callback: js.Function2[/* err */ js.Error, /* items */ js.Array[_], Unit]
  ): Unit = js.native
  def batchGetItems(
    items: js.Array[String | StringDictionary[String]],
    options: GetItemOptions,
    callback: js.Function2[/* err */ js.Error, /* items */ js.Array[_], Unit]
  ): Unit = js.native
  def before(
    action: LifeCycleAction,
    listner: js.Function2[
      /* data */ js.Any, 
      /* next */ js.Function2[/* err */ js.Error | Null, /* data */ js.Any, Unit], 
      Unit
    ]
  ): Unit = js.native
  def config(config: ModelConfig): Name = js.native
  def create(item: js.Any, callback: DynogelsItemCallback): Unit = js.native
  def create(item: js.Any, options: CreateItemOptions, callback: DynogelsItemCallback): Unit = js.native
  def createTable(callback: js.Function2[/* err */ js.Error, /* data */ CreateTableOutput, Unit]): Unit = js.native
  def createTable(
    options: CreateTablesOptions,
    callback: js.Function2[/* err */ js.Error, /* data */ CreateTableOutput, Unit]
  ): Unit = js.native
  def deleteTable(callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def describeTable(callback: js.Function2[/* err */ js.Error, /* data */ DescribeTableOutput, Unit]): Unit = js.native
  def destroy(hashKey: js.Any, callback: DynogelsItemCallback): Unit = js.native
  def destroy(hashKey: js.Any, rangeKey: js.Any, callback: DynogelsItemCallback): Unit = js.native
  def destroy(hashKey: js.Any, rangeKey: js.Any, options: DestroyItemOptions, callback: DynogelsItemCallback): Unit = js.native
  def destroy(haskKey: js.Any, options: DestroyItemOptions, callback: DynogelsItemCallback): Unit = js.native
  def get(hashKey: js.Any, callback: DynogelsItemCallback): Unit = js.native
  def get(hashKey: js.Any, rangeKey: js.Any, callback: DynogelsItemCallback): Unit = js.native
  def get(hashKey: js.Any, rangeKey: js.Any, options: GetItemOptions, callback: DynogelsItemCallback): Unit = js.native
  def get(haskKey: js.Any, options: GetItemOptions, callback: DynogelsItemCallback): Unit = js.native
  def getItems(
    items: js.Array[String | StringDictionary[String]],
    callback: js.Function2[/* err */ js.Error, /* items */ js.Array[_], Unit]
  ): Unit = js.native
  def getItems(
    items: js.Array[String | StringDictionary[String]],
    options: GetItemOptions,
    callback: js.Function2[/* err */ js.Error, /* items */ js.Array[_], Unit]
  ): Unit = js.native
  def parallelScan(totalSegments: Double): Scan = js.native
  def query(hashKey: js.Any): Query = js.native
  def scan(): Scan = js.native
  def tableName(): String = js.native
  def update(item: js.Any, callback: DynogelsItemCallback): Unit = js.native
  def update(item: js.Any, options: UpdateItemOptions, callback: DynogelsItemCallback): Unit = js.native
  def updateTable(callback: js.Function2[/* err */ js.Error, /* data */ UpdateTableOutput, Unit]): Unit = js.native
  def updateTable(
    throughput: Throughput,
    callback: js.Function2[/* err */ js.Error, /* data */ UpdateTableOutput, Unit]
  ): Unit = js.native
}

