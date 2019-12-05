package typingsSlinky.fluentDashReact.fluentDashReactMod

import slinky.core.ReactComponentClass
import typingsSlinky.react.reactMod.ComponentClass
import typingsSlinky.react.reactMod.ComponentState
import typingsSlinky.react.reactMod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fluent-react", "withLocalization")
@js.native
object withLocalization extends js.Object {
  def apply(component: ComponentClass[Matching[InjectedProps, GetProps[_]], ComponentState]): ReactComponentClass[
    Omit[GetProps[ReactComponentClass[Matching[InjectedProps, GetProps[_]]]], String]
  ] = js.native
  def apply(component: FunctionComponent[Matching[InjectedProps, GetProps[_]]]): ReactComponentClass[
    Omit[GetProps[ReactComponentClass[Matching[InjectedProps, GetProps[_]]]], String]
  ] = js.native
}

