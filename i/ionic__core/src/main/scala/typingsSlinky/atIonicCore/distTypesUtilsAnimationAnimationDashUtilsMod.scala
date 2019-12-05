package typingsSlinky.atIonicCore

import org.scalajs.dom.raw.TransitionEvent
import typingsSlinky.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/utils/animation/animation-utils", JSImport.Namespace)
@js.native
object distTypesUtilsAnimationAnimationDashUtilsMod extends js.Object {
  def addClassToArray(): js.Array[String] = js.native
  def addClassToArray(classes: js.UndefOr[scala.Nothing], className: String): js.Array[String] = js.native
  def addClassToArray(classes: js.UndefOr[scala.Nothing], className: js.Array[String]): js.Array[String] = js.native
  def addClassToArray(classes: js.Array[String]): js.Array[String] = js.native
  def addClassToArray(classes: js.Array[String], className: String): js.Array[String] = js.native
  def addClassToArray(classes: js.Array[String], className: js.Array[String]): js.Array[String] = js.native
  def animationEnd(el: Null, callback: js.Function1[/* ev */ js.UndefOr[TransitionEvent], Unit]): js.Function0[Unit] = js.native
  def animationEnd(el: HTMLElement, callback: js.Function1[/* ev */ js.UndefOr[TransitionEvent], Unit]): js.Function0[Unit] = js.native
  def createKeyframeStylesheet(keyframeName: String, keyframeRules: String, element: org.scalajs.dom.raw.HTMLElement): org.scalajs.dom.raw.HTMLElement = js.native
  def generateKeyframeName(keyframeRules: String): String = js.native
  def generateKeyframeRules(): String = js.native
  def generateKeyframeRules(keyframes: js.Array[_]): String = js.native
  def getStyleContainer(element: org.scalajs.dom.raw.HTMLElement): js.Any = js.native
  def removeStyleProperty(element: org.scalajs.dom.raw.HTMLElement, propertyName: String): Unit = js.native
  def setStyleProperty(element: org.scalajs.dom.raw.HTMLElement, propertyName: String): Unit = js.native
  def setStyleProperty(element: org.scalajs.dom.raw.HTMLElement, propertyName: String, value: String): Unit = js.native
}

