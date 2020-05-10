package typingsSlinky.pulumiKubernetes.outputMod.meta.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * APIResource specifies the name of a resource and whether it is namespaced.
  */
@js.native
trait APIResource extends js.Object {
  /**
    * categories is a list of the grouped resources this resource belongs to (e.g. 'all')
    */
  val categories: js.Array[String] = js.native
  /**
    * group is the preferred group of the resource.  Empty implies the group of the containing
    * resource list. For subresources, this may have a different value, for example: Scale".
    */
  val group: String = js.native
  /**
    * kind is the kind for the resource (e.g. 'Foo' is the kind for a resource 'foo')
    */
  val kind: String = js.native
  /**
    * name is the plural name of the resource.
    */
  val name: String = js.native
  /**
    * namespaced indicates if a resource is namespaced or not.
    */
  val namespaced: Boolean = js.native
  /**
    * shortNames is a list of suggested short names of the resource.
    */
  val shortNames: js.Array[String] = js.native
  /**
    * singularName is the singular name of the resource.  This allows clients to handle plural
    * and singular opaquely. The singularName is more correct for reporting status on a single
    * item and both singular and plural are allowed from the kubectl CLI interface.
    */
  val singularName: String = js.native
  /**
    * The hash value of the storage version, the version this resource is converted to when
    * written to the data store. Value must be treated as opaque by clients. Only equality
    * comparison on the value is valid. This is an alpha feature and may change or be removed in
    * the future. The field is populated by the apiserver only if the StorageVersionHash feature
    * gate is enabled. This field will remain optional even if it graduates.
    */
  val storageVersionHash: String = js.native
  /**
    * verbs is a list of supported kube verbs (this includes get, list, watch, create, update,
    * patch, delete, deletecollection, and proxy)
    */
  val verbs: js.Array[String] = js.native
  /**
    * version is the preferred version of the resource.  Empty implies the version of the
    * containing resource list For subresources, this may have a different value, for example: v1
    * (while inside a v1beta1 version of the core resource's group)".
    */
  val version: String = js.native
}

object APIResource {
  @scala.inline
  def apply(
    categories: js.Array[String],
    group: String,
    kind: String,
    name: String,
    namespaced: Boolean,
    shortNames: js.Array[String],
    singularName: String,
    storageVersionHash: String,
    verbs: js.Array[String],
    version: String
  ): APIResource = {
    val __obj = js.Dynamic.literal(categories = categories.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespaced = namespaced.asInstanceOf[js.Any], shortNames = shortNames.asInstanceOf[js.Any], singularName = singularName.asInstanceOf[js.Any], storageVersionHash = storageVersionHash.asInstanceOf[js.Any], verbs = verbs.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[APIResource]
  }
  @scala.inline
  implicit class APIResourceOps[Self <: APIResource] (val x: Self) extends AnyVal {
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
    def withGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNamespaced(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespaced")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShortNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSingularName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singularName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStorageVersionHash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageVersionHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerbs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

