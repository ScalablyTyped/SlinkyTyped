package typingsSlinky.gapiClientStorage.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DestinationKmsKeyName extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.native
  /** Name of the bucket in which to store the new object. Overrides the provided object metadata's bucket value, if any. */
  var destinationBucket: String = js.native
  /**
    * Resource name of the Cloud KMS key, of the form projects/my-project/locations/global/keyRings/my-kr/cryptoKeys/my-key, that will be used to encrypt the
    * object. Overrides the object metadata's kms_key_name value, if any.
    */
  var destinationKmsKeyName: js.UndefOr[String] = js.native
  /**
    * Name of the new object. Required when the object metadata is not otherwise provided. Overrides the object metadata's name value, if any. For
    * information about how to URL encode object names to be path safe, see Encoding URI Path Parts.
    */
  var destinationObject: String = js.native
  /** Apply a predefined set of access controls to the destination object. */
  var destinationPredefinedAcl: js.UndefOr[String] = js.native
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.native
  /**
    * Makes the operation conditional on whether the object's current generation matches the given value. Setting to 0 makes the operation succeed only if
    * there are no live versions of the object.
    */
  var ifGenerationMatch: js.UndefOr[String] = js.native
  /**
    * Makes the operation conditional on whether the object's current generation does not match the given value. If no live object exists, the precondition
    * fails. Setting to 0 makes the operation succeed only if there is a live version of the object.
    */
  var ifGenerationNotMatch: js.UndefOr[String] = js.native
  /** Makes the operation conditional on whether the destination object's current metageneration matches the given value. */
  var ifMetagenerationMatch: js.UndefOr[String] = js.native
  /** Makes the operation conditional on whether the destination object's current metageneration does not match the given value. */
  var ifMetagenerationNotMatch: js.UndefOr[String] = js.native
  /** Makes the operation conditional on whether the source object's current generation matches the given value. */
  var ifSourceGenerationMatch: js.UndefOr[String] = js.native
  /** Makes the operation conditional on whether the source object's current generation does not match the given value. */
  var ifSourceGenerationNotMatch: js.UndefOr[String] = js.native
  /** Makes the operation conditional on whether the source object's current metageneration matches the given value. */
  var ifSourceMetagenerationMatch: js.UndefOr[String] = js.native
  /** Makes the operation conditional on whether the source object's current metageneration does not match the given value. */
  var ifSourceMetagenerationNotMatch: js.UndefOr[String] = js.native
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.native
  /**
    * The maximum number of bytes that will be rewritten per rewrite request. Most callers shouldn't need to specify this parameter - it is primarily in
    * place to support testing. If specified the value must be an integral multiple of 1 MiB (1048576). Also, this only applies to requests where the source
    * and destination span locations and/or storage classes. Finally, this value must not change across rewrite calls else you'll get an error that the
    * rewriteToken is invalid.
    */
  var maxBytesRewrittenPerCall: js.UndefOr[String] = js.native
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.native
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.native
  /** Set of properties to return. Defaults to noAcl, unless the object resource specifies the acl property, when it defaults to full. */
  var projection: js.UndefOr[String] = js.native
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[String] = js.native
  /**
    * Include this field (from the previous rewrite response) on each rewrite request after the first one, until the rewrite response 'done' flag is true.
    * Calls that provide a rewriteToken can omit all other request fields, but if included those fields must match the values provided in the first rewrite
    * request.
    */
  var rewriteToken: js.UndefOr[String] = js.native
  /** Name of the bucket in which to find the source object. */
  var sourceBucket: String = js.native
  /** If present, selects a specific revision of the source object (as opposed to the latest version, the default). */
  var sourceGeneration: js.UndefOr[String] = js.native
  /** Name of the source object. For information about how to URL encode object names to be path safe, see Encoding URI Path Parts. */
  var sourceObject: String = js.native
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[String] = js.native
  /** The project to be billed for this request, for Requester Pays buckets. */
  var userProject: js.UndefOr[String] = js.native
}

