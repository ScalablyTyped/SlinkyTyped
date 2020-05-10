package typingsSlinky.atom.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContextMenuManager extends js.Object {
  /** Add context menu items scoped by CSS selectors. */
  def add(itemsBySelector: StringDictionary[js.Array[ContextMenuOptions]]): Disposable = js.native
}

object ContextMenuManager {
  @scala.inline
  def apply(add: StringDictionary[js.Array[ContextMenuOptions]] => Disposable): ContextMenuManager = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add))
    __obj.asInstanceOf[ContextMenuManager]
  }
  @scala.inline
  implicit class ContextMenuManagerOps[Self <: ContextMenuManager] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: StringDictionary[js.Array[ContextMenuOptions]] => Disposable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

