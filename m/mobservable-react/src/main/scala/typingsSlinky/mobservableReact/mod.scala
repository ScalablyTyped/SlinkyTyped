package typingsSlinky.mobservableReact

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.ClassicComponentClass
import typingsSlinky.react.mod.ComponentClass
import typingsSlinky.react.mod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mobservable-react", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def observer[P](clazz: ClassicComponentClass[P]): ReactComponentClass[P] = js.native
  def observer[P](clazz: ComponentClass[P, js.Object]): ReactComponentClass[P] = js.native
  def observer[P](clazz: StatelessComponent[P]): ReactComponentClass[P] = js.native
  def observer[P](renderFunction: js.Function1[/* props */ P, ReactElement]): ReactComponentClass[P] = js.native
  def observer[TFunction /* <: ReactComponentClass[_] */](target: TFunction): TFunction = js.native
}
