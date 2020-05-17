package typingsSlinky.gatsby.mod

import typingsSlinky.gatsby.anon.Del
import typingsSlinky.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePageArgs[TContext] extends ParentSpanPluginArgs {
  var page: Page[TContext] = js.native
  var traceId: String = js.native
}

object CreatePageArgs {
  @scala.inline
  def apply[TContext](
    actions: Actions,
    boundActionCreators: Actions,
    cache: Del,
    createContentDigest: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof createContentDigest */ js.Any,
    createNodeId: js.Function,
    emitter: EventEmitter,
    getNode: js.Function,
    getNodeAndSavePathDependency: js.Function,
    getNodes: js.Function,
    getNodesByType: js.Function,
    hasNodeChanged: js.Function,
    loadNodeContent: js.Function,
    page: Page[TContext],
    parentSpan: js.Object,
    pathPrefix: String,
    reporter: Reporter,
    schema: NodePluginSchema,
    store: Store,
    traceId: String,
    tracing: Tracing
  ): CreatePageArgs[TContext] = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], boundActionCreators = boundActionCreators.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], createContentDigest = createContentDigest.asInstanceOf[js.Any], createNodeId = createNodeId.asInstanceOf[js.Any], emitter = emitter.asInstanceOf[js.Any], getNode = getNode.asInstanceOf[js.Any], getNodeAndSavePathDependency = getNodeAndSavePathDependency.asInstanceOf[js.Any], getNodes = getNodes.asInstanceOf[js.Any], getNodesByType = getNodesByType.asInstanceOf[js.Any], hasNodeChanged = hasNodeChanged.asInstanceOf[js.Any], loadNodeContent = loadNodeContent.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], parentSpan = parentSpan.asInstanceOf[js.Any], pathPrefix = pathPrefix.asInstanceOf[js.Any], reporter = reporter.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any], traceId = traceId.asInstanceOf[js.Any], tracing = tracing.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePageArgs[TContext]]
  }
  @scala.inline
  implicit class CreatePageArgsOps[Self[tcontext] <: CreatePageArgs[tcontext], TContext] (val x: Self[TContext]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TContext] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TContext]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TContext] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TContext] with Other]
    @scala.inline
    def withPage(value: Page[TContext]): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTraceId(value: String): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("traceId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

