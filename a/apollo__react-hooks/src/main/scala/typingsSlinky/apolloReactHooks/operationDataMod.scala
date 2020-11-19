package typingsSlinky.apolloReactHooks

import typingsSlinky.apolloClient.mod.ApolloClient
import typingsSlinky.apolloReactCommon.apolloContextMod.ApolloContextValue
import typingsSlinky.apolloReactCommon.parserMod.DocumentType
import typingsSlinky.apolloReactHooks.anon.Client
import typingsSlinky.apolloReactHooks.typesMod.CommonOptions
import typingsSlinky.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@apollo/react-hooks/lib/data/OperationData", JSImport.Namespace)
@js.native
object operationDataMod extends js.Object {
  
  @js.native
  abstract class OperationData[TOptions] () extends js.Object {
    def this(options: CommonOptions[TOptions]) = this()
    def this(options: js.UndefOr[scala.Nothing], context: ApolloContextValue) = this()
    def this(options: CommonOptions[TOptions], context: ApolloContextValue) = this()
    
    def afterExecute(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: js.Any
    ): Unit | js.Function0[Unit] = js.native
    
    def cleanup(): Unit = js.native
    
    var client: js.UndefOr[ApolloClient[js.Object]] = js.native
    
    var context: ApolloContextValue = js.native
    
    def execute(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: js.Any
    ): js.Any = js.native
    
    def getOptions(): CommonOptions[TOptions] = js.native
    
    var isMounted: Boolean = js.native
    
    var options: js.Any = js.native
    
    var previousOptions: CommonOptions[TOptions] = js.native
    
    /* protected */ def refreshClient(): Client = js.native
    
    def setOptions(newOptions: CommonOptions[TOptions]): Unit = js.native
    def setOptions(newOptions: CommonOptions[TOptions], storePrevious: Boolean): Unit = js.native
    
    /* protected */ def unmount(): Unit = js.native
    
    /* protected */ def verifyDocumentType(document: DocumentNode, `type`: DocumentType): Unit = js.native
  }
}
