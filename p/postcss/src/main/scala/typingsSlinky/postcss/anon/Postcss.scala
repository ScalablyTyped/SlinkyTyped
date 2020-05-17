package typingsSlinky.postcss.anon

import typingsSlinky.postcss.mod.AcceptedPlugin
import typingsSlinky.postcss.mod.Processor
import typingsSlinky.postcss.mod.Result
import typingsSlinky.postcss.mod.Root_
import typingsSlinky.postcss.mod.TransformCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Postcss extends AcceptedPlugin {
  var postcss: TransformCallback | Processor = js.native
}

object Postcss {
  @scala.inline
  def apply(postcss: TransformCallback | Processor): Postcss = {
    val __obj = js.Dynamic.literal(postcss = postcss.asInstanceOf[js.Any])
    __obj.asInstanceOf[Postcss]
  }
  @scala.inline
  implicit class PostcssOps[Self <: Postcss] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPostcssFunction2(value: (/* root */ Root_, /* result */ Result) => js.Promise[js.Any] | js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postcss")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withPostcss(value: TransformCallback | Processor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postcss")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

