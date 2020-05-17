package typingsSlinky.hapiHapi.mod

import typingsSlinky.hapiCatbox.mod.ClientOptions
import typingsSlinky.hapiCatbox.mod.EnginePrototype
import typingsSlinky.hapiHapi.anon.Constructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.hapiCatbox.mod.EnginePrototype[js.Any]
  - typingsSlinky.hapiHapi.anon.Constructor[T]
*/
trait CacheProvider[T /* <: ClientOptions */] extends js.Object

object CacheProvider {
  @scala.inline
  implicit def apply[T](value: Constructor[T]): CacheProvider[T] = value.asInstanceOf[CacheProvider[T]]
  @scala.inline
  implicit def apply[T](value: EnginePrototype[js.Any]): CacheProvider[T] = value.asInstanceOf[CacheProvider[T]]
}

