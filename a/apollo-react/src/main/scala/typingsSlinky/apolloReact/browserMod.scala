package typingsSlinky.apolloReact

import typingsSlinky.apolloReact.anon.Children
import typingsSlinky.apolloReact.anon.Client
import typingsSlinky.apolloReact.apolloProviderMod.default
import typingsSlinky.apolloReact.graphqlMod.OperationOption
import typingsSlinky.redux.mod.Func0
import typingsSlinky.redux.mod.Func1
import typingsSlinky.redux.mod.Func2
import typingsSlinky.redux.mod.Func3
import typingsSlinky.typedGraphql.mod.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-react/lib/browser", JSImport.Namespace)
@js.native
object browserMod extends js.Object {
  
  def compose(): js.Function1[/* a */ js.Any, _] = js.native
  def compose[R](f1: js.Function1[/* b */ js.Any, R], funcs: js.Function*): js.Function1[/* repeated */ js.Any, R] = js.native
  def compose[F /* <: js.Function */](f: F): F = js.native
  def compose[R](funcs: js.Function*): js.Function1[/* repeated */ js.Any, R] = js.native
  def compose[A, R](f1: js.Function1[/* b */ A, R], f2: Func0[A]): Func0[R] = js.native
  def compose[A, B, R](f1: js.Function1[/* b */ B, R], f2: js.Function1[/* a */ A, B], f3: Func0[A]): Func0[R] = js.native
  def compose[A, T1, R](f1: js.Function1[/* b */ A, R], f2: Func1[T1, A]): Func1[T1, R] = js.native
  def compose[A, B, C, R](
    f1: js.Function1[/* b */ C, R],
    f2: js.Function1[/* a */ B, C],
    f3: js.Function1[/* a */ A, B],
    f4: Func0[A]
  ): Func0[R] = js.native
  def compose[A, B, T1, R](f1: js.Function1[/* b */ B, R], f2: js.Function1[/* a */ A, B], f3: Func1[T1, A]): Func1[T1, R] = js.native
  def compose[A, T1, T2, R](f1: js.Function1[/* b */ A, R], f2: Func2[T1, T2, A]): Func2[T1, T2, R] = js.native
  def compose[A, B, C, T1, R](
    f1: js.Function1[/* b */ C, R],
    f2: js.Function1[/* a */ B, C],
    f3: js.Function1[/* a */ A, B],
    f4: Func1[T1, A]
  ): Func1[T1, R] = js.native
  def compose[A, B, T1, T2, R](f1: js.Function1[/* b */ B, R], f2: js.Function1[/* a */ A, B], f3: Func2[T1, T2, A]): Func2[T1, T2, R] = js.native
  def compose[A, T1, T2, T3, R](f1: js.Function1[/* b */ A, R], f2: Func3[T1, T2, T3, A]): Func3[T1, T2, T3, R] = js.native
  def compose[A, B, C, T1, T2, R](
    f1: js.Function1[/* b */ C, R],
    f2: js.Function1[/* a */ B, C],
    f3: js.Function1[/* a */ A, B],
    f4: Func2[T1, T2, A]
  ): Func2[T1, T2, R] = js.native
  def compose[A, B, T1, T2, T3, R](f1: js.Function1[/* b */ B, R], f2: js.Function1[/* a */ A, B], f3: Func3[T1, T2, T3, A]): Func3[T1, T2, T3, R] = js.native
  def compose[A, B, C, T1, T2, T3, R](
    f1: js.Function1[/* b */ C, R],
    f2: js.Function1[/* a */ B, C],
    f3: js.Function1[/* a */ A, B],
    f4: Func3[T1, T2, T3, A]
  ): Func3[T1, T2, T3, R] = js.native
  
  def graphql(document: Document): js.Function1[/* WrappedComponent */ js.Any, _] = js.native
  def graphql(document: Document, operationOptions: OperationOption): js.Function1[/* WrappedComponent */ js.Any, _] = js.native
  
  def withApollo(WrappedComponent: js.Any): js.Any = js.native
  
  @js.native
  class ApolloProvider protected () extends default {
    def this(props: js.Any, context: js.Any) = this()
  }
  /* static members */
  @js.native
  object ApolloProvider extends js.Object {
    
    var childContextTypes: Client = js.native
    
    var propTypes: Children = js.native
  }
}
