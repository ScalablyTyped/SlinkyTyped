package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CharacterSet extends js.Object {
  /**
    * The description of the character set.
    */
  var CharacterSetDescription: js.UndefOr[String] = js.native
  /**
    * The name of the character set.
    */
  var CharacterSetName: js.UndefOr[String] = js.native
}

object CharacterSet {
  @scala.inline
  def apply(): CharacterSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CharacterSet]
  }
  @scala.inline
  implicit class CharacterSetOps[Self <: CharacterSet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCharacterSetDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharacterSetDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCharacterSetDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharacterSetDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withCharacterSetName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharacterSetName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCharacterSetName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharacterSetName")(js.undefined)
        ret
    }
  }
  
}

