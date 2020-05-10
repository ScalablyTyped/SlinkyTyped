package typingsSlinky.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSourceConfiguration extends js.Object {
  /**
    * Provides information necessary to create a connector for a database.
    */
  var DatabaseConfiguration: js.UndefOr[typingsSlinky.awsSdk.kendraMod.DatabaseConfiguration] = js.native
  /**
    * Provides information to create a connector for a document repository in an Amazon S3 bucket.
    */
  var S3Configuration: js.UndefOr[S3DataSourceConfiguration] = js.native
  /**
    * Provides information necessary to create a connector for a Microsoft SharePoint site.
    */
  var SharePointConfiguration: js.UndefOr[typingsSlinky.awsSdk.kendraMod.SharePointConfiguration] = js.native
}

object DataSourceConfiguration {
  @scala.inline
  def apply(): DataSourceConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceConfiguration]
  }
  @scala.inline
  implicit class DataSourceConfigurationOps[Self <: DataSourceConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDatabaseConfiguration(value: DatabaseConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DatabaseConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatabaseConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DatabaseConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withS3Configuration(value: S3DataSourceConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3Configuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3Configuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3Configuration")(js.undefined)
        ret
    }
    @scala.inline
    def withSharePointConfiguration(value: SharePointConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SharePointConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSharePointConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SharePointConfiguration")(js.undefined)
        ret
    }
  }
  
}

