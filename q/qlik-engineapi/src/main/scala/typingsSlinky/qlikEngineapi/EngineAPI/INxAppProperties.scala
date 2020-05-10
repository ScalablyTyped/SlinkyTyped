package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxAppProperties
  */
@js.native
trait INxAppProperties extends js.Object {
  /**
    * Last reload time of the app.
    */
  var qLastReloadTime: String = js.native
  /**
    * Internal property reserved for app migration.
    * Patch version of the app.
    * Do not update.
    */
  var qMigrationHash: String = js.native
  /**
    * Internal property reserved for app migration.
    * The app is saved in this version of the product.
    * Do not update.
    */
  var qSavedInProductVersion: String = js.native
  /**
    * App thumbnail.
    */
  var qThumbnail: IStaticContentUrlDef = js.native
  /**
    * App title.
    */
  var qTitle: String = js.native
}

object INxAppProperties {
  @scala.inline
  def apply(
    qLastReloadTime: String,
    qMigrationHash: String,
    qSavedInProductVersion: String,
    qThumbnail: IStaticContentUrlDef,
    qTitle: String
  ): INxAppProperties = {
    val __obj = js.Dynamic.literal(qLastReloadTime = qLastReloadTime.asInstanceOf[js.Any], qMigrationHash = qMigrationHash.asInstanceOf[js.Any], qSavedInProductVersion = qSavedInProductVersion.asInstanceOf[js.Any], qThumbnail = qThumbnail.asInstanceOf[js.Any], qTitle = qTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxAppProperties]
  }
  @scala.inline
  implicit class INxAppPropertiesOps[Self <: INxAppProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQLastReloadTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qLastReloadTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQMigrationHash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qMigrationHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQSavedInProductVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qSavedInProductVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQThumbnail(value: IStaticContentUrlDef): Self = {
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

