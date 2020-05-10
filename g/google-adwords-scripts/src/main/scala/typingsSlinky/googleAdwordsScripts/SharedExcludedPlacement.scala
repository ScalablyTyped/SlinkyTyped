package typingsSlinky.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharedExcludedPlacement extends AdWordsEntity {
  def getExcludedPlacementList(): ExcludedPlacementList = js.native
  def getUrl(): String = js.native
  def remove(): Unit = js.native
}

object SharedExcludedPlacement {
  @scala.inline
  def apply(getExcludedPlacementList: () => ExcludedPlacementList, getUrl: () => String, remove: () => Unit): SharedExcludedPlacement = {
    val __obj = js.Dynamic.literal(getExcludedPlacementList = js.Any.fromFunction0(getExcludedPlacementList), getUrl = js.Any.fromFunction0(getUrl), remove = js.Any.fromFunction0(remove))
    __obj.asInstanceOf[SharedExcludedPlacement]
  }
  @scala.inline
  implicit class SharedExcludedPlacementOps[Self <: SharedExcludedPlacement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetExcludedPlacementList(value: () => ExcludedPlacementList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getExcludedPlacementList")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetUrl(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUrl")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemove(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

