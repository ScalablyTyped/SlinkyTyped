package typingsSlinky.fridaGum.Java

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassSpec extends StObject {
  
  /**
    * Name and type of each field to expose.
    */
  var fields: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * Interfaces implemented by this class.
    */
  var implements: js.UndefOr[js.Array[typingsSlinky.fridaGum.anon.Wrapper]] = js.native
  
  /**
    * Methods to implement. Use the special name `$init` to define one or more constructors.
    */
  var methods: js.UndefOr[
    StringDictionary[MethodImplementation[js.Object] | MethodSpec | js.Array[MethodSpec]]
  ] = js.native
  
  /**
    * Name of the class.
    */
  var name: String = js.native
  
  /**
    * Super-class. Omit to inherit from `java.lang.Object`.
    */
  var superClass: js.UndefOr[typingsSlinky.fridaGum.anon.Wrapper] = js.native
}
object ClassSpec {
  
  @scala.inline
  def apply(name: String): ClassSpec = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassSpec]
  }
  
  @scala.inline
  implicit class ClassSpecMutableBuilder[Self <: ClassSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(value: StringDictionary[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setImplements(value: js.Array[typingsSlinky.fridaGum.anon.Wrapper]): Self = StObject.set(x, "implements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImplementsUndefined: Self = StObject.set(x, "implements", js.undefined)
    
    @scala.inline
    def setImplementsVarargs(value: typingsSlinky.fridaGum.anon.Wrapper*): Self = StObject.set(x, "implements", js.Array(value :_*))
    
    @scala.inline
    def setMethods(value: StringDictionary[MethodImplementation[js.Object] | MethodSpec | js.Array[MethodSpec]]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuperClass(value: typingsSlinky.fridaGum.anon.Wrapper): Self = StObject.set(x, "superClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuperClassUndefined: Self = StObject.set(x, "superClass", js.undefined)
  }
}
