package typingsSlinky.atAntDashDesignReactDashNative.libPortalPortalDashHostMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortalMethods extends js.Object {
  def mount(children: TagMod[Any]): Double
  def unmount(key: Double): Unit
  def update(key: Double, children: TagMod[Any]): Unit
}

object PortalMethods {
  @scala.inline
  def apply(mount: TagMod[Any] => Double, unmount: Double => Unit, update: (Double, TagMod[Any]) => Unit): PortalMethods = {
    val __obj = js.Dynamic.literal(mount = js.Any.fromFunction1(mount), unmount = js.Any.fromFunction1(unmount), update = js.Any.fromFunction2(update))
  
    __obj.asInstanceOf[PortalMethods]
  }
}

