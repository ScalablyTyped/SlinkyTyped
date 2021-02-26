package typingsSlinky.cloudeventsSdk

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.NumberDictionary
import typingsSlinky.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object receiverStructured03Mod {
  
  @JSImport("cloudevents-sdk/lib/bindings/http/v03/receiver_structured_0_3", JSImport.Namespace)
  @js.native
  class ^ () extends Receiver
  
  @js.native
  trait Receiver extends StObject {
    
    var Spec: Instantiable0[typingsSlinky.cloudeventsSdk.spec03Mod.^] = js.native
    
    var allowedContentTypes: js.Array[_] = js.native
    
    var parserByMime: NumberDictionary[js.Any] = js.native
    
    var parserMap: Map[_, _] = js.native
    
    var spec: typingsSlinky.cloudeventsSdk.spec03Mod.^ = js.native
  }
  object Receiver {
    
    @scala.inline
    def apply(
      Spec: Instantiable0[typingsSlinky.cloudeventsSdk.spec03Mod.^],
      allowedContentTypes: js.Array[_],
      parserByMime: NumberDictionary[js.Any],
      parserMap: Map[_, _],
      spec: typingsSlinky.cloudeventsSdk.spec03Mod.^
    ): Receiver = {
      val __obj = js.Dynamic.literal(Spec = Spec.asInstanceOf[js.Any], allowedContentTypes = allowedContentTypes.asInstanceOf[js.Any], parserByMime = parserByMime.asInstanceOf[js.Any], parserMap = parserMap.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any])
      __obj.asInstanceOf[Receiver]
    }
    
    @scala.inline
    implicit class ReceiverMutableBuilder[Self <: Receiver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowedContentTypes(value: js.Array[_]): Self = StObject.set(x, "allowedContentTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowedContentTypesVarargs(value: js.Any*): Self = StObject.set(x, "allowedContentTypes", js.Array(value :_*))
      
      @scala.inline
      def setParserByMime(value: NumberDictionary[js.Any]): Self = StObject.set(x, "parserByMime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParserMap(value: Map[_, _]): Self = StObject.set(x, "parserMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpec(value: Instantiable0[typingsSlinky.cloudeventsSdk.spec03Mod.^]): Self = StObject.set(x, "Spec", value.asInstanceOf[js.Any])
    }
  }
}
