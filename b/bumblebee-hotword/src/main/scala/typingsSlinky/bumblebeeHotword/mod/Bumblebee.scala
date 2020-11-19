package typingsSlinky.bumblebeeHotword.mod

import org.scalajs.dom.raw.AnalyserNode
import org.scalajs.dom.raw.GainNode
import typingsSlinky.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bumblebee extends EventEmitter {
  
  def addHotword(name: String): Unit = js.native
  def addHotword(name: String, data: js.UndefOr[scala.Nothing], sensitivity: Double): Unit = js.native
  def addHotword(name: String, data: js.typedarray.Uint8Array): Unit = js.native
  def addHotword(name: String, data: js.typedarray.Uint8Array, sensitivity: Double): Unit = js.native
  
  def audioAnalyserCallback(audioAnalyser: AnalyserNode, gainNode: GainNode): Unit = js.native
  
  def audioProcessCallback(data: js.Any, sampleRate: js.Any): Unit = js.native
  
  def detectionCallback(keyword: String): Unit = js.native
  
  def errorCallback(e: js.Error): Unit = js.native
  
  def setHotword(w: String): Unit = js.native
  
  def setMicVolume(vol: Double): Unit = js.native
  
  def setMuted(muted: Boolean): Unit = js.native
  
  def setSensitivity(s: Double): Unit = js.native
  
  def setVoiceProcessor(Proc: VoiceProcessor): Unit = js.native
  
  def setWorkersPath(path: String): Unit = js.native
  
  def start(): Unit = js.native
  
  def stop(): Unit = js.native
}
