package typingsSlinky.reactLazylog.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactLazylog.AnonText
import typingsSlinky.reactLazylog.lineContentMod.LineContentProps
import typingsSlinky.reactLazylog.lineContentMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object LineContent
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-lazylog/build/LineContent", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: style */
  def apply(
    data: js.Array[AnonText],
    number: Double,
    formatPart: /* text */ String => TagMod[Any] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
    if (formatPart != null) __obj.updateDynamic("formatPart")(js.Any.fromFunction1(formatPart))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = LineContentProps
}

