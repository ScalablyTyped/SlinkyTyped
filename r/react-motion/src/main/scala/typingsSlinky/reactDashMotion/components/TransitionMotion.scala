package typingsSlinky.reactDashMotion.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashMotion.reactDashMotionMod.InterpolateFunction
import typingsSlinky.reactDashMotion.reactDashMotionMod.PlainStyle
import typingsSlinky.reactDashMotion.reactDashMotionMod.Style
import typingsSlinky.reactDashMotion.reactDashMotionMod.TransitionPlainStyle
import typingsSlinky.reactDashMotion.reactDashMotionMod.TransitionProps
import typingsSlinky.reactDashMotion.reactDashMotionMod.TransitionStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TransitionMotion
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDashMotion.reactDashMotionMod.TransitionMotion] {
  @JSImport("react-motion", "TransitionMotion")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    styles: js.Array[TransitionStyle] | InterpolateFunction,
    defaultStyles: js.Array[TransitionPlainStyle] = null,
    didLeave: /* styleThatLeft */ TransitionStyle => Unit = null,
    willEnter: /* styleThatEntered */ TransitionStyle => PlainStyle = null,
    willLeave: /* styleThatLeft */ TransitionStyle => Style | Unit = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactDashMotion.reactDashMotionMod.TransitionMotion] = {
    val __obj = js.Dynamic.literal(styles = styles.asInstanceOf[js.Any])
    if (defaultStyles != null) __obj.updateDynamic("defaultStyles")(defaultStyles.asInstanceOf[js.Any])
    if (didLeave != null) __obj.updateDynamic("didLeave")(js.Any.fromFunction1(didLeave))
    if (willEnter != null) __obj.updateDynamic("willEnter")(js.Any.fromFunction1(willEnter))
    if (willLeave != null) __obj.updateDynamic("willLeave")(js.Any.fromFunction1(willLeave))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = TransitionProps
}

