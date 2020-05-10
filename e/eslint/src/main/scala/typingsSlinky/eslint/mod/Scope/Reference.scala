package typingsSlinky.eslint.mod.Scope

import typingsSlinky.estree.mod.Identifier
import typingsSlinky.estree.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Reference extends js.Object {
  var from: typingsSlinky.eslint.mod.Scope.Scope = js.native
  var identifier: Identifier = js.native
  var init: Boolean = js.native
  var resolved: Variable | Null = js.native
  var writeExpr: Node | Null = js.native
  def isRead(): Boolean = js.native
  def isReadOnly(): Boolean = js.native
  def isReadWrite(): Boolean = js.native
  def isWrite(): Boolean = js.native
  def isWriteOnly(): Boolean = js.native
}

object Reference {
  @scala.inline
  def apply(
    from: typingsSlinky.eslint.mod.Scope.Scope,
    identifier: Identifier,
    init: Boolean,
    isRead: () => Boolean,
    isReadOnly: () => Boolean,
    isReadWrite: () => Boolean,
    isWrite: () => Boolean,
    isWriteOnly: () => Boolean
  ): Reference = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], isRead = js.Any.fromFunction0(isRead), isReadOnly = js.Any.fromFunction0(isReadOnly), isReadWrite = js.Any.fromFunction0(isReadWrite), isWrite = js.Any.fromFunction0(isWrite), isWriteOnly = js.Any.fromFunction0(isWriteOnly))
    __obj.asInstanceOf[Reference]
  }
  @scala.inline
  implicit class ReferenceOps[Self <: Reference] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFrom(value: typingsSlinky.eslint.mod.Scope.Scope): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdentifier(value: Identifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsRead(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRead")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsReadOnly(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isReadOnly")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsReadWrite(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isReadWrite")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsWrite(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isWrite")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsWriteOnly(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isWriteOnly")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withResolved(value: Variable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolved")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResolvedNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolved")(null)
        ret
    }
    @scala.inline
    def withWriteExpr(value: Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeExpr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWriteExprNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeExpr")(null)
        ret
    }
  }
  
}

