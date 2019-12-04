package typingsSlinky.reactDashNavigationDashStack.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.react.reactMod.ComponentProps
import typingsSlinky.reactDashNavigationDashStack.libTypescriptViewsHeaderHeaderTitleMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(typingsSlinky), Name(react), Name(reactMod), Name(ComponentProps))) was not a @ScalaJSDefined trait */
object HeaderTitle
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-navigation-stack/lib/typescript/views/Header/HeaderTitle", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = ComponentProps[js.Any]
}

