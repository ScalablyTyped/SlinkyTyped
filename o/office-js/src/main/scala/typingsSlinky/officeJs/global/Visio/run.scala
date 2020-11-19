package typingsSlinky.officeJs.global.Visio

import typingsSlinky.officeJs.OfficeExtension.ClientObject
import typingsSlinky.officeJs.OfficeExtension.ClientRequestContext
import typingsSlinky.officeJs.OfficeExtension.EmbeddedSession
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Visio.run")
@js.native
object run extends js.Object {
  
  /**
    * Executes a batch script that performs actions on the Visio object model, using a new request context. When the promise is resolved, any tracked objects that were automatically allocated during execution will be released.
    * @param batch - A function that takes in an Visio.RequestContext and returns a promise (typically, just the result of "context.sync()"). The context parameter facilitates requests to the Visio application. Since the Office add-in and the Visio application run in two different processes, the request context is required to get access to the Visio object model from the add-in.
    */
  def apply[T](batch: js.Function1[/* context */ typingsSlinky.officeJs.Visio.RequestContext, js.Promise[T]]): js.Promise[T] = js.native
  /**
    * Executes a batch script that performs actions on the Visio object model, using the RequestContext of a previously-created object. When the promise is resolved, any tracked objects that were automatically allocated during execution will be released.
    * @param contextObject - A previously-created Visio.RequestContext. This context will get re-used by the batch function (instead of having a new context created). This means that the batch will be able to pick up changes made to existing API objects, if those objects were derived from this same context.
    * @param batch - A function that takes in a RequestContext and returns a promise (typically, just the result of "context.sync()"). The context parameter facilitates requests to the Visio application. Since the Office add-in and the Visio application run in two different processes, the RequestContext is required to get access to the Visio object model from the add-in.
    * @remarks
    * In addition to this signature, the method also has the following signatures:
    *
    * `run<T>(batch: (context: Visio.RequestContext) => Promise<T>): Promise<T>;`
    *
    * `run<T>(object: OfficeExtension.ClientObject | OfficeExtension.EmbeddedSession, batch: (context: Visio.RequestContext) => Promise<T>): Promise<T>;`
    *
    * `run<T>(objects: OfficeExtension.ClientObject[], batch: (context: Visio.RequestContext) => Promise<T>): Promise<T>;`
    */
  def apply[T](
    contextObject: ClientRequestContext,
    batch: js.Function1[/* context */ typingsSlinky.officeJs.Visio.RequestContext, js.Promise[T]]
  ): js.Promise[T] = js.native
  /**
    * Executes a batch script that performs actions on the Visio object model, using the request context of previously-created API objects.
    * @param objects - An array of previously-created API objects. The array will be validated to make sure that all of the objects share the same context. The batch will use this shared request context, which means that any changes applied to these objects will be picked up by "context.sync()".
    * @param batch - A function that takes in a Visio.RequestContext and returns a promise (typically, just the result of "context.sync()"). When the promise is resolved, any tracked objects that were automatically allocated during execution will be released.
    */
  def apply[T](
    objects: js.Array[ClientObject],
    batch: js.Function1[/* context */ typingsSlinky.officeJs.Visio.RequestContext, js.Promise[T]]
  ): js.Promise[T] = js.native
  /**
    * Executes a batch script that performs actions on the Visio object model, using the request context of a previously-created API object.
    * @param object - A previously-created API object. The batch will use the same request context as the passed-in object, which means that any changes applied to the object will be picked up by "context.sync()".
    * @param batch - A function that takes in an Visio.RequestContext and returns a promise (typically, just the result of "context.sync()"). When the promise is resolved, any tracked objects that were automatically allocated during execution will be released.
    */
  def apply[T](
    `object`: ClientObject,
    batch: js.Function1[/* context */ typingsSlinky.officeJs.Visio.RequestContext, js.Promise[T]]
  ): js.Promise[T] = js.native
  def apply[T](
    `object`: EmbeddedSession,
    batch: js.Function1[/* context */ typingsSlinky.officeJs.Visio.RequestContext, js.Promise[T]]
  ): js.Promise[T] = js.native
}
