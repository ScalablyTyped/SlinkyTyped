package typingsSlinky.googleapis.vaultV1Mod.vaultV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Definition of the saved query.
  */
@js.native
trait SchemaSavedQuery extends js.Object {
  /**
    * Output only. The server generated timestamp at which saved query was
    * created.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * Name of the saved query.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * Output only. The matter id of the associated matter. The server does not
    * look at this field during create and always uses matter id in the URL.
    */
  var matterId: js.UndefOr[String] = js.native
  /**
    * The underlying Query object which contains all the information of the
    * saved query.
    */
  var query: js.UndefOr[SchemaQuery] = js.native
  /**
    * A unique identifier for the saved query.
    */
  var savedQueryId: js.UndefOr[String] = js.native
}

object SchemaSavedQuery {
  @scala.inline
  def apply(): SchemaSavedQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSavedQuery]
  }
  @scala.inline
  implicit class SchemaSavedQueryOps[Self <: SchemaSavedQuery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withMatterId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matterId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatterId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matterId")(js.undefined)
        ret
    }
    @scala.inline
    def withQuery(value: SchemaQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(js.undefined)
        ret
    }
    @scala.inline
    def withSavedQueryId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("savedQueryId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSavedQueryId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("savedQueryId")(js.undefined)
        ret
    }
  }
  
}

