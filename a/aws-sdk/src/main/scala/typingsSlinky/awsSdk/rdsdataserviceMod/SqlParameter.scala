package typingsSlinky.awsSdk.rdsdataserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SqlParameter extends js.Object {
  /**
    * The name of the parameter.
    */
  var name: js.UndefOr[ParameterName] = js.native
  /**
    * A hint that specifies the correct object type for data type mapping.  Values:     DECIMAL - The corresponding String parameter value is sent as an object of DECIMAL type to the database.    TIMESTAMP - The corresponding String parameter value is sent as an object of TIMESTAMP type to the database. The accepted format is YYYY-MM-DD HH:MM:SS[.FFF].    TIME - The corresponding String parameter value is sent as an object of TIME type to the database. The accepted format is HH:MM:SS[.FFF].    DATE - The corresponding String parameter value is sent as an object of DATE type to the database. The accepted format is YYYY-MM-DD.  
    */
  var typeHint: js.UndefOr[TypeHint] = js.native
  /**
    * The value of the parameter.
    */
  var value: js.UndefOr[Field] = js.native
}

object SqlParameter {
  @scala.inline
  def apply(): SqlParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SqlParameter]
  }
  @scala.inline
  implicit class SqlParameterOps[Self <: SqlParameter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: ParameterName): Self = {
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
    def withTypeHint(value: TypeHint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeHint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypeHint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeHint")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: Field): Self = {
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

