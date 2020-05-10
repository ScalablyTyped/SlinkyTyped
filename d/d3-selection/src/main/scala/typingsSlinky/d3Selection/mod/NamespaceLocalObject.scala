package typingsSlinky.d3Selection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NamespaceLocalObject extends js.Object {
  /**
    * Name of the local to be namespaced.
    */
  var local: String = js.native
  /**
    * Fully qualified namespace
    */
  var space: String = js.native
}

object NamespaceLocalObject {
  @scala.inline
  def apply(local: String, space: String): NamespaceLocalObject = {
    val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any], space = space.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamespaceLocalObject]
  }
  @scala.inline
  implicit class NamespaceLocalObjectOps[Self <: NamespaceLocalObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("local")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("space")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

