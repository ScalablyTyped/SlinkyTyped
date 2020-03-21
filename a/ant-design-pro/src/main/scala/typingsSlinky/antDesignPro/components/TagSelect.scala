package typingsSlinky.antDesignPro.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.antDesignPro.AnonCollapseText
import typingsSlinky.antDesignPro.tagSelectMod.TagSelectProps
import typingsSlinky.antDesignPro.tagSelectMod.default
import typingsSlinky.antDesignPro.tagSelectOptionMod.TagSelectOptionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TagSelect
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("ant-design-pro/lib/TagSelect", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: style */
  def apply(
    Option: TagSelectOptionProps,
    className: String,
    actionsText: AnonCollapseText = null,
    expandable: js.UndefOr[Boolean] = js.undefined,
    hideCheckAll: js.UndefOr[Boolean] = js.undefined,
    onChange: /* value */ js.Array[String] => Unit = null,
    value: js.Array[Double | String] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(Option = Option.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any])
    if (actionsText != null) __obj.updateDynamic("actionsText")(actionsText.asInstanceOf[js.Any])
    if (!js.isUndefined(expandable)) __obj.updateDynamic("expandable")(expandable.asInstanceOf[js.Any])
    if (!js.isUndefined(hideCheckAll)) __obj.updateDynamic("hideCheckAll")(hideCheckAll.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = TagSelectProps
}

