package typingsSlinky.reactDashScrollDashRotate.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashScrollDashRotate.reactDashScrollDashRotateMod.ScrollRotateProps
import typingsSlinky.reactDashScrollDashRotate.reactDashScrollDashRotateStrings.prec
import typingsSlinky.reactDashScrollDashRotate.reactDashScrollDashRotateStrings.px
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ScrollRotate
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.reactDashScrollDashRotate.reactDashScrollDashRotateMod.ScrollRotate
    ] {
  @JSImport("react-scroll-rotate", "ScrollRotate")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: target */
  def apply(
    animationDuration: Int | Double = null,
    from: Int | Double = null,
    loops: Int | Double = null,
    method: px | prec = null,
    throttle: Int | Double = null,
    to: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDashScrollDashRotate.reactDashScrollDashRotateMod.ScrollRotate
  ] = {
    val __obj = js.Dynamic.literal()
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (loops != null) __obj.updateDynamic("loops")(loops.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (throttle != null) __obj.updateDynamic("throttle")(throttle.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDashScrollDashRotate.reactDashScrollDashRotateMod.ScrollRotate
  ] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashScrollDashRotate.reactDashScrollDashRotateMod.ScrollRotate](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = ScrollRotateProps
}

