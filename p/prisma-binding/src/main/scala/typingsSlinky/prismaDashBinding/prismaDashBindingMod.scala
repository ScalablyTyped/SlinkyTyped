package typingsSlinky.prismaDashBinding

import typingsSlinky.apolloDashLink.apolloDashLinkMod.ApolloLink
import typingsSlinky.graphql.typeDefinitionMod.GraphQLResolveInfo
import typingsSlinky.graphqlDashBinding.distTypesMod.FragmentReplacement
import typingsSlinky.graphqlDashTools.distInterfacesMod.IResolvers
import typingsSlinky.prismaDashBinding.distTypesMod.PrismaOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prisma-binding", JSImport.Namespace)
@js.native
object prismaDashBindingMod extends js.Object {
  @js.native
  class Prisma protected ()
    extends typingsSlinky.prismaDashBinding.distPrismaMod.Prisma {
    def this(hasTypeDefsEndpointSecretFragmentReplacementsDebugDisableCache: PrismaOptions) = this()
  }
  
  def extractFragmentReplacements(resolvers: IResolvers[_, _]): js.Array[FragmentReplacement] = js.native
  def forwardTo(bindingName: String): js.Function4[
    /* parent */ js.Any, 
    /* args */ js.Any, 
    /* context */ js.Any, 
    /* info */ GraphQLResolveInfo, 
    _
  ] = js.native
  def makePrismaBindingClass[T](hasTypeDefs: Anon_TypeDefs): T = js.native
  def makePrismaLink(hasEndpointTokenDebug: Anon_Debug): ApolloLink = js.native
}

