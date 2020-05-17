package typingsSlinky.angularCompiler.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Key extends js.Object {
  var key: String = js.native
  var quoted: Boolean = js.native
  var value: typingsSlinky.angularCompiler.outputAstMod.Expression = js.native
}

object Key {
  @scala.inline
  def apply(key: String, quoted: Boolean, value: typingsSlinky.angularCompiler.outputAstMod.Expression): Key = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], quoted = quoted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key]
  }
  @scala.inline
  implicit class KeyOps[Self <: Key] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuoted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quoted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: typingsSlinky.angularCompiler.outputAstMod.Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

