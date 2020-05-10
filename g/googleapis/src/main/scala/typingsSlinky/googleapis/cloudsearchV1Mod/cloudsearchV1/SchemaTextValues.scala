package typingsSlinky.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List of text values.
  */
@js.native
trait SchemaTextValues extends js.Object {
  /**
    * The maximum allowable length for text values is 2048 characters.
    */
  var values: js.UndefOr[js.Array[String]] = js.native
}

object SchemaTextValues {
  @scala.inline
  def apply(): SchemaTextValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTextValues]
  }
  @scala.inline
  implicit class SchemaTextValuesOps[Self <: SchemaTextValues] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValues(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(js.undefined)
        ret
    }
  }
  
}

