package typingsSlinky.jupyterlabRendermimeInterfaces.mod.IRenderMime

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.jupyterlabRendermimeInterfaces.anon.IIconPartialIRenderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LabIcon {
  
  /**
    * The simplest possible interface for defining a generic icon.
    */
  @js.native
  trait IIcon extends StObject {
    
    /**
      * The name of the icon. By convention, the icon name will be namespaced
      * as so:
      *
      *     "pkg-name:icon-name"
      */
    val name: String = js.native
    
    /**
      * A string containing the raw contents of an svg file.
      */
    var svgstr: String = js.native
  }
  object IIcon {
    
    @scala.inline
    def apply(name: String, svgstr: String): IIcon = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], svgstr = svgstr.asInstanceOf[js.Any])
      __obj.asInstanceOf[IIcon]
    }
    
    @scala.inline
    implicit class IIconMutableBuilder[Self <: IIcon] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSvgstr(value: String): Self = StObject.set(x, "svgstr", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Interface for generic renderer.
    */
  @js.native
  trait IRenderer extends StObject {
    
    def render(container: HTMLElement): Unit = js.native
    def render(container: HTMLElement, options: js.Any): Unit = js.native
    
    def unrender(container: HTMLElement): Unit = js.native
  }
  
  /**
    * A type that can be resolved to a LabIcon instance.
    */
  type IResolvable = String | IIconPartialIRenderer
}
