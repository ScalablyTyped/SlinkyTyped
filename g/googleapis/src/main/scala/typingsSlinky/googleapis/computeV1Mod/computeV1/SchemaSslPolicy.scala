package typingsSlinky.googleapis.computeV1Mod.computeV1

import typingsSlinky.googleapis.AnonCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A SSL policy specifies the server-side support for SSL features. This can
  * be attached to a TargetHttpsProxy or a TargetSslProxy. This affects
  * connections between clients and the HTTPS or SSL proxy load balancer. They
  * do not affect the connection between the load balancers and the backends.
  */
@js.native
trait SchemaSslPolicy extends js.Object {
  /**
    * [Output Only] Creation timestamp in RFC3339 text format.
    */
  var creationTimestamp: js.UndefOr[String] = js.native
  /**
    * A list of features enabled when the selected profile is CUSTOM. The -
    * method returns the set of features that can be specified in this list.
    * This field must be empty if the profile is not CUSTOM.
    */
  var customFeatures: js.UndefOr[js.Array[String]] = js.native
  /**
    * An optional description of this resource. Provide this property when you
    * create the resource.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * [Output Only] The list of features enabled in the SSL policy.
    */
  var enabledFeatures: js.UndefOr[js.Array[String]] = js.native
  /**
    * Fingerprint of this resource. A hash of the contents stored in this
    * object. This field is used in optimistic locking. This field will be
    * ignored when inserting a SslPolicy. An up-to-date fingerprint must be
    * provided in order to update the SslPolicy, otherwise the request will
    * fail with error 412 conditionNotMet.  To see the latest fingerprint, make
    * a get() request to retrieve an SslPolicy.
    */
  var fingerprint: js.UndefOr[String] = js.native
  /**
    * [Output Only] The unique identifier for the resource. This identifier is
    * defined by the server.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * [Output only] Type of the resource. Always compute#sslPolicyfor SSL
    * policies.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The minimum version of SSL protocol that can be used by the clients to
    * establish a connection with the load balancer. This can be one of
    * TLS_1_0, TLS_1_1, TLS_1_2.
    */
  var minTlsVersion: js.UndefOr[String] = js.native
  /**
    * Name of the resource. The name must be 1-63 characters long, and comply
    * with RFC1035. Specifically, the name must be 1-63 characters long and
    * match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the
    * first character must be a lowercase letter, and all following characters
    * must be a dash, lowercase letter, or digit, except the last character,
    * which cannot be a dash.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Profile specifies the set of SSL features that can be used by the load
    * balancer when negotiating SSL with clients. This can be one of
    * COMPATIBLE, MODERN, RESTRICTED, or CUSTOM. If using CUSTOM, the set of
    * SSL features to enable must be specified in the customFeatures field.
    */
  var profile: js.UndefOr[String] = js.native
  /**
    * [Output Only] Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * [Output Only] If potential misconfigurations are detected for this SSL
    * policy, this field will be populated with warning messages.
    */
  var warnings: js.UndefOr[js.Array[AnonCode]] = js.native
}

object SchemaSslPolicy {
  @scala.inline
  def apply(): SchemaSslPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSslPolicy]
  }
  @scala.inline
  implicit class SchemaSslPolicyOps[Self <: SchemaSslPolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreationTimestamp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationTimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomFeatures(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customFeatures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomFeatures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customFeatures")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabledFeatures(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabledFeatures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabledFeatures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabledFeatures")(js.undefined)
        ret
    }
    @scala.inline
    def withFingerprint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fingerprint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFingerprint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fingerprint")(js.undefined)
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
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withMinTlsVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minTlsVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinTlsVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minTlsVersion")(js.undefined)
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
    def withProfile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile")(js.undefined)
        ret
    }
    @scala.inline
    def withSelfLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelfLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfLink")(js.undefined)
        ret
    }
    @scala.inline
    def withWarnings(value: js.Array[AnonCode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warnings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWarnings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warnings")(js.undefined)
        ret
    }
  }
  
}

