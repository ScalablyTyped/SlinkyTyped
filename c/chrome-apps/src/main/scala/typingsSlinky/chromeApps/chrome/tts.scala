package typingsSlinky.chromeApps.chrome

import typingsSlinky.chromeApps.chromeAppsStrings.female
import typingsSlinky.chromeApps.chromeAppsStrings.male
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion chrome.system.*
// #region chrome.tts
////////////////////
// Text to Speech //
////////////////////
/**
  * Use the chrome.tts API to play synthesized text-to-speech (TTS). See also the related ttsEngine API, which allows an extension to implement a speech engine.
  * Permissions:  'tts'
  * @since Chrome 14.
  */
object tts {
  
  @js.native
  trait SpeakOptions extends StObject {
    
    /** The TTS event types that you are interested in listening to. If missing, all event types may be sent. */
    var desiredEventTypes: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * Optional.
      * If true, enqueues this utterance if TTS is already in progress. If false (the default), interrupts any current speech and flushes the speech queue before speaking this new utterance.
      */
    var enqueue: js.UndefOr[Boolean] = js.native
    
    /** The extension ID of the speech engine to use, if known. */
    var extensionId: js.UndefOr[String] = js.native
    
    /**
      * @deprecated Deprecated since Chrome 70. Gender is deprecated and will be ignored.
      * @description Gender of voice for synthesized speech.
      */
    var gender: js.UndefOr[male | female] = js.native
    
    /** The language to be used for synthesis, in the form language-region. Examples: 'en', 'en-US', 'en-GB', 'zh-CN'. */
    var lang: js.UndefOr[String] = js.native
    
    /**
      * This function is called with events that occur in the process of speaking the utterance.
      * @param event The update event from the text-to-speech engine indicating the status of this utterance.
      */
    var onEvent: js.UndefOr[js.Function1[/* event */ TtsEvent, Unit]] = js.native
    
    /**
      * Optional.
      * Speaking pitch between 0 and 2 inclusive, with 0 being lowest and 2 being highest. 1.0 corresponds to a voice's default pitch.
      */
    var pitch: js.UndefOr[integer] = js.native
    
    /**
      * Optional.
      * Speaking rate relative to the default rate for this voice. 1.0 is the default rate, normally around 180 to 220 words per minute. 2.0 is twice as fast, and 0.5 is half as fast. Values below 0.1 or above 10.0 are strictly disallowed, but many voices will constrain the minimum and maximum rates further—for example a particular voice may not actually speak faster than 3 times normal even if you specify a value larger than 3.0.
      */
    var rate: js.UndefOr[integer] = js.native
    
    /** The TTS event types the voice must support. */
    var requiredEventTypes: js.UndefOr[js.Array[String]] = js.native
    
    /** The name of the voice to use for synthesis. If empty, uses any available voice. */
    var voiceName: js.UndefOr[String] = js.native
    
    /** Speaking volume between 0 and 1 inclusive, with 0 being lowest and 1 being highest, with a default of 1.0. */
    var volume: js.UndefOr[integer] = js.native
  }
  object SpeakOptions {
    
