package typingsSlinky.awsSdkClientKmsBrowser.typesGrantConstraintsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledGrantConstraints extends GrantConstraints {
  /**
    * <p>A list of key-value pairs that must be present in the encryption context of certain subsequent operations that the grant allows. When certain subsequent operations allowed by the grant include encryption context that matches this list, the grant allows the operation. Otherwise, the grant does not allow the operation.</p>
    */
  @JSName("EncryptionContextEquals")
  var EncryptionContextEquals_UnmarshalledGrantConstraints: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * <p>A list of key-value pairs, all of which must be present in the encryption context of certain subsequent operations that the grant allows. When certain subsequent operations allowed by the grant include encryption context that matches this list or is a superset of this list, the grant allows the operation. Otherwise, the grant does not allow the operation.</p>
    */
  @JSName("EncryptionContextSubset")
  var EncryptionContextSubset_UnmarshalledGrantConstraints: js.UndefOr[StringDictionary[String]] = js.native
}

object UnmarshalledGrantConstraints {
  @scala.inline
  def apply(): UnmarshalledGrantConstraints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledGrantConstraints]
  }
  @scala.inline
  implicit class UnmarshalledGrantConstraintsOps[Self <: UnmarshalledGrantConstraints] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEncryptionContextEquals(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EncryptionContextEquals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncryptionContextEquals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EncryptionContextEquals")(js.undefined)
        ret
    }
    @scala.inline
    def withEncryptionContextSubset(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EncryptionContextSubset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncryptionContextSubset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EncryptionContextSubset")(js.undefined)
        ret
    }
  }
  
}

