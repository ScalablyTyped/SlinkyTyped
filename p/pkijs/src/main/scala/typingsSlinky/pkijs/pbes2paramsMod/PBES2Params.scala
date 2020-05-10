package typingsSlinky.pkijs.pbes2paramsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PBES2Params extends js.Object {
  var encryptionScheme: typingsSlinky.pkijs.algorithmIdentifierMod.default = js.native
  var keyDerivationFunc: typingsSlinky.pkijs.algorithmIdentifierMod.default = js.native
  def fromSchema(schema: js.Any): Unit = js.native
  def toJSON(): js.Any = js.native
  def toSchema(): js.Any = js.native
}

object PBES2Params {
  @scala.inline
  def apply(
    encryptionScheme: typingsSlinky.pkijs.algorithmIdentifierMod.default,
    fromSchema: js.Any => Unit,
    keyDerivationFunc: typingsSlinky.pkijs.algorithmIdentifierMod.default,
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): PBES2Params = {
    val __obj = js.Dynamic.literal(encryptionScheme = encryptionScheme.asInstanceOf[js.Any], fromSchema = js.Any.fromFunction1(fromSchema), keyDerivationFunc = keyDerivationFunc.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    __obj.asInstanceOf[PBES2Params]
  }
  @scala.inline
  implicit class PBES2ParamsOps[Self <: PBES2Params] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEncryptionScheme(value: typingsSlinky.pkijs.algorithmIdentifierMod.default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptionScheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFromSchema(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromSchema")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withKeyDerivationFunc(value: typingsSlinky.pkijs.algorithmIdentifierMod.default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyDerivationFunc")(value.asInstanceOf[js.Any])
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
  }
  
}

