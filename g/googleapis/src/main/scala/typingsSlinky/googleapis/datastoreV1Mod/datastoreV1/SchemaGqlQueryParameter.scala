package typingsSlinky.googleapis.datastoreV1Mod.datastoreV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A binding parameter for a GQL query.
  */
@js.native
trait SchemaGqlQueryParameter extends js.Object {
  /**
    * A query cursor. Query cursors are returned in query result batches.
    */
  var cursor: js.UndefOr[String] = js.native
  /**
    * A value parameter.
    */
  var value: js.UndefOr[SchemaValue] = js.native
}

object SchemaGqlQueryParameter {
  @scala.inline
  def apply(): SchemaGqlQueryParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGqlQueryParameter]
  }
  @scala.inline
  implicit class SchemaGqlQueryParameterOps[Self <: SchemaGqlQueryParameter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCursor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCursor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursor")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: SchemaValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

