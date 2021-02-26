package typingsSlinky.reactHtml5CameraPhoto.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactHtml5CameraPhoto.anon.Height
import typingsSlinky.reactHtml5CameraPhoto.reactHtml5CameraPhotoStrings.environment
import typingsSlinky.reactHtml5CameraPhoto.reactHtml5CameraPhotoStrings.jpg
import typingsSlinky.reactHtml5CameraPhoto.reactHtml5CameraPhotoStrings.png
import typingsSlinky.reactHtml5CameraPhoto.reactHtml5CameraPhotoStrings.user
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_CameraProps65792503 (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, scala.Nothing] {
  
  @scala.inline
  def idealFacingMode(value: environment | user): this.type = set("idealFacingMode", value.asInstanceOf[js.Any])
  
  @scala.inline
  def idealResolution(value: Height): this.type = set("idealResolution", value.asInstanceOf[js.Any])
  
  @scala.inline
  def imageCompression(value: Double): this.type = set("imageCompression", value.asInstanceOf[js.Any])
  
  @scala.inline
  def imageType(value: png | jpg): this.type = set("imageType", value.asInstanceOf[js.Any])
  
  @scala.inline
  def isDisplayStartCameraError(value: Boolean): this.type = set("isDisplayStartCameraError", value.asInstanceOf[js.Any])
  
  @scala.inline
  def isFullscreen(value: Boolean): this.type = set("isFullscreen", value.asInstanceOf[js.Any])
  
  @scala.inline
  def isImageMirror(value: Boolean): this.type = set("isImageMirror", value.asInstanceOf[js.Any])
  
  @scala.inline
  def isMaxResolution(value: Boolean): this.type = set("isMaxResolution", value.asInstanceOf[js.Any])
  
  @scala.inline
  def isSilentMode(value: Boolean): this.type = set("isSilentMode", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onCameraError(value: /* error */ js.Error => Unit): this.type = set("onCameraError", js.Any.fromFunction1(value))
  
  @scala.inline
  def onCameraStart(value: () => Unit): this.type = set("onCameraStart", js.Any.fromFunction0(value))
  
  @scala.inline
  def onCameraStop(value: () => Unit): this.type = set("onCameraStop", js.Any.fromFunction0(value))
  
  @scala.inline
  def onTakePhoto(value: /* dataUri */ String => Unit): this.type = set("onTakePhoto", js.Any.fromFunction1(value))
  
  @scala.inline
  def onTakePhotoAnimationDone(value: /* dataUri */ String => Unit): this.type = set("onTakePhotoAnimationDone", js.Any.fromFunction1(value))
  
  @scala.inline
  def sizeFactor(value: Double): this.type = set("sizeFactor", value.asInstanceOf[js.Any])
}
