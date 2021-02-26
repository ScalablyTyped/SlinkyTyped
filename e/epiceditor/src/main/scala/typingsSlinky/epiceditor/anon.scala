package typingsSlinky.epiceditor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait AutoSave extends StObject {
    
    var autoSave: js.Any = js.native
    
    var defaultContent: String = js.native
    
    var name: String = js.native
  }
  object AutoSave {
    
    @scala.inline
    def apply(autoSave: js.Any, defaultContent: String, name: String): AutoSave = {
      val __obj = js.Dynamic.literal(autoSave = autoSave.asInstanceOf[js.Any], defaultContent = defaultContent.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[AutoSave]
    }
    
    @scala.inline
    implicit class AutoSaveMutableBuilder[Self <: AutoSave] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoSave(value: js.Any): Self = StObject.set(x, "autoSave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultContent(value: String): Self = StObject.set(x, "defaultContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Base extends StObject {
    
    var base: String = js.native
    
    var editor: String = js.native
    
    var preview: String = js.native
  }
  object Base {
    
    @scala.inline
    def apply(base: String, editor: String, preview: String): Base = {
      val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], editor = editor.asInstanceOf[js.Any], preview = preview.asInstanceOf[js.Any])
      __obj.asInstanceOf[Base]
    }
    
    @scala.inline
    implicit class BaseMutableBuilder[Self <: Base] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditor(value: String): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreview(value: String): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Fullscreen extends StObject {
    
    var fullscreen: Double = js.native
    
    var modifier: Double = js.native
    
    var preview: Double = js.native
  }
  object Fullscreen {
    
    @scala.inline
    def apply(fullscreen: Double, modifier: Double, preview: Double): Fullscreen = {
      val __obj = js.Dynamic.literal(fullscreen = fullscreen.asInstanceOf[js.Any], modifier = modifier.asInstanceOf[js.Any], preview = preview.asInstanceOf[js.Any])
      __obj.asInstanceOf[Fullscreen]
    }
    
    @scala.inline
    implicit class FullscreenMutableBuilder[Self <: Fullscreen] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFullscreen(value: Double): Self = StObject.set(x, "fullscreen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModifier(value: Double): Self = StObject.set(x, "modifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreview(value: Double): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ToggleEdit extends StObject {
    
    var toggleEdit: String = js.native
    
    var toggleFullscreen: String = js.native
    
    var togglePreview: String = js.native
  }
  object ToggleEdit {
    
    @scala.inline
    def apply(toggleEdit: String, toggleFullscreen: String, togglePreview: String): ToggleEdit = {
      val __obj = js.Dynamic.literal(toggleEdit = toggleEdit.asInstanceOf[js.Any], toggleFullscreen = toggleFullscreen.asInstanceOf[js.Any], togglePreview = togglePreview.asInstanceOf[js.Any])
      __obj.asInstanceOf[ToggleEdit]
    }
    
    @scala.inline
    implicit class ToggleEditMutableBuilder[Self <: ToggleEdit] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setToggleEdit(value: String): Self = StObject.set(x, "toggleEdit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToggleFullscreen(value: String): Self = StObject.set(x, "toggleFullscreen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTogglePreview(value: String): Self = StObject.set(x, "togglePreview", value.asInstanceOf[js.Any])
    }
  }
}
