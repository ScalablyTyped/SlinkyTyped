package typingsSlinky.extractFiles

import typingsSlinky.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Clone[TFile] extends StObject {
    
    @JSName("clone")
    var clone_FClone: js.Any = js.native
    
    var files: Map[TFile, js.Array[String]] = js.native
  }
  object Clone {
    
    @scala.inline
    def apply[TFile](clone_ : js.Any, files: Map[TFile, js.Array[String]]): Clone[TFile] = {
      val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any])
      __obj.updateDynamic("clone")(clone_.asInstanceOf[js.Any])
      __obj.asInstanceOf[Clone[TFile]]
    }
    
    @scala.inline
    implicit class CloneMutableBuilder[Self <: Clone[_], TFile] (val x: Self with Clone[TFile]) extends AnyVal {
      
      @scala.inline
      def setClone_(value: js.Any): Self = StObject.set(x, "clone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiles(value: Map[TFile, js.Array[String]]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    }
  }
}
