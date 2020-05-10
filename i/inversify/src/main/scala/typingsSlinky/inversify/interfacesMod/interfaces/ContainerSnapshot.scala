package typingsSlinky.inversify.interfacesMod.interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContainerSnapshot extends js.Object {
  var bindings: Lookup[Binding[_]] = js.native
  var middleware: Next | Null = js.native
}

object ContainerSnapshot {
  @scala.inline
  def apply(bindings: Lookup[Binding[_]]): ContainerSnapshot = {
    val __obj = js.Dynamic.literal(bindings = bindings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerSnapshot]
  }
  @scala.inline
  implicit class ContainerSnapshotOps[Self <: ContainerSnapshot] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBindings(value: Lookup[Binding[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMiddleware(value: /* args */ NextArgs => js.Any | js.Array[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("middleware")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMiddlewareNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("middleware")(null)
        ret
    }
  }
  
}

