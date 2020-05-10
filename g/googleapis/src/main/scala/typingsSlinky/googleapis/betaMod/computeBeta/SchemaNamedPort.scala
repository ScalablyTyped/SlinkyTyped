package typingsSlinky.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The named port. For example: .
  */
@js.native
trait SchemaNamedPort extends js.Object {
  /**
    * The name for this named port. The name must be 1-63 characters long, and
    * comply with RFC1035.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The port number, which can be a value between 1 and 65535.
    */
  var port: js.UndefOr[Double] = js.native
}

object SchemaNamedPort {
  @scala.inline
  def apply(): SchemaNamedPort = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNamedPort]
  }
  @scala.inline
  implicit class SchemaNamedPortOps[Self <: SchemaNamedPort] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(js.undefined)
        ret
    }
  }
  
}

