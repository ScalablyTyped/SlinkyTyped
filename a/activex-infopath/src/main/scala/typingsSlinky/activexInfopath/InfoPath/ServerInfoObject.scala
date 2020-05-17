package typingsSlinky.activexInfopath.InfoPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerInfoObject extends js.Object {
  @JSName("InfoPath.ServerInfoObject_typekey")
  var InfoPathDotServerInfoObject_typekey: ServerInfoObject = js.native
  val SharePointListUrl: String = js.native
  val SharePointServerRootUrl: String = js.native
  val SharePointSiteCollectionUrl: String = js.native
  val SharePointSiteUrl: String = js.native
}

object ServerInfoObject {
  @scala.inline
  def apply(
    InfoPathDotServerInfoObject_typekey: ServerInfoObject,
    SharePointListUrl: String,
    SharePointServerRootUrl: String,
    SharePointSiteCollectionUrl: String,
    SharePointSiteUrl: String
  ): ServerInfoObject = {
    val __obj = js.Dynamic.literal(SharePointListUrl = SharePointListUrl.asInstanceOf[js.Any], SharePointServerRootUrl = SharePointServerRootUrl.asInstanceOf[js.Any], SharePointSiteCollectionUrl = SharePointSiteCollectionUrl.asInstanceOf[js.Any], SharePointSiteUrl = SharePointSiteUrl.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.ServerInfoObject_typekey")(InfoPathDotServerInfoObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerInfoObject]
  }
  @scala.inline
  implicit class ServerInfoObjectOps[Self <: ServerInfoObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInfoPathDotServerInfoObject_typekey(value: ServerInfoObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InfoPath.ServerInfoObject_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSharePointListUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SharePointListUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSharePointServerRootUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SharePointServerRootUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSharePointSiteCollectionUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SharePointSiteCollectionUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSharePointSiteUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SharePointSiteUrl")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

