package typingsSlinky.codemirror.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoCloseTags extends js.Object {
  /**
    * An array of tag names that should not be autoclosed. (default is empty tags for HTML, none for XML)
    */
  var dontCloseTags: js.UndefOr[js.Array[String]] = js.native
  /**
    * An array of XML tag names that should be autoclosed with '/>'. (default is none)
    */
  var emptyTags: js.Array[String] = js.native
  /**
    * An array of tag names that should, when opened, cause a
    * blank line to be added inside the tag, and the blank line and
    * closing line to be indented. (default is block tags for HTML, none for XML)
    */
  var indentTags: js.UndefOr[js.Array[String]] = js.native
  /**
    * Whether to autoclose when the '/' of a closing tag is typed. (default true)
    */
  var whenClosing: js.UndefOr[Boolean] = js.native
  /**
    * Whether to autoclose the tag when the final '>' of an opening tag is typed. (default true)
    */
  var whenOpening: js.UndefOr[Boolean] = js.native
}

object AutoCloseTags {
  @scala.inline
  def apply(emptyTags: js.Array[String]): AutoCloseTags = {
    val __obj = js.Dynamic.literal(emptyTags = emptyTags.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoCloseTags]
  }
  @scala.inline
  implicit class AutoCloseTagsOps[Self <: AutoCloseTags] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmptyTags(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDontCloseTags(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dontCloseTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDontCloseTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dontCloseTags")(js.undefined)
        ret
    }
    @scala.inline
    def withIndentTags(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndentTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentTags")(js.undefined)
        ret
    }
    @scala.inline
    def withWhenClosing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whenClosing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhenClosing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whenClosing")(js.undefined)
        ret
    }
    @scala.inline
    def withWhenOpening(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whenOpening")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhenOpening: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whenOpening")(js.undefined)
        ret
    }
  }
  
}

