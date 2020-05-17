package typingsSlinky.babylonjs.BABYLON

import org.scalajs.dom.raw.AudioNode
import typingsSlinky.babylonjs.anon.Width
import typingsSlinky.babylonjs.anon.Y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Analyser extends js.Object {
  /**
    * Gets or sets the bar graph amplitude
    * @ignorenaming
    */
  var BARGRAPHAMPLITUDE: Double = js.native
  /**
    * Gets or sets the position of the debug canvas
    * @ignorenaming
    */
  var DEBUGCANVASPOS: Y = js.native
  /**
    * Gets or sets the debug canvas size
    * @ignorenaming
    */
  var DEBUGCANVASSIZE: Width = js.native
  /**
    * Gets or sets the FFT table size
    * @ignorenaming
    */
  var FFT_SIZE: Double = js.native
  /**
    * Gets or sets the smoothing
    * @ignorenaming
    */
  var SMOOTHING: Double = js.native
  var _audioEngine: js.Any = js.native
  var _byteFreqs: js.Any = js.native
  var _byteTime: js.Any = js.native
  var _debugCanvas: js.Any = js.native
  var _debugCanvasContext: js.Any = js.native
  var _floatFreqs: js.Any = js.native
  var _registerFunc: js.Any = js.native
  var _scene: js.Any = js.native
  var _webAudioAnalyser: js.Any = js.native
  /**
    * Connects two audio nodes
    * @param inputAudioNode defines first node to connect
    * @param outputAudioNode defines second node to connect
    */
  def connectAudioNodes(inputAudioNode: AudioNode, outputAudioNode: AudioNode): Unit = js.native
  /**
    * Releases all associated resources
    */
  def dispose(): Unit = js.native
  /**
    * Renders the debug canvas
    */
  def drawDebugCanvas(): Unit = js.native
  /**
    * Gets the current frequency data as a byte array
    * @see https://developer.mozilla.org/en-US/docs/Web/API/AnalyserNode/getByteFrequencyData
    * @returns a Uint8Array
    */
  def getByteFrequencyData(): js.typedarray.Uint8Array = js.native
  /**
    * Gets the current waveform as a byte array
    * @see https://developer.mozilla.org/en-US/docs/Web/API/AnalyserNode/getByteTimeDomainData
    * @returns a Uint8Array
    */
  def getByteTimeDomainData(): js.typedarray.Uint8Array = js.native
  /**
    * Gets the current frequency data as a float array
    * @see https://developer.mozilla.org/en-US/docs/Web/API/AnalyserNode/getByteFrequencyData
    * @returns a Float32Array
    */
  def getFloatFrequencyData(): js.typedarray.Float32Array = js.native
  /**
    * Get the number of data values you will have to play with for the visualization
    * @see https://developer.mozilla.org/en-US/docs/Web/API/AnalyserNode/frequencyBinCount
    * @returns a number
    */
  def getFrequencyBinCount(): Double = js.native
  /**
    * Stops rendering the debug canvas and removes it
    */
  def stopDebugCanvas(): Unit = js.native
}

object Analyser {
  @scala.inline
  def apply(
    BARGRAPHAMPLITUDE: Double,
    DEBUGCANVASPOS: Y,
    DEBUGCANVASSIZE: Width,
    FFT_SIZE: Double,
    SMOOTHING: Double,
    _audioEngine: js.Any,
    _byteFreqs: js.Any,
    _byteTime: js.Any,
    _debugCanvas: js.Any,
    _debugCanvasContext: js.Any,
    _floatFreqs: js.Any,
    _registerFunc: js.Any,
    _scene: js.Any,
    _webAudioAnalyser: js.Any,
    connectAudioNodes: (AudioNode, AudioNode) => Unit,
    dispose: () => Unit,
    drawDebugCanvas: () => Unit,
    getByteFrequencyData: () => js.typedarray.Uint8Array,
    getByteTimeDomainData: () => js.typedarray.Uint8Array,
    getFloatFrequencyData: () => js.typedarray.Float32Array,
    getFrequencyBinCount: () => Double,
    stopDebugCanvas: () => Unit
  ): Analyser = {
    val __obj = js.Dynamic.literal(BARGRAPHAMPLITUDE = BARGRAPHAMPLITUDE.asInstanceOf[js.Any], DEBUGCANVASPOS = DEBUGCANVASPOS.asInstanceOf[js.Any], DEBUGCANVASSIZE = DEBUGCANVASSIZE.asInstanceOf[js.Any], FFT_SIZE = FFT_SIZE.asInstanceOf[js.Any], SMOOTHING = SMOOTHING.asInstanceOf[js.Any], _audioEngine = _audioEngine.asInstanceOf[js.Any], _byteFreqs = _byteFreqs.asInstanceOf[js.Any], _byteTime = _byteTime.asInstanceOf[js.Any], _debugCanvas = _debugCanvas.asInstanceOf[js.Any], _debugCanvasContext = _debugCanvasContext.asInstanceOf[js.Any], _floatFreqs = _floatFreqs.asInstanceOf[js.Any], _registerFunc = _registerFunc.asInstanceOf[js.Any], _scene = _scene.asInstanceOf[js.Any], _webAudioAnalyser = _webAudioAnalyser.asInstanceOf[js.Any], connectAudioNodes = js.Any.fromFunction2(connectAudioNodes), dispose = js.Any.fromFunction0(dispose), drawDebugCanvas = js.Any.fromFunction0(drawDebugCanvas), getByteFrequencyData = js.Any.fromFunction0(getByteFrequencyData), getByteTimeDomainData = js.Any.fromFunction0(getByteTimeDomainData), getFloatFrequencyData = js.Any.fromFunction0(getFloatFrequencyData), getFrequencyBinCount = js.Any.fromFunction0(getFrequencyBinCount), stopDebugCanvas = js.Any.fromFunction0(stopDebugCanvas))
    __obj.asInstanceOf[Analyser]
  }
  @scala.inline
  implicit class AnalyserOps[Self <: Analyser] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBARGRAPHAMPLITUDE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BARGRAPHAMPLITUDE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDEBUGCANVASPOS(value: Y): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DEBUGCANVASPOS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDEBUGCANVASSIZE(value: Width): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DEBUGCANVASSIZE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFFT_SIZE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FFT_SIZE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSMOOTHING(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SMOOTHING")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_audioEngine(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_audioEngine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_byteFreqs(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_byteFreqs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_byteTime(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_byteTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_debugCanvas(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_debugCanvas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_debugCanvasContext(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_debugCanvasContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_floatFreqs(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_floatFreqs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_registerFunc(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_registerFunc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_scene(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_scene")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_webAudioAnalyser(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_webAudioAnalyser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnectAudioNodes(value: (AudioNode, AudioNode) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectAudioNodes")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDispose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDrawDebugCanvas(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawDebugCanvas")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetByteFrequencyData(value: () => js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getByteFrequencyData")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetByteTimeDomainData(value: () => js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getByteTimeDomainData")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetFloatFrequencyData(value: () => js.typedarray.Float32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFloatFrequencyData")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetFrequencyBinCount(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFrequencyBinCount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStopDebugCanvas(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopDebugCanvas")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

