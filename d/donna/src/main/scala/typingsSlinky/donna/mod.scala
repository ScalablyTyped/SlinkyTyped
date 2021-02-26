package typingsSlinky.donna

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.donna.mod.DonnaTypes.Metadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("donna", "generateMetadata")
  @js.native
  def generateMetadata(modules: js.Array[String]): Metadata = js.native
  
  object DonnaTypes {
    
    @js.native
    trait File extends StObject {
      
      var exports: js.Any = js.native
      
      var objects: NumberDictionary[Line] = js.native
    }
    object File {
      
      @scala.inline
      def apply(exports: js.Any, objects: NumberDictionary[Line]): File = {
        val __obj = js.Dynamic.literal(exports = exports.asInstanceOf[js.Any], objects = objects.asInstanceOf[js.Any])
        __obj.asInstanceOf[File]
      }
      
      @scala.inline
      implicit class FileMutableBuilder[Self <: File] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setExports(value: js.Any): Self = StObject.set(x, "exports", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setObjects(value: NumberDictionary[Line]): Self = StObject.set(x, "objects", value.asInstanceOf[js.Any])
      }
    }
    
    type Line = NumberDictionary[Object]
    
    @js.native
    trait Metadata extends StObject {
      
      var files: StringDictionary[File] = js.native
    }
    object Metadata {
      
      @scala.inline
      def apply(files: StringDictionary[File]): Metadata = {
        val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any])
        __obj.asInstanceOf[Metadata]
      }
      
      @scala.inline
      implicit class MetadataMutableBuilder[Self <: Metadata] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFiles(value: StringDictionary[File]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait Object extends StObject {
      
      var bindingType: String = js.native
      
      var classProperties: js.UndefOr[js.Array[_]] = js.native
      
      var doc: js.UndefOr[String] = js.native
      
      var name: String = js.native
      
      var paramNames: js.UndefOr[js.Array[String]] = js.native
      
      var prototypeProperties: js.UndefOr[js.Array[js.Array[Double]]] = js.native
      
      var range: js.Array[js.Array[Double]] = js.native
      
      var `type`: String = js.native
    }
    object Object {
      
      @scala.inline
      def apply(bindingType: String, name: String, range: js.Array[js.Array[Double]], `type`: String): Object = {
        val __obj = js.Dynamic.literal(bindingType = bindingType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[Object]
      }
      
      @scala.inline
      implicit class ObjectMutableBuilder[Self <: Object] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBindingType(value: String): Self = StObject.set(x, "bindingType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClassProperties(value: js.Array[_]): Self = StObject.set(x, "classProperties", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClassPropertiesUndefined: Self = StObject.set(x, "classProperties", js.undefined)
        
        @scala.inline
        def setClassPropertiesVarargs(value: js.Any*): Self = StObject.set(x, "classProperties", js.Array(value :_*))
        
        @scala.inline
        def setDoc(value: String): Self = StObject.set(x, "doc", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDocUndefined: Self = StObject.set(x, "doc", js.undefined)
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setParamNames(value: js.Array[String]): Self = StObject.set(x, "paramNames", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setParamNamesUndefined: Self = StObject.set(x, "paramNames", js.undefined)
        
        @scala.inline
        def setParamNamesVarargs(value: String*): Self = StObject.set(x, "paramNames", js.Array(value :_*))
        
        @scala.inline
        def setPrototypeProperties(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "prototypeProperties", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPrototypePropertiesUndefined: Self = StObject.set(x, "prototypeProperties", js.undefined)
        
        @scala.inline
        def setPrototypePropertiesVarargs(value: js.Array[Double]*): Self = StObject.set(x, "prototypeProperties", js.Array(value :_*))
        
        @scala.inline
        def setRange(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRangeVarargs(value: js.Array[Double]*): Self = StObject.set(x, "range", js.Array(value :_*))
        
        @scala.inline
        def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
  }
}
