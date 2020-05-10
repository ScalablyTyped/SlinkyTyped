package typingsSlinky.googleapis.cloudidentityV1beta1Mod.cloudidentityV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An EntityKey uniquely identifies an Entity. Namespaces are used to provide
  * isolation for ids.  A single Id can be reused across namespaces but the
  * combination of a namespace and an id must be unique.
  */
@js.native
trait SchemaEntityKey extends js.Object {
  /**
    * The id of the entity within the given namespace. The id must be unique
    * within its namespace.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Namespaces provide isolation for ids, i.e an id only needs to be unique
    * within its namespace.  Namespaces are currently only created as part of
    * IdentitySource creation from Admin Console. A namespace
    * `&quot;identitysources/{identity_source_id}&quot;` is created
    * corresponding to every Identity Source `identity_source_id`.
    */
  var namespace: js.UndefOr[String] = js.native
}

object SchemaEntityKey {
  @scala.inline
  def apply(): SchemaEntityKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEntityKey]
  }
  @scala.inline
  implicit class SchemaEntityKeyOps[Self <: SchemaEntityKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withNamespace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(js.undefined)
        ret
    }
  }
  
}

