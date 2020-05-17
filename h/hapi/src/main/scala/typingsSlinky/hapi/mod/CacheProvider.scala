package typingsSlinky.hapi.mod

import typingsSlinky.catbox.mod.ClientOptions
import typingsSlinky.catbox.mod.EnginePrototype
import typingsSlinky.hapi.anon.Constructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.catbox.mod.EnginePrototype[js.Any]
  - typingsSlinky.hapi.anon.Constructor[T]
*/
trait CacheProvider[T /* <: ClientOptions */] extends js.Object

object CacheProvider {
  @scala.inline
  implicit def apply[T](value: Constructor[T]): CacheProvider[T] = value.asInstanceOf[CacheProvider[T]]
  @scala.inline
  implicit def apply[T](value: EnginePrototype[js.Any]): CacheProvider[T] = value.asInstanceOf[CacheProvider[T]]
}

