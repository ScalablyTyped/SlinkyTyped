package typingsSlinky.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaListUnmappedIdentitiesResponse extends js.Object {
  /**
    * Token to retrieve the next page of results, or empty if there are no more
    * results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  var unmappedIdentities: js.UndefOr[js.Array[SchemaUnmappedIdentity]] = js.native
}

object SchemaListUnmappedIdentitiesResponse {
  @scala.inline
  def apply(): SchemaListUnmappedIdentitiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListUnmappedIdentitiesResponse]
  }
  @scala.inline
  implicit class SchemaListUnmappedIdentitiesResponseOps[Self <: SchemaListUnmappedIdentitiesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(js.undefined)
        ret
    }
    @scala.inline
    def withUnmappedIdentities(value: js.Array[SchemaUnmappedIdentity]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unmappedIdentities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnmappedIdentities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unmappedIdentities")(js.undefined)
        ret
    }
  }
  
}

