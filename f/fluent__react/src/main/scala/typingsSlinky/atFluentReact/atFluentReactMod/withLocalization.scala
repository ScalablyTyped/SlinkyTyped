package typingsSlinky.atFluentReact.atFluentReactMod

import slinky.core.ReactComponentClass
import typingsSlinky.hoistDashNonDashReactDashStatics.hoistDashNonDashReactDashStaticsMod.NonReactStatics
import typingsSlinky.react.reactMod.ComponentClass
import typingsSlinky.react.reactMod.ComponentState
import typingsSlinky.react.reactMod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@fluent/react", "withLocalization")
@js.native
object withLocalization extends js.Object {
  def apply(component: ComponentClass[Matching[LocalizationProps, GetProps[_]], ComponentState]): (ReactComponentClass[
    Omit[GetProps[ReactComponentClass[Matching[LocalizationProps, GetProps[_]]]], String]
  ]) with (NonReactStatics[ReactComponentClass[Matching[LocalizationProps, GetProps[_]]], js.Object]) = js.native
  def apply(component: FunctionComponent[Matching[LocalizationProps, GetProps[_]]]): (ReactComponentClass[
    Omit[GetProps[ReactComponentClass[Matching[LocalizationProps, GetProps[_]]]], String]
  ]) with (NonReactStatics[ReactComponentClass[Matching[LocalizationProps, GetProps[_]]], js.Object]) = js.native
}

