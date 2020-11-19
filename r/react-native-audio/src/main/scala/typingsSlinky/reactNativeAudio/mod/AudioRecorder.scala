package typingsSlinky.reactNativeAudio.mod

import typingsSlinky.reactNativeAudio.anon.AudioFileURL
import typingsSlinky.reactNativeAudio.anon.CurrentTime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-audio", "AudioRecorder")
@js.native
object AudioRecorder extends js.Object {
  
  def checkAuthorizationStatus(): js.Promise[Boolean] = js.native
  
  def onFinished(res: AudioFileURL): Unit = js.native
  
  def onProgress(res: CurrentTime): Unit = js.native
  
  def pauseRecording(): js.Promise[String] = js.native
  
  def prepareRecordingAtPath(path: String, options: RecordingOptions): Unit | js.Promise[String] = js.native
  
  def requestAuthorization(): js.Promise[Boolean] = js.native
  
  def resumeRecording(): js.Promise[String] = js.native
  
  def startRecording(): js.Promise[String] = js.native
  
  def stopRecording(): js.Promise[String] = js.native
}
