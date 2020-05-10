package typingsSlinky.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRelationalDatabaseLogStreamsResult extends js.Object {
  /**
    * An object describing the result of your get relational database log streams request.
    */
  var logStreams: js.UndefOr[StringList] = js.native
}

object GetRelationalDatabaseLogStreamsResult {
  @scala.inline
  def apply(): GetRelationalDatabaseLogStreamsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRelationalDatabaseLogStreamsResult]
  }
  @scala.inline
  implicit class GetRelationalDatabaseLogStreamsResultOps[Self <: GetRelationalDatabaseLogStreamsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLogStreams(value: StringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logStreams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogStreams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logStreams")(js.undefined)
        ret
    }
  }
  
}

