package typingsSlinky.jointjs.mod.Vectorizer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QualifiedAttribute extends js.Object {
  var local: String = js.native
  var ns: String | Null = js.native
}

object QualifiedAttribute {
  @scala.inline
  def apply(local: String): QualifiedAttribute = {
    val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any])
    __obj.asInstanceOf[QualifiedAttribute]
  }
  @scala.inline
  implicit class QualifiedAttributeOps[Self <: QualifiedAttribute] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("local")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ns")(null)
        ret
    }
  }
  
}

