package typingsSlinky.googleapis.appengineV1betaMod.appengineV1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An Application resource contains the top-level configuration of an App
  * Engine application.
  */
@js.native
trait SchemaApplication extends js.Object {
  /**
    * Google Apps authentication domain that controls which users can access
    * this application.Defaults to open access for any Google Account.
    */
  var authDomain: js.UndefOr[String] = js.native
  /**
    * Google Cloud Storage bucket that can be used for storing files associated
    * with this application. This bucket is associated with the application and
    * can be used by the gcloud deployment commands.@OutputOnly
    */
  var codeBucket: js.UndefOr[String] = js.native
  /**
    * Google Cloud Storage bucket that can be used by this application to store
    * content.@OutputOnly
    */
  var defaultBucket: js.UndefOr[String] = js.native
  /**
    * Cookie expiration policy for this application.
    */
  var defaultCookieExpiration: js.UndefOr[String] = js.native
  /**
    * Hostname used to reach this application, as resolved by App
    * Engine.@OutputOnly
    */
  var defaultHostname: js.UndefOr[String] = js.native
  /**
    * HTTP path dispatch rules for requests to the application that do not
    * explicitly target a service or version. Rules are order-dependent. Up to
    * 20 dispatch rules can be supported.
    */
  var dispatchRules: js.UndefOr[js.Array[SchemaUrlDispatchRule]] = js.native
  /**
    * The feature specific settings to be used in the application.
    */
  var featureSettings: js.UndefOr[SchemaFeatureSettings] = js.native
  /**
    * The Google Container Registry domain used for storing managed build
    * docker images for this application.
    */
  var gcrDomain: js.UndefOr[String] = js.native
  var iap: js.UndefOr[SchemaIdentityAwareProxy] = js.native
  /**
    * Identifier of the Application resource. This identifier is equivalent to
    * the project ID of the Google Cloud Platform project where you want to
    * deploy your application. Example: myapp.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Location from which this application runs. Application instances run out
    * of the data centers in the specified location, which is also where all of
    * the application&#39;s end user content is stored.Defaults to
    * us-central.View the list of supported locations
    * (https://cloud.google.com/appengine/docs/locations).
    */
  var locationId: js.UndefOr[String] = js.native
  /**
    * Full path to the Application resource in the API. Example:
    * apps/myapp.@OutputOnly
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Serving status of this application.
    */
  var servingStatus: js.UndefOr[String] = js.native
}

object SchemaApplication {
  @scala.inline
  def apply(): SchemaApplication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApplication]
  }
  @scala.inline
  implicit class SchemaApplicationOps[Self <: SchemaApplication] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthDomain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authDomain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authDomain")(js.undefined)
        ret
    }
    @scala.inline
    def withCodeBucket(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeBucket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodeBucket: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeBucket")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultBucket(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultBucket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultBucket: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultBucket")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultCookieExpiration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultCookieExpiration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultCookieExpiration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultCookieExpiration")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultHostname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultHostname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultHostname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultHostname")(js.undefined)
        ret
    }
    @scala.inline
    def withDispatchRules(value: js.Array[SchemaUrlDispatchRule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispatchRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDispatchRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispatchRules")(js.undefined)
        ret
    }
    @scala.inline
    def withFeatureSettings(value: SchemaFeatureSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeatureSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withGcrDomain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gcrDomain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGcrDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gcrDomain")(js.undefined)
        ret
    }
    @scala.inline
    def withIap(value: SchemaIdentityAwareProxy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iap")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withLocationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationId")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withServingStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("servingStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServingStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("servingStatus")(js.undefined)
        ret
    }
  }
  
}

