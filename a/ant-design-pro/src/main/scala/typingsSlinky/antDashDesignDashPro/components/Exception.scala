package typingsSlinky.antDashDesignDashPro.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.antDashDesignDashPro.Anon_Href
import typingsSlinky.antDashDesignDashPro.antDashDesignDashProStrings.`403`
import typingsSlinky.antDashDesignDashPro.antDashDesignDashProStrings.`404`
import typingsSlinky.antDashDesignDashPro.antDashDesignDashProStrings.`500`
import typingsSlinky.antDashDesignDashPro.libExceptionMod.ExceptionProps
import typingsSlinky.antDashDesignDashPro.libExceptionMod.default
import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Exception
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("ant-design-pro/lib/Exception", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    actions: TagMod[Any] = null,
    backText: TagMod[Any] = null,
    desc: TagMod[Any] = null,
    img: String = null,
    linkElement: String | ReactComponentClass[Anon_Href] = null,
    redirect: String = null,
    style: CSSProperties = null,
    title: TagMod[Any] = null,
    `type`: `403` | `404` | `500` = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (backText != null) __obj.updateDynamic("backText")(backText.asInstanceOf[js.Any])
    if (desc != null) __obj.updateDynamic("desc")(desc.asInstanceOf[js.Any])
    if (img != null) __obj.updateDynamic("img")(img.asInstanceOf[js.Any])
    if (linkElement != null) __obj.updateDynamic("linkElement")(linkElement.asInstanceOf[js.Any])
    if (redirect != null) __obj.updateDynamic("redirect")(redirect.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.antDashDesignDashPro.libExceptionMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = ExceptionProps[Anon_Href]
}

