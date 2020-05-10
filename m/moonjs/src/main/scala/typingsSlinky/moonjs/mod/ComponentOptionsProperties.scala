package typingsSlinky.moonjs.mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.moonjs.moonjsBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComponentOptionsProperties[Props /* <: String */, Data, Methods] extends js.Object {
  var data: js.UndefOr[Data] = js.native
  var el: js.UndefOr[String | HTMLElement] = js.native
  var functional: js.UndefOr[`true`] = js.native
  var hooks: js.UndefOr[LifecycleHooks] = js.native
  var methods: js.UndefOr[Methods] = js.native
  var name: js.UndefOr[String] = js.native
  var props: js.UndefOr[js.Array[Props]] = js.native
  var render: js.UndefOr[js.Function2[/* h */ CreateElement, /* ctx */ js.Any, VDomElement]] = js.native
  var template: js.UndefOr[String] = js.native
}

object ComponentOptionsProperties {
  @scala.inline
  def apply[Props, Data, Methods](): ComponentOptionsProperties[Props, Data, Methods] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentOptionsProperties[Props, Data, Methods]]
  }
  @scala.inline
  implicit class ComponentOptionsPropertiesOps[Self[props, data, methods] <: ComponentOptionsProperties[props, data, methods], Props, Data, Methods] (val x: Self[Props, Data, Methods]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Props, Data, Methods] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Props, Data, Methods]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Props, Data, Methods]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Props, Data, Methods]) with Other]
    @scala.inline
    def withData(value: Data): Self[Props, Data, Methods] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self[Props, Data, Methods] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withElHTMLElement(value: HTMLElement): Self[Props, Data, Methods] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("el")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEl(value: String | HTMLElement): Self[Props, Data, Methods] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("el")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEl: Self[Props, Data, Methods] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("el")(js.undefined)
        ret
    }
    @scala.inline
    def withFunctional(value: `true`): Self[Props, Data, Methods] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functional")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFunctional: Self[Props, Data, Methods] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functional")(js.undefined)
        ret
    }
    @scala.inline
    def withHooks(value: LifecycleHooks): Self[Props, Data, Methods] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hooks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHooks: Self[Props, Data, Methods] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hooks")(js.undefined)
        ret
    }
    @scala.inline
    def withMethods(value: Methods): Self[Props, Data, Methods] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethods: Self[Props, Data, Methods] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methods")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self[Props, Data, Methods] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self[Props, Data, Methods] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withProps(value: js.Array[Props]): Self[Props, Data, Methods] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("props")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProps: Self[Props, Data, Methods] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("props")(js.undefined)
        ret
    }
    @scala.inline
    def withRender(value: (/* h */ CreateElement, /* ctx */ js.Any) => VDomElement): Self[Props, Data, Methods] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRender: Self[Props, Data, Methods] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplate(value: String): Self[Props, Data, Methods] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplate: Self[Props, Data, Methods] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(js.undefined)
        ret
    }
  }
  
}

