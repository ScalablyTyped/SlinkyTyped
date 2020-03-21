package typingsSlinky.apolloReactComponents

import slinky.core.facade.ReactElement
import typingsSlinky.apolloReactComponents.typesMod.MutationComponentOptions
import typingsSlinky.propTypes.mod.Requireable
import typingsSlinky.propTypes.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@apollo/react-components/lib/Mutation", JSImport.Namespace)
@js.native
object mutationMod extends js.Object {
  @js.native
  object Mutation extends js.Object {
    def apply[TData, TVariables](props: MutationComponentOptions[TData, TVariables]): ReactElement | Null = js.native
    @js.native
    object propTypes extends js.Object {
      var awaitRefetchQueries: Requireable[Boolean] = js.native
      var children: Validator[js.Function1[/* repeated */ _, _]] = js.native
      var fetchPolicy: Requireable[String] = js.native
      var mutation: Validator[js.Object] = js.native
      var onCompleted: Requireable[js.Function1[/* repeated */ _, _]] = js.native
      var onError: Requireable[js.Function1[/* repeated */ _, _]] = js.native
      var optimisticResponse: Requireable[js.Object] = js.native
      var refetchQueries: Requireable[
            (js.Function1[/* repeated */ _, _]) | (js.Array[js.UndefOr[String | js.Object | Null]])
          ] = js.native
      var update: Requireable[js.Function1[/* repeated */ _, _]] = js.native
      var variables: Requireable[js.Object] = js.native
    }
    
  }
  
}

