package typingsSlinky.node.inspectorMod.Debugger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Search match for resource.
  */
@js.native
trait SearchMatch extends js.Object {
  /**
    * Line with match content.
    */
  var lineContent: String = js.native
  /**
    * Line number in resource content.
    */
  var lineNumber: Double = js.native
}

object SearchMatch {
  @scala.inline
  def apply(lineContent: String, lineNumber: Double): SearchMatch = {
    val __obj = js.Dynamic.literal(lineContent = lineContent.asInstanceOf[js.Any], lineNumber = lineNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchMatch]
  }
  @scala.inline
  implicit class SearchMatchOps[Self <: SearchMatch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLineContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineNumber")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

