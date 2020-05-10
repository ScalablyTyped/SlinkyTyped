package typingsSlinky.javascriptObfuscator.icalleedataextractorMod

import org.scalajs.dom.raw.Node
import typingsSlinky.javascriptObfuscator.icalleedataMod.ICalleeData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICalleeDataExtractor extends js.Object {
  /**
    * @param blockScopeBody
    * @param callee
    * @returns ICalleeData|null
    */
  def extract(blockScopeBody: js.Array[Node], callee: Node): ICalleeData | Null = js.native
}

object ICalleeDataExtractor {
  @scala.inline
  def apply(extract: (js.Array[Node], Node) => ICalleeData | Null): ICalleeDataExtractor = {
    val __obj = js.Dynamic.literal(extract = js.Any.fromFunction2(extract))
    __obj.asInstanceOf[ICalleeDataExtractor]
  }
  @scala.inline
  implicit class ICalleeDataExtractorOps[Self <: ICalleeDataExtractor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtract(value: (js.Array[Node], Node) => ICalleeData | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extract")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

