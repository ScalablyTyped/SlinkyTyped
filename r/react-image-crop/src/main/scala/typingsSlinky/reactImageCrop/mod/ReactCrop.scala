package typingsSlinky.reactImageCrop.mod

import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.MouseEvent
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Component
import typingsSlinky.reactImageCrop.anon.Height
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReactCrop
  extends Component[ReactCropProps, js.Object, js.Any] {
  
  def createCropSelection(): ReactElement = js.native
  
  def crossOverCheck(): Unit = js.native
  
  def dragCrop(): Crop = js.native
  
  def getCropStyle(): CSSProperties = js.native
  
  def getNewSize(): Height = js.native
  
  def makeNewCrop(): Crop = js.native
  
  def onComponentKeyDown(e: MouseEvent): Unit = js.native
  
  def onComponentMouseTouchDown(e: MouseEvent): Unit = js.native
  
  def onCropMouseTouchDown(e: MouseEvent): Unit = js.native
  
  def onDocMouseTouchEnd(e: MouseEvent): Unit = js.native
  
  def onDocMouseTouchMove(e: MouseEvent): Unit = js.native
  
  def onImageLoad(image: HTMLImageElement): Unit = js.native
  
  def resizeCrop(): Crop = js.native
  
  def resolveCrop(crop: Crop, imageWidth: Double, imageHeight: Double): Crop = js.native
  
  def straightenYPath(clientX: Double): Double = js.native
}
