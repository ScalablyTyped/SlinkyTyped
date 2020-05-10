package typingsSlinky.googleapis.safebrowsingV4Mod.safebrowsingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The constraints for this update.
  */
@js.native
trait SchemaConstraints extends js.Object {
  /**
    * A client&#39;s physical location, expressed as a ISO 31166-1 alpha-2
    * region code.
    */
  var deviceLocation: js.UndefOr[String] = js.native
  /**
    * Requests the lists for a specific language. Expects ISO 639 alpha-2
    * format.
    */
  var language: js.UndefOr[String] = js.native
  /**
    * Sets the maximum number of entries that the client is willing to have in
    * the local database. This should be a power of 2 between 2**10 and 2**20.
    * If zero, no database size limit is set.
    */
  var maxDatabaseEntries: js.UndefOr[Double] = js.native
  /**
    * The maximum size in number of entries. The update will not contain more
    * entries than this value.  This should be a power of 2 between 2**10 and
    * 2**20.  If zero, no update size limit is set.
    */
  var maxUpdateEntries: js.UndefOr[Double] = js.native
  /**
    * Requests the list for a specific geographic location. If not set the
    * server may pick that value based on the user&#39;s IP address. Expects
    * ISO 3166-1 alpha-2 format.
    */
  var region: js.UndefOr[String] = js.native
  /**
    * The compression types supported by the client.
    */
  var supportedCompressions: js.UndefOr[js.Array[String]] = js.native
}

object SchemaConstraints {
  @scala.inline
  def apply(): SchemaConstraints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConstraints]
  }
  @scala.inline
  implicit class SchemaConstraintsOps[Self <: SchemaConstraints] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeviceLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
        ret
    }
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

