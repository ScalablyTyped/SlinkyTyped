package typingsSlinky.detective.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetectiveResults extends js.Object {
  /**
    * an array of each stringified expression found in a require() call
    */
  var expressions: js.Array[String] = js.native
  /**
    * (when opts.nodes === true) - an array of AST nodes for each argument found in a require() call
    */
  var nodes: js.UndefOr[js.Array[_]] = js.native
  /**
    * an array of each string found in a require()
    */
  var strings: js.Array[String] = js.native
}

object DetectiveResults {
  @scala.inline
  def apply(expressions: js.Array[String], strings: js.Array[String]): DetectiveResults = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any], strings = strings.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectiveResults]
  }
  @scala.inline
  implicit class DetectiveResultsOps[Self <: DetectiveResults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpressions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expressions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrings(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodes(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodes")(js.undefined)
        ret
    }
  }
  
}

