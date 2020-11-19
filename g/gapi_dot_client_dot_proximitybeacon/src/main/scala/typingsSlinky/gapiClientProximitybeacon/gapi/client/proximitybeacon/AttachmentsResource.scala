package typingsSlinky.gapiClientProximitybeacon.gapi.client.proximitybeacon

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientProximitybeacon.anon.Alt
import typingsSlinky.gapiClientProximitybeacon.anon.AttachmentName
import typingsSlinky.gapiClientProximitybeacon.anon.BeaconName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttachmentsResource extends js.Object {
  
  /**
    * Deletes multiple attachments on a given beacon. This operation is
    * permanent and cannot be undone.
    *
    * You can optionally specify `namespacedType` to choose which attachments
    * should be deleted. If you do not specify `namespacedType`,  all your
    * attachments on the given beacon will be deleted. You also may explicitly
    * specify `&#42;/&#42;` to delete all.
    *
    * Authenticate using an [OAuth access token](https://developers.google.com/identity/protocols/OAuth2)
    * from a signed-in user with &#42;&#42;Is owner&#42;&#42; or &#42;&#42;Can edit&#42;&#42; permissions in the
    * Google Developers Console project.
    */
  def batchDelete(request: Alt): Request[DeleteAttachmentsResponse] = js.native
  
  /**
    * Associates the given data with the specified beacon. Attachment data must
    * contain two parts:
    * <ul>
    * <li>A namespaced type.</li>
    * <li>The actual attachment data itself.</li>
    * </ul>
    * The namespaced type consists of two parts, the namespace and the type.
    * The namespace must be one of the values returned by the `namespaces`
    * endpoint, while the type can be a string of any characters except for the
    * forward slash (`/`) up to 100 characters in length.
    *
    * Attachment data can be up to 1024 bytes long.
    *
    * Authenticate using an [OAuth access token](https://developers.google.com/identity/protocols/OAuth2)
    * from a signed-in user with &#42;&#42;Is owner&#42;&#42; or &#42;&#42;Can edit&#42;&#42; permissions in the
    * Google Developers Console project.
    */
  def create(request: BeaconName): Request[BeaconAttachment] = js.native
  
  /**
    * Deletes the specified attachment for the given beacon. Each attachment has
    * a unique attachment name (`attachmentName`) which is returned when you
    * fetch the attachment data via this API. You specify this with the delete
    * request to control which attachment is removed. This operation cannot be
    * undone.
    *
    * Authenticate using an [OAuth access token](https://developers.google.com/identity/protocols/OAuth2)
    * from a signed-in user with &#42;&#42;Is owner&#42;&#42; or &#42;&#42;Can edit&#42;&#42; permissions in the
    * Google Developers Console project.
    */
  def delete(request: AttachmentName): Request[js.Object] = js.native
  
  /**
    * Returns the attachments for the specified beacon that match the specified
    * namespaced-type pattern.
    *
    * To control which namespaced types are returned, you add the
    * `namespacedType` query parameter to the request. You must either use
    * `&#42;/&#42;`, to return all attachments, or the namespace must be one of
    * the ones returned from the  `namespaces` endpoint.
    *
    * Authenticate using an [OAuth access token](https://developers.google.com/identity/protocols/OAuth2)
    * from a signed-in user with &#42;&#42;viewer&#42;&#42;, &#42;&#42;Is owner&#42;&#42; or &#42;&#42;Can edit&#42;&#42;
    * permissions in the Google Developers Console project.
    */
  def list(request: Alt): Request[ListBeaconAttachmentsResponse] = js.native
}
object AttachmentsResource {
  
  @scala.inline
  def apply(
    batchDelete: Alt => Request[DeleteAttachmentsResponse],
    create: BeaconName => Request[BeaconAttachment],
    delete: AttachmentName => Request[js.Object],
    list: Alt => Request[ListBeaconAttachmentsResponse]
  ): AttachmentsResource = {
    val __obj = js.Dynamic.literal(batchDelete = js.Any.fromFunction1(batchDelete), create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[AttachmentsResource]
  }
  
  @scala.inline
  implicit class AttachmentsResourceOps[Self <: AttachmentsResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBatchDelete(value: Alt => Request[DeleteAttachmentsResponse]): Self = this.set("batchDelete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreate(value: BeaconName => Request[BeaconAttachment]): Self = this.set("create", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDelete(value: AttachmentName => Request[js.Object]): Self = this.set("delete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setList(value: Alt => Request[ListBeaconAttachmentsResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
}
