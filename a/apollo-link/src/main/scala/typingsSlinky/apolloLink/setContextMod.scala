package typingsSlinky.apolloLink

import typingsSlinky.apolloLink.linkMod.ApolloLink
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-link/lib/test-utils/setContext", JSImport.Namespace)
@js.native
object setContextMod extends js.Object {
  
  @js.native
  trait SetContextLink extends ApolloLink {
    
    var setContext: js.Any = js.native
  }
  
  @js.native
  class default () extends SetContextLink {
    def this(setContext: js.Function1[/* context */ Record[String, _], Record[String, _]]) = this()
  }
}
