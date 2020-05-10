package typingsSlinky.backboneMarionette.mod

import typingsSlinky.backbone.mod.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewOptions[TModel /* <: Model */]
  extends typingsSlinky.backbone.mod.ViewOptions[TModel]
     with ViewMixinOptions {
  /**
    * If you've created a custom region class, you can use it to define
    * your region.
    */
  var regionClass: js.UndefOr[js.Any] = js.native
  /**
    * Add regions to this View.
    */
  var regions: js.UndefOr[js.Any] = js.native
  /**
    * Set the template of this View.
    */
  var template: js.UndefOr[js.Any] = js.native
  /**
    * The templateContext attribute can be used to add extra information to
    * your templates
    */
  var templateContext: js.UndefOr[js.Any] = js.native
}

object ViewOptions {
  @scala.inline
  def apply[TModel](): ViewOptions[TModel] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewOptions[TModel]]
  }
  @scala.inline
  implicit class ViewOptionsOps[Self[tmodel] <: ViewOptions[tmodel], TModel] (val x: Self[TModel]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TModel] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TModel]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TModel] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TModel] with Other]
    @scala.inline
    def withRegionClass(value: js.Any): Self[TModel] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regionClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegionClass: Self[TModel] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regionClass")(js.undefined)
        ret
    }
    @scala.inline
    def withRegions(value: js.Any): Self[TModel] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegions: Self[TModel] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regions")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplate(value: js.Any): Self[TModel] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplate: Self[TModel] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplateContext(value: js.Any): Self[TModel] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplateContext: Self[TModel] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateContext")(js.undefined)
        ret
    }
  }
  
}

