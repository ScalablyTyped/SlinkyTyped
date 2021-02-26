package typingsSlinky.pulumiKubernetes.outputMod.apiextensions.v1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * CustomResourceDefinitionNames indicates the names to serve this CustomResourceDefinition
  */
@js.native
trait CustomResourceDefinitionNames extends StObject {
  
  /**
    * categories is a list of grouped resources this custom resource belongs to (e.g. 'all'). This is published in API discovery documents, and used by clients to support invocations like `kubectl get all`.
    */
  var categories: js.Array[String] = js.native
  
  /**
    * kind is the serialized kind of the resource. It is normally CamelCase and singular. Custom resource instances will use this value as the `kind` attribute in API calls.
    */
  var kind: String = js.native
  
  /**
    * listKind is the serialized kind of the list for this resource. Defaults to "`kind`List".
    */
  var listKind: String = js.native
  
  /**
    * plural is the plural name of the resource to serve. The custom resources are served under `/apis/<group>/<version>/.../<plural>`. Must match the name of the CustomResourceDefinition (in the form `<names.plural>.<group>`). Must be all lowercase.
    */
  var plural: String = js.native
  
  /**
    * shortNames are short names for the resource, exposed in API discovery documents, and used by clients to support invocations like `kubectl get <shortname>`. It must be all lowercase.
    */
  var shortNames: js.Array[String] = js.native
  
  /**
    * singular is the singular name of the resource. It must be all lowercase. Defaults to lowercased `kind`.
    */
  var singular: String = js.native
}
object CustomResourceDefinitionNames {
  
  @scala.inline
  def apply(
    categories: js.Array[String],
    kind: String,
    listKind: String,
    plural: String,
    shortNames: js.Array[String],
    singular: String
  ): CustomResourceDefinitionNames = {
    val __obj = js.Dynamic.literal(categories = categories.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], listKind = listKind.asInstanceOf[js.Any], plural = plural.asInstanceOf[js.Any], shortNames = shortNames.asInstanceOf[js.Any], singular = singular.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomResourceDefinitionNames]
  }
  
  @scala.inline
  implicit class CustomResourceDefinitionNamesMutableBuilder[Self <: CustomResourceDefinitionNames] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategories(value: js.Array[String]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoriesVarargs(value: String*): Self = StObject.set(x, "categories", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListKind(value: String): Self = StObject.set(x, "listKind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlural(value: String): Self = StObject.set(x, "plural", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortNames(value: js.Array[String]): Self = StObject.set(x, "shortNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortNamesVarargs(value: String*): Self = StObject.set(x, "shortNames", js.Array(value :_*))
    
    @scala.inline
    def setSingular(value: String): Self = StObject.set(x, "singular", value.asInstanceOf[js.Any])
  }
}
