package typingsSlinky.reactDashHotDashLoader.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashHotDashLoader.reactDashHotDashLoaderMod.AppChildren
import typingsSlinky.reactDashHotDashLoader.reactDashHotDashLoaderMod.AppContainerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(<intersection>))) was not a @ScalaJSDefined trait */
object AppContainer
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.reactDashHotDashLoader.reactDashHotDashLoaderMod.AppContainer
    ] {
  @JSImport("react-hot-loader", "AppContainer")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = AppContainerProps with AppChildren
}

