package typingsSlinky.dexie.anon

import typingsSlinky.dexie.mod.IndexableType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrimaryKey[Key] extends js.Object {
  var key: IndexableType = js.native
  var primaryKey: Key = js.native
}

object PrimaryKey {
  @scala.inline
  def apply[Key](key: IndexableType, primaryKey: Key): PrimaryKey[Key] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], primaryKey = primaryKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrimaryKey[Key]]
  }
  @scala.inline
  implicit class PrimaryKeyOps[Self[key] <: PrimaryKey[key], Key] (val x: Self[Key]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Key] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Key]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Key] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Key] with Other]
    @scala.inline
    def withKeyDataView(value: js.typedarray.DataView): Self[Key] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyArrayBufferView(value: js.typedarray.ArrayBufferView): Self[Key] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: IndexableType): Self[Key] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyDate(value: js.Date): Self[Key] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyArrayBuffer(value: js.typedarray.ArrayBuffer): Self[Key] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrimaryKey(value: Key): Self[Key] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryKey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

