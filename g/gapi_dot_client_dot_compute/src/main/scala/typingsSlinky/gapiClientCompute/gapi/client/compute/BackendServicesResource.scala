package typingsSlinky.gapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientCompute.anon.Alt
import typingsSlinky.gapiClientCompute.anon.AltBackendService
import typingsSlinky.gapiClientCompute.anon.AltFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackendServicesResource extends js.Object {
  
  /** Retrieves the list of all BackendService resources, regional and global, available to the specified project. */
  def aggregatedList(request: Alt): Request[BackendServiceAggregatedList] = js.native
  
  /** Deletes the specified BackendService resource. */
  def delete(request: typingsSlinky.gapiClientCompute.anon.BackendService): Request[Operation] = js.native
  
  /** Returns the specified BackendService resource. Get a list of available backend services by making a list() request. */
  def get(request: AltBackendService): Request[BackendService] = js.native
  
  /** Gets the most recent health check results for this BackendService. */
  def getHealth(request: AltBackendService): Request[BackendServiceGroupHealth] = js.native
  
  /**
    * Creates a BackendService resource in the specified project using the data included in the request. There are several restrictions and guidelines to
    * keep in mind when creating a backend service. Read  Restrictions and Guidelines for more information.
    */
  def insert(request: AltFields): Request[Operation] = js.native
  
  /** Retrieves the list of BackendService resources available to the specified project. */
  def list(request: Alt): Request[BackendServiceList] = js.native
  
  /**
    * Patches the specified BackendService resource with the data included in the request. There are several restrictions and guidelines to keep in mind when
    * updating a backend service. Read  Restrictions and Guidelines for more information. This method supports PATCH semantics and uses the JSON merge patch
    * format and processing rules.
    */
  def patch(request: typingsSlinky.gapiClientCompute.anon.BackendService): Request[Operation] = js.native
  
  /**
    * Updates the specified BackendService resource with the data included in the request. There are several restrictions and guidelines to keep in mind when
    * updating a backend service. Read  Restrictions and Guidelines for more information.
    */
  def update(request: typingsSlinky.gapiClientCompute.anon.BackendService): Request[Operation] = js.native
}
object BackendServicesResource {
  
  @scala.inline
  def apply(
    aggregatedList: Alt => Request[BackendServiceAggregatedList],
    delete: typingsSlinky.gapiClientCompute.anon.BackendService => Request[Operation],
    get: AltBackendService => Request[BackendService],
    getHealth: AltBackendService => Request[BackendServiceGroupHealth],
    insert: AltFields => Request[Operation],
    list: Alt => Request[BackendServiceList],
    patch: typingsSlinky.gapiClientCompute.anon.BackendService => Request[Operation],
    update: typingsSlinky.gapiClientCompute.anon.BackendService => Request[Operation]
  ): BackendServicesResource = {
    val __obj = js.Dynamic.literal(aggregatedList = js.Any.fromFunction1(aggregatedList), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getHealth = js.Any.fromFunction1(getHealth), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[BackendServicesResource]
  }
  
  @scala.inline
  implicit class BackendServicesResourceOps[Self <: BackendServicesResource] (val x: Self) extends AnyVal {
    
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
    def setAggregatedList(value: Alt => Request[BackendServiceAggregatedList]): Self = this.set("aggregatedList", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDelete(value: typingsSlinky.gapiClientCompute.anon.BackendService => Request[Operation]): Self = this.set("delete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGet(value: AltBackendService => Request[BackendService]): Self = this.set("get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetHealth(value: AltBackendService => Request[BackendServiceGroupHealth]): Self = this.set("getHealth", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInsert(value: AltFields => Request[Operation]): Self = this.set("insert", js.Any.fromFunction1(value))
    
    @scala.inline
    def setList(value: Alt => Request[BackendServiceList]): Self = this.set("list", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPatch(value: typingsSlinky.gapiClientCompute.anon.BackendService => Request[Operation]): Self = this.set("patch", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdate(value: typingsSlinky.gapiClientCompute.anon.BackendService => Request[Operation]): Self = this.set("update", js.Any.fromFunction1(value))
  }
}
