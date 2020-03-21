package typingsSlinky.reactCsv.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ExternalPropsWriterProvider
import slinky.web.html.`*`.tag
import typingsSlinky.reactCsv.commonPropTypesMod.AsyncClickHandler
import typingsSlinky.reactCsv.commonPropTypesMod.Data
import typingsSlinky.reactCsv.commonPropTypesMod.Headers
import typingsSlinky.reactCsv.commonPropTypesMod.SyncClickHandler
import typingsSlinky.reactCsv.downloadMod.DownloadPropTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_DownloadPropTypes1673519281[ComponentRef <: js.Object] (implicit pw: ExternalPropsWriterProvider)
  extends ExternalComponentWithAttributesWithRefType[tag.type, ComponentRef] {
  /* The following DOM/SVG props were specified: target */
  def apply(
    data: String | Data,
    asyncOnClick: js.UndefOr[Boolean] = js.undefined,
    enclosingCharacter: String = null,
    filename: String = null,
    headers: Headers = null,
    onClick: SyncClickHandler | AsyncClickHandler = null,
    separator: String = null,
    uFEFF: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ComponentRef] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (!js.isUndefined(asyncOnClick)) __obj.updateDynamic("asyncOnClick")(asyncOnClick.asInstanceOf[js.Any])
    if (enclosingCharacter != null) __obj.updateDynamic("enclosingCharacter")(enclosingCharacter.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(onClick.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    if (!js.isUndefined(uFEFF)) __obj.updateDynamic("uFEFF")(uFEFF.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = DownloadPropTypes
}

