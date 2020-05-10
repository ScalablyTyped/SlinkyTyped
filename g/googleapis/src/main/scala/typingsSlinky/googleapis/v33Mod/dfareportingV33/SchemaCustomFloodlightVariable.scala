package typingsSlinky.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A custom floodlight variable.
  */
@js.native
trait SchemaCustomFloodlightVariable extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#customFloodlightVariable&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The type of custom floodlight variable to supply a value for. These map
    * to the &quot;u[1-20]=&quot; in the tags.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * The value of the custom floodlight variable. The length of string must
    * not exceed 50 characters.
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaCustomFloodlightVariable {
  @scala.inline
  def apply(): SchemaCustomFloodlightVariable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomFloodlightVariable]
  }
  @scala.inline
  implicit class SchemaCustomFloodlightVariableOps[Self <: SchemaCustomFloodlightVariable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

