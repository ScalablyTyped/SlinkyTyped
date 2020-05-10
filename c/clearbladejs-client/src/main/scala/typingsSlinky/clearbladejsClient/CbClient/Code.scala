package typingsSlinky.clearbladejsClient.CbClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Code extends js.Object {
  var URI: String = js.native
  var callTimeout: Double = js.native
  var systemKey: String = js.native
  var systemSecret: String = js.native
  var user: APIUser = js.native
  def create(name: String, body: String, callback: CbCallback): Unit = js.native
  def delete(name: String, callback: CbCallback): Unit = js.native
  def execute(name: String, params: js.Object, callback: CbCallback): Unit = js.native
  def getAllServices(callback: CbCallback): Unit = js.native
  def getCompletedServices(callback: CbCallback): Unit = js.native
  def getFailedServices(callback: CbCallback): Unit = js.native
  def update(name: String, body: String, callback: CbCallback): Unit = js.native
}

object Code {
  @scala.inline
  def apply(
    URI: String,
    callTimeout: Double,
    create: (String, String, CbCallback) => Unit,
    delete: (String, CbCallback) => Unit,
    execute: (String, js.Object, CbCallback) => Unit,
    getAllServices: CbCallback => Unit,
    getCompletedServices: CbCallback => Unit,
    getFailedServices: CbCallback => Unit,
    systemKey: String,
    systemSecret: String,
    update: (String, String, CbCallback) => Unit,
    user: APIUser
  ): Code = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], callTimeout = callTimeout.asInstanceOf[js.Any], create = js.Any.fromFunction3(create), delete = js.Any.fromFunction2(delete), execute = js.Any.fromFunction3(execute), getAllServices = js.Any.fromFunction1(getAllServices), getCompletedServices = js.Any.fromFunction1(getCompletedServices), getFailedServices = js.Any.fromFunction1(getFailedServices), systemKey = systemKey.asInstanceOf[js.Any], systemSecret = systemSecret.asInstanceOf[js.Any], update = js.Any.fromFunction3(update), user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Code]
  }
  @scala.inline
  implicit class CodeOps[Self <: Code] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withURI(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("URI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCallTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreate(value: (String, String, CbCallback) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withDelete(value: (String, CbCallback) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withExecute(value: (String, js.Object, CbCallback) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execute")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withGetAllServices(value: CbCallback => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAllServices")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetCompletedServices(value: CbCallback => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCompletedServices")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetFailedServices(value: CbCallback => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFailedServices")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSystemKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSystemSecret(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemSecret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdate(value: (String, String, CbCallback) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withUser(value: APIUser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

