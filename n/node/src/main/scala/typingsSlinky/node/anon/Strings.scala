package typingsSlinky.node.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Strings extends js.Object {
  /**
    * If set to false any calls to eval or function constructors (Function, GeneratorFunction, etc)
    * will throw an EvalError.
    * @default true
    */
  var strings: js.UndefOr[Boolean] = js.native
  /**
    * If set to false any attempt to compile a WebAssembly module will throw a WebAssembly.CompileError.
    * @default true
    */
  var wasm: js.UndefOr[Boolean] = js.native
}

object Strings {
  @scala.inline
  def apply(): Strings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Strings]
  }
  @scala.inline
  implicit class StringsOps[Self <: Strings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStrings(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strings")(js.undefined)
        ret
    }
    @scala.inline
    def withWasm(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wasm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWasm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wasm")(js.undefined)
        ret
    }
  }
  
}

