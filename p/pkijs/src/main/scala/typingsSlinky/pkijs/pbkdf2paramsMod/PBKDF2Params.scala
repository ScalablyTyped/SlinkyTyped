package typingsSlinky.pkijs.pbkdf2paramsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PBKDF2Params extends js.Object {
  var iterationCount: Double = js.native
  var keyLength: Double = js.native
  var prf: typingsSlinky.pkijs.algorithmIdentifierMod.default = js.native
  var salt: js.Any = js.native
  def fromSchema(schema: js.Any): Unit = js.native
  def toJSON(): js.Any = js.native
  def toSchema(): js.Any = js.native
}

object PBKDF2Params {
  @scala.inline
  def apply(
    fromSchema: js.Any => Unit,
    iterationCount: Double,
    keyLength: Double,
    prf: typingsSlinky.pkijs.algorithmIdentifierMod.default,
    salt: js.Any,
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): PBKDF2Params = {
    val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), iterationCount = iterationCount.asInstanceOf[js.Any], keyLength = keyLength.asInstanceOf[js.Any], prf = prf.asInstanceOf[js.Any], salt = salt.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    __obj.asInstanceOf[PBKDF2Params]
  }
  @scala.inline
  implicit class PBKDF2ParamsOps[Self <: PBKDF2Params] (val x: Self) extends AnyVal {
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
    def withIterationCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iterationCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrf(value: typingsSlinky.pkijs.algorithmIdentifierMod.default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSalt(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("salt")(value.asInstanceOf[js.Any])
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

