package typingsSlinky.reduxPersist.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PersistorState extends js.Object {
  var bootstrapped: Boolean = js.native
  var registry: js.Array[String] = js.native
}

object PersistorState {
  @scala.inline
  def apply(bootstrapped: Boolean, registry: js.Array[String]): PersistorState = {
    val __obj = js.Dynamic.literal(bootstrapped = bootstrapped.asInstanceOf[js.Any], registry = registry.asInstanceOf[js.Any])
    __obj.asInstanceOf[PersistorState]
  }
  @scala.inline
  implicit class PersistorStateOps[Self <: PersistorState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBootstrapped(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bootstrapped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegistry(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registry")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

