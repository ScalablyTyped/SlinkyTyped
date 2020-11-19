package typingsSlinky.reactCropper.mod

import org.scalajs.dom.raw.HTMLCanvasElement
import typingsSlinky.cropperjs.Cropper
import typingsSlinky.cropperjs.Cropper.CanvasData
import typingsSlinky.cropperjs.Cropper.ContainerData
import typingsSlinky.cropperjs.Cropper.CropBoxData
import typingsSlinky.cropperjs.Cropper.Data
import typingsSlinky.cropperjs.Cropper.DragMode
import typingsSlinky.cropperjs.Cropper.GetCroppedCanvasOptions
import typingsSlinky.cropperjs.Cropper.ImageData
import typingsSlinky.cropperjs.Cropper.SetCanvasDataOptions
import typingsSlinky.cropperjs.Cropper.SetCropBoxDataOptions
import typingsSlinky.cropperjs.Cropper.SetDataOptions
import typingsSlinky.cropperjs.anon.X
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-line no-empty-interface
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.cropperjs.mod.default because Inheritance from two classes. Inlined  */ @js.native
trait ReactCropper
  extends Component[ReactCropperProps, js.Object, js.Any]
     with Cropper {
  
  /* InferMemberOverrides */
  override def clear(): Cropper = js.native
  
  /* InferMemberOverrides */
  override def crop(): Cropper = js.native
  
  /* InferMemberOverrides */
  override def destroy(): Cropper = js.native
  
  /* InferMemberOverrides */
  override def disable(): Cropper = js.native
  
  /* InferMemberOverrides */
  override def enable(): Cropper = js.native
  
  /* InferMemberOverrides */
  override def getCanvasData(): CanvasData = js.native
  
  /* InferMemberOverrides */
  override def getContainerData(): ContainerData = js.native
  
  /* InferMemberOverrides */
  override def getCropBoxData(): CropBoxData = js.native
  
  /* InferMemberOverrides */
  override def getCroppedCanvas(): HTMLCanvasElement = js.native
  /* InferMemberOverrides */
  override def getCroppedCanvas(options: GetCroppedCanvasOptions): HTMLCanvasElement = js.native
  
  /* InferMemberOverrides */
  override def getData(): Data = js.native
  /* InferMemberOverrides */
  override def getData(rounded: Boolean): Data = js.native
  
  /* InferMemberOverrides */
  override def getImageData(): ImageData = js.native
  
  /* InferMemberOverrides */
  override def move(offsetX: Double): Cropper = js.native
  /* InferMemberOverrides */
  override def move(offsetX: Double, offsetY: Double): Cropper = js.native
  
  /* InferMemberOverrides */
  override def moveTo(x: Double): Cropper = js.native
  /* InferMemberOverrides */
  override def moveTo(x: Double, y: Double): Cropper = js.native
  
  def on(eventname: String, callback: js.Function0[Unit]): Unit = js.native
  
  /* InferMemberOverrides */
  override def replace(url: String): Cropper = js.native
  /* InferMemberOverrides */
  override def replace(url: String, onlyColorChanged: Boolean): Cropper = js.native
  
  /* InferMemberOverrides */
  override def reset(): Cropper = js.native
  
  /* InferMemberOverrides */
  override def rotate(degree: Double): Cropper = js.native
  
  /* InferMemberOverrides */
  override def rotateTo(degree: Double): Cropper = js.native
  
  /* InferMemberOverrides */
  override def scale(scaleX: Double): Cropper = js.native
  /* InferMemberOverrides */
  override def scale(scaleX: Double, scaleY: Double): Cropper = js.native
  
  /* InferMemberOverrides */
  override def scaleX(scaleX: Double): Cropper = js.native
  
  /* InferMemberOverrides */
  override def scaleY(scaleY: Double): Cropper = js.native
  
  /* InferMemberOverrides */
  override def setAspectRatio(aspectRatio: Double): Cropper = js.native
  
  /* InferMemberOverrides */
  override def setCanvasData(data: SetCanvasDataOptions): Cropper = js.native
  
  /* InferMemberOverrides */
  override def setCropBoxData(data: SetCropBoxDataOptions): Cropper = js.native
  
  /* InferMemberOverrides */
  override def setData(data: SetDataOptions): Cropper = js.native
  
  /* InferMemberOverrides */
  override def setDragMode(dragMode: DragMode): Cropper = js.native
  
  /* InferMemberOverrides */
  override def zoom(ratio: Double): Cropper = js.native
  
  /* InferMemberOverrides */
  override def zoomTo(ratio: Double): Cropper = js.native
  /* InferMemberOverrides */
  override def zoomTo(ratio: Double, pivot: X): Cropper = js.native
}
