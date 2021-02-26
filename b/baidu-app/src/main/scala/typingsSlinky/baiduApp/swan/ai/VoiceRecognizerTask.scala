package typingsSlinky.baiduApp.swan.ai

import typingsSlinky.baiduApp.swan.DataResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VoiceRecognizerTask extends StObject {
  
  // 停止;
  def cancel(): Unit = js.native
  
  // 识别完成;
  def onError(callback: js.Function1[/* res */ VoiceErrorResponse, Unit]): Unit = js.native
  
  // ;有识别结果返回
  def onFinish(callback: js.Function1[/* res */ DataResponse, Unit]): Unit = js.native
  
  // 引擎准备就绪，可以开始说话;
  def onRecognize(callback: js.Function1[/* res */ VoiceRecognizeResponse, Unit]): Unit = js.native
  
  // 取消;
  def onStart(callback: js.Function0[Unit]): Unit = js.native
  
  def start(options: VoiceRecognizerStart): Unit = js.native
  
  // 开始;
  def stop(): Unit = js.native
}
object VoiceRecognizerTask {
  
  @scala.inline
  def apply(
    cancel: () => Unit,
    onError: js.Function1[/* res */ VoiceErrorResponse, Unit] => Unit,
    onFinish: js.Function1[/* res */ DataResponse, Unit] => Unit,
    onRecognize: js.Function1[/* res */ VoiceRecognizeResponse, Unit] => Unit,
    onStart: js.Function0[Unit] => Unit,
    start: VoiceRecognizerStart => Unit,
    stop: () => Unit
  ): VoiceRecognizerTask = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), onError = js.Any.fromFunction1(onError), onFinish = js.Any.fromFunction1(onFinish), onRecognize = js.Any.fromFunction1(onRecognize), onStart = js.Any.fromFunction1(onStart), start = js.Any.fromFunction1(start), stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[VoiceRecognizerTask]
  }
  
  @scala.inline
  implicit class VoiceRecognizerTaskMutableBuilder[Self <: VoiceRecognizerTask] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnError(value: js.Function1[/* res */ VoiceErrorResponse, Unit] => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnFinish(value: js.Function1[/* res */ DataResponse, Unit] => Unit): Self = StObject.set(x, "onFinish", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnRecognize(value: js.Function1[/* res */ VoiceRecognizeResponse, Unit] => Unit): Self = StObject.set(x, "onRecognize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnStart(value: js.Function0[Unit] => Unit): Self = StObject.set(x, "onStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStart(value: VoiceRecognizerStart => Unit): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
  }
}
