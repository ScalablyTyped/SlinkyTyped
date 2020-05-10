package typingsSlinky.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorRootCauseEntity extends js.Object {
  /**
    * The types and messages of the exceptions.
    */
  var Exceptions: js.UndefOr[RootCauseExceptions] = js.native
  /**
    * The name of the entity.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * A flag that denotes a remote subsegment.
    */
  var Remote: js.UndefOr[NullableBoolean] = js.native
}

object ErrorRootCauseEntity {
  @scala.inline
  def apply(): ErrorRootCauseEntity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorRootCauseEntity]
  }
  @scala.inline
  implicit class ErrorRootCauseEntityOps[Self <: ErrorRootCauseEntity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExceptions(value: RootCauseExceptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Exceptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExceptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Exceptions")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withRemote(value: NullableBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Remote")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemote: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Remote")(js.undefined)
        ret
    }
  }
  
}

