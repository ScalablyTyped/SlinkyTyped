package typingsSlinky.clownface.contextMod

import typingsSlinky.rdfJs.mod.DatasetCore
import typingsSlinky.rdfJs.mod.Quad
import typingsSlinky.rdfJs.mod.QuadGraph
import typingsSlinky.rdfJs.mod.Term
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line no-unnecessary-class
@js.native
trait Context[D /* <: DatasetCore[Quad, Quad] */, T /* <: Term */] extends js.Object {
  var dataset: D = js.native
  var graph: js.UndefOr[QuadGraph] = js.native
  var term: T = js.native
}

object Context {
  @scala.inline
  def apply[D, T](dataset: D, term: T): Context[D, T] = {
    val __obj = js.Dynamic.literal(dataset = dataset.asInstanceOf[js.Any], term = term.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context[D, T]]
  }
  @scala.inline
  implicit class ContextOps[Self[d, t] <: Context[d, t], D, T] (val x: Self[D, T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[D, T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[D, T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[D, T]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[D, T]) with Other]
    @scala.inline
    def withDataset(value: D): Self[D, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTerm(value: T): Self[D, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("term")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGraph(value: QuadGraph): Self[D, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graph")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGraph: Self[D, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graph")(js.undefined)
        ret
    }
  }
  
}

