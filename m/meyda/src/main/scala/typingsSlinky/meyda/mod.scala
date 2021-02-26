package typingsSlinky.meyda

import org.scalajs.dom.raw.AudioContext
import org.scalajs.dom.raw.AudioNode
import typingsSlinky.meyda.anon.Imag
import typingsSlinky.meyda.anon.PartialMeydaFeaturesObjec
import typingsSlinky.meyda.anon.Specific
import typingsSlinky.std.ArrayLike
import typingsSlinky.std.ScriptProcessorNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("meyda", "EXTRACTION_STARTED")
  @js.native
  val EXTRACTION_STARTED: Boolean = js.native
  
  @JSImport("meyda", "MeydaAnalyzer")
  @js.native
  class MeydaAnalyzer () extends StObject {
    
    def get(): PartialMeydaFeaturesObjec | Null = js.native
    def get(features: js.Array[MeydaAudioFeature]): PartialMeydaFeaturesObjec | Null = js.native
    def get(features: MeydaAudioFeature): PartialMeydaFeaturesObjec | Null = js.native
    
    def setSource(source: AudioNode): Unit = js.native
    
    def start(): Unit = js.native
    def start(features: js.Array[MeydaAudioFeature]): Unit = js.native
    def start(features: MeydaAudioFeature): Unit = js.native
    
    def stop(): Unit = js.native
  }
  
  @JSImport("meyda", "audioContext")
  @js.native
  val audioContext: AudioContext | Null = js.native
  
  @JSImport("meyda", "bufferSize")
  @js.native
  val bufferSize: Double = js.native
  
  @JSImport("meyda", "callback")
  @js.native
  def callback(features: PartialMeydaFeaturesObjec): Unit | Null = js.native
  
  @JSImport("meyda", "chromaBands")
  @js.native
  val chromaBands: Double = js.native
  
  @JSImport("meyda", "createMeydaAnalyzer")
  @js.native
  def createMeydaAnalyzer(options: MeydaAnalyzerOptions): MeydaAnalyzer = js.native
  
  @JSImport("meyda", "extract")
  @js.native
  def extract(feature: js.Array[MeydaAudioFeature], signal: MeydaSignal): PartialMeydaFeaturesObjec | Null = js.native
  @JSImport("meyda", "extract")
  @js.native
  def extract(feature: js.Array[MeydaAudioFeature], signal: MeydaSignal, previousSignal: MeydaSignal): PartialMeydaFeaturesObjec | Null = js.native
  @JSImport("meyda", "extract")
  @js.native
  def extract(feature: MeydaAudioFeature, signal: MeydaSignal): PartialMeydaFeaturesObjec | Null = js.native
  @JSImport("meyda", "extract")
  @js.native
  def extract(feature: MeydaAudioFeature, signal: MeydaSignal, previousSignal: MeydaSignal): PartialMeydaFeaturesObjec | Null = js.native
  
  @JSImport("meyda", "featureExtractors")
  @js.native
  val featureExtractors: js.Any = js.native
  
  @JSImport("meyda", "melBands")
  @js.native
  val melBands: Double = js.native
  
  @JSImport("meyda", "numberOfMFCCCoefficients")
  @js.native
  val numberOfMFCCCoefficients: Double = js.native
  
  @JSImport("meyda", "sampleRate")
  @js.native
  val sampleRate: Double = js.native
  
  @JSImport("meyda", "spn")
  @js.native
  val spn: ScriptProcessorNode | Null = js.native
  
  @JSImport("meyda", "windowing")
  @js.native
  def windowing(signal: MeydaSignal): MeydaSignal = js.native
  @JSImport("meyda", "windowing")
  @js.native
  def windowing(signal: MeydaSignal, windowname: MeydaWindowingFunction): MeydaSignal = js.native
  
  @JSImport("meyda", "windowingFunction")
  @js.native
  val windowingFunction: MeydaWindowingFunction = js.native
  
  @js.native
  trait MeydaAnalyzerOptions extends StObject {
    
    var audioContext: AudioContext = js.native
    
    var bufferSize: Double = js.native
    
    var callback: js.UndefOr[js.Function1[/* features */ PartialMeydaFeaturesObjec, Unit]] = js.native
    
    var channel: js.UndefOr[Double] = js.native
    
    var featureExtractors: js.UndefOr[MeydaAudioFeature | js.Array[MeydaAudioFeature]] = js.native
    
    var hopSize: js.UndefOr[Double] = js.native
    
    var inputs: js.UndefOr[Double] = js.native
    
    var numberOfMFCCCoefficients: js.UndefOr[Double] = js.native
    
    var outputs: js.UndefOr[Double] = js.native
    
    var sampleRate: js.UndefOr[Double] = js.native
    
    var source: AudioNode = js.native
    
    var startImmediately: js.UndefOr[Boolean] = js.native
    
    var windowingFunction: js.UndefOr[MeydaWindowingFunction] = js.native
  }
  object MeydaAnalyzerOptions {
    
    @scala.inline
    def apply(audioContext: AudioContext, bufferSize: Double, source: AudioNode): MeydaAnalyzerOptions = {
      val __obj = js.Dynamic.literal(audioContext = audioContext.asInstanceOf[js.Any], bufferSize = bufferSize.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[MeydaAnalyzerOptions]
    }
    
    @scala.inline
    implicit class MeydaAnalyzerOptionsMutableBuilder[Self <: MeydaAnalyzerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAudioContext(value: AudioContext): Self = StObject.set(x, "audioContext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBufferSize(value: Double): Self = StObject.set(x, "bufferSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallback(value: /* features */ PartialMeydaFeaturesObjec => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      @scala.inline
      def setChannel(value: Double): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
      
      @scala.inline
      def setFeatureExtractors(value: MeydaAudioFeature | js.Array[MeydaAudioFeature]): Self = StObject.set(x, "featureExtractors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFeatureExtractorsUndefined: Self = StObject.set(x, "featureExtractors", js.undefined)
      
      @scala.inline
      def setFeatureExtractorsVarargs(value: MeydaAudioFeature*): Self = StObject.set(x, "featureExtractors", js.Array(value :_*))
      
      @scala.inline
      def setHopSize(value: Double): Self = StObject.set(x, "hopSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHopSizeUndefined: Self = StObject.set(x, "hopSize", js.undefined)
      
      @scala.inline
      def setInputs(value: Double): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputsUndefined: Self = StObject.set(x, "inputs", js.undefined)
      
      @scala.inline
      def setNumberOfMFCCCoefficients(value: Double): Self = StObject.set(x, "numberOfMFCCCoefficients", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberOfMFCCCoefficientsUndefined: Self = StObject.set(x, "numberOfMFCCCoefficients", js.undefined)
      
      @scala.inline
      def setOutputs(value: Double): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputsUndefined: Self = StObject.set(x, "outputs", js.undefined)
      
      @scala.inline
      def setSampleRate(value: Double): Self = StObject.set(x, "sampleRate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSampleRateUndefined: Self = StObject.set(x, "sampleRate", js.undefined)
      
      @scala.inline
      def setSource(value: AudioNode): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartImmediately(value: Boolean): Self = StObject.set(x, "startImmediately", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartImmediatelyUndefined: Self = StObject.set(x, "startImmediately", js.undefined)
      
      @scala.inline
      def setWindowingFunction(value: MeydaWindowingFunction): Self = StObject.set(x, "windowingFunction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowingFunctionUndefined: Self = StObject.set(x, "windowingFunction", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.meyda.meydaStrings.amplitudeSpectrum
    - typingsSlinky.meyda.meydaStrings.chroma
    - typingsSlinky.meyda.meydaStrings.complexSpectrum
    - typingsSlinky.meyda.meydaStrings.energy
    - typingsSlinky.meyda.meydaStrings.loudness
    - typingsSlinky.meyda.meydaStrings.mfcc
    - typingsSlinky.meyda.meydaStrings.perceptualSharpness
    - typingsSlinky.meyda.meydaStrings.perceptualSpread
    - typingsSlinky.meyda.meydaStrings.powerSpectrum
    - typingsSlinky.meyda.meydaStrings.rms
    - typingsSlinky.meyda.meydaStrings.spectralCentroid
    - typingsSlinky.meyda.meydaStrings.spectralFlatness
    - typingsSlinky.meyda.meydaStrings.spectralFlux
    - typingsSlinky.meyda.meydaStrings.spectralKurtosis
    - typingsSlinky.meyda.meydaStrings.spectralRolloff
    - typingsSlinky.meyda.meydaStrings.spectralSkewness
    - typingsSlinky.meyda.meydaStrings.spectralSlope
    - typingsSlinky.meyda.meydaStrings.spectralSpread
    - typingsSlinky.meyda.meydaStrings.zcr
    - typingsSlinky.meyda.meydaStrings.buffer
  */
  trait MeydaAudioFeature extends StObject
  object MeydaAudioFeature {
    
    @scala.inline
    def amplitudeSpectrum: typingsSlinky.meyda.meydaStrings.amplitudeSpectrum = "amplitudeSpectrum".asInstanceOf[typingsSlinky.meyda.meydaStrings.amplitudeSpectrum]
    
    @scala.inline
    def buffer: typingsSlinky.meyda.meydaStrings.buffer = "buffer".asInstanceOf[typingsSlinky.meyda.meydaStrings.buffer]
    
    @scala.inline
    def chroma: typingsSlinky.meyda.meydaStrings.chroma = "chroma".asInstanceOf[typingsSlinky.meyda.meydaStrings.chroma]
    
    @scala.inline
    def complexSpectrum: typingsSlinky.meyda.meydaStrings.complexSpectrum = "complexSpectrum".asInstanceOf[typingsSlinky.meyda.meydaStrings.complexSpectrum]
    
    @scala.inline
    def energy: typingsSlinky.meyda.meydaStrings.energy = "energy".asInstanceOf[typingsSlinky.meyda.meydaStrings.energy]
    
    @scala.inline
    def loudness: typingsSlinky.meyda.meydaStrings.loudness = "loudness".asInstanceOf[typingsSlinky.meyda.meydaStrings.loudness]
    
    @scala.inline
    def mfcc: typingsSlinky.meyda.meydaStrings.mfcc = "mfcc".asInstanceOf[typingsSlinky.meyda.meydaStrings.mfcc]
    
    @scala.inline
    def perceptualSharpness: typingsSlinky.meyda.meydaStrings.perceptualSharpness = "perceptualSharpness".asInstanceOf[typingsSlinky.meyda.meydaStrings.perceptualSharpness]
    
    @scala.inline
    def perceptualSpread: typingsSlinky.meyda.meydaStrings.perceptualSpread = "perceptualSpread".asInstanceOf[typingsSlinky.meyda.meydaStrings.perceptualSpread]
    
    @scala.inline
    def powerSpectrum: typingsSlinky.meyda.meydaStrings.powerSpectrum = "powerSpectrum".asInstanceOf[typingsSlinky.meyda.meydaStrings.powerSpectrum]
    
    @scala.inline
    def rms: typingsSlinky.meyda.meydaStrings.rms = "rms".asInstanceOf[typingsSlinky.meyda.meydaStrings.rms]
    
    @scala.inline
    def spectralCentroid: typingsSlinky.meyda.meydaStrings.spectralCentroid = "spectralCentroid".asInstanceOf[typingsSlinky.meyda.meydaStrings.spectralCentroid]
    
    @scala.inline
    def spectralFlatness: typingsSlinky.meyda.meydaStrings.spectralFlatness = "spectralFlatness".asInstanceOf[typingsSlinky.meyda.meydaStrings.spectralFlatness]
    
    @scala.inline
    def spectralFlux: typingsSlinky.meyda.meydaStrings.spectralFlux = "spectralFlux".asInstanceOf[typingsSlinky.meyda.meydaStrings.spectralFlux]
    
    @scala.inline
    def spectralKurtosis: typingsSlinky.meyda.meydaStrings.spectralKurtosis = "spectralKurtosis".asInstanceOf[typingsSlinky.meyda.meydaStrings.spectralKurtosis]
    
    @scala.inline
    def spectralRolloff: typingsSlinky.meyda.meydaStrings.spectralRolloff = "spectralRolloff".asInstanceOf[typingsSlinky.meyda.meydaStrings.spectralRolloff]
    
    @scala.inline
    def spectralSkewness: typingsSlinky.meyda.meydaStrings.spectralSkewness = "spectralSkewness".asInstanceOf[typingsSlinky.meyda.meydaStrings.spectralSkewness]
    
    @scala.inline
    def spectralSlope: typingsSlinky.meyda.meydaStrings.spectralSlope = "spectralSlope".asInstanceOf[typingsSlinky.meyda.meydaStrings.spectralSlope]
    
    @scala.inline
    def spectralSpread: typingsSlinky.meyda.meydaStrings.spectralSpread = "spectralSpread".asInstanceOf[typingsSlinky.meyda.meydaStrings.spectralSpread]
    
    @scala.inline
    def zcr: typingsSlinky.meyda.meydaStrings.zcr = "zcr".asInstanceOf[typingsSlinky.meyda.meydaStrings.zcr]
  }
  
  @js.native
  trait MeydaFeaturesObject extends StObject {
    
    var amplitudeSpectrum: js.typedarray.Float32Array = js.native
    
    var buffer: js.Array[Double] = js.native
    
    var chroma: js.Array[Double] = js.native
    
    var complexSpectrum: Imag = js.native
    
    var energy: Double = js.native
    
    var loudness: Specific = js.native
    
    var mfcc: js.Array[Double] = js.native
    
    var perceptualSharpness: Double = js.native
    
    var perceptualSpread: Double = js.native
    
    var powerSpectrum: js.typedarray.Float32Array = js.native
    
    var rms: Double = js.native
    
    var spectralCentroid: Double = js.native
    
    var spectralFlatness: Double = js.native
    
    var spectralKurtosis: Double = js.native
    
    var spectralRolloff: Double = js.native
    
    var spectralSkewness: Double = js.native
    
    var spectralSlope: Double = js.native
    
    var spectralSpread: Double = js.native
    
    var zcr: Double = js.native
  }
  object MeydaFeaturesObject {
    
    @scala.inline
    def apply(
      amplitudeSpectrum: js.typedarray.Float32Array,
      buffer: js.Array[Double],
      chroma: js.Array[Double],
      complexSpectrum: Imag,
      energy: Double,
      loudness: Specific,
      mfcc: js.Array[Double],
      perceptualSharpness: Double,
      perceptualSpread: Double,
      powerSpectrum: js.typedarray.Float32Array,
      rms: Double,
      spectralCentroid: Double,
      spectralFlatness: Double,
      spectralKurtosis: Double,
      spectralRolloff: Double,
      spectralSkewness: Double,
      spectralSlope: Double,
      spectralSpread: Double,
      zcr: Double
    ): MeydaFeaturesObject = {
      val __obj = js.Dynamic.literal(amplitudeSpectrum = amplitudeSpectrum.asInstanceOf[js.Any], buffer = buffer.asInstanceOf[js.Any], chroma = chroma.asInstanceOf[js.Any], complexSpectrum = complexSpectrum.asInstanceOf[js.Any], energy = energy.asInstanceOf[js.Any], loudness = loudness.asInstanceOf[js.Any], mfcc = mfcc.asInstanceOf[js.Any], perceptualSharpness = perceptualSharpness.asInstanceOf[js.Any], perceptualSpread = perceptualSpread.asInstanceOf[js.Any], powerSpectrum = powerSpectrum.asInstanceOf[js.Any], rms = rms.asInstanceOf[js.Any], spectralCentroid = spectralCentroid.asInstanceOf[js.Any], spectralFlatness = spectralFlatness.asInstanceOf[js.Any], spectralKurtosis = spectralKurtosis.asInstanceOf[js.Any], spectralRolloff = spectralRolloff.asInstanceOf[js.Any], spectralSkewness = spectralSkewness.asInstanceOf[js.Any], spectralSlope = spectralSlope.asInstanceOf[js.Any], spectralSpread = spectralSpread.asInstanceOf[js.Any], zcr = zcr.asInstanceOf[js.Any])
      __obj.asInstanceOf[MeydaFeaturesObject]
    }
    
    @scala.inline
    implicit class MeydaFeaturesObjectMutableBuilder[Self <: MeydaFeaturesObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAmplitudeSpectrum(value: js.typedarray.Float32Array): Self = StObject.set(x, "amplitudeSpectrum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBuffer(value: js.Array[Double]): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBufferVarargs(value: Double*): Self = StObject.set(x, "buffer", js.Array(value :_*))
      
      @scala.inline
      def setChroma(value: js.Array[Double]): Self = StObject.set(x, "chroma", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChromaVarargs(value: Double*): Self = StObject.set(x, "chroma", js.Array(value :_*))
      
      @scala.inline
      def setComplexSpectrum(value: Imag): Self = StObject.set(x, "complexSpectrum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnergy(value: Double): Self = StObject.set(x, "energy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoudness(value: Specific): Self = StObject.set(x, "loudness", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMfcc(value: js.Array[Double]): Self = StObject.set(x, "mfcc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMfccVarargs(value: Double*): Self = StObject.set(x, "mfcc", js.Array(value :_*))
      
      @scala.inline
      def setPerceptualSharpness(value: Double): Self = StObject.set(x, "perceptualSharpness", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPerceptualSpread(value: Double): Self = StObject.set(x, "perceptualSpread", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPowerSpectrum(value: js.typedarray.Float32Array): Self = StObject.set(x, "powerSpectrum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRms(value: Double): Self = StObject.set(x, "rms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpectralCentroid(value: Double): Self = StObject.set(x, "spectralCentroid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpectralFlatness(value: Double): Self = StObject.set(x, "spectralFlatness", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpectralKurtosis(value: Double): Self = StObject.set(x, "spectralKurtosis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpectralRolloff(value: Double): Self = StObject.set(x, "spectralRolloff", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpectralSkewness(value: Double): Self = StObject.set(x, "spectralSkewness", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpectralSlope(value: Double): Self = StObject.set(x, "spectralSlope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpectralSpread(value: Double): Self = StObject.set(x, "spectralSpread", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZcr(value: Double): Self = StObject.set(x, "zcr", value.asInstanceOf[js.Any])
    }
  }
  
  type MeydaSignal = SliceableArrayLike[Double]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.meyda.meydaStrings.blackman
    - typingsSlinky.meyda.meydaStrings.sine
    - typingsSlinky.meyda.meydaStrings.hanning
    - typingsSlinky.meyda.meydaStrings.hamming
  */
  trait MeydaWindowingFunction extends StObject
  object MeydaWindowingFunction {
    
    @scala.inline
    def blackman: typingsSlinky.meyda.meydaStrings.blackman = "blackman".asInstanceOf[typingsSlinky.meyda.meydaStrings.blackman]
    
    @scala.inline
    def hamming: typingsSlinky.meyda.meydaStrings.hamming = "hamming".asInstanceOf[typingsSlinky.meyda.meydaStrings.hamming]
    
    @scala.inline
    def hanning: typingsSlinky.meyda.meydaStrings.hanning = "hanning".asInstanceOf[typingsSlinky.meyda.meydaStrings.hanning]
    
    @scala.inline
    def sine: typingsSlinky.meyda.meydaStrings.sine = "sine".asInstanceOf[typingsSlinky.meyda.meydaStrings.sine]
  }
  
  @js.native
  trait SliceableArrayLike[T] extends ArrayLike[T] {
    
    def slice(start: Double, end: Double): SliceableArrayLike[T] = js.native
  }
  object SliceableArrayLike {
    
    @scala.inline
    def apply[T](length: Double, slice: (Double, Double) => SliceableArrayLike[T]): SliceableArrayLike[T] = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], slice = js.Any.fromFunction2(slice))
      __obj.asInstanceOf[SliceableArrayLike[T]]
    }
    
    @scala.inline
    implicit class SliceableArrayLikeMutableBuilder[Self <: SliceableArrayLike[_], T] (val x: Self with SliceableArrayLike[T]) extends AnyVal {
      
      @scala.inline
      def setSlice(value: (Double, Double) => SliceableArrayLike[T]): Self = StObject.set(x, "slice", js.Any.fromFunction2(value))
    }
  }
}
