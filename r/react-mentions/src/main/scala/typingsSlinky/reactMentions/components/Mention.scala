package typingsSlinky.reactMentions.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactMentions.mod.DataFunc
import typingsSlinky.reactMentions.mod.MentionProps
import typingsSlinky.reactMentions.mod.SuggestionDataItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Mention
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("react-mentions", "Mention")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    data: js.Array[SuggestionDataItem] | DataFunc,
    trigger: String | js.RegExp,
    appendSpaceOnAdd: js.UndefOr[Boolean] = js.undefined,
    displayTransform: (/* id */ String, /* display */ String) => String = null,
    isLoading: js.UndefOr[Boolean] = js.undefined,
    markup: String = null,
    onAdd: (/* id */ String | Double, /* display */ String) => Unit = null,
    regex: js.RegExp = null,
    renderSuggestion: (/* suggestion */ SuggestionDataItem, /* search */ String, /* highlightedDisplay */ TagMod[Any], /* index */ Double, /* focused */ Boolean) => TagMod[Any] = null,
    style: js.Any = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], trigger = trigger.asInstanceOf[js.Any])
    if (!js.isUndefined(appendSpaceOnAdd)) __obj.updateDynamic("appendSpaceOnAdd")(appendSpaceOnAdd.asInstanceOf[js.Any])
    if (displayTransform != null) __obj.updateDynamic("displayTransform")(js.Any.fromFunction2(displayTransform))
    if (!js.isUndefined(isLoading)) __obj.updateDynamic("isLoading")(isLoading.asInstanceOf[js.Any])
    if (markup != null) __obj.updateDynamic("markup")(markup.asInstanceOf[js.Any])
    if (onAdd != null) __obj.updateDynamic("onAdd")(js.Any.fromFunction2(onAdd))
    if (regex != null) __obj.updateDynamic("regex")(regex.asInstanceOf[js.Any])
    if (renderSuggestion != null) __obj.updateDynamic("renderSuggestion")(js.Any.fromFunction5(renderSuggestion))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = MentionProps
}

