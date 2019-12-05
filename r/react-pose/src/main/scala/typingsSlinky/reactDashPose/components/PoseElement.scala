package typingsSlinky.reactDashPose.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashPose.libComponentsPoseElementTypesMod.PoseElementInternalProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(typingsSlinky), Name(reactDashPose), Name(libComponentsPoseElementTypesMod), Name(PoseElementInternalProps))) was not a @ScalaJSDefined trait */
object PoseElement
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDashPose.libComponentsPoseElementMod.PoseElement] {
  @JSImport("react-pose/lib/components/PoseElement", "PoseElement")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = PoseElementInternalProps
}

