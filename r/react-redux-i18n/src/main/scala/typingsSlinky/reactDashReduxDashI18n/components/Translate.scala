package typingsSlinky.reactDashReduxDashI18n.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.web.html.`*`.tag
import typingsSlinky.react.reactMod.CSSProperties
import typingsSlinky.reactDashReduxDashI18n.reactDashReduxDashI18nMod.TranslateProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Translate
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDashReduxDashI18n.reactDashReduxDashI18nMod.Translate] {
  @JSImport("react-redux-i18n", "Translate")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    value: String,
    dangerousHTML: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    tag: ReactComponentClass[_] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[
    slinky.web.html.`*`.tag.type, 
    typingsSlinky.reactDashReduxDashI18n.reactDashReduxDashI18nMod.Translate
  ] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(dangerousHTML)) __obj.updateDynamic("dangerousHTML")(dangerousHTML.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = TranslateProps
}

