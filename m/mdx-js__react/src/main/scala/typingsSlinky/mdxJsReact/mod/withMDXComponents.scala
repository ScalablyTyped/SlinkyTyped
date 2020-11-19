package typingsSlinky.mdxJsReact.mod

import slinky.core.ReactComponentClass
import typingsSlinky.mdxJsReact.mdxJsReactStrings.components
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@mdx-js/react", "withMDXComponents")
@js.native
object withMDXComponents extends js.Object {
  
  def apply[GProps /* <: InjectedMDXProviderProps */](Component: ReactComponentClass[GProps]): ReactComponentClass[Except[GProps, components]] = js.native
}
