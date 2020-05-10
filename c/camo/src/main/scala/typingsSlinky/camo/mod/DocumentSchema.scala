package typingsSlinky.camo.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentSchema extends /**
		 * Index signature
		 */
/* property */ StringDictionary[SchemaType] {
  /**
  		 * Document id
  		 */
  var _id: js.UndefOr[String] = js.native
}

object DocumentSchema {
  @scala.inline
  def apply(): DocumentSchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentSchema]
  }
  @scala.inline
  implicit class DocumentSchemaOps[Self <: DocumentSchema] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_id")(js.undefined)
        ret
    }
  }
  
}

