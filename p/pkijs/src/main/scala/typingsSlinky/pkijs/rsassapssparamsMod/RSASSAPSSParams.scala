package typingsSlinky.pkijs.rsassapssparamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RSASSAPSSParams extends js.Object {
  /**
    * Algorithms of hashing (DEFAULT sha1)
    *
    * @type {AlgorithmIdentifier}
    * @memberOf RSASSAPSSParams
    */
  var hashAlgorithm: typingsSlinky.pkijs.algorithmIdentifierMod.default = js.native
  /**
    * Algorithm of "mask generaion function (MGF)" (DEFAULT mgf1SHA1)
    *
    * @type {AlgorithmIdentifier}
    * @memberOf RSASSAPSSParams
    */
  var maskGenAlgorithm: typingsSlinky.pkijs.algorithmIdentifierMod.default = js.native
  /**
    * Salt length (DEFAULT 20)
    *
    * @type {number}
    * @memberOf RSASSAPSSParams
    */
  var saltLength: Double = js.native
  /**
    * (DEFAULT 1)
    *
    * @type {number}
    * @memberOf RSASSAPSSParams
    */
  var trailerField: Double = js.native
  def fromSchema(schema: js.Any): Unit = js.native
  def toJSON(): js.Any = js.native
  def toSchema(): js.Any = js.native
}

object RSASSAPSSParams {
  @scala.inline
  def apply(
    fromSchema: js.Any => Unit,
    hashAlgorithm: typingsSlinky.pkijs.algorithmIdentifierMod.default,
    maskGenAlgorithm: typingsSlinky.pkijs.algorithmIdentifierMod.default,
    saltLength: Double,
    toJSON: () => js.Any,
    toSchema: () => js.Any,
    trailerField: Double
  ): RSASSAPSSParams = {
    val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), hashAlgorithm = hashAlgorithm.asInstanceOf[js.Any], maskGenAlgorithm = maskGenAlgorithm.asInstanceOf[js.Any], saltLength = saltLength.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema), trailerField = trailerField.asInstanceOf[js.Any])
    __obj.asInstanceOf[RSASSAPSSParams]
  }
  @scala.inline
  implicit class RSASSAPSSParamsOps[Self <: RSASSAPSSParams] (val x: Self) extends AnyVal {
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
    def withHashAlgorithm(value: typingsSlinky.pkijs.algorithmIdentifierMod.default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashAlgorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaskGenAlgorithm(value: typingsSlinky.pkijs.algorithmIdentifierMod.default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskGenAlgorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSaltLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saltLength")(value.asInstanceOf[js.Any])
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
    def withTrailerField(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trailerField")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

