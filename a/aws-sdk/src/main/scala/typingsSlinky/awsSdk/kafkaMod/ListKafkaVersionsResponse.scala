package typingsSlinky.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListKafkaVersionsResponse extends js.Object {
  var KafkaVersions: js.UndefOr[listOfKafkaVersion] = js.native
  var NextToken: js.UndefOr[string] = js.native
}

object ListKafkaVersionsResponse {
  @scala.inline
  def apply(): ListKafkaVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListKafkaVersionsResponse]
  }
  @scala.inline
  implicit class ListKafkaVersionsResponseOps[Self <: ListKafkaVersionsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKafkaVersions(value: listOfKafkaVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KafkaVersions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKafkaVersions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KafkaVersions")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
  }
  
}

