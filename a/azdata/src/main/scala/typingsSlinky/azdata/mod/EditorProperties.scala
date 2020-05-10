package typingsSlinky.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditorProperties extends ComponentProperties {
  /**
  		 * The content inside the text editor
  		 */
  var content: js.UndefOr[String] = js.native
  /**
  		 * The languge mode for this text editor. The language mode is SQL by default.
  		 */
  var languageMode: js.UndefOr[String] = js.native
  /**
  		 * Minimum height for editor component
  		 */
  var minimumHeight: js.UndefOr[Double] = js.native
}

object EditorProperties {
  @scala.inline
  def apply(): EditorProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorProperties]
  }
  @scala.inline
  implicit class EditorPropertiesOps[Self <: EditorProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContent(value: String): Self = {
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
    def withLanguageMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languageMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguageMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languageMode")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimumHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumHeight")(js.undefined)
        ret
    }
  }
  
}

