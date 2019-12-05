package typingsSlinky.atApolloReactDashCommon

import slinky.core.ReactComponentClass
import typingsSlinky.atApolloReactDashCommon.libContextApolloConsumerMod.ApolloConsumerProps
import typingsSlinky.atApolloReactDashCommon.libContextApolloContextMod.ApolloContextValue
import typingsSlinky.atApolloReactDashCommon.libContextApolloProviderMod.ApolloProviderProps
import typingsSlinky.atApolloReactDashCommon.libParserParserMod.DocumentType
import typingsSlinky.atApolloReactDashCommon.libParserParserMod.IDocumentDefinition
import typingsSlinky.graphql.languageAstMod.DocumentNode
import typingsSlinky.react.reactMod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@apollo/react-common", JSImport.Namespace)
@js.native
object atApolloReactDashCommonMod extends js.Object {
  val ApolloConsumer: ReactComponentClass[ApolloConsumerProps] = js.native
  val ApolloProvider: ReactComponentClass[ApolloProviderProps[js.Any]] = js.native
  def getApolloContext(): Context[ApolloContextValue] = js.native
  def operationName(`type`: DocumentType): js.UndefOr[String] = js.native
  def parser(document: DocumentNode): IDocumentDefinition = js.native
  def resetApolloContext(): Unit = js.native
  @js.native
  object DocumentType extends js.Object {
    /* 1 */ val Mutation: typingsSlinky.atApolloReactDashCommon.libParserParserMod.DocumentType.Mutation with Double = js.native
    /* 0 */ val Query: typingsSlinky.atApolloReactDashCommon.libParserParserMod.DocumentType.Query with Double = js.native
    /* 2 */ val Subscription: typingsSlinky.atApolloReactDashCommon.libParserParserMod.DocumentType.Subscription with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.atApolloReactDashCommon.libParserParserMod.DocumentType with Double
      ] = js.native
  }
  
}

