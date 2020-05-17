package typingsSlinky.commandLineUsage.mod

import typingsSlinky.commandLineUsage.anon.Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A Content section comprises a header and one or more lines of content. */
@js.native
trait Content extends Section {
  /**
    * Overloaded property, accepting data in one of four formats.
    *  1. A single string (one line of text).
    *  2. An array of strings (multiple lines of text).
    *  3. An array of objects (recordset-style data). In this case, the data will be rendered in table format. The property names of each object are not important, so long as they are
    *     consistent throughout the array.
    *  4. An object with two properties - data and options. In this case, the data and options will be passed directly to the underlying table layout module for rendering.
    */
  var content: js.UndefOr[String | (js.Array[_ | String]) | Data] = js.native
  /** The section header, always bold and underlined. */
  var header: js.UndefOr[String] = js.native
  /** Set to true to avoid indentation and wrapping. Useful for banners. */
  var raw: js.UndefOr[Boolean] = js.native
}

object Content {
  @scala.inline
  def apply(): Content = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Content]
  }
  @scala.inline
  implicit class ContentOps[Self <: Content] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContent(value: String | (js.Array[_ | String]) | Data): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(js.undefined)
        ret
    }
    @scala.inline
    def withHeader(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(js.undefined)
        ret
    }
    @scala.inline
    def withRaw(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRaw: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(js.undefined)
        ret
    }
  }
  
}

