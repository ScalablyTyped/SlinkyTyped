package typingsSlinky.luminoWidgets

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.luminoSignaling.mod.ISignal
import typingsSlinky.luminoVirtualdom.mod.VirtualElement.IRenderer
import typingsSlinky.luminoWidgets.titleMod.Title.Dataset
import typingsSlinky.luminoWidgets.titleMod.Title.IOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object titleMod {
  
  @JSImport("@lumino/widgets/types/title", "Title")
  @js.native
  class Title[T] protected () extends StObject {
    /**
      * Construct a new title.
      *
      * @param options - The options for initializing the title.
      */
    def this(options: IOptions[T]) = this()
    
    var _caption: js.Any = js.native
    
    var _changed: js.Any = js.native
    
    var _className: js.Any = js.native
    
    var _closable: js.Any = js.native
    
    var _dataset: js.Any = js.native
    
    var _icon: js.Any = js.native
    
    var _iconClass: js.Any = js.native
    
    var _iconLabel: js.Any = js.native
    
    var _label: js.Any = js.native
    
    var _mnemonic: js.Any = js.native
    
    /**
      * Get the caption for the title.
      *
      * #### Notes
      * The default value is an empty string.
      */
    /**
      * Set the caption for the title.
      */
    var caption: String = js.native
    
    /**
      * A signal emitted when the state of the title changes.
      */
    val changed: ISignal[this.type, Unit] = js.native
    
    /**
      * Get the extra class name for the title.
      *
      * #### Notes
      * The default value is an empty string.
      */
    /**
      * Set the extra class name for the title.
      *
      * #### Notes
      * Multiple class names can be separated with whitespace.
      */
    var className: String = js.native
    
    /**
      * Get the closable state for the title.
      *
      * #### Notes
      * The default value is `false`.
      */
    /**
      * Set the closable state for the title.
      *
      * #### Notes
      * This controls the presence of a close icon when applicable.
      */
    var closable: Boolean = js.native
    
    /**
      * Get the dataset for the title.
      *
      * #### Notes
      * The default value is an empty dataset.
      */
    /**
      * Set the dataset for the title.
      *
      * #### Notes
      * This controls the data attributes when applicable.
      */
    var dataset: Dataset = js.native
    
    /**
      * Get the icon renderer for the title.
      *
      * #### Notes
      * The default value is undefined.
      *
      * DEPRECATED: if set to a string value, the .icon field will function as
      * an alias for the .iconClass field, for backwards compatibility
      */
    /**
      * Set the icon renderer for the title.
      *
      * #### Notes
      * A renderer is an object that supplies a render and unrender function.
      *
      * DEPRECATED: if set to a string value, the .icon field will function as
      * an alias for the .iconClass field, for backwards compatibility
      */
    var icon: js.UndefOr[IRenderer | String] = js.native
    
    /**
      * Get the icon class name for the title.
      *
      * #### Notes
      * The default value is an empty string.
      */
    /**
      * Set the icon class name for the title.
      *
      * #### Notes
      * Multiple class names can be separated with whitespace.
      */
    var iconClass: String = js.native
    
    /**
      * Get the icon label for the title.
      *
      * #### Notes
      * The default value is an empty string.
      */
    /**
      * Set the icon label for the title.
      *
      * #### Notes
      * Multiple class names can be separated with whitespace.
      */
    var iconLabel: String = js.native
    
    /**
      * @deprecated Use `icon` instead.
      */
    /**
      * @deprecated Use `icon` instead.
      */
    var iconRenderer: js.UndefOr[IRenderer] = js.native
    
    /**
      * Get the label for the title.
      *
      * #### Notes
      * The default value is an empty string.
      */
    /**
      * Set the label for the title.
      */
    var label: String = js.native
    
    /**
      * Get the mnemonic index for the title.
      *
      * #### Notes
      * The default value is `-1`.
      */
    /**
      * Set the mnemonic index for the title.
      */
    var mnemonic: Double = js.native
    
    /**
      * The object which owns the title.
      */
    val owner: T = js.native
  }
  object Title {
    
    /**
      * A type alias for a simple immutable string dataset.
      */
    type Dataset = StringDictionary[String]
    
    /**
      * An options object for initializing a title.
      */
    @js.native
    trait IOptions[T] extends StObject {
      
      /**
        * The caption for the title.
        */
      var caption: js.UndefOr[String] = js.native
      
      /**
        * The extra class name for the title.
        */
      var className: js.UndefOr[String] = js.native
      
      /**
        * The closable state for the title.
        */
      var closable: js.UndefOr[Boolean] = js.native
      
      /**
        * The dataset for the title.
        */
      var dataset: js.UndefOr[Dataset] = js.native
      
      /**
        * The icon renderer for the title.
        *
        * DEPRECATED: if set to a string value, the .icon field will function as
        * an alias for the .iconClass field, for backwards compatibility
        */
      var icon: js.UndefOr[IRenderer | String] = js.native
      
      /**
        * The icon class name for the title.
        */
      var iconClass: js.UndefOr[String] = js.native
      
      /**
        * The icon label for the title.
        */
      var iconLabel: js.UndefOr[String] = js.native
      
      /**
        * @deprecated Use `icon` instead.
        */
      var iconRenderer: js.UndefOr[IRenderer] = js.native
      
      /**
        * The label for the title.
        */
      var label: js.UndefOr[String] = js.native
      
      /**
        * The mnemonic index for the title.
        */
      var mnemonic: js.UndefOr[Double] = js.native
      
      /**
        * The object which owns the title.
        */
      var owner: T = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply[T](owner: T): IOptions[T] = {
        val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions[T]]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: IOptions[_], T] (val x: Self with IOptions[T]) extends AnyVal {
        
        @scala.inline
        def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
        
        @scala.inline
        def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
        
        @scala.inline
        def setClosable(value: Boolean): Self = StObject.set(x, "closable", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClosableUndefined: Self = StObject.set(x, "closable", js.undefined)
        
        @scala.inline
        def setDataset(value: Dataset): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDatasetUndefined: Self = StObject.set(x, "dataset", js.undefined)
        
        @scala.inline
        def setIcon(value: IRenderer | String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIconClassUndefined: Self = StObject.set(x, "iconClass", js.undefined)
        
        @scala.inline
        def setIconLabel(value: String): Self = StObject.set(x, "iconLabel", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIconLabelUndefined: Self = StObject.set(x, "iconLabel", js.undefined)
        
        @scala.inline
        def setIconRenderer(value: IRenderer): Self = StObject.set(x, "iconRenderer", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIconRendererUndefined: Self = StObject.set(x, "iconRenderer", js.undefined)
        
        @scala.inline
        def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
        
        @scala.inline
        def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
        
        @scala.inline
        def setMnemonic(value: Double): Self = StObject.set(x, "mnemonic", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMnemonicUndefined: Self = StObject.set(x, "mnemonic", js.undefined)
        
        @scala.inline
        def setOwner(value: T): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
      }
    }
  }
}