object DestinationKmsKeyName {
  @scala.inline
  def apply(destinationBucket: String, destinationObject: String, sourceBucket: String, sourceObject: String): DestinationKmsKeyName = {
    val __obj = js.Dynamic.literal(destinationBucket = destinationBucket.asInstanceOf[js.Any], destinationObject = destinationObject.asInstanceOf[js.Any], sourceBucket = sourceBucket.asInstanceOf[js.Any], sourceObject = sourceObject.asInstanceOf[js.Any])
    __obj.asInstanceOf[DestinationKmsKeyName]
  }
  @scala.inline
  implicit class DestinationKmsKeyNameOps[Self <: DestinationKmsKeyName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestinationBucket(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationBucket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestinationObject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceBucket(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceBucket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceObject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alt")(js.undefined)
        ret
    }
    @scala.inline
    def withDestinationKmsKeyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationKmsKeyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationKmsKeyName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationKmsKeyName")(js.undefined)
        ret
    }
    @scala.inline
    def withDestinationPredefinedAcl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationPredefinedAcl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationPredefinedAcl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationPredefinedAcl")(js.undefined)
        ret
    }
    @scala.inline
    def withFields(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(js.undefined)
        ret
    }
    @scala.inline
    def withIfGenerationMatch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ifGenerationMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIfGenerationMatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ifGenerationMatch")(js.undefined)
        ret
    }
    @scala.inline
    def withIfGenerationNotMatch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ifGenerationNotMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIfGenerationNotMatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ifGenerationNotMatch")(js.undefined)
        ret
    }
    @scala.inline
    def withIfMetagenerationMatch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ifMetagenerationMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIfMetagenerationMatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ifMetagenerationMatch")(js.undefined)
        ret
    }
    @scala.inline
    def withIfMetagenerationNotMatch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ifMetagenerationNotMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIfMetagenerationNotMatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ifMetagenerationNotMatch")(js.undefined)
        ret
    }
    @scala.inline
    def withIfSourceGenerationMatch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ifSourceGenerationMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIfSourceGenerationMatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ifSourceGenerationMatch")(js.undefined)
        ret
    }
    @scala.inline
    def withIfSourceGenerationNotMatch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ifSourceGenerationNotMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIfSourceGenerationNotMatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ifSourceGenerationNotMatch")(js.undefined)
        ret
    }
    @scala.inline
    def withIfSourceMetagenerationMatch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ifSourceMetagenerationMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIfSourceMetagenerationMatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ifSourceMetagenerationMatch")(js.undefined)
        ret
    }
    @scala.inline
    def withIfSourceMetagenerationNotMatch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ifSourceMetagenerationNotMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIfSourceMetagenerationNotMatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ifSourceMetagenerationNotMatch")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxBytesRewrittenPerCall(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxBytesRewrittenPerCall")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxBytesRewrittenPerCall: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxBytesRewrittenPerCall")(js.undefined)
        ret
    }
    @scala.inline
    def withOauth_token(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oauth_token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOauth_token: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oauth_token")(js.undefined)
        ret
    }
    @scala.inline
    def withPrettyPrint(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prettyPrint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrettyPrint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prettyPrint")(js.undefined)
        ret
    }
    @scala.inline
    def withProjection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projection")(js.undefined)
        ret
    }
    @scala.inline
    def withQuotaUser(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quotaUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuotaUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quotaUser")(js.undefined)
        ret
    }
    @scala.inline
    def withRewriteToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rewriteToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRewriteToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rewriteToken")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceGeneration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceGeneration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceGeneration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceGeneration")(js.undefined)
        ret
    }
    @scala.inline
    def withUserIp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userIp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserIp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userIp")(js.undefined)
        ret
    }
    @scala.inline
    def withUserProject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userProject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserProject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userProject")(js.undefined)
        ret
    }
  }
  
}

