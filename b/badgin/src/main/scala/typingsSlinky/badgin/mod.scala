package typingsSlinky.badgin

import typingsSlinky.badgin.anon.PartialOptions
import typingsSlinky.badgin.anon.PartialOptionsFavicon
import typingsSlinky.badgin.anon.PartialOptionsIndicator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("badgin", "clear")
  @js.native
  def clear(): Unit = js.native
  
  @JSImport("badgin", "set")
  @js.native
  def set(value: Value): Unit = js.native
  @JSImport("badgin", "set")
  @js.native
  def set(value: Value, options: PartialOptionsFavicon): Unit = js.native
  
  @js.native
  trait Interface extends StObject {
    
    def clear(): Unit = js.native
    
    def set(value: Value): Unit = js.native
  }
  object Interface {
    
    @scala.inline
    def apply(clear: () => Unit, set: Value => Unit): Interface = {
      val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), set = js.Any.fromFunction1(set))
      __obj.asInstanceOf[Interface]
    }
    
    @scala.inline
    implicit class InterfaceMutableBuilder[Self <: Interface] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSet(value: Value => Unit): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.badgin.badginStrings.Badging
    - typingsSlinky.badgin.badginStrings.Favicon
    - typingsSlinky.badgin.badginStrings.Title
  */
  trait Method extends StObject
  object Method {
    
    @scala.inline
    def Badging: typingsSlinky.badgin.badginStrings.Badging = "Badging".asInstanceOf[typingsSlinky.badgin.badginStrings.Badging]
    
    @scala.inline
    def Favicon: typingsSlinky.badgin.badginStrings.Favicon = "Favicon".asInstanceOf[typingsSlinky.badgin.badginStrings.Favicon]
    
    @scala.inline
    def Title: typingsSlinky.badgin.badginStrings.Title = "Title".asInstanceOf[typingsSlinky.badgin.badginStrings.Title]
  }
  
  @js.native
  trait Options extends StObject {
    
    var favicon: PartialOptions = js.native
    
    var method: Method = js.native
    
    var title: PartialOptionsIndicator = js.native
  }
  object Options {
    
    @scala.inline
    def apply(favicon: PartialOptions, method: Method, title: PartialOptionsIndicator): Options = {
      val __obj = js.Dynamic.literal(favicon = favicon.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFavicon(value: PartialOptions): Self = StObject.set(x, "favicon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethod(value: Method): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: PartialOptionsIndicator): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  type Value = js.UndefOr[Double]
}
