package typingsSlinky.activexAccess.AccWizObjects

import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WIZ_WIN32_FIND_DATA extends js.Object {
  val cAlternate: SafeArray[Double] = js.native
  val cFileName: SafeArray[Double] = js.native
  val dwFileAttributes: Double = js.native
  val dwReserved0: Double = js.native
  val dwReserved1: Double = js.native
  val ftCreationTime: WIZ_FILETIME = js.native
  val ftLastAccessTime: WIZ_FILETIME = js.native
  val ftLastWriteTime: WIZ_FILETIME = js.native
  val nFileSizeHigh: Double = js.native
  val nFileSizeLow: Double = js.native
}

object WIZ_WIN32_FIND_DATA {
  @scala.inline
  def apply(
    cAlternate: SafeArray[Double],
    cFileName: SafeArray[Double],
    dwFileAttributes: Double,
    dwReserved0: Double,
    dwReserved1: Double,
    ftCreationTime: WIZ_FILETIME,
    ftLastAccessTime: WIZ_FILETIME,
    ftLastWriteTime: WIZ_FILETIME,
    nFileSizeHigh: Double,
    nFileSizeLow: Double
  ): WIZ_WIN32_FIND_DATA = {
    val __obj = js.Dynamic.literal(cAlternate = cAlternate.asInstanceOf[js.Any], cFileName = cFileName.asInstanceOf[js.Any], dwFileAttributes = dwFileAttributes.asInstanceOf[js.Any], dwReserved0 = dwReserved0.asInstanceOf[js.Any], dwReserved1 = dwReserved1.asInstanceOf[js.Any], ftCreationTime = ftCreationTime.asInstanceOf[js.Any], ftLastAccessTime = ftLastAccessTime.asInstanceOf[js.Any], ftLastWriteTime = ftLastWriteTime.asInstanceOf[js.Any], nFileSizeHigh = nFileSizeHigh.asInstanceOf[js.Any], nFileSizeLow = nFileSizeLow.asInstanceOf[js.Any])
    __obj.asInstanceOf[WIZ_WIN32_FIND_DATA]
  }
  @scala.inline
  implicit class WIZ_WIN32_FIND_DATAOps[Self <: WIZ_WIN32_FIND_DATA] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCAlternate(value: SafeArray[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cAlternate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCFileName(value: SafeArray[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cFileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDwFileAttributes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dwFileAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDwReserved0(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dwReserved0")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDwReserved1(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dwReserved1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFtCreationTime(value: WIZ_FILETIME): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ftCreationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFtLastAccessTime(value: WIZ_FILETIME): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ftLastAccessTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFtLastWriteTime(value: WIZ_FILETIME): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ftLastWriteTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNFileSizeHigh(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nFileSizeHigh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNFileSizeLow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nFileSizeLow")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

