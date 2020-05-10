package typingsSlinky.restIo.authorizedSubResourceMod

import typingsSlinky.restIo.resourceMod.Resource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISubResource extends js.Object {
  var name: String = js.native
  var parentResource: Resource = js.native
  var plural: js.UndefOr[String] = js.native
  var populate: js.UndefOr[String] = js.native
}

object ISubResource {
  @scala.inline
  def apply(name: String, parentResource: Resource): ISubResource = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], parentResource = parentResource.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISubResource]
  }
  @scala.inline
  implicit class ISubResourceOps[Self <: ISubResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentResource(value: Resource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentResource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlural(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plural")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlural: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plural")(js.undefined)
        ret
    }
    @scala.inline
    def withPopulate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("populate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopulate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("populate")(js.undefined)
        ret
    }
  }
  
}

