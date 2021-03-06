package typingsSlinky.officeJsPreview.global

import typingsSlinky.officeJsPreview.OfficeExtension.ClientObject
import typingsSlinky.officeJsPreview.OfficeExtension.ClientRequestContext
import typingsSlinky.officeJsPreview.OfficeExtension.EmbeddedSession
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////////////////////////////////////////////////
/////////////////////// End OneNote APIs ///////////////////////
////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////
/////////////////////// Begin Visio APIs ///////////////////////
////////////////////////////////////////////////////////////////
object Visio {
  
  /**
    *
    * Represents the Application.
    *
    * [Api set:  1.1]
    */
  @JSGlobal("Visio.Application")
  @js.native
  class Application ()
    extends typingsSlinky.officeJsPreview.Visio.Application
  
  /**
    *
    * Represents the Comment.
    *
    * [Api set:  1.1]
    */
  @JSGlobal("Visio.Comment")
  @js.native
  class Comment ()
    extends typingsSlinky.officeJsPreview.Visio.Comment
  
  /**
    *
    * Represents the CommentCollection for a given Shape.
    *
    * [Api set:  1.1]
    */
  @JSGlobal("Visio.CommentCollection")
  @js.native
  class CommentCollection ()
    extends typingsSlinky.officeJsPreview.Visio.CommentCollection
  
  /**
    *
    * Represents the Document class.
    *
    * [Api set:  1.1]
    */
  @JSGlobal("Visio.Document")
  @js.native
  class Document ()
    extends typingsSlinky.officeJsPreview.Visio.Document
  
  /**
    *
    * Represents the DocumentView class.
    *
    * [Api set:  1.1]
    */
  @JSGlobal("Visio.DocumentView")
  @js.native
  class DocumentView ()
    extends typingsSlinky.officeJsPreview.Visio.DocumentView
  
