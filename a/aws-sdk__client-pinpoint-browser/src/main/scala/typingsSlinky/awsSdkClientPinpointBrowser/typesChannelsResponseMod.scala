package typingsSlinky.awsSdkClientPinpointBrowser

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.awsSdkClientPinpointBrowser.typesChannelResponseMod.ChannelResponse
import typingsSlinky.awsSdkClientPinpointBrowser.typesChannelResponseMod.UnmarshalledChannelResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesChannelsResponseMod {
  
  @js.native
  trait ChannelsResponse extends StObject {
    
    /**
      * A map of channels, with the ChannelType as the key and the Channel as the value.
      */
    var Channels: js.UndefOr[
        StringDictionary[ChannelResponse] | (js.Iterable[js.Tuple2[String, ChannelResponse]])
      ] = js.native
  }
  object ChannelsResponse {
    
    @scala.inline
    def apply(): ChannelsResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChannelsResponse]
    }
    
    @scala.inline
    implicit class ChannelsResponseMutableBuilder[Self <: ChannelsResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChannels(value: StringDictionary[ChannelResponse] | (js.Iterable[js.Tuple2[String, ChannelResponse]])): Self = StObject.set(x, "Channels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannelsIterable(value: js.Iterable[js.Tuple2[String, ChannelResponse]]): Self = StObject.set(x, "Channels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannelsUndefined: Self = StObject.set(x, "Channels", js.undefined)
    }
  }
  
  @js.native
  trait UnmarshalledChannelsResponse extends ChannelsResponse {
    
    /**
      * A map of channels, with the ChannelType as the key and the Channel as the value.
      */
    @JSName("Channels")
    var Channels_UnmarshalledChannelsResponse: js.UndefOr[StringDictionary[UnmarshalledChannelResponse]] = js.native
  }
  object UnmarshalledChannelsResponse {
    
    @scala.inline
    def apply(): UnmarshalledChannelsResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledChannelsResponse]
    }
    
    @scala.inline
    implicit class UnmarshalledChannelsResponseMutableBuilder[Self <: UnmarshalledChannelsResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChannels(value: StringDictionary[UnmarshalledChannelResponse]): Self = StObject.set(x, "Channels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannelsUndefined: Self = StObject.set(x, "Channels", js.undefined)
    }
  }
}
