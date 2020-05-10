package typingsSlinky.pulumiAws.inputMod.glue

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CrawlerJdbcTarget extends js.Object {
  /**
    * The name of the connection to use to connect to the JDBC target.
    */
  var connectionName: Input[String] = js.native
  /**
    * A list of glob patterns used to exclude from the crawl.
    */
  var exclusions: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The path to the Amazon S3 target.
    */
  var path: Input[String] = js.native
}

object CrawlerJdbcTarget {
  @scala.inline
  def apply(connectionName: Input[String], path: Input[String]): CrawlerJdbcTarget = {
    val __obj = js.Dynamic.literal(connectionName = connectionName.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrawlerJdbcTarget]
  }
  @scala.inline
  implicit class CrawlerJdbcTargetOps[Self <: CrawlerJdbcTarget] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnectionName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExclusions(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclusions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExclusions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclusions")(js.undefined)
        ret
    }
  }
  
}

