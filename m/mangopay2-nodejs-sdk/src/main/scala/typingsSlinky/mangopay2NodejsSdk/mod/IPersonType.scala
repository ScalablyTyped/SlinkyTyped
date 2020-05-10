package typingsSlinky.mangopay2NodejsSdk.mod

import typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LEGAL
import typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NATURAL
import typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NotSpecified
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPersonType extends js.Object {
  var Legal: LEGAL = js.native
  var Natural: NATURAL = js.native
  var NotSpecified: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NotSpecified = js.native
}

object IPersonType {
  @scala.inline
  def apply(Legal: LEGAL, Natural: NATURAL, NotSpecified: NotSpecified): IPersonType = {
    val __obj = js.Dynamic.literal(Legal = Legal.asInstanceOf[js.Any], Natural = Natural.asInstanceOf[js.Any], NotSpecified = NotSpecified.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPersonType]
  }
  @scala.inline
  implicit class IPersonTypeOps[Self <: IPersonType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLegal(value: LEGAL): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Legal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNatural(value: NATURAL): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Natural")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotSpecified(value: NotSpecified): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotSpecified")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

