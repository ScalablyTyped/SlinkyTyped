package typingsSlinky.ariaQuery.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ARIARoleRelation extends js.Object {
  var concept: js.UndefOr[ARIARoleRelationConcept] = js.native
  var module: js.UndefOr[String] = js.native
}

object ARIARoleRelation {
  @scala.inline
  def apply(): ARIARoleRelation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ARIARoleRelation]
  }
  @scala.inline
  implicit class ARIARoleRelationOps[Self <: ARIARoleRelation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConcept(value: ARIARoleRelationConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("concept")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConcept: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("concept")(js.undefined)
        ret
    }
    @scala.inline
    def withModule(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("module")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("module")(js.undefined)
        ret
    }
  }
  
}

