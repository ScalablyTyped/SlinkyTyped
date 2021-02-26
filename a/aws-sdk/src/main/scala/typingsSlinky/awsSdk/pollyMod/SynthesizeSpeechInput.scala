package typingsSlinky.awsSdk.pollyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SynthesizeSpeechInput extends StObject {
  
  /**
    * Specifies the engine (standard or neural) for Amazon Polly to use when processing input text for speech synthesis. For information on Amazon Polly voices and which voices are available in standard-only, NTTS-only, and both standard and NTTS formats, see Available Voices.  NTTS-only voices  When using NTTS-only voices such as Kevin (en-US), this parameter is required and must be set to neural. If the engine is not specified, or is set to standard, this will result in an error.  Type: String Valid Values: standard | neural  Required: Yes  Standard voices  For standard voices, this is not required; the engine parameter defaults to standard. If the engine is not specified, or is set to standard and an NTTS-only voice is selected, this will result in an error. 
    */
  var Engine: js.UndefOr[typingsSlinky.awsSdk.pollyMod.Engine] = js.native
  
  /**
    * Optional language code for the Synthesize Speech request. This is only necessary if using a bilingual voice, such as Aditi, which can be used for either Indian English (en-IN) or Hindi (hi-IN).  If a bilingual voice is used and no language code is specified, Amazon Polly will use the default language of the bilingual voice. The default language for any voice is the one returned by the DescribeVoices operation for the LanguageCode parameter. For example, if no language code is specified, Aditi will use Indian English rather than Hindi.
    */
  var LanguageCode: js.UndefOr[typingsSlinky.awsSdk.pollyMod.LanguageCode] = js.native
  
  /**
    * List of one or more pronunciation lexicon names you want the service to apply during synthesis. Lexicons are applied only if the language of the lexicon is the same as the language of the voice. For information about storing lexicons, see PutLexicon.
    */
  var LexiconNames: js.UndefOr[LexiconNameList] = js.native
  
  /**
    *  The format in which the returned output will be encoded. For audio stream, this will be mp3, ogg_vorbis, or pcm. For speech marks, this will be json.  When pcm is used, the content returned is audio/pcm in a signed 16-bit, 1 channel (mono), little-endian format. 
    */
  var OutputFormat: typingsSlinky.awsSdk.pollyMod.OutputFormat = js.native
  
  /**
    * The audio frequency specified in Hz. The valid values for mp3 and ogg_vorbis are "8000", "16000", "22050", and "24000". The default value for standard voices is "22050". The default value for neural voices is "24000". Valid values for pcm are "8000" and "16000" The default value is "16000". 
    */
  var SampleRate: js.UndefOr[typingsSlinky.awsSdk.pollyMod.SampleRate] = js.native
  
  /**
    * The type of speech marks returned for the input text.
    */
  var SpeechMarkTypes: js.UndefOr[SpeechMarkTypeList] = js.native
  
  /**
    *  Input text to synthesize. If you specify ssml as the TextType, follow the SSML format for the input text. 
    */
  var Text: typingsSlinky.awsSdk.pollyMod.Text = js.native
  
  /**
    *  Specifies whether the input text is plain text or SSML. The default value is plain text. For more information, see Using SSML.
    */
  var TextType: js.UndefOr[typingsSlinky.awsSdk.pollyMod.TextType] = js.native
  
  /**
    *  Voice ID to use for the synthesis. You can get a list of available voice IDs by calling the DescribeVoices operation. 
    */
  var VoiceId: typingsSlinky.awsSdk.pollyMod.VoiceId = js.native
}
object SynthesizeSpeechInput {
  
  @scala.inline
  def apply(OutputFormat: OutputFormat, Text: Text, VoiceId: VoiceId): SynthesizeSpeechInput = {
    val __obj = js.Dynamic.literal(OutputFormat = OutputFormat.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any], VoiceId = VoiceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SynthesizeSpeechInput]
  }
  
  @scala.inline
  implicit class SynthesizeSpeechInputMutableBuilder[Self <: SynthesizeSpeechInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEngine(value: Engine): Self = StObject.set(x, "Engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineUndefined: Self = StObject.set(x, "Engine", js.undefined)
    
    @scala.inline
    def setLanguageCode(value: LanguageCode): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageCodeUndefined: Self = StObject.set(x, "LanguageCode", js.undefined)
    
    @scala.inline
    def setLexiconNames(value: LexiconNameList): Self = StObject.set(x, "LexiconNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLexiconNamesUndefined: Self = StObject.set(x, "LexiconNames", js.undefined)
    
    @scala.inline
    def setLexiconNamesVarargs(value: LexiconName*): Self = StObject.set(x, "LexiconNames", js.Array(value :_*))
    
    @scala.inline
    def setOutputFormat(value: OutputFormat): Self = StObject.set(x, "OutputFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSampleRate(value: SampleRate): Self = StObject.set(x, "SampleRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSampleRateUndefined: Self = StObject.set(x, "SampleRate", js.undefined)
    
    @scala.inline
    def setSpeechMarkTypes(value: SpeechMarkTypeList): Self = StObject.set(x, "SpeechMarkTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeechMarkTypesUndefined: Self = StObject.set(x, "SpeechMarkTypes", js.undefined)
    
    @scala.inline
    def setSpeechMarkTypesVarargs(value: SpeechMarkType*): Self = StObject.set(x, "SpeechMarkTypes", js.Array(value :_*))
    
    @scala.inline
    def setText(value: Text): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextType(value: TextType): Self = StObject.set(x, "TextType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextTypeUndefined: Self = StObject.set(x, "TextType", js.undefined)
    
    @scala.inline
    def setVoiceId(value: VoiceId): Self = StObject.set(x, "VoiceId", value.asInstanceOf[js.Any])
  }
}
