package typingsSlinky.apolloEngineReporting

import typingsSlinky.apolloEngineReporting.anon.Logger
import typingsSlinky.apolloEngineReportingProtobuf.mod.Trace
import typingsSlinky.graphql.definitionMod.GraphQLResolveInfo
import typingsSlinky.graphql.mod.GraphQLError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-engine-reporting/dist/treeBuilder", JSImport.Namespace)
@js.native
object treeBuilderMod extends js.Object {
  
  @js.native
  class EngineReportingTreeBuilder protected () extends js.Object {
    def this(options: Logger) = this()
    
    var addProtobufError: js.Any = js.native
    
    def didEncounterErrors(errors: js.Array[GraphQLError]): Unit = js.native
    
    var ensureParentNode: js.Any = js.native
    
    var logger: js.Any = js.native
    
    var newNode: js.Any = js.native
    
    var nodes: js.Any = js.native
    
    var rewriteAndNormalizeError: js.Any = js.native
    
    var rewriteError: js.Any = js.native
    
    var rootNode: js.Any = js.native
    
    var startHrTime: js.UndefOr[js.Tuple2[Double, Double]] = js.native
    
    def startTiming(): Unit = js.native
    
    def stopTiming(): Unit = js.native
    
    var stopped: js.Any = js.native
    
    var trace: Trace = js.native
    
    def willResolveField(info: GraphQLResolveInfo): js.Function0[Unit] = js.native
  }
}
