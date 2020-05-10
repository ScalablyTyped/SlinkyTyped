package typingsSlinky.less.Less_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PreProcessor extends js.Object {
  def process(src: String, extra: PreProcessorExtraInfo): String = js.native
}

object PreProcessor {
  @scala.inline
  def apply(process: (String, PreProcessorExtraInfo) => String): PreProcessor = {
    val __obj = js.Dynamic.literal(process = js.Any.fromFunction2(process))
    __obj.asInstanceOf[PreProcessor]
  }
  @scala.inline
  implicit class PreProcessorOps[Self <: PreProcessor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProcess(value: (String, PreProcessorExtraInfo) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("process")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

