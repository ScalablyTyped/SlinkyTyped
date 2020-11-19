package typingsSlinky.apolloReactHoc

import slinky.core.ReactComponentClass
import typingsSlinky.apolloReactCommon.typesMod.OperationVariables
import typingsSlinky.apolloReactHoc.apolloReactHocStrings.client
import typingsSlinky.apolloReactHoc.typesMod.ChildProps
import typingsSlinky.apolloReactHoc.typesMod.OperationOption
import typingsSlinky.apolloReactHoc.typesMod.WithApolloClient
import typingsSlinky.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@apollo/react-hoc/lib/withApollo", JSImport.Namespace)
@js.native
object withApolloMod extends js.Object {
  
  @JSName("withApollo")
  def withApollo_client[TProps, TResult](WrappedComponent: ReactComponentClass[WithApolloClient[Omit[TProps, client]]]): ReactComponentClass[Omit[TProps, client]] = js.native
  @JSName("withApollo")
  def withApollo_client[TProps, TResult](
    WrappedComponent: ReactComponentClass[WithApolloClient[Omit[TProps, client]]],
    operationOptions: OperationOption[TProps, TResult, OperationVariables, ChildProps[TProps, TResult, OperationVariables]]
  ): ReactComponentClass[Omit[TProps, client]] = js.native
}
