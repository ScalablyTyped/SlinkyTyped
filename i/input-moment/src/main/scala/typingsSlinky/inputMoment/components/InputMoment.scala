package typingsSlinky.inputMoment.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.inputMoment.mod.InputMomentProps
import typingsSlinky.inputMoment.mod.default
import typingsSlinky.moment.mod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object InputMoment
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("input-moment", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    moment: Moment,
    hourStep: Int | Double = null,
    minStep: Int | Double = null,
    nextMonthIcon: String = null,
    onChange: /* m */ Moment => Unit = null,
    onSave: () => Unit = null,
    prevMonthIcon: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(moment = moment.asInstanceOf[js.Any])
    if (hourStep != null) __obj.updateDynamic("hourStep")(hourStep.asInstanceOf[js.Any])
    if (minStep != null) __obj.updateDynamic("minStep")(minStep.asInstanceOf[js.Any])
    if (nextMonthIcon != null) __obj.updateDynamic("nextMonthIcon")(nextMonthIcon.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onSave != null) __obj.updateDynamic("onSave")(js.Any.fromFunction0(onSave))
    if (prevMonthIcon != null) __obj.updateDynamic("prevMonthIcon")(prevMonthIcon.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = InputMomentProps
}

