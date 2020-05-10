package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IObjectTemplateSelectorItem extends js.Object {
  def GetClassID(): Double = js.native
  def GetClassName(): String = js.native
  def GetGroupID(): Double = js.native
  def GetGroupName(): String = js.native
  def GetID(): String = js.native
  def GetIconURL(): String = js.native
  def GetName(): String = js.native
  def GetTemplateID(): Double = js.native
  def IsBlankItem(): Boolean = js.native
  def IsDefaultTemplateForClass(): Boolean = js.native
}

object IObjectTemplateSelectorItem {
  @scala.inline
  def apply(
    GetClassID: () => Double,
    GetClassName: () => String,
    GetGroupID: () => Double,
    GetGroupName: () => String,
    GetID: () => String,
    GetIconURL: () => String,
    GetName: () => String,
    GetTemplateID: () => Double,
    IsBlankItem: () => Boolean,
    IsDefaultTemplateForClass: () => Boolean
  ): IObjectTemplateSelectorItem = {
    val __obj = js.Dynamic.literal(GetClassID = js.Any.fromFunction0(GetClassID), GetClassName = js.Any.fromFunction0(GetClassName), GetGroupID = js.Any.fromFunction0(GetGroupID), GetGroupName = js.Any.fromFunction0(GetGroupName), GetID = js.Any.fromFunction0(GetID), GetIconURL = js.Any.fromFunction0(GetIconURL), GetName = js.Any.fromFunction0(GetName), GetTemplateID = js.Any.fromFunction0(GetTemplateID), IsBlankItem = js.Any.fromFunction0(IsBlankItem), IsDefaultTemplateForClass = js.Any.fromFunction0(IsDefaultTemplateForClass))
    __obj.asInstanceOf[IObjectTemplateSelectorItem]
  }
  @scala.inline
  implicit class IObjectTemplateSelectorItemOps[Self <: IObjectTemplateSelectorItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetClassID(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetClassID")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetClassName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetClassName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetGroupID(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetGroupID")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetGroupName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetGroupName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetID(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetID")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetIconURL(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetIconURL")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTemplateID(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetTemplateID")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsBlankItem(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsBlankItem")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsDefaultTemplateForClass(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsDefaultTemplateForClass")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

