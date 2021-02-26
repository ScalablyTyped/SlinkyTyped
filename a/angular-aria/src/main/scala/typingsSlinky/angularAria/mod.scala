package typingsSlinky.angularAria

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  object aria {
    
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.angularAria.angularAriaStrings.ariaHidden
      - typingsSlinky.angularAria.angularAriaStrings.ariaChecked
      - typingsSlinky.angularAria.angularAriaStrings.ariaReadonly
      - typingsSlinky.angularAria.angularAriaStrings.ariaDisabled
      - typingsSlinky.angularAria.angularAriaStrings.ariaRequired
      - typingsSlinky.angularAria.angularAriaStrings.ariaInvalid
      - typingsSlinky.angularAria.angularAriaStrings.ariaValue
      - typingsSlinky.angularAria.angularAriaStrings.tabindex
      - typingsSlinky.angularAria.angularAriaStrings.bindKeydown
      - typingsSlinky.angularAria.angularAriaStrings.bindRoleForClick
    */
    trait IAriaAttribute extends StObject
    object IAriaAttribute {
      
      @scala.inline
      def ariaChecked: typingsSlinky.angularAria.angularAriaStrings.ariaChecked = "ariaChecked".asInstanceOf[typingsSlinky.angularAria.angularAriaStrings.ariaChecked]
      
      @scala.inline
      def ariaDisabled: typingsSlinky.angularAria.angularAriaStrings.ariaDisabled = "ariaDisabled".asInstanceOf[typingsSlinky.angularAria.angularAriaStrings.ariaDisabled]
      
      @scala.inline
      def ariaHidden: typingsSlinky.angularAria.angularAriaStrings.ariaHidden = "ariaHidden".asInstanceOf[typingsSlinky.angularAria.angularAriaStrings.ariaHidden]
      
      @scala.inline
      def ariaInvalid: typingsSlinky.angularAria.angularAriaStrings.ariaInvalid = "ariaInvalid".asInstanceOf[typingsSlinky.angularAria.angularAriaStrings.ariaInvalid]
      
      @scala.inline
      def ariaReadonly: typingsSlinky.angularAria.angularAriaStrings.ariaReadonly = "ariaReadonly".asInstanceOf[typingsSlinky.angularAria.angularAriaStrings.ariaReadonly]
      
      @scala.inline
      def ariaRequired: typingsSlinky.angularAria.angularAriaStrings.ariaRequired = "ariaRequired".asInstanceOf[typingsSlinky.angularAria.angularAriaStrings.ariaRequired]
      
      @scala.inline
      def ariaValue: typingsSlinky.angularAria.angularAriaStrings.ariaValue = "ariaValue".asInstanceOf[typingsSlinky.angularAria.angularAriaStrings.ariaValue]
      
      @scala.inline
      def bindKeydown: typingsSlinky.angularAria.angularAriaStrings.bindKeydown = "bindKeydown".asInstanceOf[typingsSlinky.angularAria.angularAriaStrings.bindKeydown]
      
      @scala.inline
      def bindRoleForClick: typingsSlinky.angularAria.angularAriaStrings.bindRoleForClick = "bindRoleForClick".asInstanceOf[typingsSlinky.angularAria.angularAriaStrings.bindRoleForClick]
      
      @scala.inline
      def tabindex: typingsSlinky.angularAria.angularAriaStrings.tabindex = "tabindex".asInstanceOf[typingsSlinky.angularAria.angularAriaStrings.tabindex]
    }
    
    /**
      * $ariaProvider (https://docs.angularjs.org/api/ngAria/provider/$ariaProvider).
      */
    @js.native
    trait IAriaProvider extends StObject {
      
      def config(config: IAriaProviderOptions): Unit = js.native
    }
    object IAriaProvider {
      
      @scala.inline
      def apply(config: IAriaProviderOptions => Unit): IAriaProvider = {
        val __obj = js.Dynamic.literal(config = js.Any.fromFunction1(config))
        __obj.asInstanceOf[IAriaProvider]
      }
      
      @scala.inline
      implicit class IAriaProviderMutableBuilder[Self <: IAriaProvider] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setConfig(value: IAriaProviderOptions => Unit): Self = StObject.set(x, "config", js.Any.fromFunction1(value))
      }
    }
    
    /* Inlined {[ key in angular-aria.angular.aria.IAriaAttribute ]:? boolean} */
    @js.native
    trait IAriaProviderOptions extends StObject {
      
      var ariaChecked: js.UndefOr[Boolean] = js.native
      
      var ariaDisabled: js.UndefOr[Boolean] = js.native
      
      var ariaHidden: js.UndefOr[Boolean] = js.native
      
      var ariaInvalid: js.UndefOr[Boolean] = js.native
      
      var ariaReadonly: js.UndefOr[Boolean] = js.native
      
      var ariaRequired: js.UndefOr[Boolean] = js.native
      
      var ariaValue: js.UndefOr[Boolean] = js.native
      
      var bindKeydown: js.UndefOr[Boolean] = js.native
      
      var bindRoleForClick: js.UndefOr[Boolean] = js.native
      
      var tabindex: js.UndefOr[Boolean] = js.native
    }
    object IAriaProviderOptions {
      
      @scala.inline
      def apply(): IAriaProviderOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IAriaProviderOptions]
      }
      
      @scala.inline
      implicit class IAriaProviderOptionsMutableBuilder[Self <: IAriaProviderOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAriaChecked(value: Boolean): Self = StObject.set(x, "ariaChecked", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAriaCheckedUndefined: Self = StObject.set(x, "ariaChecked", js.undefined)
        
        @scala.inline
        def setAriaDisabled(value: Boolean): Self = StObject.set(x, "ariaDisabled", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAriaDisabledUndefined: Self = StObject.set(x, "ariaDisabled", js.undefined)
        
        @scala.inline
        def setAriaHidden(value: Boolean): Self = StObject.set(x, "ariaHidden", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAriaHiddenUndefined: Self = StObject.set(x, "ariaHidden", js.undefined)
        
        @scala.inline
        def setAriaInvalid(value: Boolean): Self = StObject.set(x, "ariaInvalid", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAriaInvalidUndefined: Self = StObject.set(x, "ariaInvalid", js.undefined)
        
        @scala.inline
        def setAriaReadonly(value: Boolean): Self = StObject.set(x, "ariaReadonly", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAriaReadonlyUndefined: Self = StObject.set(x, "ariaReadonly", js.undefined)
        
        @scala.inline
        def setAriaRequired(value: Boolean): Self = StObject.set(x, "ariaRequired", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAriaRequiredUndefined: Self = StObject.set(x, "ariaRequired", js.undefined)
        
        @scala.inline
        def setAriaValue(value: Boolean): Self = StObject.set(x, "ariaValue", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAriaValueUndefined: Self = StObject.set(x, "ariaValue", js.undefined)
        
        @scala.inline
        def setBindKeydown(value: Boolean): Self = StObject.set(x, "bindKeydown", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBindKeydownUndefined: Self = StObject.set(x, "bindKeydown", js.undefined)
        
        @scala.inline
        def setBindRoleForClick(value: Boolean): Self = StObject.set(x, "bindRoleForClick", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBindRoleForClickUndefined: Self = StObject.set(x, "bindRoleForClick", js.undefined)
        
        @scala.inline
        def setTabindex(value: Boolean): Self = StObject.set(x, "tabindex", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTabindexUndefined: Self = StObject.set(x, "tabindex", js.undefined)
      }
    }
    
    /**
      * $aria service (https://docs.angularjs.org/api/ngAria/service/$aria).
      */
    @js.native
    trait IAriaService extends StObject {
      
      def config(attribute: IAriaAttribute): Boolean = js.native
    }
    object IAriaService {
      
      @scala.inline
      def apply(config: IAriaAttribute => Boolean): IAriaService = {
        val __obj = js.Dynamic.literal(config = js.Any.fromFunction1(config))
        __obj.asInstanceOf[IAriaService]
      }
      
      @scala.inline
      implicit class IAriaServiceMutableBuilder[Self <: IAriaService] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setConfig(value: IAriaAttribute => Boolean): Self = StObject.set(x, "config", js.Any.fromFunction1(value))
      }
    }
  }
}
