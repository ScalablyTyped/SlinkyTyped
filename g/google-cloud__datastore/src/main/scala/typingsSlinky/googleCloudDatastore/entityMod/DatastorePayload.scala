package typingsSlinky.googleCloudDatastore.entityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatastorePayload[T] extends js.Object {
  // TODO Include possibility of 'raw data' with indexing options, etc
  var data: T | js.Object = js.native
  var excludeFromIndexes: js.UndefOr[js.Array[String]] = js.native
  var key: DatastoreKey = js.native
}

object DatastorePayload {
  @scala.inline
  def apply[T](data: T | js.Object, key: DatastoreKey): DatastorePayload[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatastorePayload[T]]
  }
  @scala.inline
  implicit class DatastorePayloadOps[Self[t] <: DatastorePayload[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withData(value: T | js.Object): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: DatastoreKey): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExcludeFromIndexes(value: js.Array[String]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeFromIndexes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludeFromIndexes: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeFromIndexes")(js.undefined)
        ret
    }
  }
  
}

