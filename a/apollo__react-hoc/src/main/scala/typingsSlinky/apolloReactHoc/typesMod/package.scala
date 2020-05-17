package typingsSlinky.apolloReactHoc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type ChildDataProps[TProps, TData, TGraphQLVariables] = TProps with (typingsSlinky.apolloReactHoc.typesMod.DataProps[TData, TGraphQLVariables])
  type ChildMutateProps[TProps, TData, TGraphQLVariables] = TProps with (typingsSlinky.apolloReactHoc.typesMod.MutateProps[TData, TGraphQLVariables])
  type ChildProps[TProps, TData, TGraphQLVariables] = TProps with (typingsSlinky.std.Partial[typingsSlinky.apolloReactHoc.typesMod.DataProps[TData, TGraphQLVariables]]) with (typingsSlinky.std.Partial[typingsSlinky.apolloReactHoc.typesMod.MutateProps[TData, TGraphQLVariables]])
  type DataValue[TData, TGraphQLVariables] = (typingsSlinky.apolloReactHoc.typesMod.QueryControls[TData, TGraphQLVariables]) with typingsSlinky.std.Partial[TData]
  type WithApolloClient[P] = P with typingsSlinky.apolloReactHoc.anon.Client
}
