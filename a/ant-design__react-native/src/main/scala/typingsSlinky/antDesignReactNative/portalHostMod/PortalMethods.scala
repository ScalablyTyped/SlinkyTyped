package typingsSlinky.antDesignReactNative.portalHostMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PortalMethods extends js.Object {
  def mount(children: TagMod[Any]): Double = js.native
  def unmount(key: Double): Unit = js.native
  def update(key: Double, children: TagMod[Any]): Unit = js.native
}

object PortalMethods {
  @scala.inline
  def apply(mount: TagMod[Any] => Double, unmount: Double => Unit, update: (Double, TagMod[Any]) => Unit): PortalMethods = {
    val __obj = js.Dynamic.literal(mount = js.Any.fromFunction1(mount), unmount = js.Any.fromFunction1(unmount), update = js.Any.fromFunction2(update))
    __obj.asInstanceOf[PortalMethods]
  }
  @scala.inline
  implicit class PortalMethodsOps[Self <: PortalMethods] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMount(value: TagMod[Any] => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mount")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUnmount(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unmount")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: (Double, TagMod[Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

