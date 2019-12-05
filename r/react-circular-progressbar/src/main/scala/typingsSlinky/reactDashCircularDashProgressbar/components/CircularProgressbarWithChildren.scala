package typingsSlinky.reactDashCircularDashProgressbar.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashCircularDashProgressbar.distCircularProgressbarWithChildrenMod.CircularProgressbarWithChildrenProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(typingsSlinky), Name(reactDashCircularDashProgressbar), Name(distCircularProgressbarWithChildrenMod), Name(CircularProgressbarWithChildrenProps))) was not a @ScalaJSDefined trait */
object CircularProgressbarWithChildren
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("react-circular-progressbar", "CircularProgressbarWithChildren")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = CircularProgressbarWithChildrenProps
}

