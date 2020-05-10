package typingsSlinky.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HighAvailabilityOptions extends js.Object {
  /**
    * Default: false;
    */
  var domainsEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Default: true; Turn on high availability monitoring.
    */
  var ha: js.UndefOr[Boolean] = js.native
  /**
    * Default: 10000; The High availability period for replicaset inquiry
    */
  var haInterval: js.UndefOr[scala.Double] = js.native
  /** The ReadPreference mode as listed here: http://mongodb.github.io/node-mongodb-native/3.1/api/MongoClient.html */
  var readPreference: js.UndefOr[ReadPreferenceOrMode] = js.native
  /** An object representing read preference tags, see: http://mongodb.github.io/node-mongodb-native/3.1/api/ReadPreference.html */
  var readPreferenceTags: js.UndefOr[js.Array[String]] = js.native
}

object HighAvailabilityOptions {
  @scala.inline
  def apply(): HighAvailabilityOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HighAvailabilityOptions]
  }
  @scala.inline
  implicit class HighAvailabilityOptionsOps[Self <: HighAvailabilityOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDomainsEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainsEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainsEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainsEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withHa(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHa: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ha")(js.undefined)
        ret
    }
    @scala.inline
    def withHaInterval(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("haInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHaInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("haInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withReadPreference(value: ReadPreferenceOrMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readPreference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadPreference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readPreference")(js.undefined)
        ret
    }
    @scala.inline
    def withReadPreferenceTags(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readPreferenceTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadPreferenceTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readPreferenceTags")(js.undefined)
        ret
    }
  }
  
}

