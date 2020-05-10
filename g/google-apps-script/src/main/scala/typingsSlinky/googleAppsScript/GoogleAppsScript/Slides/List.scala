package typingsSlinky.googleAppsScript.GoogleAppsScript.Slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A list in the text.
  */
@js.native
trait List extends js.Object {
  def getListId(): String = js.native
  def getListParagraphs(): js.Array[Paragraph] = js.native
}

object List {
  @scala.inline
  def apply(getListId: () => String, getListParagraphs: () => js.Array[Paragraph]): List = {
    val __obj = js.Dynamic.literal(getListId = js.Any.fromFunction0(getListId), getListParagraphs = js.Any.fromFunction0(getListParagraphs))
    __obj.asInstanceOf[List]
  }
  @scala.inline
  implicit class ListOps[Self <: List] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetListId(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getListId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetListParagraphs(value: () => js.Array[Paragraph]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getListParagraphs")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

