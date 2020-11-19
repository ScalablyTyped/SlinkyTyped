package typingsSlinky.prismaBinding

import typingsSlinky.apolloLink.mod.ApolloLink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("prisma-binding/dist/SharedLink", JSImport.Namespace)
@js.native
object sharedLinkMod extends js.Object {
  
  @js.native
  class SharedLink () extends ApolloLink {
    
    var innerLink: js.Any = js.native
    
    def setInnerLink(innerLink: ApolloLink): Unit = js.native
  }
}
