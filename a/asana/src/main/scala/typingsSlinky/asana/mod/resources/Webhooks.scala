package typingsSlinky.asana.mod.resources

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.asana.mod.Dispatcher
import typingsSlinky.asana.mod.resources.Webhooks.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * **Webhooks are currently in BETA - The information here may change.**
  *
  * Webhooks allow an application to be notified of changes. This is in addition
  * to the ability to fetch those changes directly as
  * [Events](/developers/api-reference/events) - in fact, Webhooks are just a way
  * to receive Events via HTTP POST at the time they occur instead of polling for
  * them. For services accessible via HTTP this is often vastly more convenient,
  * and if events are not too frequent can be significantly more efficient.
  *
  * In both cases, however, changes are represented as Event objects - refer to
  * the [Events documentation](/developers/api-reference/events) for more
  * information on what data these events contain.
  *
  * **NOTE:** While Webhooks send arrays of Event objects to their target, the
  * Event objects themselves contain *only IDs*, rather than the actual resource
  * they are referencing. So while a normal event you receive via GET /events
  * would look like this:
  *
  *     {\
  *       "resource": {\
  *         "id": 1337,\
  *         "name": "My Task"\
  *       },\
  *       "parent": null,\
  *       "created_at": "2013-08-21T18:20:37.972Z",\
  *       "user": {\
  *         "id": 1123,\
  *         "name": "Tom Bizarro"\
  *       },\
  *       "action": "changed",\
  *       "type": "task"\
  *     }
  *
  * In a Webhook payload you would instead receive this:
  *
  *     {\
  *       "resource": 1337,\
  *       "parent": null,\
  *       "created_at": "2013-08-21T18:20:37.972Z",\
  *       "user": 1123,\
  *       "action": "changed",\
  *       "type": "task"\
  *     }
  *
  * Webhooks themselves contain only the information necessary to deliver the
  * events to the desired target as they are generated.
  * @class
  * @param {Dispatcher} dispatcher The API dispatcher
  */
@js.native
trait Webhooks
  extends typingsSlinky.asana.mod.resources.Resource {
  
  def create(resource: String, target: String, data: js.Any): typingsSlinky.bluebird.mod.^[Type] = js.native
  def create(resource: String, target: String, data: js.Any, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[Type] = js.native
  /**
    * * Establishing a webhook is a two-part process. First, a simple HTTP POST
    * * similar to any other resource creation. Since you could have multiple
    * * webhooks we recommend specifying a unique local id for each target.
    * *
    * * Next comes the confirmation handshake. When a webhook is created, we will
    * * send a test POST to the `target` with an `X-Hook-Secret` header as
    * * described in the
    * * [Resthooks Security documentation](http://resthooks.org/docs/security/).
    * * The target must respond with a `200 OK` and a matching `X-Hook-Secret`
    * * header to confirm that this webhook subscription is indeed expected.
    * *
    * * If you do not acknowledge the webhook's confirmation handshake it will
    * * fail to setup, and you will receive an error in response to your attempt
    * * to create it. This means you need to be able to receive and complete the
    * * webhook *while* the POST request is in-flight.
    *   * @param {String|Number} resource A resource ID to subscribe to. The resource can be a task or project.
    *   * @param {String} target The URL to receive the HTTP POST.
    *   * @param {Object} data Data for the request
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The response from the API
    * @param resource
    * @param target
    * @param data
    * @param dispatchOptions?
    * @return
    */
  def create(resource: Double, target: String, data: js.Any): typingsSlinky.bluebird.mod.^[Type] = js.native
  def create(resource: Double, target: String, data: js.Any, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[Type] = js.native
  
  /**
    * * This method permanently removes a webhook. Note that it may be possible
    * * to receive a request that was already in flight after deleting the
    * * webhook, but no further requests will be issued.
    *   * @param {String} webhook The webhook to delete.
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The response from the API
    * @param webhook
    * @param dispatchOptions?
    * @return
    */
  def deleteById(webhook: String): typingsSlinky.bluebird.mod.^[_] = js.native
  def deleteById(webhook: String, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[_] = js.native
  
  def getAll(workspace: String): typingsSlinky.bluebird.mod.^[_] = js.native
  def getAll(workspace: String, params: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[_] = js.native
  def getAll(workspace: String, params: js.Any): typingsSlinky.bluebird.mod.^[_] = js.native
  def getAll(workspace: String, params: js.Any, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[_] = js.native
  /**
    * * Returns the compact representation of all webhooks your app has
    * * registered for the authenticated user in the given workspace.
    *   * @param {String|Number} workspace The workspace to query for webhooks in.
    *   * @param {Object} [params] Parameters for the request
    *   * @param {String|Number} [params.resource] Only return webhooks for the given resource.
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The response from the API
    * @param workspace
    * @param params?
    * @param dispatchOptions?
    * @return
    */
  def getAll(workspace: Double): typingsSlinky.bluebird.mod.^[_] = js.native
  def getAll(workspace: Double, params: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[_] = js.native
  def getAll(workspace: Double, params: js.Any): typingsSlinky.bluebird.mod.^[_] = js.native
  def getAll(workspace: Double, params: js.Any, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[_] = js.native
  
  /**
    * * Returns the full record for the given webhook.
    *   * @param {String} webhook The webhook to get.
    *   * @param {Object} [params] Parameters for the request
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The requested resource
    * @param webhook
    * @param params?
    * @param dispatchOptions?
    * @return
    */
  def getById(webhook: String): typingsSlinky.bluebird.mod.^[_] = js.native
  def getById(webhook: String, params: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[_] = js.native
  def getById(webhook: String, params: js.Any): typingsSlinky.bluebird.mod.^[_] = js.native
  def getById(webhook: String, params: js.Any, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[_] = js.native
}
object Webhooks extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("asana", "resources.Webhooks")
  @js.native
  class ^ protected () extends Webhooks {
    /**
      * @param dispatcher
      */
    def this(dispatcher: Dispatcher) = this()
  }
  
  @JSImport("asana", "resources.Webhooks")
  @js.native
  val ^ : WebhooksStatic = js.native
  
  @js.native
  trait Filter extends StObject {
    
    var action: String = js.native
    
    var fields: js.Array[String] = js.native
    
    var resource_subtype: String = js.native
    
    var resource_type: String = js.native
  }
  object Filter {
    
    @scala.inline
    def apply(action: String, fields: js.Array[String], resource_subtype: String, resource_type: String): Filter = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], resource_subtype = resource_subtype.asInstanceOf[js.Any], resource_type = resource_type.asInstanceOf[js.Any])
      __obj.asInstanceOf[Filter]
    }
    
    @scala.inline
    implicit class FilterMutableBuilder[Self <: Filter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value :_*))
      
      @scala.inline
      def setResource_subtype(value: String): Self = StObject.set(x, "resource_subtype", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResource_type(value: String): Self = StObject.set(x, "resource_type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Type
    extends typingsSlinky.asana.mod.resources.Resource {
    
    var active: Boolean = js.native
    
    var created_at: String = js.native
    
    var filters: js.Array[Filter] = js.native
    
    var last_failure_at: String = js.native
    
    var last_failure_content: String = js.native
    
    var last_success_at: String = js.native
    
    var resource: typingsSlinky.asana.mod.resources.Resource = js.native
    
    var target: String = js.native
  }
  
  type _To = WebhooksStatic
  
  /* This means you don't have to write `^`, but can instead just say `Webhooks.foo` */
  override def _to: WebhooksStatic = ^
}
