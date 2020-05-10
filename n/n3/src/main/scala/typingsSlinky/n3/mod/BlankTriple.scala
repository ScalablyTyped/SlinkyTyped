package typingsSlinky.n3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlankTriple[Q /* <: typingsSlinky.rdfJs.mod.BaseQuad */] extends js.Object {
  var `object`: /* import warning: importer.ImportType#apply Failed type conversion: Q['object'] */ js.Any = js.native
  var predicate: /* import warning: importer.ImportType#apply Failed type conversion: Q['predicate'] */ js.Any = js.native
}

object BlankTriple {
  @scala.inline
  def apply[Q](
    `object`: /* import warning: importer.ImportType#apply Failed type conversion: Q['object'] */ js.Any,
    predicate: /* import warning: importer.ImportType#apply Failed type conversion: Q['predicate'] */ js.Any
  ): BlankTriple[Q] = {
    val __obj = js.Dynamic.literal(predicate = predicate.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlankTriple[Q]]
  }
  @scala.inline
  implicit class BlankTripleOps[Self[q] <: BlankTriple[q], Q] (val x: Self[Q]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Q] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Q]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Q] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Q] with Other]
    @scala.inline
    def withObject(value: /* import warning: importer.ImportType#apply Failed type conversion: Q['object'] */ js.Any): Self[Q] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPredicate(
      value: /* import warning: importer.ImportType#apply Failed type conversion: Q['predicate'] */ js.Any
    ): Self[Q] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("predicate")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

