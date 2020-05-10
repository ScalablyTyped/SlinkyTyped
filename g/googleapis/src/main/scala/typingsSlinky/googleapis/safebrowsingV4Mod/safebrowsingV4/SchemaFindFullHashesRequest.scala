package typingsSlinky.googleapis.safebrowsingV4Mod.safebrowsingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to return full hashes matched by the provided hash prefixes.
  */
@js.native
trait SchemaFindFullHashesRequest extends js.Object {
  /**
    * Client metadata associated with callers of higher-level APIs built on top
    * of the client&#39;s implementation.
    */
  var apiClient: js.UndefOr[SchemaClientInfo] = js.native
  /**
    * The client metadata.
    */
  var client: js.UndefOr[SchemaClientInfo] = js.native
  /**
    * The current client states for each of the client&#39;s local threat
    * lists.
    */
  var clientStates: js.UndefOr[js.Array[String]] = js.native
  /**
    * The lists and hashes to be checked.
    */
  var threatInfo: js.UndefOr[SchemaThreatInfo] = js.native
}

object SchemaFindFullHashesRequest {
  @scala.inline
  def apply(): SchemaFindFullHashesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFindFullHashesRequest]
  }
  @scala.inline
  implicit class SchemaFindFullHashesRequestOps[Self <: SchemaFindFullHashesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApiClient(value: SchemaClientInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiClient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApiClient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiClient")(js.undefined)
        ret
    }
    @scala.inline
    def withClient(value: SchemaClientInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client")(js.undefined)
        ret
    }
    @scala.inline
    def withClientStates(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientStates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientStates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientStates")(js.undefined)
        ret
    }
    @scala.inline
    def withThreatInfo(value: SchemaThreatInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threatInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThreatInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threatInfo")(js.undefined)
        ret
    }
  }
  
}

