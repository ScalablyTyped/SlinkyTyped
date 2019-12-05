package typingsSlinky.nodeDashMysqlDashWrapper.nodeDashMysqlDashWrapperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-mysql-wrapper", "ObservableCollection")
@js.native
class ObservableCollection[T] protected () extends js.Object {
  def this(table: Table[T]) = this()
  def this(table: Table[T], fetchAllFromDatabase: Boolean) = this()
  def this(table: Table[T], fetchAllFromDatabase: Boolean, callbackWhenReady: js.Function) = this()
  var _items: js.Array[T with ObservableObject] = js.native
  var items: js.Array[T with ObservableObject] = js.native
  //auti i klasi 9a xrisimopoieite ws Collection me kapoies paralages mesa sto index.ts.
  var local: BaseCollection[T] = js.native
  def delete(criteriaOrID: String): typingsSlinky.bluebird.bluebirdMod.^[DeleteAnswer] = js.native
  def delete(criteriaOrID: String, callback: js.Function1[/* _result */ DeleteAnswer, _]): typingsSlinky.bluebird.bluebirdMod.^[DeleteAnswer] = js.native
  /**
    * same thing as .remove();
    */
  def delete(criteriaOrID: js.Any): typingsSlinky.bluebird.bluebirdMod.^[DeleteAnswer] = js.native
  def delete(criteriaOrID: js.Any, callback: js.Function1[/* _result */ DeleteAnswer, _]): typingsSlinky.bluebird.bluebirdMod.^[DeleteAnswer] = js.native
  def delete(criteriaOrID: Double): typingsSlinky.bluebird.bluebirdMod.^[DeleteAnswer] = js.native
  def delete(criteriaOrID: Double, callback: js.Function1[/* _result */ DeleteAnswer, _]): typingsSlinky.bluebird.bluebirdMod.^[DeleteAnswer] = js.native
  def find(): typingsSlinky.bluebird.bluebirdMod.^[js.Array[T]] = js.native
  def find(criteriaRawJsObject: js.Any): typingsSlinky.bluebird.bluebirdMod.^[js.Array[T]] = js.native
  def find(criteriaRawJsObject: js.Any, callback: js.Function1[/* _results */ js.Array[T], _]): typingsSlinky.bluebird.bluebirdMod.^[js.Array[T]] = js.native
  def findAll(): typingsSlinky.bluebird.bluebirdMod.^[js.Array[T]] = js.native
  def findAll(tableRules: RawRules): typingsSlinky.bluebird.bluebirdMod.^[js.Array[T]] = js.native
  def findAll(tableRules: RawRules, callback: js.Function1[/* _results */ js.Array[T], _]): typingsSlinky.bluebird.bluebirdMod.^[js.Array[T]] = js.native
  def findById(id: String): typingsSlinky.bluebird.bluebirdMod.^[T] = js.native
  def findById(id: String, callback: js.Function1[/* result */ T, _]): typingsSlinky.bluebird.bluebirdMod.^[T] = js.native
  def findById(id: Double): typingsSlinky.bluebird.bluebirdMod.^[T] = js.native
  def findById(id: Double, callback: js.Function1[/* result */ T, _]): typingsSlinky.bluebird.bluebirdMod.^[T] = js.native
  def findOne(criteriaRawJsObject: js.Any): typingsSlinky.bluebird.bluebirdMod.^[T] = js.native
  def findOne(criteriaRawJsObject: js.Any, callback: js.Function1[/* _result */ T, _]): typingsSlinky.bluebird.bluebirdMod.^[T] = js.native
  /**
    * .insert() and .update() do the same thing:  .save();
    */
  def insert(criteriaRawJsObject: js.Any): typingsSlinky.bluebird.bluebirdMod.^[T | _] = js.native
  def insert(criteriaRawJsObject: js.Any, callback: js.Function1[/* _result */ js.Any, _]): typingsSlinky.bluebird.bluebirdMod.^[T | _] = js.native
  def onCollectionChanged(callback: js.Function1[/* eventArgs */ CollectionChangedEventArgs[T], Unit]): Unit = js.native
  def remove(criteriaOrID: String): typingsSlinky.bluebird.bluebirdMod.^[DeleteAnswer] = js.native
  def remove(criteriaOrID: String, callback: js.Function1[/* _result */ DeleteAnswer, _]): typingsSlinky.bluebird.bluebirdMod.^[DeleteAnswer] = js.native
  def remove(criteriaOrID: js.Any): typingsSlinky.bluebird.bluebirdMod.^[DeleteAnswer] = js.native
  def remove(criteriaOrID: js.Any, callback: js.Function1[/* _result */ DeleteAnswer, _]): typingsSlinky.bluebird.bluebirdMod.^[DeleteAnswer] = js.native
  def remove(criteriaOrID: Double): typingsSlinky.bluebird.bluebirdMod.^[DeleteAnswer] = js.native
  def remove(criteriaOrID: Double, callback: js.Function1[/* _result */ DeleteAnswer, _]): typingsSlinky.bluebird.bluebirdMod.^[DeleteAnswer] = js.native
  def save(criteriaRawJsObject: js.Any): typingsSlinky.bluebird.bluebirdMod.^[T | _] = js.native
  def save(criteriaRawJsObject: js.Any, callback: js.Function1[/* _result */ js.Any, _]): typingsSlinky.bluebird.bluebirdMod.^[T | _] = js.native
  def startListeningToDatabase(): Unit = js.native
  def update(criteriaRawJsObject: js.Any): typingsSlinky.bluebird.bluebirdMod.^[T | _] = js.native
  def update(criteriaRawJsObject: js.Any, callback: js.Function1[/* _result */ js.Any, _]): typingsSlinky.bluebird.bluebirdMod.^[T | _] = js.native
}

