package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.ForOfStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.babelTypes.mod.Node because Already inherited */ @js.native
trait ForOfStatement_
  extends BlockParent
     with BaseNode
     with For
     with ForXStatement
     with Loop
     with Scopable
     with Statement {
  var await: Boolean = js.native
  var body: Statement = js.native
  var left: VariableDeclaration_ | LVal = js.native
  var right: Expression = js.native
  @JSName("type")
  var type_ForOfStatement_ : ForOfStatement = js.native
}

object ForOfStatement_ {
  @scala.inline
  def apply(
    await: Boolean,
    body: Statement,
    left: VariableDeclaration_ | LVal,
    right: Expression,
    `type`: ForOfStatement
  ): ForOfStatement_ = {
    val __obj = js.Dynamic.literal(await = await.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForOfStatement_]
  }
  @scala.inline
  implicit class ForOfStatement_Ops[Self <: ForOfStatement_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAwait(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("await")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBody(value: Statement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeft(value: VariableDeclaration_ | LVal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRight(value: Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: ForOfStatement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

