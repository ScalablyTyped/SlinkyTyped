package typingsSlinky.googleapis.serviceusageV1beta1Mod.serviceusageV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A documentation rule provides information about individual API elements.
  */
@js.native
trait SchemaDocumentationRule extends js.Object {
  /**
    * Deprecation description of the selected element(s). It can be provided if
    * an element is marked as `deprecated`.
    */
  var deprecationDescription: js.UndefOr[String] = js.native
  /**
    * Description of the selected API(s).
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The selector is a comma-separated list of patterns. Each pattern is a
    * qualified name of the element which may end in &quot;*&quot;, indicating
    * a wildcard. Wildcards are only allowed at the end and for a whole
    * component of the qualified name, i.e. &quot;foo.*&quot; is ok, but not
    * &quot;foo.b*&quot; or &quot;foo.*.bar&quot;. A wildcard will match one or
    * more components. To specify a default for all applicable elements, the
    * whole pattern &quot;*&quot; is used.
    */
  var selector: js.UndefOr[String] = js.native
}

object SchemaDocumentationRule {
  @scala.inline
  def apply(): SchemaDocumentationRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDocumentationRule]
  }
  @scala.inline
  implicit class SchemaDocumentationRuleOps[Self <: SchemaDocumentationRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeprecationDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecationDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeprecationDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecationDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(js.undefined)
        ret
    }
  }
  
}

