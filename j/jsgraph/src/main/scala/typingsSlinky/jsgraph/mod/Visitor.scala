package typingsSlinky.jsgraph.mod

import typingsSlinky.jsgraph.anon.E
import typingsSlinky.jsgraph.anon.G
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Visitor extends js.Object {
  def blackTarget(req: E): Unit = js.native
  def discoverVertex(req: G): Unit = js.native
  def examineEdge(req: E): Unit = js.native
  def examineVertex(req: G): Unit = js.native
  def finishVertex(req: G): Unit = js.native
  def grayTarget(req: E): Unit = js.native
  def initializeVertex(req: G): Unit = js.native
  def nonTreeEdge(req: E): Unit = js.native
  def startVertex(req: G): Unit = js.native
}

object Visitor {
  @scala.inline
  def apply(
    blackTarget: E => Unit,
    discoverVertex: G => Unit,
    examineEdge: E => Unit,
    examineVertex: G => Unit,
    finishVertex: G => Unit,
    grayTarget: E => Unit,
    initializeVertex: G => Unit,
    nonTreeEdge: E => Unit,
    startVertex: G => Unit
  ): Visitor = {
    val __obj = js.Dynamic.literal(blackTarget = js.Any.fromFunction1(blackTarget), discoverVertex = js.Any.fromFunction1(discoverVertex), examineEdge = js.Any.fromFunction1(examineEdge), examineVertex = js.Any.fromFunction1(examineVertex), finishVertex = js.Any.fromFunction1(finishVertex), grayTarget = js.Any.fromFunction1(grayTarget), initializeVertex = js.Any.fromFunction1(initializeVertex), nonTreeEdge = js.Any.fromFunction1(nonTreeEdge), startVertex = js.Any.fromFunction1(startVertex))
    __obj.asInstanceOf[Visitor]
  }
  @scala.inline
  implicit class VisitorOps[Self <: Visitor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlackTarget(value: E => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blackTarget")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDiscoverVertex(value: G => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discoverVertex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withExamineEdge(value: E => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("examineEdge")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withExamineVertex(value: G => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("examineVertex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFinishVertex(value: G => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finishVertex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGrayTarget(value: E => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grayTarget")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInitializeVertex(value: G => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initializeVertex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNonTreeEdge(value: E => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonTreeEdge")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStartVertex(value: G => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startVertex")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

