package typingsSlinky.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRelationalDatabaseLogStreamsRequest extends js.Object {
  /**
    * The name of your database for which to get log streams.
    */
  var relationalDatabaseName: ResourceName = js.native
}

object GetRelationalDatabaseLogStreamsRequest {
  @scala.inline
  def apply(relationalDatabaseName: ResourceName): GetRelationalDatabaseLogStreamsRequest = {
    val __obj = js.Dynamic.literal(relationalDatabaseName = relationalDatabaseName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRelationalDatabaseLogStreamsRequest]
  }
  @scala.inline
  implicit class GetRelationalDatabaseLogStreamsRequestOps[Self <: GetRelationalDatabaseLogStreamsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRelationalDatabaseName(value: ResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relationalDatabaseName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

