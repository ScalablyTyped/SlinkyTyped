package typingsSlinky.juiCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UtilKeyParser extends js.Object {
  def changeIndex(index: String, targetIndex: String, rootIndex: String): String = js.native
  def getIndexList(index: String): Boolean = js.native
  def getNextIndex(index: String): String = js.native
  def getParentIndex(index: String): String = js.native
  def isIndexDepth(index: String): Boolean = js.native
}

object UtilKeyParser {
  @scala.inline
  def apply(
    changeIndex: (String, String, String) => String,
    getIndexList: String => Boolean,
    getNextIndex: String => String,
    getParentIndex: String => String,
    isIndexDepth: String => Boolean
  ): UtilKeyParser = {
    val __obj = js.Dynamic.literal(changeIndex = js.Any.fromFunction3(changeIndex), getIndexList = js.Any.fromFunction1(getIndexList), getNextIndex = js.Any.fromFunction1(getNextIndex), getParentIndex = js.Any.fromFunction1(getParentIndex), isIndexDepth = js.Any.fromFunction1(isIndexDepth))
    __obj.asInstanceOf[UtilKeyParser]
  }
  @scala.inline
  implicit class UtilKeyParserOps[Self <: UtilKeyParser] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChangeIndex(value: (String, String, String) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeIndex")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withGetIndexList(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIndexList")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetNextIndex(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNextIndex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetParentIndex(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getParentIndex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsIndexDepth(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isIndexDepth")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

