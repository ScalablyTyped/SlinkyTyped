package typingsSlinky.gatsby.mod

import org.scalajs.dom.raw.HTMLBodyElement
import org.scalajs.dom.raw.HTMLHtmlElement
import slinky.core.TagMod
import typingsSlinky.gatsby.anon.Del
import typingsSlinky.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderBodyArgs extends NodePluginArgs {
  var pathname: String = js.native
  var setBodyProps: js.Function = js.native
  def setBodyAttributes(attr: ReactProps[HTMLBodyElement]): Unit = js.native
  def setHeadComponents(comp: js.Array[TagMod[Any]]): Unit = js.native
  def setHtmlAttributes(attr: ReactProps[HTMLHtmlElement]): Unit = js.native
  def setPostBodyComponents(comp: js.Array[TagMod[Any]]): Unit = js.native
  def setPreBodyComponents(comp: js.Array[TagMod[Any]]): Unit = js.native
}

object RenderBodyArgs {
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
    pathPrefix: String,
    pathname: String,
    reporter: Reporter,
    schema: NodePluginSchema,
    setBodyAttributes: ReactProps[HTMLBodyElement] => Unit,
    setBodyProps: js.Function,
    setHeadComponents: js.Array[TagMod[Any]] => Unit,
    setHtmlAttributes: ReactProps[HTMLHtmlElement] => Unit,
    setPostBodyComponents: js.Array[TagMod[Any]] => Unit,
    setPreBodyComponents: js.Array[TagMod[Any]] => Unit,
    store: Store,
    tracing: Tracing
  ): RenderBodyArgs = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], boundActionCreators = boundActionCreators.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], createContentDigest = createContentDigest.asInstanceOf[js.Any], createNodeId = createNodeId.asInstanceOf[js.Any], emitter = emitter.asInstanceOf[js.Any], getNode = getNode.asInstanceOf[js.Any], getNodeAndSavePathDependency = getNodeAndSavePathDependency.asInstanceOf[js.Any], getNodes = getNodes.asInstanceOf[js.Any], getNodesByType = getNodesByType.asInstanceOf[js.Any], hasNodeChanged = hasNodeChanged.asInstanceOf[js.Any], loadNodeContent = loadNodeContent.asInstanceOf[js.Any], pathPrefix = pathPrefix.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], reporter = reporter.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], setBodyAttributes = js.Any.fromFunction1(setBodyAttributes), setBodyProps = setBodyProps.asInstanceOf[js.Any], setHeadComponents = js.Any.fromFunction1(setHeadComponents), setHtmlAttributes = js.Any.fromFunction1(setHtmlAttributes), setPostBodyComponents = js.Any.fromFunction1(setPostBodyComponents), setPreBodyComponents = js.Any.fromFunction1(setPreBodyComponents), store = store.asInstanceOf[js.Any], tracing = tracing.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderBodyArgs]
  }
  @scala.inline
  implicit class RenderBodyArgsOps[Self <: RenderBodyArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPathname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetBodyAttributes(value: ReactProps[HTMLBodyElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBodyAttributes")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetBodyProps(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBodyProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetHeadComponents(value: js.Array[TagMod[Any]] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHeadComponents")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetHtmlAttributes(value: ReactProps[HTMLHtmlElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHtmlAttributes")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetPostBodyComponents(value: js.Array[TagMod[Any]] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPostBodyComponents")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetPreBodyComponents(value: js.Array[TagMod[Any]] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPreBodyComponents")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

