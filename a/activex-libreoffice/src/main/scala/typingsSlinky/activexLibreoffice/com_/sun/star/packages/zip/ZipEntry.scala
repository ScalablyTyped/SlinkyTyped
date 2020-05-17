package typingsSlinky.activexLibreoffice.com_.sun.star.packages.zip

import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * used to represent a ZIP file entry
  *
  * This interface is an IDL version of the Java interface **java.util.zip.ZipFile** with some minor adaptations.
  */
@js.native
trait ZipEntry extends js.Object {
  /** optional extra field data for entry */
  var extra: SafeArray[Double] = js.native
  /** uncompressed size of entry data */
  var nCompressedSize: Double = js.native
  /** CRC-32 of entry data */
  var nCrc: Double = js.native
  /** The number of the disk this entry is saved on */
  var nDiskNumber: Double = js.native
  /** bit flags */
  var nFlag: Double = js.native
  /** compression method */
  var nMethod: Double = js.native
  /** offset of LOC header */
  var nOffset: Double = js.native
  /** uncompressed size of entry data */
  var nSize: Double = js.native
  /** modification time */
  var nTime: Double = js.native
  /** version needed to extract */
  var nVersion: Double = js.native
  /** optional comment */
  var sComment: String = js.native
  /** the entry name */
  var sName: String = js.native
}

object ZipEntry {
  @scala.inline
  def apply(
    extra: SafeArray[Double],
    nCompressedSize: Double,
    nCrc: Double,
    nDiskNumber: Double,
    nFlag: Double,
    nMethod: Double,
    nOffset: Double,
    nSize: Double,
    nTime: Double,
    nVersion: Double,
    sComment: String,
    sName: String
  ): ZipEntry = {
    val __obj = js.Dynamic.literal(extra = extra.asInstanceOf[js.Any], nCompressedSize = nCompressedSize.asInstanceOf[js.Any], nCrc = nCrc.asInstanceOf[js.Any], nDiskNumber = nDiskNumber.asInstanceOf[js.Any], nFlag = nFlag.asInstanceOf[js.Any], nMethod = nMethod.asInstanceOf[js.Any], nOffset = nOffset.asInstanceOf[js.Any], nSize = nSize.asInstanceOf[js.Any], nTime = nTime.asInstanceOf[js.Any], nVersion = nVersion.asInstanceOf[js.Any], sComment = sComment.asInstanceOf[js.Any], sName = sName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZipEntry]
  }
  @scala.inline
  implicit class ZipEntryOps[Self <: ZipEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtra(value: SafeArray[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extra")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNCompressedSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nCompressedSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNCrc(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nCrc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNDiskNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nDiskNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNFlag(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nFlag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNMethod(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSComment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sComment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

