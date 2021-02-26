package typingsSlinky.babylonjs

import org.scalajs.dom.raw.AudioContext
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.IDBFactory
import typingsSlinky.babylonjs.anon.TypeofURL
import typingsSlinky.babylonjs.babylonjsStrings.vrdisplayconnected
import typingsSlinky.babylonjs.babylonjsStrings.vrdisplaydisconnected
import typingsSlinky.babylonjs.babylonjsStrings.vrdisplaypresentchange
import typingsSlinky.std.Float32ArrayConstructor
import typingsSlinky.std.FrameRequestCallback
import typingsSlinky.std.Uint8ArrayConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Mixins
@js.native
trait Window extends StObject {
  
  var AudioContext: org.scalajs.dom.raw.AudioContext = js.native
  
  var CANNON: js.Any = js.native
  
  // WebVR, from specs 1.1
  var DracoDecoderModule: js.Any = js.native
  
  var Float32Array: Float32ArrayConstructor = js.native
  
  var MSGesture: typingsSlinky.std.MSGesture = js.native
  
  var Math: typingsSlinky.babylonjs.Math = js.native
  
  var PointerEvent: js.Any = js.native
  
  var Uint8Array: Uint8ArrayConstructor = js.native
  
  var VRFrameData: js.Any = js.native
  
  var WebGLRenderingContext: typingsSlinky.babylonjs.WebGLRenderingContext = js.native
  
  @JSName("addEventListener")
  def addEventListener_vrdisplayconnected(`type`: vrdisplayconnected, listener: js.Function1[/* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayconnected(`type`: vrdisplayconnected, listener: js.Function1[/* ev */ Event, _], useCapture: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaydisconnected(`type`: vrdisplaydisconnected, listener: js.Function1[/* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaydisconnected(`type`: vrdisplaydisconnected, listener: js.Function1[/* ev */ Event, _], useCapture: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaypresentchange(`type`: vrdisplaypresentchange, listener: js.Function1[/* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaypresentchange(`type`: vrdisplaypresentchange, listener: js.Function1[/* ev */ Event, _], useCapture: Boolean): Unit = js.native
  
  var mozIndexedDB: IDBFactory = js.native
  
  def mozRequestAnimationFrame(callback: FrameRequestCallback): Double = js.native
  
  var mozURL: TypeofURL = js.native
  
  var msIndexedDB: IDBFactory = js.native
  
  var msURL: TypeofURL = js.native
  
  def oRequestAnimationFrame(callback: FrameRequestCallback): Double = js.native
  
  var onvrdisplayconnected: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
  
  var onvrdisplaydisconnected: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
  
  var onvrdisplaypresentchange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
  
  def setImmediate(handler: js.Function1[/* repeated */ js.Any, Unit]): Double = js.native
  
  var webkitAudioContext: AudioContext = js.native
  
  var webkitIndexedDB: IDBFactory = js.native
  
  var webkitURL: TypeofURL = js.native
}
