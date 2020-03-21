package typingsSlinky.hyperlorisTyson.typeAdapterFactoryMod

import typingsSlinky.hyperlorisTyson.mod.Tyson
import typingsSlinky.hyperlorisTyson.typeAdapterMod.TypeAdapter
import typingsSlinky.hyperlorisTyson.typeTokenMod.TypeToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeAdapterFactory extends js.Object {
  def create[T](tyson: Tyson, typeToken: TypeToken[T]): js.UndefOr[TypeAdapter[T]]
}

object TypeAdapterFactory {
  @scala.inline
  def apply(create: (Tyson, TypeToken[js.Any]) => js.UndefOr[TypeAdapter[js.Any]]): TypeAdapterFactory = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction2(create))
  
    __obj.asInstanceOf[TypeAdapterFactory]
  }
}

