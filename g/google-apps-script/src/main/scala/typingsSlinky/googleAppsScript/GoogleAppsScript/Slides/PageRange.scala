package typingsSlinky.googleAppsScript.GoogleAppsScript.Slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A collection of one or more Page instances.
  */
@js.native
trait PageRange extends js.Object {
  def getPages(): js.Array[Page] = js.native
}

object PageRange {
  @scala.inline
  def apply(getPages: () => js.Array[Page]): PageRange = {
    val __obj = js.Dynamic.literal(getPages = js.Any.fromFunction0(getPages))
    __obj.asInstanceOf[PageRange]
  }
  @scala.inline
  implicit class PageRangeOps[Self <: PageRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetPages(value: () => js.Array[Page]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPages")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

