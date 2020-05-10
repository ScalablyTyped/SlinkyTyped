package typingsSlinky.loopback.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Context
  * @interface
  * @property {Principal[]} principals An Array of principals
  * @property {() => void} model The model class
  * @property {string} modelName The model name
  * @property {string} modelId The model id
  * @property {string} property The model property/method/relation name
  * @property {string} method The model method to be invoked
  * @property {string} accessType The access type
  * @property {AccessToken} accessToken The access toke
  * @returns {AccessContext}
  */
@js.native
trait Context extends js.Object {
  /** The access type */
  var accesType: String = js.native
  /** The access token */
  var accessToken: AccessToken = js.native
  /** The model method to be invoked */
  var method: String = js.native
  /** The model id */
  var modelId: String = js.native
  /** The model name */
  var modelName: String = js.native
  /** An Array of principals */
  var principals: js.Array[Principal] = js.native
  /** The model property/method/relation name */
  var property: String = js.native
  /** The model class */
  def model(): Unit = js.native
}

object Context {
  @scala.inline
  def apply(
    accesType: String,
    accessToken: AccessToken,
    method: String,
    model: () => Unit,
    modelId: String,
    modelName: String,
    principals: js.Array[Principal],
    property: String
  ): Context = {
    val __obj = js.Dynamic.literal(accesType = accesType.asInstanceOf[js.Any], accessToken = accessToken.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], model = js.Any.fromFunction0(model), modelId = modelId.asInstanceOf[js.Any], modelName = modelName.asInstanceOf[js.Any], principals = principals.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
  @scala.inline
  implicit class ContextOps[Self <: Context] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccesType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accesType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccessToken(value: AccessToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModel(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withModelId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModelName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrincipals(value: js.Array[Principal]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("principals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("property")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

