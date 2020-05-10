package typingsSlinky.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Snippet of the search result, which summarizes the content of the resulting
  * page.
  */
@js.native
trait SchemaSnippet extends js.Object {
  /**
    * The matched ranges in the snippet.
    */
  var matchRanges: js.UndefOr[js.Array[SchemaMatchRange]] = js.native
  /**
    * The snippet of the document. The snippet of the document. May contain
    * escaped HTML character that should be unescaped prior to rendering.
    */
  var snippet: js.UndefOr[String] = js.native
}

object SchemaSnippet {
  @scala.inline
  def apply(): SchemaSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSnippet]
  }
  @scala.inline
  implicit class SchemaSnippetOps[Self <: SchemaSnippet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMatchRanges(value: js.Array[SchemaMatchRange]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchRanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchRanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchRanges")(js.undefined)
        ret
    }
    @scala.inline
    def withSnippet(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snippet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnippet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snippet")(js.undefined)
        ret
    }
  }
  
}

