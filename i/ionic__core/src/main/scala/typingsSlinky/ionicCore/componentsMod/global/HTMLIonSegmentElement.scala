package typingsSlinky.ionicCore.componentsMod.global

import org.scalablytyped.runtime.Instantiable0
import org.scalajs.dom.raw.EventListenerOptions
import typingsSlinky.ionicCore.componentsMod.Components.IonSegment
import typingsSlinky.ionicCore.stencilPublicRuntimeMod.HTMLStencilElement
import typingsSlinky.std.AddEventListenerOptions
import typingsSlinky.std.EventListenerOrEventListenerObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTMLIonSegmentElement
  extends HTMLStencilElement
     with IonSegment {
  
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
  
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
}
@JSGlobal("HTMLIonSegmentElement")
@js.native
object HTMLIonSegmentElement extends Instantiable0[HTMLIonSegmentElement]
