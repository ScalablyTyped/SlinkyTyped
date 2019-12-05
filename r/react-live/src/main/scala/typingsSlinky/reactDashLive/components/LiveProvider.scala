package typingsSlinky.reactDashLive.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashLive.reactDashLiveMod.LiveProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(typingsSlinky), Name(reactDashLive), Name(reactDashLiveMod), Name(LiveProviderProps))) was not a @ScalaJSDefined trait */
object LiveProvider
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDashLive.reactDashLiveMod.LiveProvider] {
  @JSImport("react-live", "LiveProvider")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = LiveProviderProps
}

