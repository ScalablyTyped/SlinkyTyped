package typingsSlinky.alexaSdk.mod.templateBuilders

import typingsSlinky.alexaSdk.mod.ListItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetListItems[T /* <: TemplateBuilder[T] */] extends js.Object {
  def setListItems(listItems: js.Array[ListItem]): T = js.native
}

object SetListItems {
  @scala.inline
  def apply[T](setListItems: js.Array[ListItem] => T): SetListItems[T] = {
    val __obj = js.Dynamic.literal(setListItems = js.Any.fromFunction1(setListItems))
    __obj.asInstanceOf[SetListItems[T]]
  }
  @scala.inline
  implicit class SetListItemsOps[Self[t] <: SetListItems[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withSetListItems(value: js.Array[ListItem] => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setListItems")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

