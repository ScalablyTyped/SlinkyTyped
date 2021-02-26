package typingsSlinky.googleapis.runV1alpha1Mod.runV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * LocalObjectReference contains enough information to let you locate the
  * referenced object inside the same namespace.
  */
@js.native
trait SchemaLocalObjectReference extends StObject {
  
  /**
    * Name of the referent. More info:
    * https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
    */
  var name: js.UndefOr[String] = js.native
}
object SchemaLocalObjectReference {
  
  @scala.inline
  def apply(): SchemaLocalObjectReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLocalObjectReference]
  }
  
  @scala.inline
  implicit class SchemaLocalObjectReferenceMutableBuilder[Self <: SchemaLocalObjectReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
