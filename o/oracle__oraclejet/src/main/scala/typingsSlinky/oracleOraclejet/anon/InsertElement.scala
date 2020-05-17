package typingsSlinky.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InsertElement extends js.Object {
  var insert: org.scalajs.dom.raw.Element = js.native
}

object InsertElement {
  @scala.inline
  def apply(insert: org.scalajs.dom.raw.Element): InsertElement = {
    val __obj = js.Dynamic.literal(insert = insert.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsertElement]
  }
  @scala.inline
  implicit class InsertElementOps[Self <: InsertElement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInsert(value: org.scalajs.dom.raw.Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

