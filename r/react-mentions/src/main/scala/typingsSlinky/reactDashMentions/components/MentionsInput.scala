package typingsSlinky.reactDashMentions.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLInputElement
import org.scalajs.dom.raw.HTMLTextAreaElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.facade.ReactRef
import slinky.web.SyntheticFocusEvent
import slinky.web.html.input.tag
import typingsSlinky.reactDashMentions.Anon_Target
import typingsSlinky.reactDashMentions.reactDashMentionsMod.MentionItem
import typingsSlinky.reactDashMentions.reactDashMentionsMod.MentionsInputProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MentionsInput
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDashMentions.reactDashMentionsMod.MentionsInput] {
  @JSImport("react-mentions", "MentionsInput")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, onKeyDown, onSelect, placeholder */
  def apply(
    allowSpaceInQuery: js.UndefOr[Boolean] = js.undefined,
    classNames: js.Any = null,
    inputRef: ReactRef[HTMLInputElement | HTMLTextAreaElement] = null,
    onBlur: (/* event */ SyntheticFocusEvent[HTMLInputElement | HTMLTextAreaElement], /* clickedSuggestion */ Boolean) => Unit = null,
    onChange: (/* event */ Anon_Target, /* newValue */ String, /* newPlainTextValue */ String, /* mentions */ js.Array[MentionItem]) => Unit = null,
    singleLine: js.UndefOr[Boolean] = js.undefined,
    style: js.Any = null,
    suggestionsPortalHost: org.scalajs.dom.raw.Element = null,
    value: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactDashMentions.reactDashMentionsMod.MentionsInput] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowSpaceInQuery)) __obj.updateDynamic("allowSpaceInQuery")(allowSpaceInQuery.asInstanceOf[js.Any])
    if (classNames != null) __obj.updateDynamic("classNames")(classNames.asInstanceOf[js.Any])
    if (inputRef != null) __obj.updateDynamic("inputRef")(inputRef.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction2(onBlur))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction4(onChange))
    if (!js.isUndefined(singleLine)) __obj.updateDynamic("singleLine")(singleLine.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (suggestionsPortalHost != null) __obj.updateDynamic("suggestionsPortalHost")(suggestionsPortalHost.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = MentionsInputProps
}

