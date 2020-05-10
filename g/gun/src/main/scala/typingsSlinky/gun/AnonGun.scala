package typingsSlinky.gun

import typingsSlinky.gun.gunBooleans.`false`
import typingsSlinky.gun.mod.Gun.ArrayAsRecord
import typingsSlinky.gun.mod.Gun.ChainReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGun[DataType, ReferenceKey] extends js.Object {
  var gun: ChainReference[DataType, ReferenceKey, `false`] = js.native
  var key: ReferenceKey = js.native
  var put: ArrayAsRecord[DataType] = js.native
}

object AnonGun {
  @scala.inline
  def apply[DataType, ReferenceKey](
    gun: ChainReference[DataType, ReferenceKey, `false`],
    key: ReferenceKey,
    put: ArrayAsRecord[DataType]
  ): AnonGun[DataType, ReferenceKey] = {
    val __obj = js.Dynamic.literal(gun = gun.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGun[DataType, ReferenceKey]]
  }
  @scala.inline
  implicit class AnonGunOps[Self[datatype, referencekey] <: AnonGun[datatype, referencekey], DataType, ReferenceKey] (val x: Self[DataType, ReferenceKey]) extends AnyVal {
    @scala.inline
    def duplicate: Self[DataType, ReferenceKey] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[DataType, ReferenceKey]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[DataType, ReferenceKey]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[DataType, ReferenceKey]) with Other]
    @scala.inline
    def withGun(value: ChainReference[DataType, ReferenceKey, `false`]): Self[DataType, ReferenceKey] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gun")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: ReferenceKey): Self[DataType, ReferenceKey] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPut(value: ArrayAsRecord[DataType]): Self[DataType, ReferenceKey] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("put")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

