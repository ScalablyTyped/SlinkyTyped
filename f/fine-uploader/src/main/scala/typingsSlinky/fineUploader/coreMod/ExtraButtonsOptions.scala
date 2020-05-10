package typingsSlinky.fineUploader.coreMod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtraButtonsOptions extends js.Object {
  /**
    * The container element for the upload button
    *
    * @default `undefined`
    */
  var element: HTMLElement = js.native
  /**
    * This value will be used when creating the `title` attribute for the underlying `<input type="file">`.
    *
    * If not provided, the `text.fileInputTitle` option will be used instead
    *
    * @default `'file input'`
    */
  var fileInputTitle: js.UndefOr[String] = js.native
  /**
    * `true` to allow folders to be selected, `false` to allow files to be selected.
    *
    * @default `false`
    */
  var folders: js.UndefOr[Boolean] = js.native
  /**
    * Specify to override the default `multiple` value
    *
    * @default `true`
    */
  var multiple: js.UndefOr[Boolean] = js.native
  /**
    * Specify to override the default `validation` option specified.
    *
    * Any `validation` properties not specified will be inherited from the default `validation` option
    *
    * @default `validation`
    */
  var validation: js.UndefOr[js.Any] = js.native
}

object ExtraButtonsOptions {
  @scala.inline
  def apply(element: HTMLElement): ExtraButtonsOptions = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtraButtonsOptions]
  }
  @scala.inline
  implicit class ExtraButtonsOptionsOps[Self <: ExtraButtonsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileInputTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileInputTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileInputTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileInputTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withFolders(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("folders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFolders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("folders")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiple(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiple")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiple: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiple")(js.undefined)
        ret
    }
    @scala.inline
    def withValidation(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validation")(js.undefined)
        ret
    }
  }
  
}

