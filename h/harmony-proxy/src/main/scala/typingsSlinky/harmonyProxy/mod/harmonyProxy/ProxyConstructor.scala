package typingsSlinky.harmonyProxy.mod.harmonyProxy

import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.harmonyProxy.AnonProxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProxyConstructor
  extends Instantiable2[/* target */ js.Object, /* handler */ ProxyHandler[js.Object], js.Object] {
  def revocable[T](target: T, handler: ProxyHandler[T]): AnonProxy[T] = js.native
}

