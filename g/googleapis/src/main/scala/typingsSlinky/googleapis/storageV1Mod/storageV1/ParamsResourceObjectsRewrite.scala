package typingsSlinky.googleapis.storageV1Mod.storageV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceObjectsRewrite extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Name of the bucket in which to store the new object. Overrides the
    * provided object metadata's bucket value, if any.
    */
  var destinationBucket: js.UndefOr[String] = js.native
  
  /**
    * Resource name of the Cloud KMS key, of the form
    * projects/my-project/locations/global/keyRings/my-kr/cryptoKeys/my-key,
    * that will be used to encrypt the object. Overrides the object metadata's
    * kms_key_name value, if any.
    */
  var destinationKmsKeyName: js.UndefOr[String] = js.native
  
  /**
    * Name of the new object. Required when the object metadata is not
    * otherwise provided. Overrides the object metadata's name value, if any.
    * For information about how to URL encode object names to be path safe, see
    * Encoding URI Path Parts.
    */
  var destinationObject: js.UndefOr[String] = js.native
  
  /**
    * Apply a predefined set of access controls to the destination object.
    */
  var destinationPredefinedAcl: js.UndefOr[String] = js.native
  
  /**
    * Makes the operation conditional on whether the object's current
    * generation matches the given value. Setting to 0 makes the operation
    * succeed only if there are no live versions of the object.
    */
  var ifGenerationMatch: js.UndefOr[String] = js.native
  
  /**
    * Makes the operation conditional on whether the object's current
    * generation does not match the given value. If no live object exists, the
    * precondition fails. Setting to 0 makes the operation succeed only if
    * there is a live version of the object.
    */
  var ifGenerationNotMatch: js.UndefOr[String] = js.native
  
  /**
    * Makes the operation conditional on whether the destination object's
    * current metageneration matches the given value.
    */
  var ifMetagenerationMatch: js.UndefOr[String] = js.native
  
  /**
    * Makes the operation conditional on whether the destination object's
    * current metageneration does not match the given value.
    */
  var ifMetagenerationNotMatch: js.UndefOr[String] = js.native
  
  /**
    * Makes the operation conditional on whether the source object's current
    * generation matches the given value.
    */
  var ifSourceGenerationMatch: js.UndefOr[String] = js.native
  
  /**
    * Makes the operation conditional on whether the source object's current
    * generation does not match the given value.
    */
  var ifSourceGenerationNotMatch: js.UndefOr[String] = js.native
  
  /**
    * Makes the operation conditional on whether the source object's current
    * metageneration matches the given value.
    */
  var ifSourceMetagenerationMatch: js.UndefOr[String] = js.native
  
  /**
    * Makes the operation conditional on whether the source object's current
    * metageneration does not match the given value.
    */
  var ifSourceMetagenerationNotMatch: js.UndefOr[String] = js.native
  
  /**
    * The maximum number of bytes that will be rewritten per rewrite request.
    * Most callers shouldn't need to specify this parameter - it is primarily
    * in place to support testing. If specified the value must be an integral
    * multiple of 1 MiB (1048576). Also, this only applies to requests where
    * the source and destination span locations and/or storage classes.
    * Finally, this value must not change across rewrite calls else you'll get
    * an error that the rewriteToken is invalid.
    */
  var maxBytesRewrittenPerCall: js.UndefOr[String] = js.native
  
  /**
    * Set of properties to return. Defaults to noAcl, unless the object
    * resource specifies the acl property, when it defaults to full.
    */
  var projection: js.UndefOr[String] = js.native
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaObject] = js.native
  
  /**
    * Include this field (from the previous rewrite response) on each rewrite
    * request after the first one, until the rewrite response 'done' flag is
    * true. Calls that provide a rewriteToken can omit all other request
    * fields, but if included those fields must match the values provided in
    * the first rewrite request.
    */
  var rewriteToken: js.UndefOr[String] = js.native
  
  /**
    * Name of the bucket in which to find the source object.
    */
  var sourceBucket: js.UndefOr[String] = js.native
  
  /**
    * If present, selects a specific revision of the source object (as opposed
    * to the latest version, the default).
    */
  var sourceGeneration: js.UndefOr[String] = js.native
  
  /**
    * Name of the source object. For information about how to URL encode object
    * names to be path safe, see Encoding URI Path Parts.
    */
  var sourceObject: js.UndefOr[String] = js.native
  
  /**
    * The project to be billed for this request. Required for Requester Pays
    * buckets.
    */
  var userProject: js.UndefOr[String] = js.native
}
object ParamsResourceObjectsRewrite {
  
