package typingsSlinky.gatsby.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.gatsby.gatsbyStrings.`initial-createPagesStatefully`
import typingsSlinky.gatsby.mod.Actions
import typingsSlinky.gatsby.mod.NodePluginSchema
import typingsSlinky.gatsby.mod.Reporter
import typingsSlinky.gatsby.mod.Store
import typingsSlinky.gatsby.mod.Tracing
import typingsSlinky.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined gatsby.gatsby.CreatePagesArgs & {  traceId  :'initial-createPagesStatefully'} */
@js.native
trait CreatePagesArgstraceIdiniDictkey
  extends /* key */ StringDictionary[js.Any] {
  var actions: Actions = js.native
  var boundActionCreators: Actions = js.native
  var cache: Del = js.native
  var createContentDigest: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof createContentDigest */ js.Any = js.native
  var createNodeId: js.Function = js.native
  var emitter: EventEmitter = js.native
  var getNode: js.Function = js.native
  var getNodeAndSavePathDependency: js.Function = js.native
  var getNodes: js.Function = js.native
  var getNodesByType: js.Function = js.native
  var hasNodeChanged: js.Function = js.native
  var loadNodeContent: js.Function = js.native
  var parentSpan: js.Object = js.native
  var pathPrefix: String = js.native
  var reporter: Reporter = js.native
  var schema: NodePluginSchema = js.native
  var store: Store = js.native
  var traceId: String with `initial-createPagesStatefully` = js.native
  var tracing: Tracing = js.native
  var waitForCascadingActions: Boolean = js.native
  def graphql[TData, TVariables](query: String): js.Promise[Errors[TData]] = js.native
  def graphql[TData, TVariables](query: String, variables: TVariables): js.Promise[Errors[TData]] = js.native
}

