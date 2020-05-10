package typingsSlinky.javascriptObfuscator.isourcecodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISourceCode extends js.Object {
  /**
    * @returns string
    */
  def getSourceCode(): String = js.native
  /**
    * @returns string
    */
  def getSourceMap(): String = js.native
}

object ISourceCode {
  @scala.inline
  def apply(getSourceCode: () => String, getSourceMap: () => String): ISourceCode = {
    val __obj = js.Dynamic.literal(getSourceCode = js.Any.fromFunction0(getSourceCode), getSourceMap = js.Any.fromFunction0(getSourceMap))
    __obj.asInstanceOf[ISourceCode]
  }
  @scala.inline
  implicit class ISourceCodeOps[Self <: ISourceCode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetSourceCode(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSourceCode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSourceMap(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSourceMap")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

