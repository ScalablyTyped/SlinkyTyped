package typingsSlinky.fundamentalDashReact.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.fundamentalDashReact.libTokenTokenMod.TokenProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(typingsSlinky), Name(fundamentalDashReact), Name(libTokenTokenMod), Name(TokenProps))) was not a @ScalaJSDefined trait */
object Token
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("fundamental-react/lib/Token/Token", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = TokenProps
}

