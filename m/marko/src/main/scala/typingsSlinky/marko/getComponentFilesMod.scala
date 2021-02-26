package typingsSlinky.marko

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getComponentFilesMod {
  
  @JSImport("marko/src/components/taglib/TransformHelper/getComponentFiles", JSImport.Namespace)
  @js.native
  def apply(filename: String): ComponentFiles | Null = js.native
  
  @js.native
  trait ComponentFiles extends StObject {
    
    @JSName("package")
    var _package: String | Null = js.native
    
    var browserFile: String | Null = js.native
    
    var file: String | Null = js.native
    
    var styles: js.Array[String] = js.native
  }
  object ComponentFiles {
    
    @scala.inline
    def apply(styles: js.Array[String]): ComponentFiles = {
      val __obj = js.Dynamic.literal(styles = styles.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentFiles]
    }
    
    @scala.inline
    implicit class ComponentFilesMutableBuilder[Self <: ComponentFiles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBrowserFile(value: String): Self = StObject.set(x, "browserFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrowserFileNull: Self = StObject.set(x, "browserFile", null)
      
      @scala.inline
      def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileNull: Self = StObject.set(x, "file", null)
      
      @scala.inline
      def setStyles(value: js.Array[String]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesVarargs(value: String*): Self = StObject.set(x, "styles", js.Array(value :_*))
      
      @scala.inline
      def set_package(value: String): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_packageNull: Self = StObject.set(x, "package", null)
    }
  }
}
