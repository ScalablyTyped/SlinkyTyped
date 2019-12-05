package typingsSlinky.atApolloReactDashHoc

import slinky.core.ReactComponentClass
import typingsSlinky.atApolloReactDashCommon.libTypesTypesMod.OperationVariables
import typingsSlinky.atApolloReactDashHoc.atApolloReactDashHocStrings.client
import typingsSlinky.atApolloReactDashHoc.libTypesMod.ChildProps
import typingsSlinky.atApolloReactDashHoc.libTypesMod.OperationOption
import typingsSlinky.atApolloReactDashHoc.libTypesMod.WithApolloClient
import typingsSlinky.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@apollo/react-hoc/lib/withApollo", JSImport.Namespace)
@js.native
object libWithApolloMod extends js.Object {
  @JSName("withApollo")
  def withApollo_client[TProps, TResult](WrappedComponent: ReactComponentClass[WithApolloClient[Omit[TProps, client]]]): ReactComponentClass[Omit[TProps, client]] = js.native
  @JSName("withApollo")
  def withApollo_client[TProps, TResult](
    WrappedComponent: ReactComponentClass[WithApolloClient[Omit[TProps, client]]],
    operationOptions: OperationOption[TProps, TResult, OperationVariables, ChildProps[TProps, TResult, OperationVariables]]
  ): ReactComponentClass[Omit[TProps, client]] = js.native
}

