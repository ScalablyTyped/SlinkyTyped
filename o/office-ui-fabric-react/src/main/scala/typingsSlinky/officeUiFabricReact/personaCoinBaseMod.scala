package typingsSlinky.officeUiFabricReact

import typingsSlinky.officeUiFabricReact.personaTypesMod.IPersonaCoinProps
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object personaCoinBaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Persona/PersonaCoin/PersonaCoin.base", "PersonaCoinBase")
  @js.native
  class PersonaCoinBase protected ()
    extends Component[IPersonaCoinProps, IPersonaState, js.Any] {
    def this(props: IPersonaCoinProps) = this()
    
    @JSName("UNSAFE_componentWillReceiveProps")
    def UNSAFE_componentWillReceiveProps_MPersonaCoinBase(nextProps: IPersonaCoinProps): Unit = js.native
    
    /**
      * Deprecation helper for getting text.
      */
    var _getText: js.Any = js.native
    
    var _onPhotoLoadingStateChange: js.Any = js.native
    
    var _onRenderCoin: js.Any = js.native
    
    var _onRenderInitials: js.Any = js.native
  }
  /* static members */
  object PersonaCoinBase {
    
    @JSImport("office-ui-fabric-react/lib/components/Persona/PersonaCoin/PersonaCoin.base", "PersonaCoinBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/Persona/PersonaCoin/PersonaCoin.base", "PersonaCoinBase.defaultProps")
    @js.native
    def defaultProps: IPersonaCoinProps = js.native
    @scala.inline
    def defaultProps_=(x: IPersonaCoinProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait IPersonaState extends StObject {
    
    var isImageError: js.UndefOr[Boolean] = js.native
    
    var isImageLoaded: js.UndefOr[Boolean] = js.native
  }
  object IPersonaState {
    
    @scala.inline
    def apply(): IPersonaState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPersonaState]
    }
    
    @scala.inline
    implicit class IPersonaStateMutableBuilder[Self <: IPersonaState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsImageError(value: Boolean): Self = StObject.set(x, "isImageError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsImageErrorUndefined: Self = StObject.set(x, "isImageError", js.undefined)
      
      @scala.inline
      def setIsImageLoaded(value: Boolean): Self = StObject.set(x, "isImageLoaded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsImageLoadedUndefined: Self = StObject.set(x, "isImageLoaded", js.undefined)
    }
  }
}
