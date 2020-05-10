package typingsSlinky.pulumiAws.inputMod.glue

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CrawlerCatalogTarget extends js.Object {
  /**
    * The name of the Glue database to be synchronized.
    */
  var databaseName: Input[String] = js.native
  /**
    * A list of catalog tables to be synchronized.
    */
  var tables: Input[js.Array[Input[String]]] = js.native
}

object CrawlerCatalogTarget {
  @scala.inline
  def apply(databaseName: Input[String], tables: Input[js.Array[Input[String]]]): CrawlerCatalogTarget = {
    val __obj = js.Dynamic.literal(databaseName = databaseName.asInstanceOf[js.Any], tables = tables.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrawlerCatalogTarget]
  }
  @scala.inline
  implicit class CrawlerCatalogTargetOps[Self <: CrawlerCatalogTarget] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDatabaseName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("databaseName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTables(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tables")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

