package typingsSlinky.materialDashUi.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.materialDashUi.Anon_Text
import typingsSlinky.materialDashUi.__MaterialUI.AutoCompleteProps
import typingsSlinky.materialDashUi.__MaterialUI.Popover.PopoverAnimationProps
import typingsSlinky.materialDashUi.__MaterialUI.Popover.PopoverProps
import typingsSlinky.materialDashUi.__MaterialUI.propTypes.origin
import typingsSlinky.materialDashUi.autoCompleteMod.default
import typingsSlinky.react.reactMod.CSSProperties
import typingsSlinky.react.reactMod.FormEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object AutoComplete
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("material-ui/AutoComplete", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: autoComplete, autoFocus, className, defaultValue, disabled, id, name, onBlur, onFocus, onKeyDown, onKeyPress, onKeyUp, open, placeholder, required, rows, type, value */
  def apply(
    dataSource: js.Array[js.Any],
    anchorOrigin: origin = null,
    animated: js.UndefOr[Boolean] = js.undefined,
    animation: ReactComponentClass[PopoverAnimationProps] = null,
    dataSourceConfig: Anon_Text = null,
    disableFocusRipple: js.UndefOr[Boolean] = js.undefined,
    errorStyle: CSSProperties = null,
    errorText: TagMod[Any] = null,
    filter: (/* searchText */ String, /* key */ String, js.Any) => Boolean = null,
    floatingLabelFixed: js.UndefOr[Boolean] = js.undefined,
    floatingLabelFocusStyle: CSSProperties = null,
    floatingLabelShrinkStyle: CSSProperties = null,
    floatingLabelStyle: CSSProperties = null,
    floatingLabelText: TagMod[Any] = null,
    fullWidth: js.UndefOr[Boolean] = js.undefined,
    hintStyle: CSSProperties = null,
    hintText: TagMod[Any] = null,
    inputStyle: CSSProperties = null,
    listStyle: CSSProperties = null,
    max: Int | Double = null,
    maxSearchResults: Int | Double = null,
    maxlength: String = null,
    menuCloseDelay: Int | Double = null,
    menuProps: js.Any = null,
    menuStyle: CSSProperties = null,
    min: Int | Double = null,
    minlength: String = null,
    multiLine: js.UndefOr[Boolean] = js.undefined,
    onChange: (/* e */ FormEvent[js.Object], /* newValue */ String) => Unit = null,
    onNewRequest: (js.Any, /* index */ Double) => Unit = null,
    onUpdateInput: (/* searchText */ String, /* dataSource */ js.Array[js.Any]) => Unit = null,
    openOnFocus: js.UndefOr[Boolean] = js.undefined,
    popoverProps: PopoverProps = null,
    rowsMax: Int | Double = null,
    searchText: String = null,
    step: Int | Double = null,
    style: CSSProperties = null,
    targetOrigin: origin = null,
    textFieldStyle: CSSProperties = null,
    textareaStyle: CSSProperties = null,
    title: String = null,
    underlineDisabledStyle: CSSProperties = null,
    underlineFocusStyle: CSSProperties = null,
    underlineShow: js.UndefOr[Boolean] = js.undefined,
    underlineStyle: CSSProperties = null,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(dataSource = dataSource.asInstanceOf[js.Any])
    if (anchorOrigin != null) __obj.updateDynamic("anchorOrigin")(anchorOrigin.asInstanceOf[js.Any])
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (dataSourceConfig != null) __obj.updateDynamic("dataSourceConfig")(dataSourceConfig.asInstanceOf[js.Any])
    if (!js.isUndefined(disableFocusRipple)) __obj.updateDynamic("disableFocusRipple")(disableFocusRipple.asInstanceOf[js.Any])
    if (errorStyle != null) __obj.updateDynamic("errorStyle")(errorStyle.asInstanceOf[js.Any])
    if (errorText != null) __obj.updateDynamic("errorText")(errorText.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction3(filter))
    if (!js.isUndefined(floatingLabelFixed)) __obj.updateDynamic("floatingLabelFixed")(floatingLabelFixed.asInstanceOf[js.Any])
    if (floatingLabelFocusStyle != null) __obj.updateDynamic("floatingLabelFocusStyle")(floatingLabelFocusStyle.asInstanceOf[js.Any])
    if (floatingLabelShrinkStyle != null) __obj.updateDynamic("floatingLabelShrinkStyle")(floatingLabelShrinkStyle.asInstanceOf[js.Any])
    if (floatingLabelStyle != null) __obj.updateDynamic("floatingLabelStyle")(floatingLabelStyle.asInstanceOf[js.Any])
    if (floatingLabelText != null) __obj.updateDynamic("floatingLabelText")(floatingLabelText.asInstanceOf[js.Any])
    if (!js.isUndefined(fullWidth)) __obj.updateDynamic("fullWidth")(fullWidth.asInstanceOf[js.Any])
    if (hintStyle != null) __obj.updateDynamic("hintStyle")(hintStyle.asInstanceOf[js.Any])
    if (hintText != null) __obj.updateDynamic("hintText")(hintText.asInstanceOf[js.Any])
    if (inputStyle != null) __obj.updateDynamic("inputStyle")(inputStyle.asInstanceOf[js.Any])
    if (listStyle != null) __obj.updateDynamic("listStyle")(listStyle.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (maxSearchResults != null) __obj.updateDynamic("maxSearchResults")(maxSearchResults.asInstanceOf[js.Any])
    if (maxlength != null) __obj.updateDynamic("maxlength")(maxlength.asInstanceOf[js.Any])
    if (menuCloseDelay != null) __obj.updateDynamic("menuCloseDelay")(menuCloseDelay.asInstanceOf[js.Any])
    if (menuProps != null) __obj.updateDynamic("menuProps")(menuProps.asInstanceOf[js.Any])
    if (menuStyle != null) __obj.updateDynamic("menuStyle")(menuStyle.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (minlength != null) __obj.updateDynamic("minlength")(minlength.asInstanceOf[js.Any])
    if (!js.isUndefined(multiLine)) __obj.updateDynamic("multiLine")(multiLine.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onNewRequest != null) __obj.updateDynamic("onNewRequest")(js.Any.fromFunction2(onNewRequest))
    if (onUpdateInput != null) __obj.updateDynamic("onUpdateInput")(js.Any.fromFunction2(onUpdateInput))
    if (!js.isUndefined(openOnFocus)) __obj.updateDynamic("openOnFocus")(openOnFocus.asInstanceOf[js.Any])
    if (popoverProps != null) __obj.updateDynamic("popoverProps")(popoverProps.asInstanceOf[js.Any])
    if (rowsMax != null) __obj.updateDynamic("rowsMax")(rowsMax.asInstanceOf[js.Any])
    if (searchText != null) __obj.updateDynamic("searchText")(searchText.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (targetOrigin != null) __obj.updateDynamic("targetOrigin")(targetOrigin.asInstanceOf[js.Any])
    if (textFieldStyle != null) __obj.updateDynamic("textFieldStyle")(textFieldStyle.asInstanceOf[js.Any])
    if (textareaStyle != null) __obj.updateDynamic("textareaStyle")(textareaStyle.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (underlineDisabledStyle != null) __obj.updateDynamic("underlineDisabledStyle")(underlineDisabledStyle.asInstanceOf[js.Any])
    if (underlineFocusStyle != null) __obj.updateDynamic("underlineFocusStyle")(underlineFocusStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(underlineShow)) __obj.updateDynamic("underlineShow")(underlineShow.asInstanceOf[js.Any])
    if (underlineStyle != null) __obj.updateDynamic("underlineStyle")(underlineStyle.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = AutoCompleteProps[js.Any]
}

