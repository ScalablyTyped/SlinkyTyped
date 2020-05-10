package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IObjectTemplateSelector extends js.Object {
  val ClassSelector: IMetadataCardControl = js.native
  val Events: IEvents = js.native
  def GetObjectTypeIconURL(): String = js.native
  def GetObjectTypeId(): Double = js.native
  def GetObjectTypeName(): String = js.native
  def GetTemplateItems(): js.Any = js.native
  def SelectItem(itemID: String): Unit = js.native
}

object IObjectTemplateSelector {
  @scala.inline
  def apply(
    ClassSelector: IMetadataCardControl,
    Events: IEvents,
    GetObjectTypeIconURL: () => String,
    GetObjectTypeId: () => Double,
    GetObjectTypeName: () => String,
    GetTemplateItems: () => js.Any,
    SelectItem: String => Unit
  ): IObjectTemplateSelector = {
    val __obj = js.Dynamic.literal(ClassSelector = ClassSelector.asInstanceOf[js.Any], Events = Events.asInstanceOf[js.Any], GetObjectTypeIconURL = js.Any.fromFunction0(GetObjectTypeIconURL), GetObjectTypeId = js.Any.fromFunction0(GetObjectTypeId), GetObjectTypeName = js.Any.fromFunction0(GetObjectTypeName), GetTemplateItems = js.Any.fromFunction0(GetTemplateItems), SelectItem = js.Any.fromFunction1(SelectItem))
    __obj.asInstanceOf[IObjectTemplateSelector]
  }
  @scala.inline
  implicit class IObjectTemplateSelectorOps[Self <: IObjectTemplateSelector] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassSelector(value: IMetadataCardControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClassSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvents(value: IEvents): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetObjectTypeIconURL(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetObjectTypeIconURL")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetObjectTypeId(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetObjectTypeId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetObjectTypeName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetObjectTypeName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTemplateItems(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetTemplateItems")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSelectItem(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SelectItem")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

