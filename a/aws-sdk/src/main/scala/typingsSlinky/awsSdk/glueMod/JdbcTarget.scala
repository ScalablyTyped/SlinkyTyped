package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JdbcTarget extends js.Object {
  /**
    * The name of the connection to use to connect to the JDBC target.
    */
  var ConnectionName: js.UndefOr[typingsSlinky.awsSdk.glueMod.ConnectionName] = js.native
  /**
    * A list of glob patterns used to exclude from the crawl. For more information, see Catalog Tables with a Crawler.
    */
  var Exclusions: js.UndefOr[PathList] = js.native
  /**
    * The path of the JDBC target.
    */
  var Path: js.UndefOr[typingsSlinky.awsSdk.glueMod.Path] = js.native
}

object JdbcTarget {
  @scala.inline
  def apply(): JdbcTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JdbcTarget]
  }
  @scala.inline
  implicit class JdbcTargetOps[Self <: JdbcTarget] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnectionName(value: ConnectionName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectionName")(js.undefined)
        ret
    }
    @scala.inline
    def withExclusions(value: PathList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Exclusions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExclusions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Exclusions")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: Path): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Path")(js.undefined)
        ret
    }
  }
  
}

