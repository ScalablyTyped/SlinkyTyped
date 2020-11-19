package typingsSlinky.officeJsPreview.Visio

import typingsSlinky.officeJsPreview.OfficeExtension.ClientObject
import typingsSlinky.officeJsPreview.OfficeExtension.ClientResult
import typingsSlinky.officeJsPreview.OfficeExtension.UpdateOptions
import typingsSlinky.officeJsPreview.Visio.Interfaces.ShapeViewData
import typingsSlinky.officeJsPreview.Visio.Interfaces.ShapeViewLoadOptions
import typingsSlinky.officeJsPreview.Visio.Interfaces.ShapeViewUpdateData
import typingsSlinky.officeJsPreview.anon.Expand
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Bottom
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Center
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Html
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Image
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Left
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Middle
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Right
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Text
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the ShapeView class.
  *
  * [Api set:  1.1]
  */
@js.native
trait ShapeView extends ClientObject {
  
  /**
    *
    * Adds an overlay on top of the shape.
    *
    * [Api set:  1.1]
    *
    * @param OverlayType An Overlay Type. Can be 'Text' or 'Image'.
    * @param Content Content of Overlay.
    * @param OverlayHorizontalAlignment Horizontal Alignment of Overlay. Can be 'Left', 'Center', or 'Right'.
    * @param OverlayVerticalAlignment Vertical Alignment of Overlay. Can be 'Top', 'Middle', 'Bottom'.
    * @param Width Overlay Width.
    * @param Height Overlay Height.
    */
  def addOverlay(
    OverlayType: OverlayType,
    Content: String,
    OverlayHorizontalAlignment: OverlayHorizontalAlignment,
    OverlayVerticalAlignment: OverlayVerticalAlignment,
    Width: Double,
    Height: Double
  ): ClientResult[Double] = js.native
  def addOverlay(
    OverlayType: Html,
    Content: String,
    OverlayHorizontalAlignment: Center,
    OverlayVerticalAlignment: Bottom,
    Width: Double,
    Height: Double
  ): ClientResult[Double] = js.native
  def addOverlay(
    OverlayType: Html,
    Content: String,
    OverlayHorizontalAlignment: Center,
    OverlayVerticalAlignment: Middle,
    Width: Double,
    Height: Double
  ): ClientResult[Double] = js.native
  def addOverlay(
    OverlayType: Html,
    Content: String,
    OverlayHorizontalAlignment: Center,
    OverlayVerticalAlignment: Top,
    Width: Double,
    Height: Double
  ): ClientResult[Double] = js.native
  def addOverlay(
    OverlayType: Html,
    Content: String,
    OverlayHorizontalAlignment: Left,
    OverlayVerticalAlignment: Bottom,
    Width: Double,
    Height: Double
  ): ClientResult[Double] = js.native
  def addOverlay(
    OverlayType: Html,
    Content: String,
    OverlayHorizontalAlignment: Left,
    OverlayVerticalAlignment: Middle,
    Width: Double,
    Height: Double
  ): ClientResult[Double] = js.native
  def addOverlay(
    OverlayType: Html,
    Content: String,
    OverlayHorizontalAlignment: Left,
    OverlayVerticalAlignment: Top,
    Width: Double,
    Height: Double
  ): ClientResult[Double] = js.native
  def addOverlay(
    OverlayType: Html,
    Content: String,
    OverlayHorizontalAlignment: Right,
    OverlayVerticalAlignment: Bottom,
    Width: Double,
    Height: Double
  ): ClientResult[Double] = js.native
  def addOverlay(
    OverlayType: Html,
    Content: String,
    OverlayHorizontalAlignment: Right,
    OverlayVerticalAlignment: Middle,
    Width: Double,
    Height: Double
  ): ClientResult[Double] = js.native
  def addOverlay(
    OverlayType: Html,
    Content: String,
    OverlayHorizontalAlignment: Right,
    OverlayVerticalAlignment: Top,
    Width: Double,
    Height: Double
  ): ClientResult[Double] = js.native
  def addOverlay(
    OverlayType: Image,
    Content: String,
    OverlayHorizontalAlignment: Center,
    OverlayVerticalAlignment: Bottom,
    Width: Double,
    Height: Double
  ): ClientResult[Double] = js.native
  def addOverlay(
    OverlayType: Image,
    Content: String,
    OverlayHorizontalAlignment: Center,
    OverlayVerticalAlignment: Middle,
    Width: Double,
    Height: Double
  ): ClientResult[Double] = js.native
  def addOverlay(
    OverlayType: Image,
    Content: String,
    OverlayHorizontalAlignment: Center,
    OverlayVerticalAlignment: Top,
    Width: Double,
    Height: Double
  ): ClientResult[Double] = js.native
  def addOverlay(
    OverlayType: Image,
    Content: String,
    OverlayHorizontalAlignment: Left,
    OverlayVerticalAlignment: Bottom,
    Width: Double,
    Height: Double
  ): ClientResult[Double] = js.native
  def addOverlay(
    OverlayType: Image,
    Content: String,
    OverlayHorizontalAlignment: Left,
    OverlayVerticalAlignment: Middle,
    Width: Double,
    Height: Double
  ): ClientResult[Double] = js.native
  def addOverlay(
    OverlayType: Image,
    Content: String,
    OverlayHorizontalAlignment: Left,
    OverlayVerticalAlignment: Top,
    Width: Double,
    Height: Double
  ): ClientResult[Double] = js.native
  def addOverlay(
    OverlayType: Image,
    Content: String,
    OverlayHorizontalAlignment: Right,
    OverlayVerticalAlignment: Bottom,
    Width: Double,
    Height: Double
  ): ClientResult[Double] = js.native
  def addOverlay(
    OverlayType: Image,
    Content: String,
    OverlayHorizontalAlignment: Right,
    OverlayVerticalAlignment: Middle,
    Width: Double,
    Height: Double
  ): ClientResult[Double] = js.native
  def addOverlay(
    OverlayType: Image,
    Content: String,
    OverlayHorizontalAlignment: Right,
    OverlayVerticalAlignment: Top,
    Width: Double,
    Height: Double
  ): ClientResult[Double] = js.native
  def addOverlay(
    OverlayType: Text,
    Content: String,
    OverlayHorizontalAlignment: Center,
    OverlayVerticalAlignment: Bottom,
    Width: Double,
    Height: Double
  ): ClientResult[Double] = js.native
  def addOverlay(
    OverlayType: Text,
    Content: String,
    OverlayHorizontalAlignment: Center,
    OverlayVerticalAlignment: Middle,
    Width: Double,
    Height: Double
  ): ClientResult[Double] = js.native
  def addOverlay(
    OverlayType: Text,
    Content: String,
    OverlayHorizontalAlignment: Center,
    OverlayVerticalAlignment: Top,
    Width: Double,
    Height: Double
  ): ClientResult[Double] = js.native
  def addOverlay(
    OverlayType: Text,
    Content: String,
    OverlayHorizontalAlignment: Left,
    OverlayVerticalAlignment: Bottom,
    Width: Double,
    Height: Double
  ): ClientResult[Double] = js.native
  def addOverlay(
    OverlayType: Text,
    Content: String,
    OverlayHorizontalAlignment: Left,
    OverlayVerticalAlignment: Middle,
    Width: Double,
    Height: Double
  ): ClientResult[Double] = js.native
  /**
    *
    * Adds an overlay on top of the shape.
    *
    * [Api set:  1.1]
    *
    * @param OverlayType An Overlay Type. Can be 'Text' or 'Image'.
    * @param Content Content of Overlay.
    * @param OverlayHorizontalAlignment Horizontal Alignment of Overlay. Can be 'Left', 'Center', or 'Right'.
    * @param OverlayVerticalAlignment Vertical Alignment of Overlay. Can be 'Top', 'Middle', 'Bottom'.
    * @param Width Overlay Width.
    * @param Height Overlay Height.
    */
  def addOverlay(
    OverlayType: Text,
    Content: String,
    OverlayHorizontalAlignment: Left,
    OverlayVerticalAlignment: Top,
    Width: Double,
    Height: Double
  ): ClientResult[Double] = js.native
  def addOverlay(
    OverlayType: Text,
    Content: String,
    OverlayHorizontalAlignment: Right,
    OverlayVerticalAlignment: Bottom,
    Width: Double,
    Height: Double
  ): ClientResult[Double] = js.native
  def addOverlay(
    OverlayType: Text,
    Content: String,
    OverlayHorizontalAlignment: Right,
    OverlayVerticalAlignment: Middle,
    Width: Double,
    Height: Double
  ): ClientResult[Double] = js.native
  def addOverlay(
    OverlayType: Text,
    Content: String,
    OverlayHorizontalAlignment: Right,
    OverlayVerticalAlignment: Top,
    Width: Double,
    Height: Double
  ): ClientResult[Double] = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ShapeView: RequestContext = js.native
  
  /**
    *
    * Represents the highlight around the shape.
    *
    * [Api set:  1.1]
    */
  var highlight: Highlight = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Visio.ShapeView` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Visio.ShapeView` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Visio.ShapeView` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ShapeView = js.native
  def load(option: String): ShapeView = js.native
  def load(option: js.Array[String]): ShapeView = js.native
  def load(option: ShapeViewLoadOptions): ShapeView = js.native
  def load(option: Expand): ShapeView = js.native
  
  /**
    *
    * Removes particular overlay or all overlays on the Shape.
    *
    * [Api set:  1.1]
    *
    * @param OverlayId An Overlay Id. Removes the specific overlay id from the shape.
    */
  def removeOverlay(OverlayId: Double): Unit = js.native
  
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Visio.ShapeView): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: ShapeViewUpdateData): Unit = js.native
  def set(properties: ShapeViewUpdateData, options: UpdateOptions): Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: ShapeView): Unit = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Visio.ShapeView object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Visio.Interfaces.ShapeViewData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): ShapeViewData = js.native
}
