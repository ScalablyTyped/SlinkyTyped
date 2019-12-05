package typingsSlinky.reactDashLive.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashLive.reactDashLiveMod.EditorProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(typingsSlinky), Name(reactDashLive), Name(reactDashLiveMod), Name(EditorProps))) was not a @ScalaJSDefined trait */
object Editor
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDashLive.reactDashLiveMod.Editor] {
  @JSImport("react-live", "Editor")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = EditorProps
}

