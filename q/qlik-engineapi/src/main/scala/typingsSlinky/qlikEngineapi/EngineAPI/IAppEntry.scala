package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * AppEntry...
  */
@js.native
trait IAppEntry extends js.Object {
  /**
    * Identifier of the app.
    */
  var qID: String = js.native
  /**
    * Last reload time of the app.
    */
  var qLastReloadTime: String = js.native
  /**
    * Meta data.
    */
  var qMeta: INxMeta = js.native
  /**
    * Path of the app.
    */
  var qPath: String = js.native
  /**
    * Is set to true if the app is read-only.
    */
  var qReadOnly: Boolean = js.native
  /**
    * App thumbnail.
    */
  var qThumbnail: IStaticContentUrl = js.native
  /**
    * Title of the app.
    */
  var qTitle: String = js.native
}

object IAppEntry {
  @scala.inline
  def apply(
    qID: String,
    qLastReloadTime: String,
    qMeta: INxMeta,
    qPath: String,
    qReadOnly: Boolean,
    qThumbnail: IStaticContentUrl,
    qTitle: String
  ): IAppEntry = {
    val __obj = js.Dynamic.literal(qID = qID.asInstanceOf[js.Any], qLastReloadTime = qLastReloadTime.asInstanceOf[js.Any], qMeta = qMeta.asInstanceOf[js.Any], qPath = qPath.asInstanceOf[js.Any], qReadOnly = qReadOnly.asInstanceOf[js.Any], qThumbnail = qThumbnail.asInstanceOf[js.Any], qTitle = qTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAppEntry]
  }
  @scala.inline
  implicit class IAppEntryOps[Self <: IAppEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qID")(value.asInstanceOf[js.Any])
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
    def withQPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qPath")(value.asInstanceOf[js.Any])
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

