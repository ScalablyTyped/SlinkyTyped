package typingsSlinky.jupyterlabRendermimeInterfaces.mod.IRenderMime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A file type to associate with the renderer.
  */
@js.native
trait IFileType extends js.Object {
  /**
    * An optional display name for the file type.
    */
  val displayName: js.UndefOr[String] = js.native
  /**
    * The extensions of the file type (e.g. `".txt"`).  Can be a compound
    * extension (e.g. `".table.json`).
    */
  val extensions: js.Array[String] = js.native
  /**
    * The file format for the file type ('text', 'base64', or 'json').
    */
  val fileFormat: js.UndefOr[String] = js.native
  /**
    * The icon class name for the file type.
    */
  val iconClass: js.UndefOr[String] = js.native
  /**
    * The icon label for the file type.
    */
  val iconLabel: js.UndefOr[String] = js.native
  /**
    * The mime types associated the file type.
    */
  val mimeTypes: js.Array[String] = js.native
  /**
    * The name of the file type.
    */
  val name: String = js.native
  /**
    * An optional pattern for a file name (e.g. `^Dockerfile$`).
    */
  val pattern: js.UndefOr[String] = js.native
}

object IFileType {
  @scala.inline
  def apply(extensions: js.Array[String], mimeTypes: js.Array[String], name: String): IFileType = {
    val __obj = js.Dynamic.literal(extensions = extensions.asInstanceOf[js.Any], mimeTypes = mimeTypes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFileType]
  }
  @scala.inline
  implicit class IFileTypeOps[Self <: IFileType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtensions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMimeTypes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mimeTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withFileFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withIconClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconClass")(js.undefined)
        ret
    }
    @scala.inline
    def withIconLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withPattern(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pattern")(js.undefined)
        ret
    }
  }
  
}

