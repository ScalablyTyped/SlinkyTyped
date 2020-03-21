package typingsSlinky.reactScrollspy.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.web.html.`*`.tag
import typingsSlinky.reactScrollspy.mod.ScrollspyProps
import typingsSlinky.reactScrollspy.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactScrollspy
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-scrollspy", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, style */
  def apply(
    currentClassName: String,
    items: js.Array[String],
    componentTag: String | ReactComponentClass[js.Object] = null,
    offset: Int | Double = null,
    onUpdate: /* item */ String => Unit = null,
    rootEl: String = null,
    scrolledPastClassName: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(currentClassName = currentClassName.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    if (componentTag != null) __obj.updateDynamic("componentTag")(componentTag.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (onUpdate != null) __obj.updateDynamic("onUpdate")(js.Any.fromFunction1(onUpdate))
    if (rootEl != null) __obj.updateDynamic("rootEl")(rootEl.asInstanceOf[js.Any])
    if (scrolledPastClassName != null) __obj.updateDynamic("scrolledPastClassName")(scrolledPastClassName.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ScrollspyProps
}

