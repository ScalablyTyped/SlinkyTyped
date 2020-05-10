package typingsSlinky.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for object properties.
  */
@js.native
trait SchemaObjectPropertyOptions extends js.Object {
  /**
    * The properties of the sub-object. These properties represent a nested
    * object. For example, if this property represents a postal address, the
    * subobjectProperties might be named *street*, *city*, and *state*. The
    * maximum number of elements is 1000.
    */
  var subobjectProperties: js.UndefOr[js.Array[SchemaPropertyDefinition]] = js.native
}

object SchemaObjectPropertyOptions {
  @scala.inline
  def apply(): SchemaObjectPropertyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaObjectPropertyOptions]
  }
  @scala.inline
  implicit class SchemaObjectPropertyOptionsOps[Self <: SchemaObjectPropertyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSubobjectProperties(value: js.Array[SchemaPropertyDefinition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subobjectProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubobjectProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subobjectProperties")(js.undefined)
        ret
    }
  }
  
}

