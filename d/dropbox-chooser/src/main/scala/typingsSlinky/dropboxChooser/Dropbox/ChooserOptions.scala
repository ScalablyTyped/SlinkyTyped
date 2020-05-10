package typingsSlinky.dropboxChooser.Dropbox

import typingsSlinky.dropboxChooser.dropboxChooserStrings.direct
import typingsSlinky.dropboxChooser.dropboxChooserStrings.preview
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChooserOptions extends js.Object {
  // called when the user closes the dialog without selecting a file
  var cancel: js.UndefOr[js.Function0[Unit]] = js.native
  // eg. '.png'
  var extensions: js.UndefOr[js.Array[String]] = js.native
  // default: false
  var folderselect: js.UndefOr[Boolean] = js.native
  // default: 'preview'
  var linkType: js.UndefOr[preview | direct] = js.native
  // default: false
  var multiselect: js.UndefOr[Boolean] = js.native
  // any positive number
  var sizeLimit: js.UndefOr[Double] = js.native
  // called when a user selects an item in the Chooser
  def success(files: js.Array[ChooserFile]): Unit = js.native
}

object ChooserOptions {
  @scala.inline
  def apply(success: js.Array[ChooserFile] => Unit): ChooserOptions = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[ChooserOptions]
  }
  @scala.inline
  implicit class ChooserOptionsOps[Self <: ChooserOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSuccess(value: js.Array[ChooserFile] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCancel(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.undefined)
        ret
    }
    @scala.inline
    def withExtensions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(js.undefined)
        ret
    }
    @scala.inline
    def withFolderselect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("folderselect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFolderselect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("folderselect")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkType(value: preview | direct): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkType")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiselect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiselect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiselect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiselect")(js.undefined)
        ret
    }
    @scala.inline
    def withSizeLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizeLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeLimit")(js.undefined)
        ret
    }
  }
  
}

