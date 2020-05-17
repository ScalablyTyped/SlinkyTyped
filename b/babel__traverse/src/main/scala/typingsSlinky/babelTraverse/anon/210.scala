package typingsSlinky.babelTraverse.anon

import typingsSlinky.babelTraverse.babelTraverseStrings.FunctionDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `210` extends js.Object {
  var `type`: FunctionDeclaration = js.native
}

object `210` {
  @scala.inline
  def apply(`type`: FunctionDeclaration): `210` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`210`]
  }
  @scala.inline
  implicit class `210Ops`[Self <: `210`] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: FunctionDeclaration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

