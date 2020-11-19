package typingsSlinky.restfulJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MemberEndpoint extends Endpoint[MemberEndpoint] {
  
  /**
    * Target a child collection name.
    * @param name
    */
  def all(name: String): CollectionEndpoint = js.native
  
  def allUrl(name: String, url: String): CollectionEndpoint = js.native
  
  def customUrl(): String = js.native
  def customUrl(url: String): MemberEndpoint = js.native
  
  /**
    * Delete a member. Returns a promise with the response.
    * @param data
    * @param headers
    */
  def delete[T](): js.Promise[MemberResponse[T]] = js.native
  def delete[T](data: js.UndefOr[scala.Nothing], headers: Headers): js.Promise[MemberResponse[T]] = js.native
  def delete[T](data: js.Any): js.Promise[MemberResponse[T]] = js.native
  def delete[T](data: js.Any, headers: Headers): js.Promise[MemberResponse[T]] = js.native
  
  /**
    * Get a member. Returns a promise with an entity.
    * @param params
    * @param headers
    */
  def get[T](): js.Promise[MemberResponse[T]] = js.native
  def get[T](params: js.UndefOr[scala.Nothing], headers: Headers): js.Promise[MemberResponse[T]] = js.native
  def get[T](params: js.Any): js.Promise[MemberResponse[T]] = js.native
  def get[T](params: js.Any, headers: Headers): js.Promise[MemberResponse[T]] = js.native
  
  /**
    * Perform a HEAD request on a member. Returns a promise with the response.
    * @param headers
    */
  def head[T](): js.Promise[MemberResponse[T]] = js.native
  def head[T](headers: js.Any): js.Promise[MemberResponse[T]] = js.native
  
  /**
    * Target a child member in a collection name.
    * @param name
    * @param id
    */
  def one(name: String, id: js.Any): MemberEndpoint = js.native
  
  def oneUrl(name: String, url: String): MemberEndpoint = js.native
  
  /**
    * Patch a member. Returns a promise with the response.
    * @param data
    * @param headers
    */
  def patch[T](data: js.Any): js.Promise[MemberResponse[T]] = js.native
  def patch[T](data: js.Any, headers: Headers): js.Promise[MemberResponse[T]] = js.native
  
  /**
    * Update a member. Returns a promise with the response.
    * @param data
    * @param headers
    */
  def put[T](data: js.Any): js.Promise[MemberResponse[T]] = js.native
  def put[T](data: js.Any, headers: Headers): js.Promise[MemberResponse[T]] = js.native
}
