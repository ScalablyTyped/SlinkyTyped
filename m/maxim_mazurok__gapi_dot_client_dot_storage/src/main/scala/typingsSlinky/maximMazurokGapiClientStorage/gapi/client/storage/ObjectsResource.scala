package typingsSlinky.maximMazurokGapiClientStorage.gapi.client.storage

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientStorage.anon.ContentEncoding
import typingsSlinky.maximMazurokGapiClientStorage.anon.Delimiter
import typingsSlinky.maximMazurokGapiClientStorage.anon.DestinationBucket
import typingsSlinky.maximMazurokGapiClientStorage.anon.DestinationKmsKeyName
import typingsSlinky.maximMazurokGapiClientStorage.anon.DestinationObject
import typingsSlinky.maximMazurokGapiClientStorage.anon.DestinationPredefinedAcl
import typingsSlinky.maximMazurokGapiClientStorage.anon.EndOffset
import typingsSlinky.maximMazurokGapiClientStorage.anon.GenerationIfGenerationMatch
import typingsSlinky.maximMazurokGapiClientStorage.anon.GenerationKey
import typingsSlinky.maximMazurokGapiClientStorage.anon.IfGenerationMatchIfGenerationNotMatch
import typingsSlinky.maximMazurokGapiClientStorage.anon.IfGenerationNotMatch
import typingsSlinky.maximMazurokGapiClientStorage.anon.IfGenerationNotMatchIfMetagenerationMatch
import typingsSlinky.maximMazurokGapiClientStorage.anon.IfSourceGenerationMatch
import typingsSlinky.maximMazurokGapiClientStorage.anon.IfSourceGenerationNotMatch
import typingsSlinky.maximMazurokGapiClientStorage.anon.KeyOauthtoken
import typingsSlinky.maximMazurokGapiClientStorage.anon.KmsKeyName
import typingsSlinky.maximMazurokGapiClientStorage.anon.OauthtokenObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectsResource extends js.Object {
  
  /** Concatenates a list of existing objects into a new object in the same bucket. */
  def compose(request: DestinationBucket): Request[Object] = js.native
  def compose(request: DestinationObject, body: ComposeRequest): Request[Object] = js.native
  
  /** Copies a source object to a destination object. Optionally overrides metadata. */
  def copy(request: DestinationKmsKeyName): Request[Object] = js.native
  def copy(request: DestinationPredefinedAcl, // tslint:disable-next-line:ban-types
  body: Object): Request[Object] = js.native
  
  /** Deletes an object and its metadata. Deletions are permanent if versioning is not enabled for the bucket, or if the generation parameter is used. */
  def delete(): Request[Unit] = js.native
  def delete(request: IfGenerationNotMatch): Request[Unit] = js.native
  
  /** Retrieves an object or its metadata. */
  def get(): Request[Object] = js.native
  def get(request: GenerationIfGenerationMatch): Request[Object] = js.native
  
  /** Returns an IAM policy for the specified object. */
  def getIamPolicy(): Request[Policy] = js.native
  def getIamPolicy(request: GenerationKey): Request[Policy] = js.native
  
  /** Stores a new object and metadata. */
  def insert(request: ContentEncoding): Request[Object] = js.native
  def insert(request: KmsKeyName, // tslint:disable-next-line:ban-types
  body: Object): Request[Object] = js.native
  
  /** Retrieves a list of objects matching the criteria. */
  def list(): Request[Objects] = js.native
  def list(request: Delimiter): Request[Objects] = js.native
  
  /** Patches an object's metadata. */
  def patch(request: IfGenerationMatchIfGenerationNotMatch): Request[Object] = js.native
  def patch(
    request: IfGenerationNotMatchIfMetagenerationMatch,
    // tslint:disable-next-line:ban-types
  body: Object
  ): Request[Object] = js.native
  
  /** Rewrites a source object to a destination object. Optionally overrides metadata. */
  def rewrite(request: IfSourceGenerationMatch): Request[RewriteResponse] = js.native
  def rewrite(request: IfSourceGenerationNotMatch, // tslint:disable-next-line:ban-types
  body: Object): Request[RewriteResponse] = js.native
  
  def setIamPolicy(request: GenerationKey, body: Policy): Request[Policy] = js.native
  /** Updates an IAM policy for the specified object. */
  def setIamPolicy(request: KeyOauthtoken): Request[Policy] = js.native
  
  /** Tests a set of permissions on the given object to see which, if any, are held by the caller. */
  def testIamPermissions(): Request[TestIamPermissionsResponse] = js.native
  def testIamPermissions(request: OauthtokenObject): Request[TestIamPermissionsResponse] = js.native
  
  /** Updates an object's metadata. */
  def update(request: IfGenerationMatchIfGenerationNotMatch): Request[Object] = js.native
  def update(
    request: IfGenerationNotMatchIfMetagenerationMatch,
    // tslint:disable-next-line:ban-types
  body: Object
  ): Request[Object] = js.native
  
  def watchAll(request: Delimiter, body: Channel): Request[Channel] = js.native
  /** Watch for changes on all objects in a bucket. */
  def watchAll(request: EndOffset): Request[Channel] = js.native
}
