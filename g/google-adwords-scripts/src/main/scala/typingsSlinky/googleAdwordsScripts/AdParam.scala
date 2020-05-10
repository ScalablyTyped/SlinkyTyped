package typingsSlinky.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Ad Param
@js.native
trait AdParam extends AdWordsEntity {
  def getAdGroup(): AdGroup = js.native
  def getInde(): Double = js.native
  def getInsertionText(): String = js.native
  def getKeyword(): Keyword = js.native
  def remove(): Unit = js.native
  def setInsertionText(insertionText: String): Unit = js.native
}

object AdParam {
  @scala.inline
  def apply(
    getAdGroup: () => AdGroup,
    getInde: () => Double,
    getInsertionText: () => String,
    getKeyword: () => Keyword,
    remove: () => Unit,
    setInsertionText: String => Unit
  ): AdParam = {
    val __obj = js.Dynamic.literal(getAdGroup = js.Any.fromFunction0(getAdGroup), getInde = js.Any.fromFunction0(getInde), getInsertionText = js.Any.fromFunction0(getInsertionText), getKeyword = js.Any.fromFunction0(getKeyword), remove = js.Any.fromFunction0(remove), setInsertionText = js.Any.fromFunction1(setInsertionText))
    __obj.asInstanceOf[AdParam]
  }
  @scala.inline
  implicit class AdParamOps[Self <: AdParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetAdGroup(value: () => AdGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAdGroup")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetInde(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInde")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetInsertionText(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInsertionText")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetKeyword(value: () => Keyword): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getKeyword")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemove(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetInsertionText(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setInsertionText")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

