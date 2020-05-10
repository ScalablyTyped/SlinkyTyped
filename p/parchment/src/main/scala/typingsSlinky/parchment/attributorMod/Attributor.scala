package typingsSlinky.parchment.attributorMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.parchment.registryMod.Scope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Attributor extends js.Object {
  var attrName: String = js.native
  var keyName: String = js.native
  var scope: Scope = js.native
  var whitelist: js.UndefOr[js.Array[String]] = js.native
  def add(node: HTMLElement, value: String): Boolean = js.native
  def canAdd(node: HTMLElement, value: js.Any): Boolean = js.native
  def remove(node: HTMLElement): Unit = js.native
  def value(node: HTMLElement): String = js.native
}

object Attributor {
  @scala.inline
  def apply(
    add: (HTMLElement, String) => Boolean,
    attrName: String,
    canAdd: (HTMLElement, js.Any) => Boolean,
    keyName: String,
    remove: HTMLElement => Unit,
    scope: Scope,
    value: HTMLElement => String
  ): Attributor = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), attrName = attrName.asInstanceOf[js.Any], canAdd = js.Any.fromFunction2(canAdd), keyName = keyName.asInstanceOf[js.Any], remove = js.Any.fromFunction1(remove), scope = scope.asInstanceOf[js.Any], value = js.Any.fromFunction1(value))
    __obj.asInstanceOf[Attributor]
  }
  @scala.inline
  implicit class AttributorOps[Self <: Attributor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: (HTMLElement, String) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAttrName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attrName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanAdd(value: (HTMLElement, js.Any) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canAdd")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withKeyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemove(value: HTMLElement => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withScope(value: Scope): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: HTMLElement => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWhitelist(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whitelist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhitelist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whitelist")(js.undefined)
        ret
    }
  }
  
}

