package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.TryStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TryStatement_
  extends Node
     with Statement {
  var block: BlockStatement_ = js.native
  var finalizer: BlockStatement_ = js.native
  var handler: CatchClause_ = js.native
  @JSName("type")
  var type_TryStatement_ : TryStatement = js.native
}

object TryStatement_ {
  @scala.inline
  def apply(
    block: BlockStatement_,
    end: Double,
    finalizer: BlockStatement_,
    handler: CatchClause_,
    loc: SourceLocation,
    start: Double,
    `type`: TryStatement
  ): TryStatement_ = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], finalizer = finalizer.asInstanceOf[js.Any], handler = handler.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
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
    def withBlock(value: BlockStatement_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("block")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFinalizer(value: BlockStatement_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finalizer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHandler(value: CatchClause_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: TryStatement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

