package typingsSlinky.googleapis.serviceusageV1beta1Mod.serviceusageV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Enum type definition.
  */
@js.native
trait SchemaEnum extends js.Object {
  /**
    * Enum value definitions.
    */
  var enumvalue: js.UndefOr[js.Array[SchemaEnumValue]] = js.native
  /**
    * Enum type name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Protocol buffer options.
    */
  var options: js.UndefOr[js.Array[SchemaOption]] = js.native
  /**
    * The source context.
    */
  var sourceContext: js.UndefOr[SchemaSourceContext] = js.native
  /**
    * The source syntax.
    */
  var syntax: js.UndefOr[String] = js.native
}

object SchemaEnum {
  @scala.inline
  def apply(): SchemaEnum = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEnum]
  }
  @scala.inline
  implicit class SchemaEnumOps[Self <: SchemaEnum] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnumvalue(value: js.Array[SchemaEnumValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enumvalue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnumvalue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enumvalue")(js.undefined)
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
    @scala.inline
    def withOptions(value: js.Array[SchemaOption]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceContext(value: SchemaSourceContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceContext")(js.undefined)
        ret
    }
    @scala.inline
    def withSyntax(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syntax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSyntax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syntax")(js.undefined)
        ret
    }
  }
  
}

