package typingsSlinky.elasticsearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDocumentResponse extends js.Object {
  var _id: String = js.native
  var _index: String = js.native
  var _shards: ShardsResponse = js.native
  var _type: String = js.native
  var _version: Double = js.native
  var found: Boolean = js.native
  var result: String = js.native
}

object DeleteDocumentResponse {
  @scala.inline
  def apply(
    _id: String,
    _index: String,
    _shards: ShardsResponse,
    _type: String,
    _version: Double,
    found: Boolean,
    result: String
  ): DeleteDocumentResponse = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], _index = _index.asInstanceOf[js.Any], _shards = _shards.asInstanceOf[js.Any], _type = _type.asInstanceOf[js.Any], _version = _version.asInstanceOf[js.Any], found = found.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDocumentResponse]
  }
  @scala.inline
  implicit class DeleteDocumentResponseOps[Self <: DeleteDocumentResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_index(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_shards(value: ShardsResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_shards")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_version(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFound(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("found")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResult(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

