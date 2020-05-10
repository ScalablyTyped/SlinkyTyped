package typingsSlinky.googleapis.v1beta3Mod.datastoreV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A (kind, ID/name) pair used to construct a key path.  If either name or ID
  * is set, the element is complete. If neither is set, the element is
  * incomplete.
  */
@js.native
trait SchemaPathElement extends js.Object {
  /**
    * The auto-allocated ID of the entity. Never equal to zero. Values less
    * than zero are discouraged and may not be supported in the future.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The kind of the entity. A kind matching regex `__.*__` is
    * reserved/read-only. A kind must not contain more than 1500 bytes when
    * UTF-8 encoded. Cannot be `&quot;&quot;`.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The name of the entity. A name matching regex `__.*__` is
    * reserved/read-only. A name must not be more than 1500 bytes when UTF-8
    * encoded. Cannot be `&quot;&quot;`.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaPathElement {
  @scala.inline
  def apply(): SchemaPathElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPathElement]
  }
  @scala.inline
  implicit class SchemaPathElementOps[Self <: SchemaPathElement] (val x: Self) extends AnyVal {
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
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
  }
  
}

