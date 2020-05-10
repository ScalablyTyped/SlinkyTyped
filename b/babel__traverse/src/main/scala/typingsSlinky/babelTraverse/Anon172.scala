package typingsSlinky.babelTraverse

import typingsSlinky.babelTraverse.babelTraverseStrings.V8IntrinsicIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon172 extends js.Object {
  var `type`: V8IntrinsicIdentifier = js.native
}

object Anon172 {
  @scala.inline
  def apply(`type`: V8IntrinsicIdentifier): Anon172 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon172]
  }
  @scala.inline
  implicit class Anon172Ops[Self <: Anon172] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: V8IntrinsicIdentifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

