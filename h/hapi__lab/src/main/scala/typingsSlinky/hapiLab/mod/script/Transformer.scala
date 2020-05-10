package typingsSlinky.hapiLab.mod.script

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transformer extends js.Object {
  val ext: String = js.native
  def transform(content: String, filename: String): String = js.native
}

object Transformer {
  @scala.inline
  def apply(ext: String, transform: (String, String) => String): Transformer = {
    val __obj = js.Dynamic.literal(ext = ext.asInstanceOf[js.Any], transform = js.Any.fromFunction2(transform))
    __obj.asInstanceOf[Transformer]
  }
  @scala.inline
  implicit class TransformerOps[Self <: Transformer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransform(value: (String, String) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

