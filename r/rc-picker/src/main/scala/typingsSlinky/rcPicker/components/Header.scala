package typingsSlinky.rcPicker.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.rcPicker.headerMod.HeaderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Header
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("rc-picker/lib/panels/Header", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    prefixCls: String,
    nextIcon: TagMod[Any] = null,
    onNext: () => Unit = null,
    onPrev: () => Unit = null,
    onSuperNext: () => Unit = null,
    onSuperPrev: () => Unit = null,
    prevIcon: TagMod[Any] = null,
    superNextIcon: TagMod[Any] = null,
    superPrevIcon: TagMod[Any] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any])
    if (nextIcon != null) __obj.updateDynamic("nextIcon")(nextIcon.asInstanceOf[js.Any])
    if (onNext != null) __obj.updateDynamic("onNext")(js.Any.fromFunction0(onNext))
    if (onPrev != null) __obj.updateDynamic("onPrev")(js.Any.fromFunction0(onPrev))
    if (onSuperNext != null) __obj.updateDynamic("onSuperNext")(js.Any.fromFunction0(onSuperNext))
    if (onSuperPrev != null) __obj.updateDynamic("onSuperPrev")(js.Any.fromFunction0(onSuperPrev))
    if (prevIcon != null) __obj.updateDynamic("prevIcon")(prevIcon.asInstanceOf[js.Any])
    if (superNextIcon != null) __obj.updateDynamic("superNextIcon")(superNextIcon.asInstanceOf[js.Any])
    if (superPrevIcon != null) __obj.updateDynamic("superPrevIcon")(superPrevIcon.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = HeaderProps
}

