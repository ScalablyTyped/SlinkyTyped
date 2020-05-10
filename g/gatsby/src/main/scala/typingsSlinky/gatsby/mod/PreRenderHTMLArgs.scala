package typingsSlinky.gatsby.mod

import slinky.core.TagMod
import typingsSlinky.gatsby.AnonDel
import typingsSlinky.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PreRenderHTMLArgs extends NodePluginArgs {
  def getHeadComponents(): js.Array[TagMod[Any]] = js.native
  def getPostBodyComponents(): js.Array[TagMod[Any]] = js.native
  def getPreBodyComponents(): js.Array[TagMod[Any]] = js.native
  def replaceHeadComponents(comp: js.Array[TagMod[Any]]): Unit = js.native
  def replacePostBodyComponents(comp: js.Array[TagMod[Any]]): Unit = js.native
  def replacePreBodyComponents(comp: js.Array[TagMod[Any]]): Unit = js.native
}

object PreRenderHTMLArgs {
  @scala.inline
  def apply(
    actions: Actions,
    boundActionCreators: Actions,
    cache: AnonDel,
    createContentDigest: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof createContentDigest */ js.Any,
    createNodeId: js.Function,
    emitter: EventEmitter,
    getHeadComponents: () => js.Array[TagMod[Any]],
    getNode: js.Function,
    getNodeAndSavePathDependency: js.Function,
    getNodes: js.Function,
    getNodesByType: js.Function,
    getPostBodyComponents: () => js.Array[TagMod[Any]],
    getPreBodyComponents: () => js.Array[TagMod[Any]],
    hasNodeChanged: js.Function,
    loadNodeContent: js.Function,
    pathPrefix: String,
    replaceHeadComponents: js.Array[TagMod[Any]] => Unit,
    replacePostBodyComponents: js.Array[TagMod[Any]] => Unit,
    replacePreBodyComponents: js.Array[TagMod[Any]] => Unit,
    reporter: Reporter,
    schema: NodePluginSchema,
    store: Store,
    tracing: Tracing
  ): PreRenderHTMLArgs = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], boundActionCreators = boundActionCreators.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], createContentDigest = createContentDigest.asInstanceOf[js.Any], createNodeId = createNodeId.asInstanceOf[js.Any], emitter = emitter.asInstanceOf[js.Any], getHeadComponents = js.Any.fromFunction0(getHeadComponents), getNode = getNode.asInstanceOf[js.Any], getNodeAndSavePathDependency = getNodeAndSavePathDependency.asInstanceOf[js.Any], getNodes = getNodes.asInstanceOf[js.Any], getNodesByType = getNodesByType.asInstanceOf[js.Any], getPostBodyComponents = js.Any.fromFunction0(getPostBodyComponents), getPreBodyComponents = js.Any.fromFunction0(getPreBodyComponents), hasNodeChanged = hasNodeChanged.asInstanceOf[js.Any], loadNodeContent = loadNodeContent.asInstanceOf[js.Any], pathPrefix = pathPrefix.asInstanceOf[js.Any], replaceHeadComponents = js.Any.fromFunction1(replaceHeadComponents), replacePostBodyComponents = js.Any.fromFunction1(replacePostBodyComponents), replacePreBodyComponents = js.Any.fromFunction1(replacePreBodyComponents), reporter = reporter.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any], tracing = tracing.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreRenderHTMLArgs]
  }
  @scala.inline
  implicit class PreRenderHTMLArgsOps[Self <: PreRenderHTMLArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetHeadComponents(value: () => js.Array[TagMod[Any]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHeadComponents")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPostBodyComponents(value: () => js.Array[TagMod[Any]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPostBodyComponents")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPreBodyComponents(value: () => js.Array[TagMod[Any]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPreBodyComponents")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReplaceHeadComponents(value: js.Array[TagMod[Any]] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceHeadComponents")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReplacePostBodyComponents(value: js.Array[TagMod[Any]] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replacePostBodyComponents")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReplacePreBodyComponents(value: js.Array[TagMod[Any]] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replacePreBodyComponents")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

