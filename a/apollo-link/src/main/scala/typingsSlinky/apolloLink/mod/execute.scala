package typingsSlinky.apolloLink.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.apolloLink.typesMod.FetchResult
import typingsSlinky.apolloLink.typesMod.GraphQLRequest
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-link", "execute")
@js.native
object execute extends js.Object {
  def apply(link: typingsSlinky.apolloLink.linkMod.ApolloLink, operation: GraphQLRequest): typingsSlinky.zenObservableTs.zenObservableMod.Observable[FetchResult[StringDictionary[_], Record[String, _], Record[String, _]]] = js.native
}

