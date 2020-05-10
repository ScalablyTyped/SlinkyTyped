package typingsSlinky.angularCore.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElementDef extends js.Object {
  /**
    * same as visiblePublicProviders, but also includes private providers
    * that are located on this element.
    */
  var allProviders: StringDictionary[NodeDef] | Null = js.native
  /** ns, name, value */
  var attrs: (js.Array[js.Tuple3[String, String, String]]) | Null = js.native
  var componentProvider: NodeDef | Null = js.native
  var componentRendererType: RendererType2 | Null = js.native
  var componentView: ViewDefinitionFactory | Null = js.native
  var handleEvent: ElementHandleEventFn | Null = js.native
  var name: String | Null = js.native
  var ns: String | Null = js.native
  /**
    * visible public providers for DI in the view,
    * as see from this element. This does not include private providers.
    */
  var publicProviders: StringDictionary[NodeDef] | Null = js.native
  var template: ɵViewDefinition | Null = js.native
}

object ElementDef {
  @scala.inline
  def apply(): ElementDef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElementDef]
  }
  @scala.inline
  implicit class ElementDefOps[Self <: ElementDef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllProviders(value: StringDictionary[NodeDef]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allProviders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllProvidersNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allProviders")(null)
        ret
    }
    @scala.inline
    def withAttrs(value: js.Array[js.Tuple3[String, String, String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attrs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttrsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attrs")(null)
        ret
    }
    @scala.inline
    def withComponentProvider(value: NodeDef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentProviderNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentProvider")(null)
        ret
    }
    @scala.inline
    def withComponentRendererType(value: RendererType2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRendererType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentRendererTypeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRendererType")(null)
        ret
    }
    @scala.inline
    def withComponentView(value: ViewDefinitionFactory): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentViewNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentView")(null)
        ret
    }
    @scala.inline
    def withHandleEvent(value: (/* view */ ViewData, /* eventName */ String, /* event */ js.Any) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleEvent")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withHandleEventNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleEvent")(null)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(null)
        ret
    }
    @scala.inline
    def withNs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ns")(null)
        ret
    }
    @scala.inline
    def withPublicProviders(value: StringDictionary[NodeDef]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicProviders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublicProvidersNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicProviders")(null)
        ret
    }
    @scala.inline
    def withTemplate(value: ɵViewDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTemplateNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(null)
        ret
    }
  }
  
}

