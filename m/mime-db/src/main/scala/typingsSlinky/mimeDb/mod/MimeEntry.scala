package typingsSlinky.mimeDb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link https://github.com/jshttp/mime-db#data-structure}
  */
@js.native
trait MimeEntry extends js.Object {
  /** The default charset associated with this type, if any. */
  val charset: js.UndefOr[String] = js.native
  /** Whether a file of this type can be gzipped. */
  val compressible: js.UndefOr[Boolean] = js.native
  /** Known extensions associated with this mime type. */
  val extensions: js.UndefOr[js.Array[String]] = js.native
  /**
    * Where the mime type is defined.
    * If not set, it's probably a custom media type.
    */
  val source: js.UndefOr[MimeSource] = js.native
}

object MimeEntry {
  @scala.inline
  def apply(): MimeEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MimeEntry]
  }
  @scala.inline
  implicit class MimeEntryOps[Self <: MimeEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCharset(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCharset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charset")(js.undefined)
        ret
    }
    @scala.inline
    def withCompressible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compressible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompressible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compressible")(js.undefined)
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
    def withSource(value: MimeSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
  }
  
}

