package typingsSlinky.aframe.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaUtils extends js.Object {
  def isSingleProperty(schema: Schema_[js.Object]): Boolean = js.native
  def process(schema: Schema_[js.Object]): Boolean = js.native
}

object SchemaUtils {
  @scala.inline
  def apply(isSingleProperty: Schema_[js.Object] => Boolean, process: Schema_[js.Object] => Boolean): SchemaUtils = {
    val __obj = js.Dynamic.literal(isSingleProperty = js.Any.fromFunction1(isSingleProperty), process = js.Any.fromFunction1(process))
    __obj.asInstanceOf[SchemaUtils]
  }
  @scala.inline
  implicit class SchemaUtilsOps[Self <: SchemaUtils] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsSingleProperty(value: Schema_[js.Object] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSingleProperty")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withProcess(value: Schema_[js.Object] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("process")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

