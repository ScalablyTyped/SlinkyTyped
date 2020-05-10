package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxAppLayout ...
  */
@js.native
trait INxAppLayout extends js.Object {
  /**
    * In Qlik Sense Enterprise, this property corresponds to the app identifier (GUID).
    * In Qlik Sense Desktop, this property corresponds to the full path of the app.
    */
  var qFileName: String = js.native
  /**
    * Is set to true if the app contains data following a script reload.
    */
  var qHasData: Boolean = js.native
  /**
    * Is set to true if a script is defined in the app.
    */
  var qHasScript: Boolean = js.native
  /**
    * If set to true, it means that the app was opened without loading its data.
    */
  var qIsOpenedWithoutData: Boolean = js.native
  /**
    * Date and time of the last reload of the app in ISO format.
    */
  var qLastReloadTime: String = js.native
  /**
    * Information about the locale.
    */
  var qLocaleInfo: ILocaleInfo = js.native
  /**
    * Information on publishing and permissions.
    */
  var qMeta: INxMeta = js.native
  /**
    * Is set to true if the app has been updated since the last save.
    */
  var qModified: Boolean = js.native
  /**
    * If set to true, it means that the app is read-only.
    */
  var qReadOnly: Boolean = js.native
  /**
    * Array of alternate states.
    */
  var qStateNames: js.Array[String] = js.native
  /**
    * App thumbnail.
    */
  var qThumbnail: IStaticContentUrl = js.native
  /**
    * Title of the app.
    */
  var qTitle: String = js.native
}

object INxAppLayout {
  @scala.inline
  def apply(
    qFileName: String,
    qHasData: Boolean,
    qHasScript: Boolean,
    qIsOpenedWithoutData: Boolean,
    qLastReloadTime: String,
    qLocaleInfo: ILocaleInfo,
    qMeta: INxMeta,
    qModified: Boolean,
    qReadOnly: Boolean,
    qStateNames: js.Array[String],
    qThumbnail: IStaticContentUrl,
    qTitle: String
  ): INxAppLayout = {
    val __obj = js.Dynamic.literal(qFileName = qFileName.asInstanceOf[js.Any], qHasData = qHasData.asInstanceOf[js.Any], qHasScript = qHasScript.asInstanceOf[js.Any], qIsOpenedWithoutData = qIsOpenedWithoutData.asInstanceOf[js.Any], qLastReloadTime = qLastReloadTime.asInstanceOf[js.Any], qLocaleInfo = qLocaleInfo.asInstanceOf[js.Any], qMeta = qMeta.asInstanceOf[js.Any], qModified = qModified.asInstanceOf[js.Any], qReadOnly = qReadOnly.asInstanceOf[js.Any], qStateNames = qStateNames.asInstanceOf[js.Any], qThumbnail = qThumbnail.asInstanceOf[js.Any], qTitle = qTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxAppLayout]
  }
  @scala.inline
  implicit class INxAppLayoutOps[Self <: INxAppLayout] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQFileName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qFileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQHasData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qHasData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQHasScript(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qHasScript")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQIsOpenedWithoutData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qIsOpenedWithoutData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQLastReloadTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qLastReloadTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQLocaleInfo(value: ILocaleInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qLocaleInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQMeta(value: INxMeta): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qMeta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQModified(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qModified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQReadOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qReadOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQStateNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qStateNames")(value.asInstanceOf[js.Any])
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

