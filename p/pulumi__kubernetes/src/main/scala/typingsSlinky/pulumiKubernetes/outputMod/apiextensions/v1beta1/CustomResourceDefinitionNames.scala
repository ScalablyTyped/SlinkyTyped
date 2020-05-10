package typingsSlinky.pulumiKubernetes.outputMod.apiextensions.v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CustomResourceDefinitionNames indicates the names to serve this CustomResourceDefinition
  */
@js.native
trait CustomResourceDefinitionNames extends js.Object {
  /**
    * categories is a list of grouped resources this custom resource belongs to (e.g. 'all').
    * This is published in API discovery documents, and used by clients to support invocations
    * like `kubectl get all`.
    */
  val categories: js.Array[String] = js.native
  /**
    * kind is the serialized kind of the resource. It is normally CamelCase and singular. Custom
    * resource instances will use this value as the `kind` attribute in API calls.
    */
  val kind: String = js.native
  /**
    * listKind is the serialized kind of the list for this resource. Defaults to "`kind`List".
    */
  val listKind: String = js.native
  /**
    * plural is the plural name of the resource to serve. The custom resources are served under
    * `/apis/<group>/<version>/.../<plural>`. Must match the name of the CustomResourceDefinition
    * (in the form `<names.plural>.<group>`). Must be all lowercase.
    */
  val plural: String = js.native
  /**
    * shortNames are short names for the resource, exposed in API discovery documents, and used
    * by clients to support invocations like `kubectl get <shortname>`. It must be all lowercase.
    */
  val shortNames: js.Array[String] = js.native
  /**
    * singular is the singular name of the resource. It must be all lowercase. Defaults to
    * lowercased `kind`.
    */
  val singular: String = js.native
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
  implicit class CustomResourceDefinitionNamesOps[Self <: CustomResourceDefinitionNames] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCategories(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listKind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlural(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plural")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShortNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSingular(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singular")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

