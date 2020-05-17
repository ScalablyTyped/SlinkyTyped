package typingsSlinky.loadableComponent.mod

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultImportedComponent[P] extends DefaultComponent[P] {
  var default: ReactComponentClass[P] = js.native
}

object DefaultImportedComponent {
  @scala.inline
  def apply[P](default: ReactComponentClass[P]): DefaultImportedComponent[P] = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultImportedComponent[P]]
  }
  @scala.inline
  implicit class DefaultImportedComponentOps[Self[p] <: DefaultImportedComponent[p], P] (val x: Self[P]) extends AnyVal {
    @scala.inline
    def duplicate: Self[P] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[P]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[P] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[P] with Other]
    @scala.inline
    def withDefault(value: ReactComponentClass[P]): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

