package typingsSlinky.buble.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Arrow extends js.Object {
  var arrow: js.UndefOr[Boolean] = js.native
  var classes: js.UndefOr[Boolean] = js.native
  var collections: js.UndefOr[Boolean] = js.native
  var computedProperty: js.UndefOr[Boolean] = js.native
  var conciseMethodProperty: js.UndefOr[Boolean] = js.native
  var constLoop: js.UndefOr[Boolean] = js.native
  var dangerousForOf: js.UndefOr[Boolean] = js.native
  var dangerousTaggedTemplateString: js.UndefOr[Boolean] = js.native
  var defaultParameter: js.UndefOr[Boolean] = js.native
  var destructuring: js.UndefOr[Boolean] = js.native
  var forOf: js.UndefOr[Boolean] = js.native
  var generator: js.UndefOr[Boolean] = js.native
  var letConst: js.UndefOr[Boolean] = js.native
  var modules: js.UndefOr[Boolean] = js.native
  var numericLiteral: js.UndefOr[Boolean] = js.native
  var parameterDestructuring: js.UndefOr[Boolean] = js.native
  var reservedProperties: js.UndefOr[Boolean] = js.native
  var spreadRest: js.UndefOr[Boolean] = js.native
  var stickyRegExp: js.UndefOr[Boolean] = js.native
  var templateString: js.UndefOr[Boolean] = js.native
  var unicodeRegExp: js.UndefOr[Boolean] = js.native
}

object Arrow {
  @scala.inline
  def apply(): Arrow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Arrow]
  }
  @scala.inline
  implicit class ArrowOps[Self <: Arrow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArrow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrow")(js.undefined)
        ret
    }
    @scala.inline
    def withClasses(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClasses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classes")(js.undefined)
        ret
    }
    @scala.inline
    def withCollections(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollections: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collections")(js.undefined)
        ret
    }
    @scala.inline
    def withComputedProperty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computedProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComputedProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computedProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withConciseMethodProperty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conciseMethodProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConciseMethodProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conciseMethodProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withConstLoop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constLoop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConstLoop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constLoop")(js.undefined)
        ret
    }
    @scala.inline
    def withDangerousForOf(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dangerousForOf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDangerousForOf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dangerousForOf")(js.undefined)
        ret
    }
    @scala.inline
    def withDangerousTaggedTemplateString(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dangerousTaggedTemplateString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDangerousTaggedTemplateString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dangerousTaggedTemplateString")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultParameter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultParameter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultParameter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultParameter")(js.undefined)
        ret
    }
    @scala.inline
    def withDestructuring(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destructuring")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestructuring: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destructuring")(js.undefined)
        ret
    }
    @scala.inline
    def withForOf(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forOf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForOf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forOf")(js.undefined)
        ret
    }
    @scala.inline
    def withGenerator(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGenerator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generator")(js.undefined)
        ret
    }
    @scala.inline
    def withLetConst(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("letConst")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLetConst: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("letConst")(js.undefined)
        ret
    }
    @scala.inline
    def withModules(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modules")(js.undefined)
        ret
    }
    @scala.inline
    def withNumericLiteral(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numericLiteral")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumericLiteral: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numericLiteral")(js.undefined)
        ret
    }
    @scala.inline
    def withParameterDestructuring(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameterDestructuring")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameterDestructuring: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameterDestructuring")(js.undefined)
        ret
    }
    @scala.inline
    def withReservedProperties(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reservedProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReservedProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reservedProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withSpreadRest(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spreadRest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpreadRest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spreadRest")(js.undefined)
        ret
    }
    @scala.inline
    def withStickyRegExp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stickyRegExp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStickyRegExp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stickyRegExp")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplateString(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplateString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateString")(js.undefined)
        ret
    }
    @scala.inline
    def withUnicodeRegExp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unicodeRegExp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnicodeRegExp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unicodeRegExp")(js.undefined)
        ret
    }
  }
  
}

