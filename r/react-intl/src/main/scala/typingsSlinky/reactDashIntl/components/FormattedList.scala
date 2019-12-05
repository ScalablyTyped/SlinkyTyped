package typingsSlinky.reactDashIntl.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.atFormatjsIntlDashListformat.atFormatjsIntlDashListformatMod.IntlListFormatOptions
import typingsSlinky.reactDashIntl.Anon_ValueArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(<intersection>))) was not a @ScalaJSDefined trait */
object FormattedList
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("react-intl/lib", "FormattedList")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = IntlListFormatOptions with Anon_ValueArray
}

