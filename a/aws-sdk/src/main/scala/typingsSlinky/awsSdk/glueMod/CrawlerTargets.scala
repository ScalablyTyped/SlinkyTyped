package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CrawlerTargets extends js.Object {
  /**
    * Specifies AWS Glue Data Catalog targets.
    */
  var CatalogTargets: js.UndefOr[CatalogTargetList] = js.native
  /**
    * Specifies Amazon DynamoDB targets.
    */
  var DynamoDBTargets: js.UndefOr[DynamoDBTargetList] = js.native
  /**
    * Specifies JDBC targets.
    */
  var JdbcTargets: js.UndefOr[JdbcTargetList] = js.native
  /**
    * Specifies Amazon Simple Storage Service (Amazon S3) targets.
    */
  var S3Targets: js.UndefOr[S3TargetList] = js.native
}

object CrawlerTargets {
  @scala.inline
  def apply(): CrawlerTargets = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CrawlerTargets]
  }
  @scala.inline
  implicit class CrawlerTargetsOps[Self <: CrawlerTargets] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCatalogTargets(value: CatalogTargetList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CatalogTargets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCatalogTargets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CatalogTargets")(js.undefined)
        ret
    }
    @scala.inline
    def withDynamoDBTargets(value: DynamoDBTargetList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DynamoDBTargets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDynamoDBTargets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DynamoDBTargets")(js.undefined)
        ret
    }
    @scala.inline
    def withJdbcTargets(value: JdbcTargetList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JdbcTargets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJdbcTargets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JdbcTargets")(js.undefined)
        ret
    }
    @scala.inline
    def withS3Targets(value: S3TargetList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3Targets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3Targets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3Targets")(js.undefined)
        ret
    }
  }
  
}

