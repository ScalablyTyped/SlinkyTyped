package typingsSlinky.googleapis.tagmanagerV1Mod.tagmanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a Google Tag Manager Parameter.
  */
@js.native
trait SchemaParameter extends js.Object {
  /**
    * The named key that uniquely identifies a parameter. Required for
    * top-level parameters, as well as map values. Ignored for list values.
    */
  var key: js.UndefOr[String] = js.native
  /**
    * This list parameter&#39;s parameters (keys will be ignored).
    */
  var list: js.UndefOr[js.Array[SchemaParameter]] = js.native
  /**
    * This map parameter&#39;s parameters (must have keys; keys must be
    * unique).
    */
  var map: js.UndefOr[js.Array[SchemaParameter]] = js.native
  /**
    * The parameter type. Valid values are:  - boolean: The value represents a
    * boolean, represented as &#39;true&#39; or &#39;false&#39;  - integer: The
    * value represents a 64-bit signed integer value, in base 10  - list: A
    * list of parameters should be specified  - map: A map of parameters should
    * be specified  - template: The value represents any text; this can include
    * variable references (even variable references that might return
    * non-string types)
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * A parameter&#39;s value (may contain variable references such as
    * &quot;{{myVariable}}&quot;) as appropriate to the specified type.
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaParameter {
  @scala.inline
  def apply(): SchemaParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaParameter]
  }
  @scala.inline
  implicit class SchemaParameterOps[Self <: SchemaParameter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withList(value: js.Array[SchemaParameter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.undefined)
        ret
    }
    @scala.inline
    def withMap(value: js.Array[SchemaParameter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(js.undefined)
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

