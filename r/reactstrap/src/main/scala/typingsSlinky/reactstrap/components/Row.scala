package typingsSlinky.reactstrap.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.web.html.`*`.tag
import typingsSlinky.reactstrap.libRowMod.RowProps
import typingsSlinky.reactstrap.libRowMod.default
import typingsSlinky.reactstrap.reactstrapMod.CSSModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Row
  extends ExternalComponentWithAttributesWithRefType[tag.type, default[js.Any]] {
  @JSImport("reactstrap/lib/Row", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply[T](
    cssModule: CSSModule = null,
    form: js.UndefOr[Boolean] = js.undefined,
    noGutters: js.UndefOr[Boolean] = js.undefined,
    tag: String | ReactComponentClass[_] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[slinky.web.html.`*`.tag.type, default[js.Any]] = {
    val __obj = js.Dynamic.literal()
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule.asInstanceOf[js.Any])
    if (!js.isUndefined(form)) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
    if (!js.isUndefined(noGutters)) __obj.updateDynamic("noGutters")(noGutters.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props]).asInstanceOf[slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactstrap.libRowMod.default[js.Any]]]
  }
  type Props = RowProps
}

