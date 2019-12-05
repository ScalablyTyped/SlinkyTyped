package typingsSlinky.redboxDashReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ExternalPropsWriterProvider
import slinky.web.html.`*`.tag
import typingsSlinky.react.reactMod.CSSProperties
import typingsSlinky.redboxDashReact.redboxDashReactMod.RedBoxProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_RedBoxProps_721629917[ComponentRef <: js.Object] (implicit pw: ExternalPropsWriterProvider)
  extends ExternalComponentWithAttributesWithRefType[tag.type, ComponentRef] {
  /* The following DOM/SVG props were specified: className */
  def apply(
    error: js.Error,
    editorScheme: String = null,
    filename: String = null,
    style: CSSProperties = null,
    useColumns: js.UndefOr[Boolean] = js.undefined,
    useLines: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ComponentRef] = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    if (editorScheme != null) __obj.updateDynamic("editorScheme")(editorScheme.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(useColumns)) __obj.updateDynamic("useColumns")(useColumns.asInstanceOf[js.Any])
    if (!js.isUndefined(useLines)) __obj.updateDynamic("useLines")(useLines.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = RedBoxProps
}

