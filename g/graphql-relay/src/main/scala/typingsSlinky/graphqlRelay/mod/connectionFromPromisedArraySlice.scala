package typingsSlinky.graphqlRelay.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql-relay", "connectionFromPromisedArraySlice")
@js.native
object connectionFromPromisedArraySlice extends js.Object {
  
  def apply[T](dataPromise: js.Promise[js.Array[T]], args: ConnectionArguments, arrayInfo: ArraySliceMetaInfo): js.Promise[Connection[T]] = js.native
}
