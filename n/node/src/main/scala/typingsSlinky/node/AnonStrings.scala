package typingsSlinky.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonStrings extends js.Object {
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

object AnonStrings {
  @scala.inline
  def apply(): AnonStrings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonStrings]
  }
  @scala.inline
  implicit class AnonStringsOps[Self <: AnonStrings] (val x: Self) extends AnyVal {
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

