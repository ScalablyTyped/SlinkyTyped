package typingsSlinky.breeze.breeze

import typingsSlinky.breeze.breeze.core.EnumSymbol
import typingsSlinky.breeze.breeze.core.IEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EntityStateSymbol extends EnumSymbol {
  def isAdded(): Boolean = js.native
  def isAddedModifiedOrDeleted(): Boolean = js.native
  def isDeleted(): Boolean = js.native
  def isDetached(): Boolean = js.native
  def isModified(): Boolean = js.native
  def isUnchanged(): Boolean = js.native
  def isUnchangedOrModified(): Boolean = js.native
}

object EntityStateSymbol {
  @scala.inline
  def apply(
    getName: () => String,
    isAdded: () => Boolean,
    isAddedModifiedOrDeleted: () => Boolean,
    isDeleted: () => Boolean,
    isDetached: () => Boolean,
    isModified: () => Boolean,
    isUnchanged: () => Boolean,
    isUnchangedOrModified: () => Boolean,
    parentEnum: IEnum
  ): EntityStateSymbol = {
    val __obj = js.Dynamic.literal(getName = js.Any.fromFunction0(getName), isAdded = js.Any.fromFunction0(isAdded), isAddedModifiedOrDeleted = js.Any.fromFunction0(isAddedModifiedOrDeleted), isDeleted = js.Any.fromFunction0(isDeleted), isDetached = js.Any.fromFunction0(isDetached), isModified = js.Any.fromFunction0(isModified), isUnchanged = js.Any.fromFunction0(isUnchanged), isUnchangedOrModified = js.Any.fromFunction0(isUnchangedOrModified), parentEnum = parentEnum.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityStateSymbol]
  }
  @scala.inline
  implicit class EntityStateSymbolOps[Self <: EntityStateSymbol] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsAdded(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAdded")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsAddedModifiedOrDeleted(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAddedModifiedOrDeleted")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsDeleted(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDeleted")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsDetached(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDetached")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsModified(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isModified")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsUnchanged(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isUnchanged")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsUnchangedOrModified(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isUnchangedOrModified")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

