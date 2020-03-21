package typingsSlinky.materialUiPagination.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.materialUiPagination.mod.PaginationProps
import typingsSlinky.materialUiPagination.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MaterialUiPagination
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("material-ui-pagination", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    current: Double,
    display: Double,
    onChange: Double => Unit,
    total: Double,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), total = total.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = PaginationProps
}

