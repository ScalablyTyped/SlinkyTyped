package typingsSlinky.googleAppsScript.GoogleAppsScript.Bigquery.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BigtableOptions extends js.Object {
  var columnFamilies: js.UndefOr[js.Array[BigtableColumnFamily]] = js.native
  var ignoreUnspecifiedColumnFamilies: js.UndefOr[Boolean] = js.native
  var readRowkeyAsString: js.UndefOr[Boolean] = js.native
}

object BigtableOptions {
  @scala.inline
  def apply(): BigtableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BigtableOptions]
  }
  @scala.inline
  implicit class BigtableOptionsOps[Self <: BigtableOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnFamilies(value: js.Array[BigtableColumnFamily]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnFamilies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnFamilies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnFamilies")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreUnspecifiedColumnFamilies(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreUnspecifiedColumnFamilies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreUnspecifiedColumnFamilies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreUnspecifiedColumnFamilies")(js.undefined)
        ret
    }
    @scala.inline
    def withReadRowkeyAsString(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readRowkeyAsString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadRowkeyAsString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readRowkeyAsString")(js.undefined)
        ret
    }
  }
  
}

