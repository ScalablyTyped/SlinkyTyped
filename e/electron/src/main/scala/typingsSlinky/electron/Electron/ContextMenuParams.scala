package typingsSlinky.electron.Electron

import typingsSlinky.electron.electronStrings.audio
import typingsSlinky.electron.electronStrings.canvas
import typingsSlinky.electron.electronStrings.file
import typingsSlinky.electron.electronStrings.image
import typingsSlinky.electron.electronStrings.keyboard
import typingsSlinky.electron.electronStrings.mouse
import typingsSlinky.electron.electronStrings.none
import typingsSlinky.electron.electronStrings.plugin
import typingsSlinky.electron.electronStrings.touch
import typingsSlinky.electron.electronStrings.touchMenu
import typingsSlinky.electron.electronStrings.video
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContextMenuParams extends js.Object {
  /**
    * These flags indicate whether the renderer believes it is able to perform the
    * corresponding action.
    */
  var editFlags: EditFlags = js.native
  /**
    * The character encoding of the frame on which the menu was invoked.
    */
  var frameCharset: String = js.native
  /**
    * URL of the subframe that the context menu was invoked on.
    */
  var frameURL: String = js.native
  /**
    * Whether the context menu was invoked on an image which has non-empty contents.
    */
  var hasImageContents: Boolean = js.native
  /**
    * If the context menu was invoked on an input field, the type of that field.
    * Possible values are none, plainText, password, other.
    */
  var inputFieldType: String = js.native
  /**
    * Whether the context is editable.
    */
  var isEditable: Boolean = js.native
  /**
    * Text associated with the link. May be an empty string if the contents of the
    * link are an image.
    */
  var linkText: String = js.native
  /**
    * URL of the link that encloses the node the context menu was invoked on.
    */
  var linkURL: String = js.native
  /**
    * The flags for the media element the context menu was invoked on.
    */
  var mediaFlags: MediaFlags = js.native
  /**
    * Type of the node the context menu was invoked on. Can be none, image, audio,
    * video, canvas, file or plugin.
    */
  var mediaType: none | image | audio | video | canvas | file | plugin = js.native
  /**
    * Input source that invoked the context menu. Can be none, mouse, keyboard, touch
    * or touchMenu.
    */
  var menuSourceType: none | mouse | keyboard | touch | touchMenu = js.native
  /**
    * The misspelled word under the cursor, if any.
    */
  var misspelledWord: String = js.native
  /**
    * URL of the top level page that the context menu was invoked on.
    */
  var pageURL: String = js.native
  /**
    * Text of the selection that the context menu was invoked on.
    */
  var selectionText: String = js.native
  /**
    * Source URL for the element that the context menu was invoked on. Elements with
    * source URLs are images, audio and video.
    */
  var srcURL: String = js.native
  /**
    * Title or alt text of the selection that the context was invoked on.
    */
  var titleText: String = js.native
  /**
    * x coordinate.
    */
  var x: Double = js.native
  /**
    * y coordinate.
    */
  var y: Double = js.native
}

object ContextMenuParams {
  @scala.inline
  def apply(
    editFlags: EditFlags,
    frameCharset: String,
    frameURL: String,
    hasImageContents: Boolean,
    inputFieldType: String,
    isEditable: Boolean,
    linkText: String,
    linkURL: String,
    mediaFlags: MediaFlags,
    mediaType: none | image | audio | video | canvas | file | plugin,
    menuSourceType: none | mouse | keyboard | touch | touchMenu,
    misspelledWord: String,
    pageURL: String,
    selectionText: String,
    srcURL: String,
    titleText: String,
    x: Double,
    y: Double
  ): ContextMenuParams = {
    val __obj = js.Dynamic.literal(editFlags = editFlags.asInstanceOf[js.Any], frameCharset = frameCharset.asInstanceOf[js.Any], frameURL = frameURL.asInstanceOf[js.Any], hasImageContents = hasImageContents.asInstanceOf[js.Any], inputFieldType = inputFieldType.asInstanceOf[js.Any], isEditable = isEditable.asInstanceOf[js.Any], linkText = linkText.asInstanceOf[js.Any], linkURL = linkURL.asInstanceOf[js.Any], mediaFlags = mediaFlags.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], menuSourceType = menuSourceType.asInstanceOf[js.Any], misspelledWord = misspelledWord.asInstanceOf[js.Any], pageURL = pageURL.asInstanceOf[js.Any], selectionText = selectionText.asInstanceOf[js.Any], srcURL = srcURL.asInstanceOf[js.Any], titleText = titleText.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextMenuParams]
  }
  @scala.inline
  implicit class ContextMenuParamsOps[Self <: ContextMenuParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEditFlags(value: EditFlags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editFlags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrameCharset(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameCharset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrameURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasImageContents(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasImageContents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputFieldType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputFieldType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsEditable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEditable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinkText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinkURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMediaFlags(value: MediaFlags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaFlags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMediaType(value: none | image | audio | video | canvas | file | plugin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMenuSourceType(value: none | mouse | keyboard | touch | touchMenu): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuSourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMisspelledWord(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("misspelledWord")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectionText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSrcURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("srcURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitleText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

