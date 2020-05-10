package typingsSlinky.gatsby.mod

import typingsSlinky.gatsby.AnonDel
import typingsSlinky.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WrapPageElementNodeArgs[DataType, PageContextType] extends NodePluginArgs {
  var element: js.Object = js.native
  var pathname: String = js.native
  var props: PageProps[DataType, PageContextType] = js.native
}

object WrapPageElementNodeArgs {
  @scala.inline
  def apply[DataType, PageContextType](
    actions: Actions,
    boundActionCreators: Actions,
    cache: AnonDel,
    createContentDigest: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof createContentDigest */ js.Any,
    createNodeId: js.Function,
    element: js.Object,
    emitter: EventEmitter,
    getNode: js.Function,
    getNodeAndSavePathDependency: js.Function,
    getNodes: js.Function,
    getNodesByType: js.Function,
    hasNodeChanged: js.Function,
    loadNodeContent: js.Function,
    pathPrefix: String,
    pathname: String,
    props: PageProps[DataType, PageContextType],
    reporter: Reporter,
    schema: NodePluginSchema,
    store: Store,
    tracing: Tracing
  ): WrapPageElementNodeArgs[DataType, PageContextType] = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], boundActionCreators = boundActionCreators.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], createContentDigest = createContentDigest.asInstanceOf[js.Any], createNodeId = createNodeId.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], emitter = emitter.asInstanceOf[js.Any], getNode = getNode.asInstanceOf[js.Any], getNodeAndSavePathDependency = getNodeAndSavePathDependency.asInstanceOf[js.Any], getNodes = getNodes.asInstanceOf[js.Any], getNodesByType = getNodesByType.asInstanceOf[js.Any], hasNodeChanged = hasNodeChanged.asInstanceOf[js.Any], loadNodeContent = loadNodeContent.asInstanceOf[js.Any], pathPrefix = pathPrefix.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], reporter = reporter.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any], tracing = tracing.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrapPageElementNodeArgs[DataType, PageContextType]]
  }
  @scala.inline
  implicit class WrapPageElementNodeArgsOps[Self[datatype, pagecontexttype] <: WrapPageElementNodeArgs[datatype, pagecontexttype], DataType, PageContextType] (val x: Self[DataType, PageContextType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[DataType, PageContextType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[DataType, PageContextType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[DataType, PageContextType]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[DataType, PageContextType]) with Other]
    @scala.inline
    def withElement(value: js.Object): Self[DataType, PageContextType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPathname(value: String): Self[DataType, PageContextType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProps(value: PageProps[DataType, PageContextType]): Self[DataType, PageContextType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("props")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

