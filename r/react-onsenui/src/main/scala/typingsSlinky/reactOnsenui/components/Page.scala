package typingsSlinky.reactOnsenui.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactOnsenui.HTMLAttributesidclassNameContentStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Page
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactOnsenui.mod.Page] {
  @JSImport("react-onsenui", "Page")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, id, style */
  def apply(
    contentStyle: js.Any = null,
    modifier: String = null,
    onHide: () => Unit = null,
    onInit: () => Unit = null,
    onShow: () => Unit = null,
    renderBottomToolbar: () => Unit = null,
    renderFixed: () => Unit = null,
    renderModal: () => Unit = null,
    renderToolbar: () => Unit = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactOnsenui.mod.Page] = {
    val __obj = js.Dynamic.literal()
    if (contentStyle != null) __obj.updateDynamic("contentStyle")(contentStyle.asInstanceOf[js.Any])
    if (modifier != null) __obj.updateDynamic("modifier")(modifier.asInstanceOf[js.Any])
    if (onHide != null) __obj.updateDynamic("onHide")(js.Any.fromFunction0(onHide))
    if (onInit != null) __obj.updateDynamic("onInit")(js.Any.fromFunction0(onInit))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction0(onShow))
    if (renderBottomToolbar != null) __obj.updateDynamic("renderBottomToolbar")(js.Any.fromFunction0(renderBottomToolbar))
    if (renderFixed != null) __obj.updateDynamic("renderFixed")(js.Any.fromFunction0(renderFixed))
    if (renderModal != null) __obj.updateDynamic("renderModal")(js.Any.fromFunction0(renderModal))
    if (renderToolbar != null) __obj.updateDynamic("renderToolbar")(js.Any.fromFunction0(renderToolbar))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactOnsenui.mod.Page] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactOnsenui.mod.Page](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = HTMLAttributesidclassNameContentStyle
}

