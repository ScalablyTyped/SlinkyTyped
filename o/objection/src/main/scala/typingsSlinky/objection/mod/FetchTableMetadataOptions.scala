package typingsSlinky.objection.mod

import typingsSlinky.knex.mod.Knex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FetchTableMetadataOptions extends js.Object {
  var force: js.UndefOr[Boolean] = js.native
  var knex: js.UndefOr[Knex[_, js.Array[_]]] = js.native
  var table: js.UndefOr[String] = js.native
}

object FetchTableMetadataOptions {
  @scala.inline
  def apply(): FetchTableMetadataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FetchTableMetadataOptions]
  }
  @scala.inline
  implicit class FetchTableMetadataOptionsOps[Self <: FetchTableMetadataOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withForce(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("force")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("force")(js.undefined)
        ret
    }
    @scala.inline
    def withKnex(value: Knex[_, js.Array[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("knex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKnex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("knex")(js.undefined)
        ret
    }
    @scala.inline
    def withTable(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("table")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("table")(js.undefined)
        ret
    }
  }
  
}

