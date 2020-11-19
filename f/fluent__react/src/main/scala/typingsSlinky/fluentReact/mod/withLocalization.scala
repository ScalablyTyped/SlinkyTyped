package typingsSlinky.fluentReact.mod

import slinky.core.ReactComponentClass
import typingsSlinky.hoistNonReactStatics.mod.NonReactStatics
import typingsSlinky.react.mod.ComponentClass
import typingsSlinky.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@fluent/react", "withLocalization")
@js.native
object withLocalization extends js.Object {
  
  def apply(component: ComponentClass[Matching[LocalizationProps, GetProps[_]], js.Object]): (ReactComponentClass[
    Omit[
      GetProps[ReactComponentClass[Matching[LocalizationProps, GetProps[_]]]], 
      /* keyof @fluent/react.@fluent/react.Shared<@fluent/react.@fluent/react.LocalizationProps, @fluent/react.@fluent/react.GetProps<react.react.ComponentClass<@fluent/react.@fluent/react.Matching<@fluent/react.@fluent/react.LocalizationProps, @fluent/react.@fluent/react.GetProps<any>>, react.react.ComponentState>>> */ String
    ]
  ]) with (NonReactStatics[ReactComponentClass[Matching[LocalizationProps, GetProps[_]]], js.Object]) = js.native
  def apply(component: FunctionComponent[Matching[LocalizationProps, GetProps[_]]]): (ReactComponentClass[
    Omit[
      GetProps[ReactComponentClass[Matching[LocalizationProps, GetProps[_]]]], 
      /* keyof @fluent/react.@fluent/react.Shared<@fluent/react.@fluent/react.LocalizationProps, @fluent/react.@fluent/react.GetProps<react.react.FunctionComponent<@fluent/react.@fluent/react.Matching<@fluent/react.@fluent/react.LocalizationProps, @fluent/react.@fluent/react.GetProps<any>>>>> */ String
    ]
  ]) with (NonReactStatics[ReactComponentClass[Matching[LocalizationProps, GetProps[_]]], js.Object]) = js.native
}