  @JSGlobal("Visio.ErrorCodes")
  @js.native
  object ErrorCodes extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.officeJsPreview.Visio.ErrorCodes with String] = js.native
    
    /* "AccessDenied" */ val accessDenied: typingsSlinky.officeJsPreview.Visio.ErrorCodes.accessDenied with String = js.native
    
    /* "GeneralException" */ val generalException: typingsSlinky.officeJsPreview.Visio.ErrorCodes.generalException with String = js.native
    
    /* "InvalidArgument" */ val invalidArgument: typingsSlinky.officeJsPreview.Visio.ErrorCodes.invalidArgument with String = js.native
    
    /* "ItemNotFound" */ val itemNotFound: typingsSlinky.officeJsPreview.Visio.ErrorCodes.itemNotFound with String = js.native
    
    /* "NotImplemented" */ val notImplemented: typingsSlinky.officeJsPreview.Visio.ErrorCodes.notImplemented with String = js.native
    
    /* "UnsupportedOperation" */ val unsupportedOperation: typingsSlinky.officeJsPreview.Visio.ErrorCodes.unsupportedOperation with String = js.native
  }
  
  /**
    *
    * Represents the Hyperlink.
    *
    * [Api set:  1.1]
    */
  @JSGlobal("Visio.Hyperlink")
  @js.native
  class Hyperlink ()
    extends typingsSlinky.officeJsPreview.Visio.Hyperlink
  
  /**
    *
    * Represents the Hyperlink Collection.
    *
    * [Api set:  1.1]
    */
  @JSGlobal("Visio.HyperlinkCollection")
  @js.native
  class HyperlinkCollection ()
    extends typingsSlinky.officeJsPreview.Visio.HyperlinkCollection
  
  /**
    *
    * Represents the Horizontal Alignment of the Overlay relative to the shape.
    *
    * [Api set:  1.1]
    */
  @JSGlobal("Visio.OverlayHorizontalAlignment")
  @js.native
  object OverlayHorizontalAlignment extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.officeJsPreview.Visio.OverlayHorizontalAlignment with String] = js.native
    
    /* "Center" */ val center: typingsSlinky.officeJsPreview.Visio.OverlayHorizontalAlignment.center with String = js.native
    
    /* "Left" */ val left: typingsSlinky.officeJsPreview.Visio.OverlayHorizontalAlignment.left with String = js.native
    
    /* "Right" */ val right: typingsSlinky.officeJsPreview.Visio.OverlayHorizontalAlignment.right with String = js.native
  }
  
  /**
    *
    * Represents the type of the overlay.
    *
    * [Api set:  1.1]
    */
  @JSGlobal("Visio.OverlayType")
  @js.native
  object OverlayType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.officeJsPreview.Visio.OverlayType with String] = js.native
    
    /* "Html" */ val html: typingsSlinky.officeJsPreview.Visio.OverlayType.html with String = js.native
    
    /* "Image" */ val image: typingsSlinky.officeJsPreview.Visio.OverlayType.image with String = js.native
    
    /* "Text" */ val text: typingsSlinky.officeJsPreview.Visio.OverlayType.text with String = js.native
  }
  
  /**
    *
    * Represents the Vertical Alignment of the Overlay relative to the shape.
    *
    * [Api set:  1.1]
    */
  @JSGlobal("Visio.OverlayVerticalAlignment")
  @js.native
  object OverlayVerticalAlignment extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.officeJsPreview.Visio.OverlayVerticalAlignment with String] = js.native
    
    /* "Bottom" */ val bottom: typingsSlinky.officeJsPreview.Visio.OverlayVerticalAlignment.bottom with String = js.native
    
    /* "Middle" */ val middle: typingsSlinky.officeJsPreview.Visio.OverlayVerticalAlignment.middle with String = js.native
    
    /* "Top" */ val top: typingsSlinky.officeJsPreview.Visio.OverlayVerticalAlignment.top with String = js.native
  }
  
  /**
    *
    * Represents the Page class.
    *
    * [Api set:  1.1]
    */
  @JSGlobal("Visio.Page")
  @js.native
  class Page ()
    extends typingsSlinky.officeJsPreview.Visio.Page
  
  /**
    *
    * Represents a collection of Page objects that are part of the document.
    *
    * [Api set:  1.1]
    */
  @JSGlobal("Visio.PageCollection")
  @js.native
  class PageCollection ()
    extends typingsSlinky.officeJsPreview.Visio.PageCollection
  
  /**
    *
    * Represents the PageView class.
    *
    * [Api set:  1.1]
    */
  @JSGlobal("Visio.PageView")
  @js.native
  class PageView ()
    extends typingsSlinky.officeJsPreview.Visio.PageView
  
  /**
    * The RequestContext object facilitates requests to the Visio application. Since the Office add-in and the Visio application run in two different processes, the request context is required to get access to the Visio object model from the add-in.
    */
  @JSGlobal("Visio.RequestContext")
  @js.native
  class RequestContext ()
    extends typingsSlinky.officeJsPreview.Visio.RequestContext {
    def this(url: String) = this()
    def this(url: EmbeddedSession) = this()
  }
  
  /**
    *
    * Represents the Selection in the page.
    *
    * [Api set:  1.1]
    */
  @JSGlobal("Visio.Selection")
  @js.native
  class Selection ()
    extends typingsSlinky.officeJsPreview.Visio.Selection
  
  /**
    *
    * Represents the Shape class.
    *
    * [Api set:  1.1]
    */
  @JSGlobal("Visio.Shape")
  @js.native
  class Shape ()
    extends typingsSlinky.officeJsPreview.Visio.Shape
  
  /**
    *
    * Represents the Shape Collection.
    *
    * [Api set:  1.1]
    */
  @JSGlobal("Visio.ShapeCollection")
  @js.native
  class ShapeCollection ()
    extends typingsSlinky.officeJsPreview.Visio.ShapeCollection
  
  /**
    *
    * Represents the ShapeDataItem.
    *
    * [Api set:  1.1]
    */
  @JSGlobal("Visio.ShapeDataItem")
  @js.native
  class ShapeDataItem ()
    extends typingsSlinky.officeJsPreview.Visio.ShapeDataItem
  
  /**
    *
    * Represents the ShapeDataItemCollection for a given Shape.
    *
    * [Api set:  1.1]
    */
  @JSGlobal("Visio.ShapeDataItemCollection")
  @js.native
  class ShapeDataItemCollection ()
    extends typingsSlinky.officeJsPreview.Visio.ShapeDataItemCollection
  
  /**
    *
    * Represents the ShapeView class.
    *
    * [Api set:  1.1]
    */
  @JSGlobal("Visio.ShapeView")
  @js.native
  class ShapeView ()
    extends typingsSlinky.officeJsPreview.Visio.ShapeView
  
  /**
    *
    * Toolbar IDs of the app
    *
    * [Api set:  1.1]
    */
  @JSGlobal("Visio.ToolBarType")
  @js.native
  object ToolBarType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.officeJsPreview.Visio.ToolBarType with String] = js.native
    
    /* "CommandBar" */ val commandBar: typingsSlinky.officeJsPreview.Visio.ToolBarType.commandBar with String = js.native
    
    /* "PageNavigationBar" */ val pageNavigationBar: typingsSlinky.officeJsPreview.Visio.ToolBarType.pageNavigationBar with String = js.native
    
    /* "StatusBar" */ val statusBar: typingsSlinky.officeJsPreview.Visio.ToolBarType.statusBar with String = js.native
  }
  
  /**
    * Executes a batch script that performs actions on the Visio object model, using a new request context. When the promise is resolved, any tracked objects that were automatically allocated during execution will be released.
    * @param batch - A function that takes in an Visio.RequestContext and returns a promise (typically, just the result of "context.sync()"). The context parameter facilitates requests to the Visio application. Since the Office add-in and the Visio application run in two different processes, the request context is required to get access to the Visio object model from the add-in.
    */
  @JSGlobal("Visio.run")
  @js.native
  def run[T](
    batch: js.Function1[/* context */ typingsSlinky.officeJsPreview.Visio.RequestContext, js.Promise[T]]
  ): js.Promise[T] = js.native
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
  @JSGlobal("Visio.run")
  @js.native
  def run[T](
    contextObject: ClientRequestContext,
    batch: js.Function1[/* context */ typingsSlinky.officeJsPreview.Visio.RequestContext, js.Promise[T]]
  ): js.Promise[T] = js.native
  /**
    * Executes a batch script that performs actions on the Visio object model, using the request context of previously-created API objects.
    * @param objects - An array of previously-created API objects. The array will be validated to make sure that all of the objects share the same context. The batch will use this shared request context, which means that any changes applied to these objects will be picked up by "context.sync()".
    * @param batch - A function that takes in a Visio.RequestContext and returns a promise (typically, just the result of "context.sync()"). When the promise is resolved, any tracked objects that were automatically allocated during execution will be released.
    */
  @JSGlobal("Visio.run")
  @js.native
  def run[T](
    objects: js.Array[ClientObject],
    batch: js.Function1[/* context */ typingsSlinky.officeJsPreview.Visio.RequestContext, js.Promise[T]]
  ): js.Promise[T] = js.native
  /**
    * Executes a batch script that performs actions on the Visio object model, using the request context of a previously-created API object.
    * @param object - A previously-created API object. The batch will use the same request context as the passed-in object, which means that any changes applied to the object will be picked up by "context.sync()".
    * @param batch - A function that takes in an Visio.RequestContext and returns a promise (typically, just the result of "context.sync()"). When the promise is resolved, any tracked objects that were automatically allocated during execution will be released.
    */
  @JSGlobal("Visio.run")
  @js.native
  def run[T](
    `object`: ClientObject,
    batch: js.Function1[/* context */ typingsSlinky.officeJsPreview.Visio.RequestContext, js.Promise[T]]
  ): js.Promise[T] = js.native
  @JSGlobal("Visio.run")
  @js.native
  def run[T](
    `object`: EmbeddedSession,
    batch: js.Function1[/* context */ typingsSlinky.officeJsPreview.Visio.RequestContext, js.Promise[T]]
  ): js.Promise[T] = js.native
}
