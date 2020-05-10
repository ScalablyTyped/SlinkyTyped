package typingsSlinky.qlikVisualizationextensions.ExtensionAPI

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IExtension extends js.Object {
  var controller: js.UndefOr[js.Any] = js.native
  var definition: js.UndefOr[IDefinition] = js.native
  var initialProperties: js.UndefOr[IInitialProperties] = js.native
  var paint: js.UndefOr[js.Function2[/* $element */ HTMLElement, /* layout */ js.UndefOr[js.Any], Unit]] = js.native
  var support: js.UndefOr[ISupport] = js.native
  var template: js.UndefOr[String] = js.native
}

object IExtension {
  @scala.inline
  def apply(): IExtension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IExtension]
  }
  @scala.inline
  implicit class IExtensionOps[Self <: IExtension] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withController(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controller")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutController: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controller")(js.undefined)
        ret
    }
    @scala.inline
    def withDefinition(value: IDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefinition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definition")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialProperties(value: IInitialProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withPaint(value: (/* $element */ HTMLElement, /* layout */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paint")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPaint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paint")(js.undefined)
        ret
    }
    @scala.inline
    def withSupport(value: ISupport): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("support")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("support")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(js.undefined)
        ret
    }
  }
  
}

