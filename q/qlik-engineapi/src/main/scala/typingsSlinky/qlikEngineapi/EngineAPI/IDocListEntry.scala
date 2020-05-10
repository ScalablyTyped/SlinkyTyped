package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DocListEntry...
  */
@js.native
trait IDocListEntry extends js.Object {
  /**
    * Not used.
    */
  var qConnectedUsers: Double = js.native
  /**
    * Identifier of the app.
    *
    * - In Qlik Sense Desktop, the identifier is the path and name of the app
    * - In Qlik Sense Enterprise, the identifier is the app's GUID.
    */
  var qDocId: String = js.native
  /**
    * Name of the app.
    */
  var qDocName: String = js.native
  /**
    * Size of remote app.
    * This property is used only with Qlik Sense Desktop.
    * It is set to 0 for Qlik Sense Enterprise.
    */
  var qFileSize: Double = js.native
  /**
    * Last modified time stamp of the app.
    * This property is used only with Qlik Sense Desktop.
    * It is set to 0 for Qlik Sense Enterprise.
    */
  var qFileTime: Double = js.native
  /**
    * Last reload time of the app.
    */
  var qLastReloadTime: String = js.native
  /**
    * Meta data related to the app.
    */
  var qMeta: INxMeta = js.native
  /**
    * If set to true, the app is read-only.
    */
  var qReadOnly: Boolean = js.native
  /**
    * Thumbnail of the app.
    */
  var qThumbnail: IStaticContentUrl = js.native
  /**
    * Title of the app.
    */
  var qTitle: String = js.native
}

object IDocListEntry {
  @scala.inline
  def apply(
    qConnectedUsers: Double,
    qDocId: String,
    qDocName: String,
    qFileSize: Double,
    qFileTime: Double,
    qLastReloadTime: String,
    qMeta: INxMeta,
    qReadOnly: Boolean,
    qThumbnail: IStaticContentUrl,
    qTitle: String
  ): IDocListEntry = {
    val __obj = js.Dynamic.literal(qConnectedUsers = qConnectedUsers.asInstanceOf[js.Any], qDocId = qDocId.asInstanceOf[js.Any], qDocName = qDocName.asInstanceOf[js.Any], qFileSize = qFileSize.asInstanceOf[js.Any], qFileTime = qFileTime.asInstanceOf[js.Any], qLastReloadTime = qLastReloadTime.asInstanceOf[js.Any], qMeta = qMeta.asInstanceOf[js.Any], qReadOnly = qReadOnly.asInstanceOf[js.Any], qThumbnail = qThumbnail.asInstanceOf[js.Any], qTitle = qTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDocListEntry]
  }
  @scala.inline
  implicit class IDocListEntryOps[Self <: IDocListEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQConnectedUsers(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qConnectedUsers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQDocId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qDocId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQDocName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qDocName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQFileSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qFileSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQFileTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qFileTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQLastReloadTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qLastReloadTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQMeta(value: INxMeta): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qMeta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQReadOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qReadOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQThumbnail(value: IStaticContentUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qThumbnail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qTitle")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

