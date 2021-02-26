package typingsSlinky.nodeMicrophone

import typingsSlinky.node.processMod.global.NodeJS.WriteStream
import typingsSlinky.nodeMicrophone.nodeMicrophoneNumbers.`16000`
import typingsSlinky.nodeMicrophone.nodeMicrophoneNumbers.`16`
import typingsSlinky.nodeMicrophone.nodeMicrophoneNumbers.`1`
import typingsSlinky.nodeMicrophone.nodeMicrophoneNumbers.`24`
import typingsSlinky.nodeMicrophone.nodeMicrophoneNumbers.`2`
import typingsSlinky.nodeMicrophone.nodeMicrophoneNumbers.`44100`
import typingsSlinky.nodeMicrophone.nodeMicrophoneNumbers.`8000`
import typingsSlinky.nodeMicrophone.nodeMicrophoneNumbers.`8`
import typingsSlinky.nodeMicrophone.nodeMicrophoneStrings.`signed-integer`
import typingsSlinky.nodeMicrophone.nodeMicrophoneStrings.`unsigned-integer`
import typingsSlinky.nodeMicrophone.nodeMicrophoneStrings.big
import typingsSlinky.nodeMicrophone.nodeMicrophoneStrings.default
import typingsSlinky.nodeMicrophone.nodeMicrophoneStrings.hwColon0Comma0
import typingsSlinky.nodeMicrophone.nodeMicrophoneStrings.little
import typingsSlinky.nodeMicrophone.nodeMicrophoneStrings.plughwColon1Comma0
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-microphone", JSImport.Namespace)
  @js.native
  class ^ () extends Microphone {
    def this(options: MicrophoneOptions) = this()
  }
  
  @js.native
  trait Microphone extends StObject {
    
    def startRecording(): WriteStream = js.native
    
    def stopRecording(): Unit = js.native
  }
  object Microphone {
    
    @scala.inline
    def apply(startRecording: () => WriteStream, stopRecording: () => Unit): Microphone = {
      val __obj = js.Dynamic.literal(startRecording = js.Any.fromFunction0(startRecording), stopRecording = js.Any.fromFunction0(stopRecording))
      __obj.asInstanceOf[Microphone]
    }
    
    @scala.inline
    implicit class MicrophoneMutableBuilder[Self <: Microphone] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStartRecording(value: () => WriteStream): Self = StObject.set(x, "startRecording", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStopRecording(value: () => Unit): Self = StObject.set(x, "stopRecording", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait MicrophoneOptions extends StObject {
    
    var additionalParameters: js.UndefOr[js.Any] = js.native
    
    var bitwidth: js.UndefOr[`8` | `16` | `24`] = js.native
    
    var channels: js.UndefOr[`1` | `2`] = js.native
    
    var device: js.UndefOr[hwColon0Comma0 | plughwColon1Comma0 | default] = js.native
    
    var encoding: js.UndefOr[`signed-integer` | `unsigned-integer`] = js.native
    
    var endian: js.UndefOr[big | little] = js.native
    
    var rate: js.UndefOr[`8000` | `16000` | `44100`] = js.native
  }
  object MicrophoneOptions {
    
    @scala.inline
    def apply(): MicrophoneOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MicrophoneOptions]
    }
    
    @scala.inline
    implicit class MicrophoneOptionsMutableBuilder[Self <: MicrophoneOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdditionalParameters(value: js.Any): Self = StObject.set(x, "additionalParameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdditionalParametersUndefined: Self = StObject.set(x, "additionalParameters", js.undefined)
      
      @scala.inline
      def setBitwidth(value: `8` | `16` | `24`): Self = StObject.set(x, "bitwidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBitwidthUndefined: Self = StObject.set(x, "bitwidth", js.undefined)
      
      @scala.inline
      def setChannels(value: `1` | `2`): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannelsUndefined: Self = StObject.set(x, "channels", js.undefined)
      
      @scala.inline
      def setDevice(value: hwColon0Comma0 | plughwColon1Comma0 | default): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
      
      @scala.inline
      def setEncoding(value: `signed-integer` | `unsigned-integer`): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setEndian(value: big | little): Self = StObject.set(x, "endian", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndianUndefined: Self = StObject.set(x, "endian", js.undefined)
      
      @scala.inline
      def setRate(value: `8000` | `16000` | `44100`): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRateUndefined: Self = StObject.set(x, "rate", js.undefined)
    }
  }
}
