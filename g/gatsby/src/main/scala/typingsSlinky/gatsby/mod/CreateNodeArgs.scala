package typingsSlinky.gatsby.mod

import typingsSlinky.gatsby.AnonDel
import typingsSlinky.gatsby.AnonNodeId
import typingsSlinky.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateNodeArgs[TNode /* <: js.Object */] extends ParentSpanPluginArgs {
  var node: Node with TNode = js.native
  var traceId: String = js.native
  var traceTags: AnonNodeId = js.native
}

object CreateNodeArgs {
  @scala.inline
  def apply[TNode](
    actions: Actions,
    boundActionCreators: Actions,
    cache: AnonDel,
    createContentDigest: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof createContentDigest */ js.Any,
    createNodeId: js.Function,
    emitter: EventEmitter,
    getNode: js.Function,
    getNodeAndSavePathDependency: js.Function,
    getNodes: js.Function,
    getNodesByType: js.Function,
    hasNodeChanged: js.Function,
    loadNodeContent: js.Function,
    node: Node with TNode,
    parentSpan: js.Object,
    pathPrefix: String,
    reporter: Reporter,
    schema: NodePluginSchema,
    store: Store,
    traceId: String,
    traceTags: AnonNodeId,
    tracing: Tracing
  ): CreateNodeArgs[TNode] = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], boundActionCreators = boundActionCreators.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], createContentDigest = createContentDigest.asInstanceOf[js.Any], createNodeId = createNodeId.asInstanceOf[js.Any], emitter = emitter.asInstanceOf[js.Any], getNode = getNode.asInstanceOf[js.Any], getNodeAndSavePathDependency = getNodeAndSavePathDependency.asInstanceOf[js.Any], getNodes = getNodes.asInstanceOf[js.Any], getNodesByType = getNodesByType.asInstanceOf[js.Any], hasNodeChanged = hasNodeChanged.asInstanceOf[js.Any], loadNodeContent = loadNodeContent.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], parentSpan = parentSpan.asInstanceOf[js.Any], pathPrefix = pathPrefix.asInstanceOf[js.Any], reporter = reporter.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any], traceId = traceId.asInstanceOf[js.Any], traceTags = traceTags.asInstanceOf[js.Any], tracing = tracing.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateNodeArgs[TNode]]
  }
  @scala.inline
  implicit class CreateNodeArgsOps[Self[tnode] <: CreateNodeArgs[tnode], TNode] (val x: Self[TNode]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TNode] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TNode]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TNode] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TNode] with Other]
    @scala.inline
    def withNode(value: Node with TNode): Self[TNode] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTraceId(value: String): Self[TNode] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("traceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTraceTags(value: AnonNodeId): Self[TNode] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("traceTags")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

