package typingsSlinky.dynogels.mod

import typingsSlinky.dynogels.AnonStreamEnabled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTablesOptions extends js.Object {
  var readCapacity: js.UndefOr[Double] = js.native
  var streamSpecification: js.UndefOr[AnonStreamEnabled] = js.native
  var writeCapacity: js.UndefOr[Double] = js.native
}

object CreateTablesOptions {
  @scala.inline
  def apply(): CreateTablesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTablesOptions]
  }
  @scala.inline
  implicit class CreateTablesOptionsOps[Self <: CreateTablesOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReadCapacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readCapacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadCapacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readCapacity")(js.undefined)
        ret
    }
    @scala.inline
    def withStreamSpecification(value: AnonStreamEnabled): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streamSpecification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreamSpecification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streamSpecification")(js.undefined)
        ret
    }
    @scala.inline
    def withWriteCapacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeCapacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWriteCapacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeCapacity")(js.undefined)
        ret
    }
  }
  
}

