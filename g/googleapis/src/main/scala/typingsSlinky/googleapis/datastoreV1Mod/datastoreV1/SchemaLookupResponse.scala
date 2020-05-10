package typingsSlinky.googleapis.datastoreV1Mod.datastoreV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response for Datastore.Lookup.
  */
@js.native
trait SchemaLookupResponse extends js.Object {
  /**
    * A list of keys that were not looked up due to resource constraints. The
    * order of results in this field is undefined and has no relation to the
    * order of the keys in the input.
    */
  var deferred: js.UndefOr[js.Array[SchemaKey]] = js.native
  /**
    * Entities found as `ResultType.FULL` entities. The order of results in
    * this field is undefined and has no relation to the order of the keys in
    * the input.
    */
  var found: js.UndefOr[js.Array[SchemaEntityResult]] = js.native
  /**
    * Entities not found as `ResultType.KEY_ONLY` entities. The order of
    * results in this field is undefined and has no relation to the order of
    * the keys in the input.
    */
  var missing: js.UndefOr[js.Array[SchemaEntityResult]] = js.native
}

object SchemaLookupResponse {
  @scala.inline
  def apply(): SchemaLookupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLookupResponse]
  }
  @scala.inline
  implicit class SchemaLookupResponseOps[Self <: SchemaLookupResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeferred(value: js.Array[SchemaKey]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deferred")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeferred: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deferred")(js.undefined)
        ret
    }
    @scala.inline
    def withFound(value: js.Array[SchemaEntityResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("found")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("found")(js.undefined)
        ret
    }
    @scala.inline
    def withMissing(value: js.Array[SchemaEntityResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("missing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMissing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("missing")(js.undefined)
        ret
    }
  }
  
}

