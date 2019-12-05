package typingsSlinky.harmonyDashProxy.harmonyDashProxyMod.harmonyProxy

import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.harmonyDashProxy.Anon_Proxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProxyConstructor
  extends Instantiable2[/* target */ js.Object, /* handler */ ProxyHandler[js.Object], js.Object] {
  def revocable[T](target: T, handler: ProxyHandler[T]): Anon_Proxy[T] = js.native
}

