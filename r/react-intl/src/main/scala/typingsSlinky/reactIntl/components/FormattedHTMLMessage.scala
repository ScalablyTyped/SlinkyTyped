package typingsSlinky.reactIntl.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.intlMessageformat.mod.PrimitiveType
import typingsSlinky.reactIntl.mod.Props3
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FormattedHTMLMessage
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactIntl.mod.FormattedHTMLMessage] {
  @JSImport("react-intl", "FormattedHTMLMessage")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    defaultMessage: String = null,
    description: String | js.Object = null,
    id: String | Double = null,
    tagName: ReactElement = null,
    values: Record[String, PrimitiveType] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactIntl.mod.FormattedHTMLMessage] = {
    val __obj = js.Dynamic.literal()
    if (defaultMessage != null) __obj.updateDynamic("defaultMessage")(defaultMessage.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (tagName != null) __obj.updateDynamic("tagName")(tagName.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactIntl.mod.FormattedHTMLMessage] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactIntl.mod.FormattedHTMLMessage](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = Props3[Record[String, PrimitiveType]]
}

