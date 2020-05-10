package typingsSlinky.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaQueryParameterValue extends js.Object {
  /**
    * [Optional] The array values, if this is an array type.
    */
  var arrayValues: js.UndefOr[js.Array[SchemaQueryParameterValue]] = js.native
  /**
    * [Optional] The struct field values, in order of the struct type&#39;s
    * declaration.
    */
  var structValues: js.UndefOr[StringDictionary[SchemaQueryParameterValue]] = js.native
  /**
    * [Optional] The value of this value, if a simple scalar type.
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaQueryParameterValue {
  @scala.inline
  def apply(): SchemaQueryParameterValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQueryParameterValue]
  }
  @scala.inline
  implicit class SchemaQueryParameterValueOps[Self <: SchemaQueryParameterValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArrayValues(value: js.Array[SchemaQueryParameterValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrayValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrayValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrayValues")(js.undefined)
        ret
    }
    @scala.inline
    def withStructValues(value: StringDictionary[SchemaQueryParameterValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("structValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStructValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("structValues")(js.undefined)
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

