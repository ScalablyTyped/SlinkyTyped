package typingsSlinky.apolloReactCommon

import slinky.core.ReactComponentClass
import typingsSlinky.apolloReactCommon.apolloConsumerMod.ApolloConsumerProps
import typingsSlinky.apolloReactCommon.apolloContextMod.ApolloContextValue
import typingsSlinky.apolloReactCommon.apolloProviderMod.ApolloProviderProps
import typingsSlinky.apolloReactCommon.parserMod.DocumentType
import typingsSlinky.apolloReactCommon.parserMod.IDocumentDefinition
import typingsSlinky.graphql.astMod.DocumentNode
import typingsSlinky.react.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@apollo/react-common", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val ApolloConsumer: ReactComponentClass[ApolloConsumerProps] = js.native
  
  val ApolloProvider: ReactComponentClass[ApolloProviderProps[js.Any]] = js.native
  
  def getApolloContext(): Context[ApolloContextValue] = js.native
  
  def operationName(`type`: DocumentType): String = js.native
  
  def parser(document: DocumentNode): IDocumentDefinition = js.native
  
  def resetApolloContext(): Unit = js.native
  
  @js.native
  object DocumentType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.apolloReactCommon.parserMod.DocumentType with Double] = js.native
    
    /* 1 */ val Mutation: typingsSlinky.apolloReactCommon.parserMod.DocumentType.Mutation with Double = js.native
    
    /* 0 */ val Query: typingsSlinky.apolloReactCommon.parserMod.DocumentType.Query with Double = js.native
    
    /* 2 */ val Subscription: typingsSlinky.apolloReactCommon.parserMod.DocumentType.Subscription with Double = js.native
  }
}
