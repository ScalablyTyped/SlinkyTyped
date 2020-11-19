package typingsSlinky.gapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientCompute.anon.Alt
import typingsSlinky.gapiClientCompute.anon.AltFields
import typingsSlinky.gapiClientCompute.anon.UserIp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackendBucketsResource extends js.Object {
  
  /** Deletes the specified BackendBucket resource. */
  def delete(request: typingsSlinky.gapiClientCompute.anon.BackendBucket): Request[Operation] = js.native
  
  /** Returns the specified BackendBucket resource. Get a list of available backend buckets by making a list() request. */
  def get(request: UserIp): Request[BackendBucket] = js.native
  
  /** Creates a BackendBucket resource in the specified project using the data included in the request. */
  def insert(request: AltFields): Request[Operation] = js.native
  
  /** Retrieves the list of BackendBucket resources available to the specified project. */
  def list(request: Alt): Request[BackendBucketList] = js.native
  
  /**
    * Updates the specified BackendBucket resource with the data included in the request. This method supports PATCH semantics and uses the JSON merge patch
    * format and processing rules.
    */
  def patch(request: typingsSlinky.gapiClientCompute.anon.BackendBucket): Request[Operation] = js.native
  
  /** Updates the specified BackendBucket resource with the data included in the request. */
  def update(request: typingsSlinky.gapiClientCompute.anon.BackendBucket): Request[Operation] = js.native
}
object BackendBucketsResource {
  
  @scala.inline
  def apply(
    delete: typingsSlinky.gapiClientCompute.anon.BackendBucket => Request[Operation],
    get: UserIp => Request[BackendBucket],
    insert: AltFields => Request[Operation],
    list: Alt => Request[BackendBucketList],
    patch: typingsSlinky.gapiClientCompute.anon.BackendBucket => Request[Operation],
    update: typingsSlinky.gapiClientCompute.anon.BackendBucket => Request[Operation]
  ): BackendBucketsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[BackendBucketsResource]
  }
  
  @scala.inline
  implicit class BackendBucketsResourceOps[Self <: BackendBucketsResource] (val x: Self) extends AnyVal {
    
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
    def setDelete(value: typingsSlinky.gapiClientCompute.anon.BackendBucket => Request[Operation]): Self = this.set("delete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGet(value: UserIp => Request[BackendBucket]): Self = this.set("get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInsert(value: AltFields => Request[Operation]): Self = this.set("insert", js.Any.fromFunction1(value))
    
    @scala.inline
    def setList(value: Alt => Request[BackendBucketList]): Self = this.set("list", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPatch(value: typingsSlinky.gapiClientCompute.anon.BackendBucket => Request[Operation]): Self = this.set("patch", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdate(value: typingsSlinky.gapiClientCompute.anon.BackendBucket => Request[Operation]): Self = this.set("update", js.Any.fromFunction1(value))
  }
}
