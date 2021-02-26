package typingsSlinky.iconGen

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Ico extends StObject {
    
    var ico: js.Array[Double] = js.native
    
    var name: String = js.native
    
    var sizes: js.Array[Double] = js.native
  }
  object Ico {
    
    @scala.inline
    def apply(ico: js.Array[Double], name: String, sizes: js.Array[Double]): Ico = {
      val __obj = js.Dynamic.literal(ico = ico.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sizes = sizes.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ico]
    }
    
    @scala.inline
    implicit class IcoMutableBuilder[Self <: Ico] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIco(value: js.Array[Double]): Self = StObject.set(x, "ico", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIcoVarargs(value: Double*): Self = StObject.set(x, "ico", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizes(value: js.Array[Double]): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizesVarargs(value: Double*): Self = StObject.set(x, "sizes", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Name extends StObject {
    
    var name: String = js.native
    
    var sizes: js.Array[Double] = js.native
  }
  object Name {
    
    @scala.inline
    def apply(name: String, sizes: js.Array[Double]): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], sizes = sizes.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit class NameMutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizes(value: js.Array[Double]): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizesVarargs(value: Double*): Self = StObject.set(x, "sizes", js.Array(value :_*))
    }
  }
}
