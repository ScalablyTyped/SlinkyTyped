package typingsSlinky.javascriptObfuscator.ijavascriptobfsucatorMod

import typingsSlinky.javascriptObfuscator.iobfuscatedcodeMod.IObfuscatedCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IJavaScriptObfuscator extends js.Object {
  /**
    * @param sourceCode
    * @returns IObfuscatedCode
    */
  def obfuscate(sourceCode: String): IObfuscatedCode = js.native
}

object IJavaScriptObfuscator {
  @scala.inline
  def apply(obfuscate: String => IObfuscatedCode): IJavaScriptObfuscator = {
    val __obj = js.Dynamic.literal(obfuscate = js.Any.fromFunction1(obfuscate))
    __obj.asInstanceOf[IJavaScriptObfuscator]
  }
  @scala.inline
  implicit class IJavaScriptObfuscatorOps[Self <: IJavaScriptObfuscator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withObfuscate(value: String => IObfuscatedCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("obfuscate")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

