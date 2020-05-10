package typingsSlinky.sarif.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphTraversal extends js.Object {
  /**
    * A description of this graph traversal.
    */
  var description: js.UndefOr[Message] = js.native
  /**
    * The sequences of edges traversed by this graph traversal.
    */
  var edgeTraversals: js.UndefOr[js.Array[EdgeTraversal]] = js.native
  /**
    * Values of relevant expressions at the start of the graph traversal that remain constant for the graph traversal.
    */
  var immutableState: js.UndefOr[StringDictionary[MultiformatMessageString]] = js.native
  /**
    * Values of relevant expressions at the start of the graph traversal that may change during graph traversal.
    */
  var initialState: js.UndefOr[StringDictionary[MultiformatMessageString]] = js.native
  /**
    * Key/value pairs that provide additional information about the graph traversal.
    */
  var properties: js.UndefOr[PropertyBag] = js.native
  /**
    * The index within the result.graphs to be associated with the result.
    */
  var resultGraphIndex: js.UndefOr[Double] = js.native
  /**
    * The index within the run.graphs to be associated with the result.
    */
  var runGraphIndex: js.UndefOr[Double] = js.native
}

object GraphTraversal {
  @scala.inline
  def apply(): GraphTraversal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GraphTraversal]
  }
  @scala.inline
  implicit class GraphTraversalOps[Self <: GraphTraversal] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: Message): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withEdgeTraversals(value: js.Array[EdgeTraversal]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeTraversals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEdgeTraversals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeTraversals")(js.undefined)
        ret
    }
    @scala.inline
    def withImmutableState(value: StringDictionary[MultiformatMessageString]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("immutableState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImmutableState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("immutableState")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialState(value: StringDictionary[MultiformatMessageString]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialState")(js.undefined)
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
    def withResultGraphIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultGraphIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResultGraphIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultGraphIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withRunGraphIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runGraphIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRunGraphIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runGraphIndex")(js.undefined)
        ret
    }
  }
  
}

