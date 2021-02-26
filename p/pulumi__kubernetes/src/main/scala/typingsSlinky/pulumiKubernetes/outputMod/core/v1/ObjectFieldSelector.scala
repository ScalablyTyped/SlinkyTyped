package typingsSlinky.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ObjectFieldSelector selects an APIVersioned field of an object.
  */
@js.native
trait ObjectFieldSelector extends StObject {
  
  /**
    * Version of the schema the FieldPath is written in terms of, defaults to "v1".
    */
  var apiVersion: String = js.native
  
  /**
    * Path of the field to select in the specified API version.
    */
  var fieldPath: String = js.native
}
object ObjectFieldSelector {
  
  @scala.inline
  def apply(apiVersion: String, fieldPath: String): ObjectFieldSelector = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], fieldPath = fieldPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectFieldSelector]
  }
  
  @scala.inline
  implicit class ObjectFieldSelectorMutableBuilder[Self <: ObjectFieldSelector] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiVersion(value: String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldPath(value: String): Self = StObject.set(x, "fieldPath", value.asInstanceOf[js.Any])
  }
}
