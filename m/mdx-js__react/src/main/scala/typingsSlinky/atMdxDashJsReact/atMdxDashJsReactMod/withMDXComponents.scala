package typingsSlinky.atMdxDashJsReact.atMdxDashJsReactMod

import slinky.core.ReactComponentClass
import typingsSlinky.atMdxDashJsReact.atMdxDashJsReactStrings.components
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@mdx-js/react", "withMDXComponents")
@js.native
object withMDXComponents extends js.Object {
  def apply[GProps /* <: InjectedMDXProviderProps */](Component: ReactComponentClass[GProps]): ReactComponentClass[Except[GProps, components]] = js.native
}

