package typingsSlinky.fluentReact.mod

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.ComponentClass
import typingsSlinky.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fluent-react", "withLocalization")
@js.native
object withLocalization extends js.Object {
  
  def apply(component: ComponentClass[Matching[InjectedProps, GetProps[_]], js.Object]): ReactComponentClass[
    Omit[
      GetProps[ReactComponentClass[Matching[InjectedProps, GetProps[_]]]], 
      /* keyof fluent-react.fluent-react.Shared<fluent-react.fluent-react.InjectedProps, fluent-react.fluent-react.GetProps<react.react.ComponentClass<fluent-react.fluent-react.Matching<fluent-react.fluent-react.InjectedProps, fluent-react.fluent-react.GetProps<any>>, react.react.ComponentState>>> */ String
    ]
  ] = js.native
  def apply(component: FunctionComponent[Matching[InjectedProps, GetProps[_]]]): ReactComponentClass[
    Omit[
      GetProps[ReactComponentClass[Matching[InjectedProps, GetProps[_]]]], 
      /* keyof fluent-react.fluent-react.Shared<fluent-react.fluent-react.InjectedProps, fluent-react.fluent-react.GetProps<react.react.FunctionComponent<fluent-react.fluent-react.Matching<fluent-react.fluent-react.InjectedProps, fluent-react.fluent-react.GetProps<any>>>>> */ String
    ]
  ] = js.native
}
