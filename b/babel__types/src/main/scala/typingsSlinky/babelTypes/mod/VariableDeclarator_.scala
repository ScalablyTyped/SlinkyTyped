package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.VariableDeclarator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VariableDeclarator_
  extends BaseNode
     with Node {
  var definite: Boolean | Null = js.native
  var id: LVal = js.native
  var init: Expression | Null = js.native
  @JSName("type")
  var type_VariableDeclarator_ : VariableDeclarator = js.native
}

object VariableDeclarator_ {
  @scala.inline
  def apply(id: LVal, `type`: VariableDeclarator): VariableDeclarator_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariableDeclarator_]
  }
  @scala.inline
  implicit class VariableDeclarator_Ops[Self <: VariableDeclarator_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: LVal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: VariableDeclarator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefinite(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefiniteNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definite")(null)
        ret
    }
    @scala.inline
    def withInit(value: Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(null)
        ret
    }
  }
  
}

