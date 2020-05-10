package typingsSlinky.node.inspectorMod.Debugger

import typingsSlinky.node.inspectorMod.Runtime.ScriptId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchInContentParameterType extends js.Object {
  /**
    * If true, search is case sensitive.
    */
  var caseSensitive: js.UndefOr[Boolean] = js.native
  /**
    * If true, treats string parameter as regex.
    */
  var isRegex: js.UndefOr[Boolean] = js.native
  /**
    * String to search for.
    */
  var query: String = js.native
  /**
    * Id of the script to search in.
    */
  var scriptId: ScriptId = js.native
}

object SearchInContentParameterType {
  @scala.inline
  def apply(query: String, scriptId: ScriptId): SearchInContentParameterType = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], scriptId = scriptId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchInContentParameterType]
  }
  @scala.inline
  implicit class SearchInContentParameterTypeOps[Self <: SearchInContentParameterType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQuery(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScriptId(value: ScriptId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scriptId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCaseSensitive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caseSensitive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaseSensitive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caseSensitive")(js.undefined)
        ret
    }
    @scala.inline
    def withIsRegex(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRegex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsRegex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRegex")(js.undefined)
        ret
    }
  }
  
}

