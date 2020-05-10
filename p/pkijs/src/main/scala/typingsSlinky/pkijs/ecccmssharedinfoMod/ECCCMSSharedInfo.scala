package typingsSlinky.pkijs.ecccmssharedinfoMod

import org.scalajs.dom.crypto.Algorithm
import typingsSlinky.asn1js.mod.OctetString
import typingsSlinky.std.AlgorithmIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ECCCMSSharedInfo extends js.Object {
  var entityUInfo: js.UndefOr[OctetString] = js.native
  var keyInfo: AlgorithmIdentifier = js.native
  var suppPubInfo: OctetString = js.native
  def fromSchema(schema: js.Any): Unit = js.native
  def toJSON(): js.Any = js.native
  def toSchema(): js.Any = js.native
}

object ECCCMSSharedInfo {
  @scala.inline
  def apply(
    fromSchema: js.Any => Unit,
    keyInfo: AlgorithmIdentifier,
    suppPubInfo: OctetString,
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): ECCCMSSharedInfo = {
    val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), keyInfo = keyInfo.asInstanceOf[js.Any], suppPubInfo = suppPubInfo.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    __obj.asInstanceOf[ECCCMSSharedInfo]
  }
  @scala.inline
  implicit class ECCCMSSharedInfoOps[Self <: ECCCMSSharedInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFromSchema(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromSchema")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withKeyInfoAlgorithm(value: Algorithm): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyInfo(value: AlgorithmIdentifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuppPubInfo(value: OctetString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppPubInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToJSON(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toJSON")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToSchema(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toSchema")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEntityUInfo(value: OctetString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityUInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntityUInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityUInfo")(js.undefined)
        ret
    }
  }
  
}

