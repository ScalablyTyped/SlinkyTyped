package typingsSlinky.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourcePath extends js.Object {
  /**
    * The components of the resource path.
    */
  var Components: js.UndefOr[ResourcePathComponentList] = js.native
}

object ResourcePath {
  @scala.inline
  def apply(): ResourcePath = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourcePath]
  }
  @scala.inline
  implicit class ResourcePathOps[Self <: ResourcePath] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComponents(value: ResourcePathComponentList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Components")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Components")(js.undefined)
        ret
    }
  }
  
}