  @scala.inline
  def apply(): ParamsResourceObjectsRewrite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceObjectsRewrite]
  }
  
  @scala.inline
  implicit class ParamsResourceObjectsRewriteMutableBuilder[Self <: ParamsResourceObjectsRewrite] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setDestinationBucket(value: String): Self = StObject.set(x, "destinationBucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationBucketUndefined: Self = StObject.set(x, "destinationBucket", js.undefined)
    
    @scala.inline
    def setDestinationKmsKeyName(value: String): Self = StObject.set(x, "destinationKmsKeyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationKmsKeyNameUndefined: Self = StObject.set(x, "destinationKmsKeyName", js.undefined)
    
    @scala.inline
    def setDestinationObject(value: String): Self = StObject.set(x, "destinationObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationObjectUndefined: Self = StObject.set(x, "destinationObject", js.undefined)
    
    @scala.inline
    def setDestinationPredefinedAcl(value: String): Self = StObject.set(x, "destinationPredefinedAcl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationPredefinedAclUndefined: Self = StObject.set(x, "destinationPredefinedAcl", js.undefined)
    
    @scala.inline
    def setIfGenerationMatch(value: String): Self = StObject.set(x, "ifGenerationMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIfGenerationMatchUndefined: Self = StObject.set(x, "ifGenerationMatch", js.undefined)
    
    @scala.inline
    def setIfGenerationNotMatch(value: String): Self = StObject.set(x, "ifGenerationNotMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIfGenerationNotMatchUndefined: Self = StObject.set(x, "ifGenerationNotMatch", js.undefined)
    
    @scala.inline
    def setIfMetagenerationMatch(value: String): Self = StObject.set(x, "ifMetagenerationMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIfMetagenerationMatchUndefined: Self = StObject.set(x, "ifMetagenerationMatch", js.undefined)
    
    @scala.inline
    def setIfMetagenerationNotMatch(value: String): Self = StObject.set(x, "ifMetagenerationNotMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIfMetagenerationNotMatchUndefined: Self = StObject.set(x, "ifMetagenerationNotMatch", js.undefined)
    
    @scala.inline
    def setIfSourceGenerationMatch(value: String): Self = StObject.set(x, "ifSourceGenerationMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIfSourceGenerationMatchUndefined: Self = StObject.set(x, "ifSourceGenerationMatch", js.undefined)
    
    @scala.inline
    def setIfSourceGenerationNotMatch(value: String): Self = StObject.set(x, "ifSourceGenerationNotMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIfSourceGenerationNotMatchUndefined: Self = StObject.set(x, "ifSourceGenerationNotMatch", js.undefined)
    
    @scala.inline
    def setIfSourceMetagenerationMatch(value: String): Self = StObject.set(x, "ifSourceMetagenerationMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIfSourceMetagenerationMatchUndefined: Self = StObject.set(x, "ifSourceMetagenerationMatch", js.undefined)
    
    @scala.inline
    def setIfSourceMetagenerationNotMatch(value: String): Self = StObject.set(x, "ifSourceMetagenerationNotMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIfSourceMetagenerationNotMatchUndefined: Self = StObject.set(x, "ifSourceMetagenerationNotMatch", js.undefined)
    
    @scala.inline
    def setMaxBytesRewrittenPerCall(value: String): Self = StObject.set(x, "maxBytesRewrittenPerCall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxBytesRewrittenPerCallUndefined: Self = StObject.set(x, "maxBytesRewrittenPerCall", js.undefined)
    
    @scala.inline
    def setProjection(value: String): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaObject): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    @scala.inline
    def setRewriteToken(value: String): Self = StObject.set(x, "rewriteToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRewriteTokenUndefined: Self = StObject.set(x, "rewriteToken", js.undefined)
    
    @scala.inline
    def setSourceBucket(value: String): Self = StObject.set(x, "sourceBucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceBucketUndefined: Self = StObject.set(x, "sourceBucket", js.undefined)
    
    @scala.inline
    def setSourceGeneration(value: String): Self = StObject.set(x, "sourceGeneration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceGenerationUndefined: Self = StObject.set(x, "sourceGeneration", js.undefined)
    
    @scala.inline
    def setSourceObject(value: String): Self = StObject.set(x, "sourceObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceObjectUndefined: Self = StObject.set(x, "sourceObject", js.undefined)
    
    @scala.inline
    def setUserProject(value: String): Self = StObject.set(x, "userProject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserProjectUndefined: Self = StObject.set(x, "userProject", js.undefined)
  }
}
