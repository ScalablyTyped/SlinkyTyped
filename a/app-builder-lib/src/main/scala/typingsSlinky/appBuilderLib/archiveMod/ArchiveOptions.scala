package typingsSlinky.appBuilderLib.archiveMod

import typingsSlinky.appBuilderLib.appBuilderLibStrings.Copy
import typingsSlinky.appBuilderLib.appBuilderLibStrings.DEFAULT
import typingsSlinky.appBuilderLib.appBuilderLibStrings.Deflate
import typingsSlinky.appBuilderLib.appBuilderLibStrings.LZMA
import typingsSlinky.appBuilderLib.coreMod.CompressionLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArchiveOptions extends js.Object {
  var compression: js.UndefOr[CompressionLevel | Null] = js.native
  var dictSize: js.UndefOr[Double] = js.native
  var excluded: js.UndefOr[js.Array[String] | Null] = js.native
  /**
    * @default true
    */
  var isArchiveHeaderCompressed: js.UndefOr[Boolean] = js.native
  var isRegularFile: js.UndefOr[Boolean] = js.native
  var method: js.UndefOr[Copy | LZMA | Deflate | DEFAULT] = js.native
  /**
    * @default true
    */
  var solid: js.UndefOr[Boolean] = js.native
  /**
    * @default false
    */
  var withoutDir: js.UndefOr[Boolean] = js.native
}

object ArchiveOptions {
  @scala.inline
  def apply(): ArchiveOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArchiveOptions]
  }
  @scala.inline
  implicit class ArchiveOptionsOps[Self <: ArchiveOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompression(value: CompressionLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compression")(js.undefined)
        ret
    }
    @scala.inline
    def withCompressionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compression")(null)
        ret
    }
    @scala.inline
    def withDictSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dictSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDictSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dictSize")(js.undefined)
        ret
    }
    @scala.inline
    def withExcluded(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excluded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcluded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excluded")(js.undefined)
        ret
    }
    @scala.inline
    def withExcludedNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excluded")(null)
        ret
    }
    @scala.inline
    def withIsArchiveHeaderCompressed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isArchiveHeaderCompressed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsArchiveHeaderCompressed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isArchiveHeaderCompressed")(js.undefined)
        ret
    }
    @scala.inline
    def withIsRegularFile(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRegularFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsRegularFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRegularFile")(js.undefined)
        ret
    }
    @scala.inline
    def withMethod(value: Copy | LZMA | Deflate | DEFAULT): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(js.undefined)
        ret
    }
    @scala.inline
    def withSolid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("solid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSolid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("solid")(js.undefined)
        ret
    }
    @scala.inline
    def withWithoutDir(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withoutDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWithoutDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withoutDir")(js.undefined)
        ret
    }
  }
  
}

