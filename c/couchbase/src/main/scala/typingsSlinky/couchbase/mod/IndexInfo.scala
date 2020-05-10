package typingsSlinky.couchbase.mod

import typingsSlinky.couchbase.couchbaseStrings.gsi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IndexInfo extends js.Object {
  /**
    * ID for the index.
    */
  var id: String = js.native
  /**
    * List of index keys.
    */
  var index_key: js.Array[String] = js.native
  /**
    * True if this is a primary index.
    */
  var is_primary: Boolean = js.native
  /**
    * ID for the keyspace to which the index belongs.
    */
  var keyspace_id: String = js.native
  /**
    * Name for the index.
    */
  var name: String = js.native
  /**
    * ID for the namespace to which the index belongs.
    */
  var namespace_id: String = js.native
  /**
    * The current state of the index.
    *
    * Values include `online` and `pending`.
    */
  var state: String = js.native
  /**
    * ID for the datastore to which the index belongs.
    */
  var store_id: String = js.native
  /**
    * The type of view, which will always be `gsi`.
    */
  var using: gsi = js.native
}

object IndexInfo {
  @scala.inline
  def apply(
    id: String,
    index_key: js.Array[String],
    is_primary: Boolean,
    keyspace_id: String,
    name: String,
    namespace_id: String,
    state: String,
    store_id: String,
    using: gsi
  ): IndexInfo = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], index_key = index_key.asInstanceOf[js.Any], is_primary = is_primary.asInstanceOf[js.Any], keyspace_id = keyspace_id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace_id = namespace_id.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], store_id = store_id.asInstanceOf[js.Any], using = using.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexInfo]
  }
  @scala.inline
  implicit class IndexInfoOps[Self <: IndexInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex_key(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index_key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIs_primary(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_primary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyspace_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyspace_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNamespace_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStore_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("store_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsing(value: gsi): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("using")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

