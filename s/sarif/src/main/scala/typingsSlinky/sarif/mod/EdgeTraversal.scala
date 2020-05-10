package typingsSlinky.sarif.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EdgeTraversal extends js.Object {
  /**
    * Identifies the edge being traversed.
    */
  var edgeId: String = js.native
  /**
    * The values of relevant expressions after the edge has been traversed.
    */
  var finalState: js.UndefOr[StringDictionary[MultiformatMessageString]] = js.native
  /**
    * A message to display to the user as the edge is traversed.
    */
  var message: js.UndefOr[Message] = js.native
  /**
    * Key/value pairs that provide additional information about the edge traversal.
    */
  var properties: js.UndefOr[PropertyBag] = js.native
  /**
    * The number of edge traversals necessary to return from a nested graph.
    */
  var stepOverEdgeCount: js.UndefOr[Double] = js.native
}

object EdgeTraversal {
  @scala.inline
  def apply(edgeId: String): EdgeTraversal = {
    val __obj = js.Dynamic.literal(edgeId = edgeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EdgeTraversal]
  }
  @scala.inline
  implicit class EdgeTraversalOps[Self <: EdgeTraversal] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEdgeId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFinalState(value: StringDictionary[MultiformatMessageString]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finalState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFinalState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finalState")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: Message): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
    @scala.inline
    def withProperties(value: PropertyBag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(js.undefined)
        ret
    }
    @scala.inline
    def withStepOverEdgeCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepOverEdgeCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStepOverEdgeCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepOverEdgeCount")(js.undefined)
        ret
    }
  }
  
}

