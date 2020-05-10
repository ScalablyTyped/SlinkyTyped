package typingsSlinky.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateEntityRecognizerResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) that identifies the entity recognizer.
    */
  var EntityRecognizerArn: js.UndefOr[typingsSlinky.awsSdk.comprehendMod.EntityRecognizerArn] = js.native
}

object CreateEntityRecognizerResponse {
  @scala.inline
  def apply(): CreateEntityRecognizerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateEntityRecognizerResponse]
  }
  @scala.inline
  implicit class CreateEntityRecognizerResponseOps[Self <: CreateEntityRecognizerResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntityRecognizerArn(value: EntityRecognizerArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EntityRecognizerArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntityRecognizerArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EntityRecognizerArn")(js.undefined)
        ret
    }
  }
  
}

