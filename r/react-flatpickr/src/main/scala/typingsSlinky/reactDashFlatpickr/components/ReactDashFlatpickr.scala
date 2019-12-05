package typingsSlinky.reactDashFlatpickr.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.flatpickr.distTypesGlobalsMod._Global_.Date
import typingsSlinky.flatpickr.distTypesInstanceMod.Instance
import typingsSlinky.flatpickr.flatpickrMod.flatpickr.Options.Options
import typingsSlinky.reactDashFlatpickr.reactDashFlatpickrMod.DateTimePickerProps
import typingsSlinky.reactDashFlatpickr.reactDashFlatpickrMod.Omit
import typingsSlinky.reactDashFlatpickr.reactDashFlatpickrMod.default
import typingsSlinky.reactDashFlatpickr.reactDashFlatpickrStrings.options
import typingsSlinky.reactDashFlatpickr.reactDashFlatpickrStrings.render
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDashFlatpickr
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-flatpickr", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, value */
  def apply(
    defaultValue: String = null,
    onChange: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[js.Any]) => Unit = null,
    onClose: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[js.Any]) => Unit = null,
    onDayCreate: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[js.Any]) => Unit = null,
    onMonthChange: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[js.Any]) => Unit = null,
    onOpen: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[js.Any]) => Unit = null,
    onReady: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[js.Any]) => Unit = null,
    onValueUpdate: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[js.Any]) => Unit = null,
    onYearChange: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[js.Any]) => Unit = null,
    options: Options = null,
    render: (/* props */ Omit[DateTimePickerProps, options | render], /* ref */ js.Function1[/* node */ HTMLInputElement, Unit]) => ReactElement = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction4(onChange))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction4(onClose))
    if (onDayCreate != null) __obj.updateDynamic("onDayCreate")(js.Any.fromFunction4(onDayCreate))
    if (onMonthChange != null) __obj.updateDynamic("onMonthChange")(js.Any.fromFunction4(onMonthChange))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction4(onOpen))
    if (onReady != null) __obj.updateDynamic("onReady")(js.Any.fromFunction4(onReady))
    if (onValueUpdate != null) __obj.updateDynamic("onValueUpdate")(js.Any.fromFunction4(onValueUpdate))
    if (onYearChange != null) __obj.updateDynamic("onYearChange")(js.Any.fromFunction4(onYearChange))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction2(render))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = DateTimePickerProps
}

