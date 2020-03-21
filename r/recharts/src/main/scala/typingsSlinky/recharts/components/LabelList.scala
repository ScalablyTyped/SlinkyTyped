package typingsSlinky.recharts.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.recharts.mod.ContentRenderer
import typingsSlinky.recharts.mod.LabelListProps
import typingsSlinky.recharts.mod.LabelProps
import typingsSlinky.recharts.mod.PositionType
import typingsSlinky.recharts.mod.RechartsFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object LabelList
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.recharts.mod.LabelList] {
  @JSImport("recharts", "LabelList")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, id */
  def apply(
    dataKey: String | Double | RechartsFunction,
    angle: Int | Double = null,
    clockWise: js.UndefOr[Boolean] = js.undefined,
    content: ReactElement | ContentRenderer[LabelProps] = null,
    data: Int | Double = null,
    formatter: /* label */ String | Double => TagMod[Any] = null,
    offset: Int | Double = null,
    position: PositionType = null,
    valueAccessor: /* repeated */ js.Any => Unit = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.recharts.mod.LabelList] = {
    val __obj = js.Dynamic.literal(dataKey = dataKey.asInstanceOf[js.Any])
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (!js.isUndefined(clockWise)) __obj.updateDynamic("clockWise")(clockWise.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(js.Any.fromFunction1(formatter))
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (valueAccessor != null) __obj.updateDynamic("valueAccessor")(js.Any.fromFunction1(valueAccessor))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = LabelListProps
}

