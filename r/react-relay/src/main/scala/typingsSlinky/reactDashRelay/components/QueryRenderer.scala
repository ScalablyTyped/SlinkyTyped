package typingsSlinky.reactDashRelay.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashRelay.Anon_CacheConfig
import typingsSlinky.reactDashRelay.reactDashRelayMod.QueryRendererProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(<intersection>))) was not a @ScalaJSDefined trait */
object QueryRenderer
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDashRelay.reactDashRelayMod.QueryRenderer[js.Any]] {
  @JSImport("react-relay", "QueryRenderer")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = Anon_CacheConfig with QueryRendererProps[js.Any]
}

