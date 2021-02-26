package typingsSlinky.awsSdk.lexruntimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PostContentRequest extends StObject {
  
  /**
    *  You pass this value as the Accept HTTP header.   The message Amazon Lex returns in the response can be either text or speech based on the Accept HTTP header value in the request.     If the value is text/plain; charset=utf-8, Amazon Lex returns text in the response.     If the value begins with audio/, Amazon Lex returns speech in the response. Amazon Lex uses Amazon Polly to generate the speech (using the configuration you specified in the Accept header). For example, if you specify audio/mpeg as the value, Amazon Lex returns speech in the MPEG format.   If the value is audio/pcm, the speech returned is audio/pcm in 16-bit, little endian format.    The following are the accepted values:   audio/mpeg   audio/ogg   audio/pcm   text/plain; charset=utf-8   audio/ * (defaults to mpeg)    
    */
  var accept: js.UndefOr[Accept] = js.native
  
  /**
    * A list of contexts active for the request. A context can be activated when a previous intent is fulfilled, or by including the context in the request, If you don't specify a list of contexts, Amazon Lex will use the current list of contexts for the session. If you specify an empty list, all contexts for the session are cleared.
    */
  var activeContexts: js.UndefOr[ActiveContextsString] = js.native
  
  /**
    * Alias of the Amazon Lex bot.
    */
  var botAlias: BotAlias = js.native
  
  /**
    * Name of the Amazon Lex bot.
    */
  var botName: BotName = js.native
  
  /**
    *  You pass this value as the Content-Type HTTP header.   Indicates the audio format or text. The header value must start with one of the following prefixes:    PCM format, audio data must be in little-endian byte order.   audio/l16; rate=16000; channels=1   audio/x-l16; sample-rate=16000; channel-count=1   audio/lpcm; sample-rate=8000; sample-size-bits=16; channel-count=1; is-big-endian=false      Opus format   audio/x-cbr-opus-with-preamble; preamble-size=0; bit-rate=256000; frame-size-milliseconds=4     Text format   text/plain; charset=utf-8    
    */
  var contentType: HttpContentType = js.native
  
  /**
    *  User input in PCM or Opus audio format or text format as described in the Content-Type HTTP header.  You can stream audio data to Amazon Lex or you can create a local buffer that captures all of the audio data before sending. In general, you get better performance if you stream audio data rather than buffering the data locally.
    */
  var inputStream: BlobStream = js.native
  
  /**
    * You pass this value as the x-amz-lex-request-attributes HTTP header. Request-specific information passed between Amazon Lex and a client application. The value must be a JSON serialized and base64 encoded map with string keys and values. The total size of the requestAttributes and sessionAttributes headers is limited to 12 KB. The namespace x-amz-lex: is reserved for special attributes. Don't create any request attributes with the prefix x-amz-lex:. For more information, see Setting Request Attributes.
    */
  var requestAttributes: js.UndefOr[AttributesString] = js.native
  
  /**
    * You pass this value as the x-amz-lex-session-attributes HTTP header. Application-specific information passed between Amazon Lex and a client application. The value must be a JSON serialized and base64 encoded map with string keys and values. The total size of the sessionAttributes and requestAttributes headers is limited to 12 KB. For more information, see Setting Session Attributes.
    */
  var sessionAttributes: js.UndefOr[AttributesString] = js.native
  
  /**
    * The ID of the client application user. Amazon Lex uses this to identify a user's conversation with your bot. At runtime, each request must contain the userID field. To decide the user ID to use for your application, consider the following factors.   The userID field must not contain any personally identifiable information of the user, for example, name, personal identification numbers, or other end user personal information.   If you want a user to start a conversation on one device and continue on another device, use a user-specific identifier.   If you want the same user to be able to have two independent conversations on two different devices, choose a device-specific identifier.   A user can't have two independent conversations with two different versions of the same bot. For example, a user can't have a conversation with the PROD and BETA versions of the same bot. If you anticipate that a user will need to have conversation with two different versions, for example, while testing, include the bot alias in the user ID to separate the two conversations.  
    */
  var userId: UserId = js.native
}
object PostContentRequest {
  
  @scala.inline
  def apply(
    botAlias: BotAlias,
    botName: BotName,
    contentType: HttpContentType,
    inputStream: BlobStream,
    userId: UserId
  ): PostContentRequest = {
    val __obj = js.Dynamic.literal(botAlias = botAlias.asInstanceOf[js.Any], botName = botName.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], inputStream = inputStream.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostContentRequest]
  }
  
  @scala.inline
  implicit class PostContentRequestMutableBuilder[Self <: PostContentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccept(value: Accept): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
    
    @scala.inline
    def setActiveContexts(value: ActiveContextsString): Self = StObject.set(x, "activeContexts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveContextsUndefined: Self = StObject.set(x, "activeContexts", js.undefined)
    
    @scala.inline
    def setBotAlias(value: BotAlias): Self = StObject.set(x, "botAlias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBotName(value: BotName): Self = StObject.set(x, "botName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentType(value: HttpContentType): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputStream(value: BlobStream): Self = StObject.set(x, "inputStream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputStreamUint8Array(value: js.typedarray.Uint8Array): Self = StObject.set(x, "inputStream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestAttributes(value: AttributesString): Self = StObject.set(x, "requestAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestAttributesUndefined: Self = StObject.set(x, "requestAttributes", js.undefined)
    
    @scala.inline
    def setSessionAttributes(value: AttributesString): Self = StObject.set(x, "sessionAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionAttributesUndefined: Self = StObject.set(x, "sessionAttributes", js.undefined)
    
    @scala.inline
    def setUserId(value: UserId): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
  }
}
