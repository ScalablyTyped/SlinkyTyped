package typingsSlinky.ejson.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StringifyOptions extends js.Object {
  var canonical: Boolean = js.native
  var indent: Boolean | Double | String = js.native
}

object StringifyOptions {
  @scala.inline
  def apply(canonical: Boolean, indent: Boolean | Double | String): StringifyOptions = {
    val __obj = js.Dynamic.literal(canonical = canonical.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringifyOptions]
  }
  @scala.inline
  implicit class StringifyOptionsOps[Self <: StringifyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanonical(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canonical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndent(value: Boolean | Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indent")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

