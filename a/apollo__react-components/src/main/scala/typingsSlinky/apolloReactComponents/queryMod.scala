package typingsSlinky.apolloReactComponents

import slinky.core.facade.ReactElement
import typingsSlinky.apolloReactComponents.typesMod.QueryComponentOptions
import typingsSlinky.propTypes.mod.Requireable
import typingsSlinky.propTypes.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@apollo/react-components/lib/Query", JSImport.Namespace)
@js.native
object queryMod extends js.Object {
  @js.native
  object Query extends js.Object {
    def apply[TData, TVariables](props: QueryComponentOptions[TData, TVariables]): ReactElement | Null = js.native
    @js.native
    object propTypes extends js.Object {
      var children: Validator[js.Function1[/* repeated */ _, _]] = js.native
      var client: Requireable[js.Object] = js.native
      var fetchPolicy: Requireable[String] = js.native
      var notifyOnNetworkStatusChange: Requireable[Boolean] = js.native
      var onCompleted: Requireable[js.Function1[/* repeated */ _, _]] = js.native
      var onError: Requireable[js.Function1[/* repeated */ _, _]] = js.native
      var partialRefetch: Requireable[Boolean] = js.native
      var pollInterval: Requireable[Double] = js.native
      var query: Validator[js.Object] = js.native
      var returnPartialData: Requireable[Boolean] = js.native
      var ssr: Requireable[Boolean] = js.native
      var variables: Requireable[js.Object] = js.native
    }
    
  }
  
}

