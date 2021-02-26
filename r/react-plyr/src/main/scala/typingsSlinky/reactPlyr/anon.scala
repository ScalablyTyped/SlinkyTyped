package typingsSlinky.reactPlyr

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Active extends StObject {
    
    var active: js.UndefOr[Boolean] = js.native
  }
  object Active {
    
    @scala.inline
    def apply(): Active = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Active]
    }
    
    @scala.inline
    implicit class ActiveMutableBuilder[Self <: Active] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    }
  }
  
  @js.native
  trait Controls extends StObject {
    
    var controls: js.UndefOr[Boolean] = js.native
    
    var seek: js.UndefOr[Boolean] = js.native
  }
  object Controls {
    
    @scala.inline
    def apply(): Controls = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Controls]
    }
    
    @scala.inline
    implicit class ControlsMutableBuilder[Self <: Controls] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setControls(value: Boolean): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
      
      @scala.inline
      def setSeek(value: Boolean): Self = StObject.set(x, "seek", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeekUndefined: Self = StObject.set(x, "seek", js.undefined)
    }
  }
  
  @js.native
  trait Default extends StObject {
    
    var default: js.UndefOr[String | Double] = js.native
    
    var option: js.UndefOr[js.Array[Double | String]] = js.native
  }
  object Default {
    
    @scala.inline
    def apply(): Default = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Default]
    }
    
    @scala.inline
    implicit class DefaultMutableBuilder[Self <: Default] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefault(value: String | Double): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      @scala.inline
      def setOption(value: js.Array[Double | String]): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionUndefined: Self = StObject.set(x, "option", js.undefined)
      
      @scala.inline
      def setOptionVarargs(value: (Double | String)*): Self = StObject.set(x, "option", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Enabled extends StObject {
    
    var enabled: js.UndefOr[Boolean] = js.native
    
    var fallback: js.UndefOr[Boolean] = js.native
    
    var iosNative: js.UndefOr[Boolean] = js.native
  }
  object Enabled {
    
    @scala.inline
    def apply(): Enabled = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Enabled]
    }
    
    @scala.inline
    implicit class EnabledMutableBuilder[Self <: Enabled] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setFallback(value: Boolean): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
      
      @scala.inline
      def setIosNative(value: Boolean): Self = StObject.set(x, "iosNative", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIosNativeUndefined: Self = StObject.set(x, "iosNative", js.undefined)
    }
  }
  
  @js.native
  trait Focused extends StObject {
    
    var focused: js.UndefOr[Boolean] = js.native
    
    var global: js.UndefOr[Boolean] = js.native
  }
  object Focused {
    
    @scala.inline
    def apply(): Focused = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Focused]
    }
    
    @scala.inline
    implicit class FocusedMutableBuilder[Self <: Focused] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusedUndefined: Self = StObject.set(x, "focused", js.undefined)
      
      @scala.inline
      def setGlobal(value: Boolean): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
    }
  }
  
  @js.native
  trait Key extends StObject {
    
    var enabled: js.UndefOr[Boolean] = js.native
    
    var key: js.UndefOr[String] = js.native
  }
  object Key {
    
    @scala.inline
    def apply(): Key = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Key]
    }
    
    @scala.inline
    implicit class KeyMutableBuilder[Self <: Key] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    }
  }
  
  @js.native
  trait Kind extends StObject {
    
    var default: js.UndefOr[Boolean] = js.native
    
    var key: js.UndefOr[js.Any] = js.native
    
    var kind: js.UndefOr[String] = js.native
    
    var label: js.UndefOr[String] = js.native
    
    var src: String = js.native
    
    var srclang: js.UndefOr[String] = js.native
  }
  object Kind {
    
    @scala.inline
    def apply(src: String): Kind = {
      val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
      __obj.asInstanceOf[Kind]
    }
    
    @scala.inline
    implicit class KindMutableBuilder[Self <: Kind] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      @scala.inline
      def setKey(value: js.Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrclang(value: String): Self = StObject.set(x, "srclang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrclangUndefined: Self = StObject.set(x, "srclang", js.undefined)
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    var options: js.UndefOr[js.Array[Double]] = js.native
    
    var selected: js.UndefOr[Double] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOptions(value: js.Array[Double]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setOptionsVarargs(value: Double*): Self = StObject.set(x, "options", js.Array(value :_*))
      
      @scala.inline
      def setSelected(value: Double): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    }
  }
  
  @js.native
  trait Size extends StObject {
    
    var size: js.UndefOr[String] = js.native
    
    var src: String = js.native
    
    var `type`: String = js.native
  }
  object Size {
    
    @scala.inline
    def apply(src: String, `type`: String): Size = {
      val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Size]
    }
    
    @scala.inline
    implicit class SizeMutableBuilder[Self <: Size] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
