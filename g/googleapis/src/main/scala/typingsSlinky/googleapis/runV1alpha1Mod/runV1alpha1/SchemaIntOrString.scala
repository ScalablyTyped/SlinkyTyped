package typingsSlinky.googleapis.runV1alpha1Mod.runV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * IntOrString is a type that can hold an int32 or a string.  When used in
  * JSON or YAML marshalling and unmarshalling, it produces or consumes the
  * inner type.  This allows you to have, for example, a JSON field that can
  * accept a name or number.
  */
@js.native
trait SchemaIntOrString extends js.Object {
  /**
    * The int value.
    */
  var intVal: js.UndefOr[Double] = js.native
  /**
    * The string value.
    */
  var strVal: js.UndefOr[String] = js.native
  /**
    * The type of the value.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaIntOrString {
  @scala.inline
  def apply(): SchemaIntOrString = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIntOrString]
  }
  @scala.inline
  implicit class SchemaIntOrStringOps[Self <: SchemaIntOrString] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIntVal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intVal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntVal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intVal")(js.undefined)
        ret
    }
    @scala.inline
    def withStrVal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strVal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrVal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strVal")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

