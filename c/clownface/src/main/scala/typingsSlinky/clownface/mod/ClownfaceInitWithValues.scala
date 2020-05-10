package typingsSlinky.clownface.mod

import typingsSlinky.clownface.contextMod.Context
import typingsSlinky.rdfJs.mod.DatasetCore
import typingsSlinky.rdfJs.mod.Quad
import typingsSlinky.rdfJs.mod.QuadGraph
import typingsSlinky.rdfJs.mod.Term
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined clownface.clownface.ClownfaceInit<D> & {  value  :std.Array<string>} */
@js.native
trait ClownfaceInitWithValues[D /* <: DatasetCore[Quad, Quad] */] extends js.Object {
  var _context: js.UndefOr[js.Array[Context[D, Term]]] = js.native
  var dataset: js.UndefOr[D] = js.native
  var graph: js.UndefOr[QuadGraph] = js.native
  var value: js.Array[String] = js.native
}

object ClownfaceInitWithValues {
  @scala.inline
  def apply[D](value: js.Array[String]): ClownfaceInitWithValues[D] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClownfaceInitWithValues[D]]
  }
  @scala.inline
  implicit class ClownfaceInitWithValuesOps[Self[d] <: ClownfaceInitWithValues[d], D] (val x: Self[D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[D] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[D] with Other]
    @scala.inline
    def withValue(value: js.Array[String]): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_context(value: js.Array[Context[D, Term]]): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_context: Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_context")(js.undefined)
        ret
    }
    @scala.inline
    def withDataset(value: D): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataset: Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataset")(js.undefined)
        ret
    }
    @scala.inline
    def withGraph(value: QuadGraph): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graph")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGraph: Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graph")(js.undefined)
        ret
    }
  }
  
}

