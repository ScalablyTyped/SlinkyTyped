package typingsSlinky.atApolloReactDashHoc

import slinky.core.ReactComponentClass
import typingsSlinky.atApolloReactDashHoc.libTypesMod.OperationOption
import typingsSlinky.graphql.languageAstMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@apollo/react-hoc/lib/graphql", JSImport.Namespace)
@js.native
object libGraphqlMod extends js.Object {
  def graphql[TProps /* <: TGraphQLVariables | js.Object */, TData, TGraphQLVariables, TChildProps](document: DocumentNode): js.Function1[
    /* WrappedComponent */ ReactComponentClass[TProps with TChildProps], 
    ReactComponentClass[TProps]
  ] = js.native
  def graphql[TProps /* <: TGraphQLVariables | js.Object */, TData, TGraphQLVariables, TChildProps](
    document: DocumentNode,
    operationOptions: OperationOption[TProps, TData, TGraphQLVariables, TChildProps]
  ): js.Function1[
    /* WrappedComponent */ ReactComponentClass[TProps with TChildProps], 
    ReactComponentClass[TProps]
  ] = js.native
}

