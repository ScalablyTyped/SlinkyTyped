package typingsSlinky.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ulimit extends js.Object {
  /**
    * The hard limit for the ulimit type.
    */
  var hardLimit: Integer = js.native
  /**
    * The type of the ulimit.
    */
  var name: UlimitName = js.native
  /**
    * The soft limit for the ulimit type.
    */
  var softLimit: Integer = js.native
}

object Ulimit {
  @scala.inline
  def apply(hardLimit: Integer, name: UlimitName, softLimit: Integer): Ulimit = {
    val __obj = js.Dynamic.literal(hardLimit = hardLimit.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], softLimit = softLimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ulimit]
  }
  @scala.inline
  implicit class UlimitOps[Self <: Ulimit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHardLimit(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hardLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: UlimitName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSoftLimit(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("softLimit")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

