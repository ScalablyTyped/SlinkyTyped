package typingsSlinky.prismaBinding

import typingsSlinky.apolloLink.mod.ApolloLink
import typingsSlinky.graphql.definitionMod.GraphQLResolveInfo
import typingsSlinky.graphqlBinding.distTypesMod.FragmentReplacement
import typingsSlinky.graphqlTools.interfacesMod.IResolvers
import typingsSlinky.prismaBinding.anon.Debug
import typingsSlinky.prismaBinding.anon.TypeDefs
import typingsSlinky.prismaBinding.typesMod.PrismaOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prisma-binding", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Prisma protected ()
    extends typingsSlinky.prismaBinding.prismaMod.Prisma {
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
  def makePrismaBindingClass[T](hasTypeDefs: TypeDefs): T = js.native
  def makePrismaLink(hasEndpointTokenDebug: Debug): ApolloLink = js.native
}

