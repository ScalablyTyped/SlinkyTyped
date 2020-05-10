package typingsSlinky.reactFilepond.mod

import org.scalablytyped.runtime.StringDictionary
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilePondBaseProps extends js.Object {
  var acceptedFileTypes: js.UndefOr[js.Array[String]] = js.native
  /** Enable or disable file browser */
  var allowBrowse: js.UndefOr[Boolean] = js.native
  /** Enable or disable drag n’ drop */
  var allowDrop: js.UndefOr[Boolean] = js.native
  /** Enable or disable adding multiple files */
  var allowMultiple: js.UndefOr[Boolean] = js.native
  /**
    * Enable or disable pasting of files. Pasting files is not
    * supported on all browsers.
    */
  var allowPaste: js.UndefOr[Boolean] = js.native
  /** Allow drop to replace a file, only works when allowMultiple is false */
  var allowReplace: js.UndefOr[Boolean] = js.native
  /** Allows the user to undo file upload */
  var allowRevert: js.UndefOr[Boolean] = js.native
  /** Sets the given value to the capture attribute */
  var captureMethod: js.UndefOr[js.Any] = js.native
  var children: js.UndefOr[ReactElement | js.Array[ReactElement]] = js.native
  var className: js.UndefOr[String] = js.native
  /** List of files for controlled usage */
  var files: js.UndefOr[js.Array[File]] = js.native
  var id: js.UndefOr[String] = js.native
  /** The maximum number of files that the pond can handle */
  var maxFiles: js.UndefOr[Double] = js.native
  /** The maximum number of files that can be uploaded in parallel */
  var maxParallelUploads: js.UndefOr[Double] = js.native
  var metadata: js.UndefOr[StringDictionary[js.Any]] = js.native
  var name: js.UndefOr[String] = js.native
  /** Sets the required attribute to the output field */
  var required: js.UndefOr[Boolean] = js.native
}

object FilePondBaseProps {
  @scala.inline
  def apply(): FilePondBaseProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilePondBaseProps]
  }
  @scala.inline
  implicit class FilePondBasePropsOps[Self <: FilePondBaseProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcceptedFileTypes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptedFileTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcceptedFileTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptedFileTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowBrowse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowBrowse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowBrowse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowBrowse")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowDrop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDrop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowDrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDrop")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowMultiple(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowMultiple")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowMultiple: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowMultiple")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowPaste(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowPaste")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowPaste: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowPaste")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowReplace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowReplace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowReplace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowReplace")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowRevert(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowRevert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowRevert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowRevert")(js.undefined)
        ret
    }
    @scala.inline
    def withCaptureMethod(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captureMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaptureMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captureMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withChildrenReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: ReactElement | js.Array[ReactElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withFiles(value: js.Array[File]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxFiles(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFiles")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxParallelUploads(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxParallelUploads")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxParallelUploads: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxParallelUploads")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadata(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withRequired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(js.undefined)
        ret
    }
  }
  
}

