package typingsSlinky.acl.aclMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// For internal use
//
@js.native
trait Backend[T] extends js.Object {
  def add(transaction: T, bucket: String, key: Value, values: Values): Unit = js.native
  def begin(): T = js.native
  def clean(): Unit = js.native
  def clean(cb: Action): Unit = js.native
  def cleanAsync(): typingsSlinky.bluebird.bluebirdMod.^[Unit] = js.native
  def cleanAsync(cb: js.Function1[/* error */ js.UndefOr[js.Error], Unit]): typingsSlinky.bluebird.bluebirdMod.^[Unit] = js.native
  def del(transaction: T, bucket: String, keys: js.Array[Value]): Unit = js.native
  def end(transaction: T): Unit = js.native
  def end(transaction: T, cb: Action): Unit = js.native
  def endAsync(transaction: T): typingsSlinky.bluebird.bluebirdMod.^[Unit] = js.native
  def endAsync(transaction: T, cb: js.Function1[/* err */ js.Error | Null, Unit]): typingsSlinky.bluebird.bluebirdMod.^[Unit] = js.native
  def get(bucket: String, key: Value): Unit = js.native
  def get(bucket: String, key: Value, cb: Action): Unit = js.native
  def getAsync(bucket: String, key: Value): typingsSlinky.bluebird.bluebirdMod.^[_] = js.native
  def getAsync(bucket: String, key: Value, cb: js.Function2[/* err */ js.Error | Null, /* value */ js.Any, Unit]): typingsSlinky.bluebird.bluebirdMod.^[_] = js.native
  def remove(transaction: T, bucket: String, key: Value, values: Values): Unit = js.native
  def union(bucket: String, keys: js.Array[Value]): Unit = js.native
  def union(bucket: String, keys: js.Array[Value], cb: Action): Unit = js.native
  def unionAsync(bucket: String, keys: js.Array[Value]): typingsSlinky.bluebird.bluebirdMod.^[js.Array[_]] = js.native
  def unionAsync(
    bucket: String,
    keys: js.Array[Value],
    cb: js.Function2[/* error */ js.UndefOr[js.Error], /* results */ js.Array[_], Unit]
  ): typingsSlinky.bluebird.bluebirdMod.^[js.Array[_]] = js.native
}

