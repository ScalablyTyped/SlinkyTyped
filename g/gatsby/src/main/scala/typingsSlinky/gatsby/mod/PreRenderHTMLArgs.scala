package typingsSlinky.gatsby.mod

import slinky.core.TagMod
import typingsSlinky.gatsby.AnonDel
import typingsSlinky.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreRenderHTMLArgs extends NodePluginArgs {
  def getHeadComponents(): js.Array[TagMod[Any]]
  def getPostBodyComponents(): js.Array[TagMod[Any]]
  def getPreBodyComponents(): js.Array[TagMod[Any]]
  def replaceHeadComponents(comp: js.Array[TagMod[Any]]): Unit
  def replacePostBodyComponents(comp: js.Array[TagMod[Any]]): Unit
  def replacePreBodyComponents(comp: js.Array[TagMod[Any]]): Unit
}

object PreRenderHTMLArgs {
  @scala.inline
  def apply(
    actions: Actions,
    boundActionCreators: Actions,
    cache: AnonDel,
    createContentDigest: /* input */ js.Any => String,
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
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], boundActionCreators = boundActionCreators.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], createContentDigest = js.Any.fromFunction1(createContentDigest), createNodeId = createNodeId.asInstanceOf[js.Any], emitter = emitter.asInstanceOf[js.Any], getHeadComponents = js.Any.fromFunction0(getHeadComponents), getNode = getNode.asInstanceOf[js.Any], getNodeAndSavePathDependency = getNodeAndSavePathDependency.asInstanceOf[js.Any], getNodes = getNodes.asInstanceOf[js.Any], getNodesByType = getNodesByType.asInstanceOf[js.Any], getPostBodyComponents = js.Any.fromFunction0(getPostBodyComponents), getPreBodyComponents = js.Any.fromFunction0(getPreBodyComponents), hasNodeChanged = hasNodeChanged.asInstanceOf[js.Any], loadNodeContent = loadNodeContent.asInstanceOf[js.Any], pathPrefix = pathPrefix.asInstanceOf[js.Any], replaceHeadComponents = js.Any.fromFunction1(replaceHeadComponents), replacePostBodyComponents = js.Any.fromFunction1(replacePostBodyComponents), replacePreBodyComponents = js.Any.fromFunction1(replacePreBodyComponents), reporter = reporter.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any], tracing = tracing.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PreRenderHTMLArgs]
  }
}

