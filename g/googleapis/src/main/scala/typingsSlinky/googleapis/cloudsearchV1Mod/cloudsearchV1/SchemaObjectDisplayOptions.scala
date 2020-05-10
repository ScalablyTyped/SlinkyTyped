package typingsSlinky.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The display options for an object.
  */
@js.native
trait SchemaObjectDisplayOptions extends js.Object {
  /**
    * Defines the properties that will be displayed in the metalines of the
    * search results. The property values will be displayed in the order given
    * here. If a property holds multiple values, all of the values will be
    * diplayed before the next properties. For this reason, it is a good
    * practice to specify singular properties before repeated properties in
    * this list. All of the properties must set is_returnable to true. The
    * maximum number of elements is 3.
    */
  var metalines: js.UndefOr[js.Array[SchemaMetaline]] = js.native
  /**
    * The user friendly label to display in the search result to inidicate the
    * type of the item. This is OPTIONAL; if not given, an object label will
    * not be displayed on the context line of the search results. The maximum
    * length is 32 characters.
    */
  var objectDisplayLabel: js.UndefOr[String] = js.native
}

object SchemaObjectDisplayOptions {
  @scala.inline
  def apply(): SchemaObjectDisplayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaObjectDisplayOptions]
  }
  @scala.inline
  implicit class SchemaObjectDisplayOptionsOps[Self <: SchemaObjectDisplayOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMetalines(value: js.Array[SchemaMetaline]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metalines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetalines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metalines")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectDisplayLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectDisplayLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectDisplayLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectDisplayLabel")(js.undefined)
        ret
    }
  }
  
}

