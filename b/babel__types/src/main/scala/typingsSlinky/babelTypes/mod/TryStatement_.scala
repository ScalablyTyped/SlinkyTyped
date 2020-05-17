package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.TryStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.babelTypes.mod.Node because Already inherited */ @js.native
trait TryStatement_
  extends Statement
     with BaseNode {
  var block: js.Any = js.native
  var finalizer: BlockStatement_ | Null = js.native
  var handler: CatchClause_ | Null = js.native
  @JSName("type")
  var type_TryStatement_ : TryStatement = js.native
}

object TryStatement_ {
  @scala.inline
  def apply(block: js.Any, `type`: TryStatement): TryStatement_ = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TryStatement_]
  }
  @scala.inline
  implicit class TryStatement_Ops[Self <: TryStatement_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlock(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("block")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: TryStatement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFinalizer(value: BlockStatement_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finalizer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFinalizerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finalizer")(null)
        ret
    }
    @scala.inline
    def withHandler(value: CatchClause_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHandlerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handler")(null)
        ret
    }
  }
  
}

