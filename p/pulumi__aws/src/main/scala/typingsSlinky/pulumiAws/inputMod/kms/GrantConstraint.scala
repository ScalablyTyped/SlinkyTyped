package typingsSlinky.pulumiAws.inputMod.kms

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GrantConstraint extends js.Object {
  var encryptionContextEquals: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  var encryptionContextSubset: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}

object GrantConstraint {
  @scala.inline
  def apply(): GrantConstraint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GrantConstraint]
  }
  @scala.inline
  implicit class GrantConstraintOps[Self <: GrantConstraint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEncryptionContextEquals(value: Input[StringDictionary[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptionContextEquals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncryptionContextEquals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptionContextEquals")(js.undefined)
        ret
    }
    @scala.inline
    def withEncryptionContextSubset(value: Input[StringDictionary[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptionContextSubset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncryptionContextSubset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptionContextSubset")(js.undefined)
        ret
    }
  }
  
}

