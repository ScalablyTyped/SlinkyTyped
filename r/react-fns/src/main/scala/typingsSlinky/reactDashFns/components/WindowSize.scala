package typingsSlinky.reactDashFns.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashFns.distTypesMod.SharedRenderProps
import typingsSlinky.reactDashFns.distWindowSizeWindowSizeMod.WindowSizeConfig
import typingsSlinky.reactDashFns.distWindowSizeWindowSizeMod.WindowSizeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(<intersection>))) was not a @ScalaJSDefined trait */
object WindowSize
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDashFns.reactDashFnsMod.WindowSize] {
  @JSImport("react-fns", "WindowSize")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = WindowSizeConfig with SharedRenderProps[WindowSizeProps]
}

