package typingsSlinky.googleAppsScript.GoogleAppsScript.Sites

import typingsSlinky.googleAppsScript.GoogleAppsScript.Base.Date
import typingsSlinky.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Sites ListItem - a list element from a Sites List page.
  * A rebuilt
  * version of Sites was launched on November 22, 2016. Apps Script cannot currently access or
  * modify Sites made with this version, but script can still access
  * classic Sites.
  */
@js.native
trait ListItem extends js.Object {
  def deleteListItem(): Unit = js.native
  def getDatePublished(): Date = js.native
  def getLastUpdated(): Date = js.native
  def getParent(): Page = js.native
  def getValueByIndex(index: Integer): String = js.native
  def getValueByName(name: String): String = js.native
  def setParent(parent: Page): ListItem = js.native
  def setValueByIndex(index: Integer, value: String): ListItem = js.native
  def setValueByName(name: String, value: String): ListItem = js.native
}

object ListItem {
  @scala.inline
  def apply(
    deleteListItem: () => Unit,
    getDatePublished: () => Date,
    getLastUpdated: () => Date,
    getParent: () => Page,
    getValueByIndex: Integer => String,
    getValueByName: String => String,
    setParent: Page => ListItem,
    setValueByIndex: (Integer, String) => ListItem,
    setValueByName: (String, String) => ListItem
  ): ListItem = {
    val __obj = js.Dynamic.literal(deleteListItem = js.Any.fromFunction0(deleteListItem), getDatePublished = js.Any.fromFunction0(getDatePublished), getLastUpdated = js.Any.fromFunction0(getLastUpdated), getParent = js.Any.fromFunction0(getParent), getValueByIndex = js.Any.fromFunction1(getValueByIndex), getValueByName = js.Any.fromFunction1(getValueByName), setParent = js.Any.fromFunction1(setParent), setValueByIndex = js.Any.fromFunction2(setValueByIndex), setValueByName = js.Any.fromFunction2(setValueByName))
    __obj.asInstanceOf[ListItem]
  }
  @scala.inline
  implicit class ListItemOps[Self <: ListItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeleteListItem(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteListItem")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDatePublished(value: () => Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDatePublished")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetLastUpdated(value: () => Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLastUpdated")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetParent(value: () => Page): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getParent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetValueByIndex(value: Integer => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValueByIndex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetValueByName(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValueByName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetParent(value: Page => ListItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setParent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetValueByIndex(value: (Integer, String) => ListItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setValueByIndex")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetValueByName(value: (String, String) => ListItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setValueByName")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

