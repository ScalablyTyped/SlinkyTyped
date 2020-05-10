package typingsSlinky.googleapis.safebrowsingV4Mod.safebrowsingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaFindFullHashesResponse extends js.Object {
  /**
    * The full hashes that matched the requested prefixes.
    */
  var matches: js.UndefOr[js.Array[SchemaThreatMatch]] = js.native
  /**
    * The minimum duration the client must wait before issuing any find hashes
    * request. If this field is not set, clients can issue a request as soon as
    * they want.
    */
  var minimumWaitDuration: js.UndefOr[String] = js.native
  /**
    * For requested entities that did not match the threat list, how long to
    * cache the response.
    */
  var negativeCacheDuration: js.UndefOr[String] = js.native
}

object SchemaFindFullHashesResponse {
  @scala.inline
  def apply(): SchemaFindFullHashesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFindFullHashesResponse]
  }
  @scala.inline
  implicit class SchemaFindFullHashesResponseOps[Self <: SchemaFindFullHashesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMatches(value: js.Array[SchemaThreatMatch]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatches: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matches")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimumWaitDuration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumWaitDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumWaitDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumWaitDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withNegativeCacheDuration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negativeCacheDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNegativeCacheDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negativeCacheDuration")(js.undefined)
        ret
    }
  }
  
}

