package typingsSlinky.javascriptObfuscator.iobfuscatedcodeMod

import typingsSlinky.javascriptObfuscator.iinitializableMod.IInitializable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IObfuscatedCode
  extends IInitializable[js.Tuple2[String, String]] {
  /**
    * @return {string}
    */
  def getObfuscatedCode(): String = js.native
  /**
    * @return {string}
    */
  def getSourceMap(): String = js.native
}

object IObfuscatedCode {
  @scala.inline
  def apply(
    getObfuscatedCode: () => String,
    getSourceMap: () => String,
    initialize: js.Tuple2[String, String] => Unit
  ): IObfuscatedCode = {
    val __obj = js.Dynamic.literal(getObfuscatedCode = js.Any.fromFunction0(getObfuscatedCode), getSourceMap = js.Any.fromFunction0(getSourceMap), initialize = js.Any.fromFunction1(initialize))
    __obj.asInstanceOf[IObfuscatedCode]
  }
  @scala.inline
  implicit class IObfuscatedCodeOps[Self <: IObfuscatedCode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetObfuscatedCode(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getObfuscatedCode")(js.Any.fromFunction0(value))
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

