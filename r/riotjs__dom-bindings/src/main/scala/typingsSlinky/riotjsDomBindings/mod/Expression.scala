package typingsSlinky.riotjsDomBindings.mod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Expression[Scope] extends js.Object {
  var node: HTMLElement = js.native
  var `type`: ExpressionType = js.native
  var value: js.Any = js.native
  def mount(scope: Scope): Expression[_] = js.native
  def unmount(scope: Scope): Expression[_] = js.native
  def update(scope: Scope): Expression[_] = js.native
}

object Expression {
  @scala.inline
  def apply[Scope](
    mount: Scope => Expression[_],
    node: HTMLElement,
    `type`: ExpressionType,
    unmount: Scope => Expression[_],
    update: Scope => Expression[_],
    value: js.Any
  ): Expression[Scope] = {
    val __obj = js.Dynamic.literal(mount = js.Any.fromFunction1(mount), node = node.asInstanceOf[js.Any], unmount = js.Any.fromFunction1(unmount), update = js.Any.fromFunction1(update), value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression[Scope]]
  }
  @scala.inline
  implicit class ExpressionOps[Self[scope] <: Expression[scope], Scope] (val x: Self[Scope]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Scope] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Scope]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Scope] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Scope] with Other]
    @scala.inline
    def withMount(value: Scope => Expression[_]): Self[Scope] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mount")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNode(value: HTMLElement): Self[Scope] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: ExpressionType): Self[Scope] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnmount(value: Scope => Expression[_]): Self[Scope] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unmount")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: Scope => Expression[_]): Self[Scope] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withValue(value: js.Any): Self[Scope] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

