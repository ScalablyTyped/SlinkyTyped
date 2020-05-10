package typingsSlinky.pulumiAws.ciphertextMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CiphertextState extends js.Object {
  /**
    * Base64 encoded ciphertext
    */
  val ciphertextBlob: js.UndefOr[Input[String]] = js.native
  /**
    * An optional mapping that makes up the encryption context.
    */
  val context: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * Globally unique key ID for the customer master key.
    */
  val keyId: js.UndefOr[Input[String]] = js.native
  /**
    * Data to be encrypted. Note that this may show up in logs, and it will be stored in the state file.
    */
  val plaintext: js.UndefOr[Input[String]] = js.native
}

object CiphertextState {
  @scala.inline
  def apply(): CiphertextState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CiphertextState]
  }
  @scala.inline
  implicit class CiphertextStateOps[Self <: CiphertextState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCiphertextBlob(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ciphertextBlob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCiphertextBlob: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ciphertextBlob")(js.undefined)
        ret
    }
    @scala.inline
    def withContext(value: Input[StringDictionary[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyId")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaintext(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plaintext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaintext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plaintext")(js.undefined)
        ret
    }
  }
  
}

