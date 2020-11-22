package typingsSlinky.officeJs.global

import typingsSlinky.officeJs.OfficeExtension.ClientObject
import typingsSlinky.officeJs.OfficeExtension.ClientRequestContext
import typingsSlinky.officeJs.OfficeExtension.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////////////////////////////////////////////////
//////////////////////// End Visio APIs ////////////////////////
////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////
//////////////////// Begin PowerPoint APIs /////////////////////
////////////////////////////////////////////////////////////////
@JSGlobal("PowerPoint")
@js.native
object PowerPoint extends js.Object {
  
  /**
    * Creates and opens a new presentation. Optionally, the presentation can be pre-populated with a base64-encoded .pptx file.
    *
    * [Api set: PowerPointApi 1.1]
    *
    * @param base64File Optional. The base64-encoded .pptx file. The default value is null.
    */
  def createPresentation(): js.Promise[Unit] = js.native
  def createPresentation(base64File: String): js.Promise[Unit] = js.native
  
  /**
    * Executes a batch script that performs actions on the PowerPoint object model, using a new RequestContext. When the promise is resolved, any tracked objects that were automatically allocated during execution will be released.
    * @param batch - A function that takes in a RequestContext and returns a promise (typically, just the result of "context.sync()"). The context parameter facilitates requests to the PowerPoint application. Since the Office add-in and the PowerPoint application run in two different processes, the RequestContext is required to get access to the PowerPoint object model from the add-in.
    */
  def run[T](batch: js.Function1[/* context */ typingsSlinky.officeJs.PowerPoint.RequestContext, IPromise[T]]): IPromise[T] = js.native
  /**
    * Executes a batch script that performs actions on the PowerPoint object model, using the RequestContext of previously-created API objects.
    * @param objects - An array of previously-created API objects. The array will be validated to make sure that all of the objects share the same context. The batch will use this shared RequestContext, which means that any changes applied to these objects will be picked up by "context.sync()".
    * @param batch - A function that takes in a RequestContext and returns a promise (typically, just the result of "context.sync()"). The context parameter facilitates requests to the PowerPoint application. Since the Office add-in and the PowerPoint application run in two different processes, the RequestContext is required to get access to the PowerPoint object model from the add-in.
    */
  def run[T](
    objects: js.Array[ClientObject],
    batch: js.Function1[/* context */ typingsSlinky.officeJs.PowerPoint.RequestContext, IPromise[T]]
  ): IPromise[T] = js.native
  /**
    * Executes a batch script that performs actions on the PowerPoint object model, using the RequestContext of a previously-created API object. When the promise is resolved, any tracked objects that were automatically allocated during execution will be released.
    * @param object - A previously-created API object. The batch will use the same RequestContext as the passed-in object, which means that any changes applied to the object will be picked up by "context.sync()".
    * @param batch - A function that takes in a RequestContext and returns a promise (typically, just the result of "context.sync()"). The context parameter facilitates requests to the PowerPoint application. Since the Office add-in and the PowerPoint application run in two different processes, the RequestContext is required to get access to the PowerPoint object model from the add-in.
    */
  def run[T](
    `object`: ClientObject,
    batch: js.Function1[/* context */ typingsSlinky.officeJs.PowerPoint.RequestContext, IPromise[T]]
  ): IPromise[T] = js.native
  
  /**
    * [Api set: PowerPointApi 1.0]
    */
  @js.native
  class Application ()
    extends typingsSlinky.officeJs.PowerPoint.Application
  /* static members */
  @js.native
  object Application extends js.Object {
    
    /**
      * Create a new instance of PowerPoint.Application object
      */
    def newObject(context: ClientRequestContext): typingsSlinky.officeJs.PowerPoint.Application = js.native
  }
  
  @js.native
  object ErrorCodes extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.officeJs.PowerPoint.ErrorCodes with String] = js.native
    
    /* "GeneralException" */ val generalException: typingsSlinky.officeJs.PowerPoint.ErrorCodes.generalException with String = js.native
  }
  
  /**
    * [Api set: PowerPointApi 1.0]
    */
  @js.native
  class Presentation ()
    extends typingsSlinky.officeJs.PowerPoint.Presentation
  
  /**
    * The RequestContext object facilitates requests to the PowerPoint application. Since the Office add-in and the PowerPoint application run in two different processes, the request context is required to get access to the PowerPoint object model from the add-in.
    */
  @js.native
  class RequestContext ()
    extends typingsSlinky.officeJs.PowerPoint.RequestContext {
    def this(url: String) = this()
  }
}
