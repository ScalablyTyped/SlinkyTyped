package typingsSlinky.anchorJs

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typingsSlinky.anchorJs.mod.anchorjs.Anchor
import typingsSlinky.anchorJs.mod.anchorjs.AnchorOptions
import typingsSlinky.anchorJs.mod.anchorjs.AnchorStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("anchor-js", JSImport.Namespace)
  @js.native
  class ^ () extends Anchor {
    def this(options: AnchorOptions) = this()
  }
  @JSImport("anchor-js", JSImport.Namespace)
  @js.native
  val ^ : AnchorStatic = js.native
  
  object global {
    
    @JSGlobal("anchors")
    @js.native
    val anchors: Anchor = js.native
  }
  
  type _To = AnchorStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: AnchorStatic = ^
  
  object anchorjs {
    
    @js.native
    trait Anchor extends StObject {
      
      def add(): Anchor = js.native
      def add(selector: String): Anchor = js.native
      
      var options: AnchorOptions = js.native
      
      def remove(): Anchor = js.native
      def remove(selector: String): Anchor = js.native
      
      def removeAll(): Unit = js.native
    }
    
    @js.native
    trait AnchorOptions extends StObject {
      
      var ariaLabel: js.UndefOr[String] = js.native
      
      var base: js.UndefOr[String] = js.native
      
      var `class`: js.UndefOr[String] = js.native
      
      var icon: js.UndefOr[String] = js.native
      
      var placement: js.UndefOr[AnchorPlacement] = js.native
      
      var titleText: js.UndefOr[String] = js.native
      
      var truncate: js.UndefOr[Double] = js.native
      
      var visible: js.UndefOr[AnchorVisibility] = js.native
    }
    object AnchorOptions {
      
      @scala.inline
      def apply(): AnchorOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AnchorOptions]
      }
      
      @scala.inline
      implicit class AnchorOptionsMutableBuilder[Self <: AnchorOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
        
        @scala.inline
        def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
        
        @scala.inline
        def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
        
        @scala.inline
        def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
        
        @scala.inline
        def setPlacement(value: AnchorPlacement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
        
        @scala.inline
        def setTitleText(value: String): Self = StObject.set(x, "titleText", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTitleTextUndefined: Self = StObject.set(x, "titleText", js.undefined)
        
        @scala.inline
        def setTruncate(value: Double): Self = StObject.set(x, "truncate", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTruncateUndefined: Self = StObject.set(x, "truncate", js.undefined)
        
        @scala.inline
        def setVisible(value: AnchorVisibility): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.anchorJs.anchorJsStrings.left
      - typingsSlinky.anchorJs.anchorJsStrings.right
    */
    trait AnchorPlacement extends StObject
    object AnchorPlacement {
      
      @scala.inline
      def left: typingsSlinky.anchorJs.anchorJsStrings.left = "left".asInstanceOf[typingsSlinky.anchorJs.anchorJsStrings.left]
      
      @scala.inline
      def right: typingsSlinky.anchorJs.anchorJsStrings.right = "right".asInstanceOf[typingsSlinky.anchorJs.anchorJsStrings.right]
    }
    
    @js.native
    trait AnchorStatic
      extends Instantiable0[Anchor]
         with Instantiable1[/* options */ AnchorOptions, Anchor]
    
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.anchorJs.anchorJsStrings.always
      - typingsSlinky.anchorJs.anchorJsStrings.hover
      - typingsSlinky.anchorJs.anchorJsStrings.touch
    */
    trait AnchorVisibility extends StObject
    object AnchorVisibility {
      
      @scala.inline
      def always: typingsSlinky.anchorJs.anchorJsStrings.always = "always".asInstanceOf[typingsSlinky.anchorJs.anchorJsStrings.always]
      
      @scala.inline
      def hover: typingsSlinky.anchorJs.anchorJsStrings.hover = "hover".asInstanceOf[typingsSlinky.anchorJs.anchorJsStrings.hover]
      
      @scala.inline
      def touch: typingsSlinky.anchorJs.anchorJsStrings.touch = "touch".asInstanceOf[typingsSlinky.anchorJs.anchorJsStrings.touch]
    }
  }
}
