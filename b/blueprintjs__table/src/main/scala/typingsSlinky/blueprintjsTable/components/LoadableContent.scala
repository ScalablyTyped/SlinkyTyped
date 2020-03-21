package typingsSlinky.blueprintjsTable.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.blueprintjsTable.loadableContentMod.ILoadableContentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object LoadableContent
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.blueprintjsTable.loadableContentMod.LoadableContent] {
  @JSImport("@blueprintjs/table/lib/esm/common/loadableContent", "LoadableContent")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    loading: Boolean,
    variableLength: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.blueprintjsTable.loadableContentMod.LoadableContent] = {
    val __obj = js.Dynamic.literal(loading = loading.asInstanceOf[js.Any])
    if (!js.isUndefined(variableLength)) __obj.updateDynamic("variableLength")(variableLength.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ILoadableContentProps
}

