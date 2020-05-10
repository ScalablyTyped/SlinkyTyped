package typingsSlinky.clownface.mod

import typingsSlinky.clownface.contextMod.Context
import typingsSlinky.rdfJs.mod.DatasetCore
import typingsSlinky.rdfJs.mod.Quad
import typingsSlinky.rdfJs.mod.QuadGraph
import typingsSlinky.rdfJs.mod.Term
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined clownface.clownface.ClownfaceInit<D> & {  term  :T} */
@js.native
trait ClownfaceInitWithTerms[T /* <: Term | js.Array[Term] */, D /* <: DatasetCore[Quad, Quad] */] extends js.Object {
  var _context: js.UndefOr[js.Array[Context[D, Term]]] = js.native
  var dataset: js.UndefOr[D] = js.native
  var graph: js.UndefOr[QuadGraph] = js.native
  var term: T = js.native
}

object ClownfaceInitWithTerms {
  @scala.inline
  def apply[T, D](term: T): ClownfaceInitWithTerms[T, D] = {
    val __obj = js.Dynamic.literal(term = term.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClownfaceInitWithTerms[T, D]]
  }
  @scala.inline
  implicit class ClownfaceInitWithTermsOps[Self[t, d] <: ClownfaceInitWithTerms[t, d], T, D] (val x: Self[T, D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T, D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T, D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T, D]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T, D]) with Other]
    @scala.inline
    def withTerm(value: T): Self[T, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("term")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_context(value: js.Array[Context[D, Term]]): Self[T, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_context: Self[T, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_context")(js.undefined)
        ret
    }
    @scala.inline
    def withDataset(value: D): Self[T, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataset: Self[T, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataset")(js.undefined)
        ret
    }
    @scala.inline
    def withGraph(value: QuadGraph): Self[T, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graph")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGraph: Self[T, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graph")(js.undefined)
        ret
    }
  }
  
}

