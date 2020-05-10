package typingsSlinky.javascriptObfuscator.ianalyzerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAnalyzer[T] extends js.Object {
  /**
    * @param {Program} astTree
    * @returns {T[]}
    */
  def analyze(
    astTree: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ESTree.Program */ js.Any
  ): js.Array[T] = js.native
}

object IAnalyzer {
  @scala.inline
  def apply[T](
    analyze: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ESTree.Program */ js.Any => js.Array[T]
  ): IAnalyzer[T] = {
    val __obj = js.Dynamic.literal(analyze = js.Any.fromFunction1(analyze))
    __obj.asInstanceOf[IAnalyzer[T]]
  }
  @scala.inline
  implicit class IAnalyzerOps[Self[t] <: IAnalyzer[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withAnalyze(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ESTree.Program */ js.Any => js.Array[T]
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("analyze")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

