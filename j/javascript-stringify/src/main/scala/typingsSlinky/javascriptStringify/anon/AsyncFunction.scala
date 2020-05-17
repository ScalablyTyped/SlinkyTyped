package typingsSlinky.javascriptStringify.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsyncFunction extends js.Object {
  var AsyncFunction: String = js.native
  var AsyncGeneratorFunction: String = js.native
  var Function: String = js.native
  var GeneratorFunction: String = js.native
}

object AsyncFunction {
  @scala.inline
  def apply(AsyncFunction: String, AsyncGeneratorFunction: String, Function: String, GeneratorFunction: String): AsyncFunction = {
    val __obj = js.Dynamic.literal(AsyncFunction = AsyncFunction.asInstanceOf[js.Any], AsyncGeneratorFunction = AsyncGeneratorFunction.asInstanceOf[js.Any], Function = Function.asInstanceOf[js.Any], GeneratorFunction = GeneratorFunction.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncFunction]
  }
  @scala.inline
  implicit class AsyncFunctionOps[Self <: AsyncFunction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAsyncFunction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AsyncFunction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAsyncGeneratorFunction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AsyncGeneratorFunction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFunction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Function")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGeneratorFunction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GeneratorFunction")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

