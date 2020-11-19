package typingsSlinky.prismaBinding

import typingsSlinky.apolloLink.mod.ApolloLink
import typingsSlinky.prismaBinding.anon.Debug
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("prisma-binding/dist/link", JSImport.Namespace)
@js.native
object linkMod extends js.Object {
  
  def makePrismaLink(hasEndpointTokenDebug: Debug): ApolloLink = js.native
}
