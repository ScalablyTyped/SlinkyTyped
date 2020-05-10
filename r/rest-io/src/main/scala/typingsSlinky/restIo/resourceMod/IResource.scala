package typingsSlinky.restIo.resourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IResource extends js.Object {
  var model: js.Any = js.native
  var name: String = js.native
  var parentRef: js.UndefOr[String] = js.native
  var parentResource: js.UndefOr[Resource] = js.native
  var plural: js.UndefOr[String] = js.native
  var populate: js.UndefOr[String] = js.native
}

object IResource {
  @scala.inline
  def apply(model: js.Any, name: String): IResource = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IResource]
  }
  @scala.inline
  implicit class IResourceOps[Self <: IResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withModel(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentRef(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentRef")(js.undefined)
        ret
    }
    @scala.inline
    def withParentResource(value: Resource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentResource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentResource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentResource")(js.undefined)
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

