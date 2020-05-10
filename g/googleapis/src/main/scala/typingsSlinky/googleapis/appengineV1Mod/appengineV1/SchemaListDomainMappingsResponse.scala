package typingsSlinky.googleapis.appengineV1Mod.appengineV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for DomainMappings.ListDomainMappings.
  */
@js.native
trait SchemaListDomainMappingsResponse extends js.Object {
  /**
    * The domain mappings for the application.
    */
  var domainMappings: js.UndefOr[js.Array[SchemaDomainMapping]] = js.native
  /**
    * Continuation token for fetching the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListDomainMappingsResponse {
  @scala.inline
  def apply(): SchemaListDomainMappingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListDomainMappingsResponse]
  }
  @scala.inline
  implicit class SchemaListDomainMappingsResponseOps[Self <: SchemaListDomainMappingsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDomainMappings(value: js.Array[SchemaDomainMapping]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainMappings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainMappings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainMappings")(js.undefined)
        ret
    }
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
  }
  
}

