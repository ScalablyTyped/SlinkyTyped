package typingsSlinky.mirrorx.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(T))) was not a @ScalaJSDefined trait */
object Route
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.mirrorx.mirrorxMod.Route[js.Any]] {
  @JSImport("mirrorx", "Route")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = js.Any
}

