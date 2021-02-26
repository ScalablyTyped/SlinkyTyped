package typingsSlinky.mobxReact

import typingsSlinky.mobxReact.ireactcomponentMod.IReactComponent
import typingsSlinky.mobxReact.istorestopropsMod.IStoresToProps
import typingsSlinky.mobxReact.iwrappedcomponentMod.IWrappedComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object injectMod {
  
  @JSImport("mobx-react/dist/inject", "inject")
  @js.native
  def inject(stores: String*): js.Function1[/* target */ IReactComponent[_], IReactComponent[_] with IWrappedComponent[_]] = js.native
  @JSImport("mobx-react/dist/inject", "inject")
  @js.native
  def inject[S, P, I, C](fn: IStoresToProps[S, P, I, C]): js.Function1[/* target */ IReactComponent[_], IReactComponent[_] with IWrappedComponent[P]] = js.native
}
