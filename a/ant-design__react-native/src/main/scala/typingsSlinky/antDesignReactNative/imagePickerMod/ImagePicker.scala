package typingsSlinky.antDesignReactNative.imagePickerMod

import typingsSlinky.antDesignReactNative.imagePickerStyleMod.ImagePickerStyle
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImagePicker
  extends Component[ImagePickerProps, js.Any, js.Any] {
  
  def addImage(imageObj: js.Any): Unit = js.native
  
  def hideImageRoll(): Unit = js.native
  
  def onImageClick(index: Double): Unit = js.native
  
  def onPressIn(styles: ImagePickerStyle): js.Function0[Unit] = js.native
  
  def onPressOut(styles: ImagePickerStyle): js.Function0[Unit] = js.native
  
  var plusText: js.Any = js.native
  
  var plusWrap: js.Any = js.native
  
  def removeImage(idx: Double): Unit = js.native
  
  def showPicker(): Unit = js.native
}
