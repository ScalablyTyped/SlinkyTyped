package typingsSlinky.reactFocusLock.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.html.`*`.tag
import typingsSlinky.react.mod.Ref
import typingsSlinky.reactFocusLock.ReactFocusLockPropsReactN
import typingsSlinky.reactFocusLock.reactFocusLockStrings.tail
import typingsSlinky.std.FocusOptions
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object UI
  extends ExternalComponentWithAttributesWithRefType[tag.type, Ref[js.Any] with js.Object] {
  @JSImport("react-focus-lock/UI/UI", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: autoFocus, className, disabled */
  def apply(
    sideCar: ReactComponentClass[_],
    allowTextSelection: js.UndefOr[Boolean] = js.undefined,
    as: String | ReactElement = null,
    group: String = null,
    lockProps: Record[String, _] = null,
    noFocusGuards: Boolean | tail = null,
    onActivation: /* node */ HTMLElement => Unit = null,
    onDeactivation: /* node */ HTMLElement => Unit = null,
    persistentFocus: js.UndefOr[Boolean] = js.undefined,
    returnFocus: Boolean | FocusOptions = null,
    shards: js.Array[ReactRef[_] | HTMLElement] = null,
    whiteList: /* activeElement */ HTMLElement => Boolean = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, Ref[js.Any] with js.Object] = {
    val __obj = js.Dynamic.literal(sideCar = sideCar.asInstanceOf[js.Any])
    if (!js.isUndefined(allowTextSelection)) __obj.updateDynamic("allowTextSelection")(allowTextSelection.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (lockProps != null) __obj.updateDynamic("lockProps")(lockProps.asInstanceOf[js.Any])
    if (noFocusGuards != null) __obj.updateDynamic("noFocusGuards")(noFocusGuards.asInstanceOf[js.Any])
    if (onActivation != null) __obj.updateDynamic("onActivation")(js.Any.fromFunction1(onActivation))
    if (onDeactivation != null) __obj.updateDynamic("onDeactivation")(js.Any.fromFunction1(onDeactivation))
    if (!js.isUndefined(persistentFocus)) __obj.updateDynamic("persistentFocus")(persistentFocus.asInstanceOf[js.Any])
    if (returnFocus != null) __obj.updateDynamic("returnFocus")(returnFocus.asInstanceOf[js.Any])
    if (shards != null) __obj.updateDynamic("shards")(shards.asInstanceOf[js.Any])
    if (whiteList != null) __obj.updateDynamic("whiteList")(js.Any.fromFunction1(whiteList))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ReactFocusLockPropsReactN
}

