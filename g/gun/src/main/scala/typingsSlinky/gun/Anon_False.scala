package typingsSlinky.gun

import typingsSlinky.gun.gunBooleans.`false`
import typingsSlinky.gun.gunMod.Gun.ArrayAsRecord
import typingsSlinky.gun.gunMod.Gun.ChainReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_False[DataType, ReferenceKey] extends js.Object {
  var gun: ChainReference[DataType, ReferenceKey, `false`]
  var key: ReferenceKey
  var put: ArrayAsRecord[DataType]
}

object Anon_False {
  @scala.inline
  def apply[DataType, ReferenceKey](
    gun: ChainReference[DataType, ReferenceKey, `false`],
    key: ReferenceKey,
    put: ArrayAsRecord[DataType]
  ): Anon_False[DataType, ReferenceKey] = {
    val __obj = js.Dynamic.literal(gun = gun.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_False[DataType, ReferenceKey]]
  }
}

