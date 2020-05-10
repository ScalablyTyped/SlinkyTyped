package typingsSlinky.grunt.grunt.file

import typingsSlinky.grunt.minimatch.IMinimatchOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * {@link http://gruntjs.com/configuring-tasks#files}
  */
@js.native
trait IFilesConfig extends IMinimatchOptions {
  /**
    * Patterns will be matched relative to this path, and all returned filepaths will
    * also be relative to this path.
    */
  var cwd: js.UndefOr[String] = js.native
  /**
    * Destination path prefix.
    */
  var dest: js.UndefOr[String] = js.native
  /**
    * Process a dynamic src-dest file mapping,
    * @see {@link http://gruntjs.com/configuring-tasks#building-the-files-object-dynamically for more information.
    */
  var expand: js.UndefOr[Boolean] = js.native
   // = false
  /**
    * Either a valid fs.Stats method name:
    * - isFile
    * - isDirectory
    * - isBlockDevice
    * - isCharacterDevice
    * - isSymbolicLink
    * - isFIFO
    * - isSocket
    *
    * or a function that is passed the matched src filepath and returns true or false.
    *
    * string
    * (src: string) => boolean
    */
  // filter?: string
  // filter?: (src: string) => boolean
  var filter: js.UndefOr[js.Any] = js.native
  /**
    * Pattern(s) to match, relative to the {@link IExpandedFilesConfig.cwd}.
    */
  var src: js.UndefOr[js.Array[String]] = js.native
}

object IFilesConfig {
  @scala.inline
  def apply(): IFilesConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFilesConfig]
  }
  @scala.inline
  implicit class IFilesConfigOps[Self <: IFilesConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCwd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cwd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCwd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cwd")(js.undefined)
        ret
    }
    @scala.inline
    def withDest(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dest")(js.undefined)
        ret
    }
    @scala.inline
    def withExpand(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expand")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withSrc(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSrc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(js.undefined)
        ret
    }
  }
  
}

