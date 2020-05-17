package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.V8IntrinsicIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait V8IntrinsicIdentifier_
  extends BaseNode
     with Node {
  var name: String = js.native
  @JSName("type")
  var type_V8IntrinsicIdentifier_ : V8IntrinsicIdentifier = js.native
}

object V8IntrinsicIdentifier_ {
  @scala.inline
  def apply(name: String, `type`: V8IntrinsicIdentifier): V8IntrinsicIdentifier_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[V8IntrinsicIdentifier_]
  }
  @scala.inline
  implicit class V8IntrinsicIdentifier_Ops[Self <: V8IntrinsicIdentifier_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: V8IntrinsicIdentifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

