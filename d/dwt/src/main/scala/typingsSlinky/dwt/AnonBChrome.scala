package typingsSlinky.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBChrome extends js.Object {
  var WSSession: Double = js.native
  var WSVersion: String = js.native
  var bChrome: Boolean = js.native
  var bEdge: Boolean = js.native
  var bFileSystem: Boolean = js.native
  var bFirefox: Boolean = js.native
  var bIE: Boolean = js.native
  var bLinux: Boolean = js.native
  var bMac: Boolean = js.native
  var bSafari: Boolean = js.native
  var bWin: Boolean = js.native
  var bWin64: Boolean = js.native
  var basePath: String = js.native
  var iPluginLength: Double = js.native
  var isX64: Boolean = js.native
  var pathType: Double = js.native
  var strChromeVersion: String = js.native
  var strFirefoxVersion: String = js.native
  var strIEVersion: String = js.native
}

object AnonBChrome {
  @scala.inline
  def apply(
    WSSession: Double,
    WSVersion: String,
    bChrome: Boolean,
    bEdge: Boolean,
    bFileSystem: Boolean,
    bFirefox: Boolean,
    bIE: Boolean,
    bLinux: Boolean,
    bMac: Boolean,
    bSafari: Boolean,
    bWin: Boolean,
    bWin64: Boolean,
    basePath: String,
    iPluginLength: Double,
    isX64: Boolean,
    pathType: Double,
    strChromeVersion: String,
    strFirefoxVersion: String,
    strIEVersion: String
  ): AnonBChrome = {
    val __obj = js.Dynamic.literal(WSSession = WSSession.asInstanceOf[js.Any], WSVersion = WSVersion.asInstanceOf[js.Any], bChrome = bChrome.asInstanceOf[js.Any], bEdge = bEdge.asInstanceOf[js.Any], bFileSystem = bFileSystem.asInstanceOf[js.Any], bFirefox = bFirefox.asInstanceOf[js.Any], bIE = bIE.asInstanceOf[js.Any], bLinux = bLinux.asInstanceOf[js.Any], bMac = bMac.asInstanceOf[js.Any], bSafari = bSafari.asInstanceOf[js.Any], bWin = bWin.asInstanceOf[js.Any], bWin64 = bWin64.asInstanceOf[js.Any], basePath = basePath.asInstanceOf[js.Any], iPluginLength = iPluginLength.asInstanceOf[js.Any], isX64 = isX64.asInstanceOf[js.Any], pathType = pathType.asInstanceOf[js.Any], strChromeVersion = strChromeVersion.asInstanceOf[js.Any], strFirefoxVersion = strFirefoxVersion.asInstanceOf[js.Any], strIEVersion = strIEVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBChrome]
  }
  @scala.inline
  implicit class AnonBChromeOps[Self <: AnonBChrome] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWSSession(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WSSession")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWSVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WSVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBChrome(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bChrome")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBEdge(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bEdge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBFileSystem(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bFileSystem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBFirefox(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bFirefox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBIE(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bIE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBLinux(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bLinux")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBMac(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bMac")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBSafari(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bSafari")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBWin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bWin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBWin64(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bWin64")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBasePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIPluginLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iPluginLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsX64(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isX64")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPathType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrChromeVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strChromeVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrFirefoxVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strFirefoxVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrIEVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strIEVersion")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

