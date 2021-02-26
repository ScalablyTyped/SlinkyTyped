package typingsSlinky.onfidoSdkUi

import typingsSlinky.onfidoSdkUi.anon.Id
import typingsSlinky.onfidoSdkUi.anon.Options
import typingsSlinky.onfidoSdkUi.anon.Variant
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("onfido-sdk-ui", "init")
  @js.native
  def init(e: js.Any): OnfidoHandle = js.native
  
  @js.native
  trait OnfidoConfig extends StObject {
    
    var containerId: js.UndefOr[String] = js.native
    
    var isModalOpen: js.UndefOr[Boolean] = js.native
    
    var onComplete: js.UndefOr[js.Function1[/* data */ OnfidoResponse, Null]] = js.native
    
    var onModalRequestClose: js.UndefOr[js.Function0[Null]] = js.native
    
    var steps: js.UndefOr[js.Array[String | Options]] = js.native
    
    var token: js.UndefOr[String] = js.native
    
    var useModal: js.UndefOr[Boolean] = js.native
  }
  object OnfidoConfig {
    
    @scala.inline
    def apply(): OnfidoConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OnfidoConfig]
    }
    
    @scala.inline
    implicit class OnfidoConfigMutableBuilder[Self <: OnfidoConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
      
      @scala.inline
      def setIsModalOpen(value: Boolean): Self = StObject.set(x, "isModalOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsModalOpenUndefined: Self = StObject.set(x, "isModalOpen", js.undefined)
      
      @scala.inline
      def setOnComplete(value: /* data */ OnfidoResponse => Null): Self = StObject.set(x, "onComplete", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
      
      @scala.inline
      def setOnModalRequestClose(value: () => Null): Self = StObject.set(x, "onModalRequestClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnModalRequestCloseUndefined: Self = StObject.set(x, "onModalRequestClose", js.undefined)
      
      @scala.inline
      def setSteps(value: js.Array[String | Options]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
      
      @scala.inline
      def setStepsVarargs(value: (String | Options)*): Self = StObject.set(x, "steps", js.Array(value :_*))
      
      @scala.inline
      def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
      
      @scala.inline
      def setUseModal(value: Boolean): Self = StObject.set(x, "useModal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseModalUndefined: Self = StObject.set(x, "useModal", js.undefined)
    }
  }
  
  @js.native
  trait OnfidoHandle extends StObject {
    
    def setOptions(opts: OnfidoConfig): Null = js.native
    
    def tearDown(): Null = js.native
  }
  object OnfidoHandle {
    
    @scala.inline
    def apply(setOptions: OnfidoConfig => Null, tearDown: () => Null): OnfidoHandle = {
      val __obj = js.Dynamic.literal(setOptions = js.Any.fromFunction1(setOptions), tearDown = js.Any.fromFunction0(tearDown))
      __obj.asInstanceOf[OnfidoHandle]
    }
    
    @scala.inline
    implicit class OnfidoHandleMutableBuilder[Self <: OnfidoHandle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSetOptions(value: OnfidoConfig => Null): Self = StObject.set(x, "setOptions", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTearDown(value: () => Null): Self = StObject.set(x, "tearDown", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait OnfidoResponse extends StObject {
    
    var document_front: Id = js.native
    
    var face: Variant = js.native
  }
  object OnfidoResponse {
    
    @scala.inline
    def apply(document_front: Id, face: Variant): OnfidoResponse = {
      val __obj = js.Dynamic.literal(document_front = document_front.asInstanceOf[js.Any], face = face.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnfidoResponse]
    }
    
    @scala.inline
    implicit class OnfidoResponseMutableBuilder[Self <: OnfidoResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDocument_front(value: Id): Self = StObject.set(x, "document_front", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFace(value: Variant): Self = StObject.set(x, "face", value.asInstanceOf[js.Any])
    }
  }
}
