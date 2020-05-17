package typingsSlinky.meteor.Blaze

import org.scalajs.dom.raw.Node
import typingsSlinky.meteor.Tracker.Computation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait View extends js.Object {
  var isCreated: Boolean = js.native
  var isDestroyed: Boolean = js.native
  var isRendered: Boolean = js.native
  var name: String = js.native
  var parentView: View = js.native
  var renderCount: Double = js.native
  var template: Template = js.native
  def autorun(runFunc: js.Function1[/* computation */ Computation, Unit]): Computation = js.native
  def firstNode(): Node = js.native
  def lastNode(): Node = js.native
  def onViewCreated(func: js.Function): Unit = js.native
  def onViewDestroyed(func: js.Function): Unit = js.native
  def onViewReady(func: js.Function): Unit = js.native
  def templateInstance(): TemplateInstance = js.native
}

object View {
  @scala.inline
  def apply(
    autorun: js.Function1[/* computation */ Computation, Unit] => Computation,
    firstNode: () => Node,
    isCreated: Boolean,
    isDestroyed: Boolean,
    isRendered: Boolean,
    lastNode: () => Node,
    name: String,
    onViewCreated: js.Function => Unit,
    onViewDestroyed: js.Function => Unit,
    onViewReady: js.Function => Unit,
    parentView: View,
    renderCount: Double,
    template: Template,
    templateInstance: () => TemplateInstance
  ): View = {
    val __obj = js.Dynamic.literal(autorun = js.Any.fromFunction1(autorun), firstNode = js.Any.fromFunction0(firstNode), isCreated = isCreated.asInstanceOf[js.Any], isDestroyed = isDestroyed.asInstanceOf[js.Any], isRendered = isRendered.asInstanceOf[js.Any], lastNode = js.Any.fromFunction0(lastNode), name = name.asInstanceOf[js.Any], onViewCreated = js.Any.fromFunction1(onViewCreated), onViewDestroyed = js.Any.fromFunction1(onViewDestroyed), onViewReady = js.Any.fromFunction1(onViewReady), parentView = parentView.asInstanceOf[js.Any], renderCount = renderCount.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], templateInstance = js.Any.fromFunction0(templateInstance))
    __obj.asInstanceOf[View]
  }
  @scala.inline
  implicit class ViewOps[Self <: View] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutorun(value: js.Function1[/* computation */ Computation, Unit] => Computation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autorun")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFirstNode(value: () => Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstNode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsCreated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCreated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsDestroyed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDestroyed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsRendered(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRendered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastNode(value: () => Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastNode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnViewCreated(value: js.Function => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onViewCreated")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnViewDestroyed(value: js.Function => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onViewDestroyed")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnViewReady(value: js.Function => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onViewReady")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withParentView(value: View): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTemplate(value: Template): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTemplateInstance(value: () => TemplateInstance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateInstance")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

