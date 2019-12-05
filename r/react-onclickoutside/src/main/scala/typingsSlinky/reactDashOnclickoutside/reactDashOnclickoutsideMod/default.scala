package typingsSlinky.reactDashOnclickoutside.reactDashOnclickoutsideMod

import slinky.core.ReactComponentClass
import typingsSlinky.react.reactMod.ComponentClass
import typingsSlinky.react.reactMod.ComponentState
import typingsSlinky.react.reactMod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-onclickoutside", JSImport.Default)
@js.native
object default extends js.Object {
  def apply[P](component: ComponentClass[P, ComponentState]): WrapperClass[P, ReactComponentClass[P]] = js.native
  def apply[P](component: ComponentClass[P, ComponentState], config: ConfigObject): WrapperClass[P, ReactComponentClass[P]] = js.native
  def apply[P](component: FunctionComponent[P]): WrapperClass[P, ReactComponentClass[P]] = js.native
  def apply[P](component: FunctionComponent[P], config: ConfigObject): WrapperClass[P, ReactComponentClass[P]] = js.native
  def apply[P](component: ClickOutComponentClass[P]): WrapperClass[P, ClickOutComponentClass[P]] = js.native
  def apply[P](component: ClickOutComponentClass[P], config: ConfigObject): WrapperClass[P, ClickOutComponentClass[P]] = js.native
}

