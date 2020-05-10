package typingsSlinky.gapiClientSafebrowsing.gapi.client.safebrowsing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Constraints extends js.Object {
  /**
    * Sets the maximum number of entries that the client is willing to have
    * in the local database. This should be a power of 2 between 2&#42;&#42;10 and
    * 2&#42;&#42;20. If zero, no database size limit is set.
    */
  var maxDatabaseEntries: js.UndefOr[Double] = js.native
  /**
    * The maximum size in number of entries. The update will not contain more
    * entries than this value.  This should be a power of 2 between 2&#42;&#42;10 and
    * 2&#42;&#42;20.  If zero, no update size limit is set.
    */
  var maxUpdateEntries: js.UndefOr[Double] = js.native
  /**
    * Requests the list for a specific geographic location. If not set the
    * server may pick that value based on the user's IP address. Expects ISO
    * 3166-1 alpha-2 format.
    */
  var region: js.UndefOr[String] = js.native
  /** The compression types supported by the client. */
  var supportedCompressions: js.UndefOr[js.Array[String]] = js.native
}

object Constraints {
  @scala.inline
  def apply(): Constraints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Constraints]
  }
  @scala.inline
  implicit class ConstraintsOps[Self <: Constraints] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxDatabaseEntries(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDatabaseEntries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxDatabaseEntries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDatabaseEntries")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxUpdateEntries(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxUpdateEntries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxUpdateEntries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxUpdateEntries")(js.undefined)
        ret
    }
    @scala.inline
    def withRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportedCompressions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedCompressions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportedCompressions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedCompressions")(js.undefined)
        ret
    }
  }
  
}

