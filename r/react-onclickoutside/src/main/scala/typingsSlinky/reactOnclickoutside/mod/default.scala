package typingsSlinky.reactOnclickoutside.mod

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.ComponentClass
import typingsSlinky.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-onclickoutside", JSImport.Default)
@js.native
object default extends js.Object {
  def apply[P](component: ComponentClass[P, js.Object]): WrapperClass[P, ReactComponentClass[P]] = js.native
  def apply[P](component: ComponentClass[P, js.Object], config: ConfigObject): WrapperClass[P, ReactComponentClass[P]] = js.native
  def apply[P](component: FunctionComponent[P]): WrapperClass[P, ReactComponentClass[P]] = js.native
  def apply[P](component: FunctionComponent[P], config: ConfigObject): WrapperClass[P, ReactComponentClass[P]] = js.native
  def apply[P](component: ClickOutComponentClass[P]): WrapperClass[P, ClickOutComponentClass[P]] = js.native
  def apply[P](component: ClickOutComponentClass[P], config: ConfigObject): WrapperClass[P, ClickOutComponentClass[P]] = js.native
}

