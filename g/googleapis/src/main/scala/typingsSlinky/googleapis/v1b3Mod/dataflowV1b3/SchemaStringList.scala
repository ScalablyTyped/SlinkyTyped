package typingsSlinky.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A metric value representing a list of strings.
  */
@js.native
trait SchemaStringList extends js.Object {
  /**
    * Elements of the list.
    */
  var elements: js.UndefOr[js.Array[String]] = js.native
}

object SchemaStringList {
  @scala.inline
  def apply(): SchemaStringList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStringList]
  }
  @scala.inline
  implicit class SchemaStringListOps[Self <: SchemaStringList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withElements(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elements")(js.undefined)
        ret
    }
  }
  
}

