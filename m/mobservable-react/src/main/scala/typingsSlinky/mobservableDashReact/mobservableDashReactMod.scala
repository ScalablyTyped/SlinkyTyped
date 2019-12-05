package typingsSlinky.mobservableDashReact

import slinky.core.ReactComponentClass
import typingsSlinky.react.reactMod.ClassicComponentClass
import typingsSlinky.react.reactMod.ComponentClass
import typingsSlinky.react.reactMod.ComponentState
import typingsSlinky.react.reactMod.ReactElement
import typingsSlinky.react.reactMod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobservable-react", JSImport.Namespace)
@js.native
object mobservableDashReactMod extends js.Object {
  def observer[P](clazz: ClassicComponentClass[P]): ReactComponentClass[P] = js.native
  def observer[P](clazz: ComponentClass[P, ComponentState]): ReactComponentClass[P] = js.native
  def observer[P](clazz: StatelessComponent[P]): ReactComponentClass[P] = js.native
  def observer[P](renderFunction: js.Function1[/* props */ P, ReactElement]): ReactComponentClass[P] = js.native
  def observer[TFunction /* <: ReactComponentClass[_] */](target: TFunction): TFunction = js.native
}

