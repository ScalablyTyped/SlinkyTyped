package typingsSlinky.clownface.mod

import typingsSlinky.clownface.contextMod.Context
import typingsSlinky.rdfJs.mod.DatasetCore
import typingsSlinky.rdfJs.mod.Quad
import typingsSlinky.rdfJs.mod.QuadGraph
import typingsSlinky.rdfJs.mod.Term
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined clownface.clownface.ClownfaceInit<D> & {  term :T} */
@js.native
trait ClownfaceInitWithTerms[T /* <: Term | js.Array[Term] */, D /* <: DatasetCore[Quad, Quad] */] extends js.Object {
  var _context: js.UndefOr[js.Array[Context[D, Term]]] = js.native
  var dataset: js.UndefOr[D] = js.native
  var graph: js.UndefOr[QuadGraph] = js.native
  var term: T = js.native
}

object ClownfaceInitWithTerms {
  @scala.inline
  def apply[/* <: typingsSlinky.rdfJs.mod.Term | js.Array[typingsSlinky.rdfJs.mod.Term] */ T, /* <: typingsSlinky.rdfJs.mod.DatasetCore[typingsSlinky.rdfJs.mod.Quad, typingsSlinky.rdfJs.mod.Quad] */ D](term: T): ClownfaceInitWithTerms[T, D] = {
    val __obj = js.Dynamic.literal(term = term.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClownfaceInitWithTerms[T, D]]
  }
  @scala.inline
  implicit class ClownfaceInitWithTermsOps[Self <: ClownfaceInitWithTerms[_, _], /* <: typingsSlinky.rdfJs.mod.Term | js.Array[typingsSlinky.rdfJs.mod.Term] */ T, /* <: typingsSlinky.rdfJs.mod.DatasetCore[typingsSlinky.rdfJs.mod.Quad, typingsSlinky.rdfJs.mod.Quad] */ D] (val x: Self with (ClownfaceInitWithTerms[T, D])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTerm(value: T): Self = this.set("term", value.asInstanceOf[js.Any])
    @scala.inline
    def set_contextVarargs(value: (Context[D, Term])*): Self = this.set("_context", js.Array(value :_*))
    @scala.inline
    def set_context(value: js.Array[Context[D, Term]]): Self = this.set("_context", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_context: Self = this.set("_context", js.undefined)
    @scala.inline
    def setDataset(value: D): Self = this.set("dataset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataset: Self = this.set("dataset", js.undefined)
    @scala.inline
    def setGraph(value: QuadGraph): Self = this.set("graph", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGraph: Self = this.set("graph", js.undefined)
  }
  
}

