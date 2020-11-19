package typingsSlinky.mobxReact

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.ForwardRefExoticComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mobx-react/dist/types/IReactComponent", JSImport.Namespace)
@js.native
object ireactcomponentMod extends js.Object {
  
  type IReactComponent[P] = ReactComponentClass[P] | ForwardRefExoticComponent[P]
}
