package typingsSlinky.gatsby.mod

import typingsSlinky.gatsby.anon.Del
import typingsSlinky.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParentSpanPluginArgs extends NodePluginArgs {
  var parentSpan: js.Object = js.native
}

object ParentSpanPluginArgs {
  @scala.inline
  def apply(
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
    parentSpan: js.Object,
    pathPrefix: String,
    reporter: Reporter,
    schema: NodePluginSchema,
    store: Store,
    tracing: Tracing
  ): ParentSpanPluginArgs = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], boundActionCreators = boundActionCreators.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], createContentDigest = createContentDigest.asInstanceOf[js.Any], createNodeId = createNodeId.asInstanceOf[js.Any], emitter = emitter.asInstanceOf[js.Any], getNode = getNode.asInstanceOf[js.Any], getNodeAndSavePathDependency = getNodeAndSavePathDependency.asInstanceOf[js.Any], getNodes = getNodes.asInstanceOf[js.Any], getNodesByType = getNodesByType.asInstanceOf[js.Any], hasNodeChanged = hasNodeChanged.asInstanceOf[js.Any], loadNodeContent = loadNodeContent.asInstanceOf[js.Any], parentSpan = parentSpan.asInstanceOf[js.Any], pathPrefix = pathPrefix.asInstanceOf[js.Any], reporter = reporter.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any], tracing = tracing.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParentSpanPluginArgs]
  }
  @scala.inline
  implicit class ParentSpanPluginArgsOps[Self <: ParentSpanPluginArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParentSpan(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentSpan")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

