package typingsSlinky.fluentReact.mod

import slinky.core.ReactComponentClass
import typingsSlinky.hoistNonReactStatics.mod.NonReactStatics
import typingsSlinky.react.mod.ComponentClass
import typingsSlinky.react.mod.ComponentState
import typingsSlinky.react.mod.FunctionComponent
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

