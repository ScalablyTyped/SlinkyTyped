package typingsSlinky.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A variable set is a key-value pair of EMM-provided placeholders and its
  * corresponding value, which is attributed to a user. For example, $FIRSTNAME
  * could be a placeholder, and its value could be Alice. Placeholders should
  * start with a &#39;$&#39; sign and should be alphanumeric only.
  */
@js.native
trait SchemaVariableSet extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#variableSet&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The placeholder string; defined by EMM.
    */
  var placeholder: js.UndefOr[String] = js.native
  /**
    * The value of the placeholder, specific to the user.
    */
  var userValue: js.UndefOr[String] = js.native
}

object SchemaVariableSet {
  @scala.inline
  def apply(): SchemaVariableSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVariableSet]
  }
  @scala.inline
  implicit class SchemaVariableSetOps[Self <: SchemaVariableSet] (val x: Self) extends AnyVal {
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
    def withPlaceholder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(js.undefined)
        ret
    }
    @scala.inline
    def withUserValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userValue")(js.undefined)
        ret
    }
  }
  
}