    @scala.inline
    def apply(): SpeakOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpeakOptions]
    }
    
    @scala.inline
    implicit class SpeakOptionsMutableBuilder[Self <: SpeakOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDesiredEventTypes(value: js.Array[String]): Self = StObject.set(x, "desiredEventTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDesiredEventTypesUndefined: Self = StObject.set(x, "desiredEventTypes", js.undefined)
      
      @scala.inline
      def setDesiredEventTypesVarargs(value: String*): Self = StObject.set(x, "desiredEventTypes", js.Array(value :_*))
      
      @scala.inline
      def setEnqueue(value: Boolean): Self = StObject.set(x, "enqueue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnqueueUndefined: Self = StObject.set(x, "enqueue", js.undefined)
      
      @scala.inline
      def setExtensionId(value: String): Self = StObject.set(x, "extensionId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtensionIdUndefined: Self = StObject.set(x, "extensionId", js.undefined)
      
      @scala.inline
      def setGender(value: male | female): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGenderUndefined: Self = StObject.set(x, "gender", js.undefined)
      
      @scala.inline
      def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      @scala.inline
      def setOnEvent(value: /* event */ TtsEvent => Unit): Self = StObject.set(x, "onEvent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEventUndefined: Self = StObject.set(x, "onEvent", js.undefined)
      
      @scala.inline
      def setPitch(value: integer): Self = StObject.set(x, "pitch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPitchUndefined: Self = StObject.set(x, "pitch", js.undefined)
      
      @scala.inline
      def setRate(value: integer): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRateUndefined: Self = StObject.set(x, "rate", js.undefined)
      
      @scala.inline
      def setRequiredEventTypes(value: js.Array[String]): Self = StObject.set(x, "requiredEventTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredEventTypesUndefined: Self = StObject.set(x, "requiredEventTypes", js.undefined)
      
      @scala.inline
      def setRequiredEventTypesVarargs(value: String*): Self = StObject.set(x, "requiredEventTypes", js.Array(value :_*))
      
      @scala.inline
      def setVoiceName(value: String): Self = StObject.set(x, "voiceName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVoiceNameUndefined: Self = StObject.set(x, "voiceName", js.undefined)
      
      @scala.inline
      def setVolume(value: integer): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVolumeUndefined: Self = StObject.set(x, "volume", js.undefined)
    }
  }
  
  /** An event from the TTS engine to communicate the status of an utterance. */
  @js.native
  trait TtsEvent extends StObject {
    
    /** The index of the current character in the utterance. */
    var charIndex: js.UndefOr[integer] = js.native
    
    /** The error description, if the event type is 'error'. */
    var errorMessage: js.UndefOr[String] = js.native
    
    /**
      * The type can be 'start' as soon as speech has started, 'word' when a word boundary is reached, 'sentence' when a sentence boundary is reached, 'marker' when an SSML mark element is reached, 'end' when the end of the utterance is reached, 'interrupted' when the utterance is stopped or interrupted before reaching the end, 'cancelled' when it's removed from the queue before ever being synthesized, or 'error' when any other error occurs. When pausing speech, a 'pause' event is fired if a particular utterance is paused in the middle, and 'resume' if an utterance resumes speech. Note that pause and resume events may not fire if speech is paused in-between utterances.
      * One of: 'start', 'end', 'word', 'sentence', 'marker', 'interrupted', 'cancelled', 'error', 'pause', or 'resume'
      */
    var `type`: String = js.native
  }
  object TtsEvent {
    
    @scala.inline
    def apply(`type`: String): TtsEvent = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TtsEvent]
    }
    
    @scala.inline
    implicit class TtsEventMutableBuilder[Self <: TtsEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCharIndex(value: integer): Self = StObject.set(x, "charIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharIndexUndefined: Self = StObject.set(x, "charIndex", js.undefined)
      
      @scala.inline
      def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /** A description of a voice available for speech synthesis. */
  @js.native
  trait TtsVoice extends StObject {
    
    /** All of the callback event types that this voice is capable of sending. */
    var eventTypes: js.UndefOr[js.Array[String]] = js.native
    
    /** The ID of the extension providing this voice. */
    var extensionsId: js.UndefOr[String] = js.native
    
    /**
      * @deprecated Deprecated since Chrome 70. Gender is deprecated and will be ignored.
      * @description This voice's gender.
      */
    var gender: js.UndefOr[male | female] = js.native
    
    /** The language that this voice supports, in the form language-region. Examples: 'en', 'en-US', 'en-GB', 'zh-CN'. */
    var lang: js.UndefOr[String] = js.native
    
    /**
      * If true, the synthesis engine is a remote network resource. It may be higher latency and may incur bandwidth costs.
      * @since Chrome 33.
      */
    var remote: js.UndefOr[Boolean] = js.native
    
    /** The name of the voice. */
    var voiceName: js.UndefOr[String] = js.native
  }
  object TtsVoice {
    
    @scala.inline
    def apply(): TtsVoice = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TtsVoice]
    }
    
    @scala.inline
    implicit class TtsVoiceMutableBuilder[Self <: TtsVoice] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEventTypes(value: js.Array[String]): Self = StObject.set(x, "eventTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventTypesUndefined: Self = StObject.set(x, "eventTypes", js.undefined)
      
      @scala.inline
      def setEventTypesVarargs(value: String*): Self = StObject.set(x, "eventTypes", js.Array(value :_*))
      
      @scala.inline
      def setExtensionsId(value: String): Self = StObject.set(x, "extensionsId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtensionsIdUndefined: Self = StObject.set(x, "extensionsId", js.undefined)
      
      @scala.inline
      def setGender(value: male | female): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGenderUndefined: Self = StObject.set(x, "gender", js.undefined)
      
      @scala.inline
      def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      @scala.inline
      def setRemote(value: Boolean): Self = StObject.set(x, "remote", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoteUndefined: Self = StObject.set(x, "remote", js.undefined)
      
      @scala.inline
      def setVoiceName(value: String): Self = StObject.set(x, "voiceName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVoiceNameUndefined: Self = StObject.set(x, "voiceName", js.undefined)
    }
  }
}
