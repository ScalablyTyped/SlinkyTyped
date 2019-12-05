package typingsSlinky.reactDashIntl.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashIntl.libComponentsProviderMod.OptionalIntlConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(typingsSlinky), Name(reactDashIntl), Name(libComponentsProviderMod), Name(OptionalIntlConfig))) was not a @ScalaJSDefined trait */
object IntlProvider
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDashIntl.libMod.IntlProvider] {
  @JSImport("react-intl/lib", "IntlProvider")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = OptionalIntlConfig
}

