package typingsSlinky.backboneLayoutmanager.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.backbone.mod.Model
import typingsSlinky.backbone.mod.View
import typingsSlinky.backbone.mod.ViewOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayoutOptions[TModel /* <: Model */] extends ViewOptions[TModel] {
  var template: js.UndefOr[String] = js.native
  var views: js.UndefOr[StringDictionary[View[TModel]]] = js.native
}

object LayoutOptions {
  @scala.inline
  def apply[TModel](): LayoutOptions[TModel] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayoutOptions[TModel]]
  }
  @scala.inline
  implicit class LayoutOptionsOps[Self[tmodel] <: LayoutOptions[tmodel], TModel] (val x: Self[TModel]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TModel] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TModel]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TModel] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TModel] with Other]
    @scala.inline
    def withTemplate(value: String): Self[TModel] = {
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
    def withViews(value: StringDictionary[View[TModel]]): Self[TModel] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("views")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViews: Self[TModel] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("views")(js.undefined)
        ret
    }
  }
  
}

