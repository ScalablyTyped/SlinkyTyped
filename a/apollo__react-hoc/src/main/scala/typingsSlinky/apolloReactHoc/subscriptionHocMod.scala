package typingsSlinky.apolloReactHoc

import slinky.core.ReactComponentClass
import typingsSlinky.apolloReactHoc.typesMod.OperationOption
import typingsSlinky.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@apollo/react-hoc/lib/subscription-hoc", JSImport.Namespace)
@js.native
object subscriptionHocMod extends js.Object {
  
  def withSubscription[TProps /* <: TGraphQLVariables | js.Object */, TData, TGraphQLVariables, TChildProps](document: DocumentNode): js.Function1[
    /* WrappedComponent */ ReactComponentClass[TProps with TChildProps], 
    ReactComponentClass[TProps]
  ] = js.native
  def withSubscription[TProps /* <: TGraphQLVariables | js.Object */, TData, TGraphQLVariables, TChildProps](
    document: DocumentNode,
    operationOptions: OperationOption[TProps, TData, TGraphQLVariables, TChildProps]
  ): js.Function1[
    /* WrappedComponent */ ReactComponentClass[TProps with TChildProps], 
    ReactComponentClass[TProps]
  ] = js.native
}
