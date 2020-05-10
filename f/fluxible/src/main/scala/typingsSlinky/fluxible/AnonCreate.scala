package typingsSlinky.fluxible

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCreate extends js.Object {
  /**
    * POST request to the server
    * @param resource name of resourse
    * @param params query string parameters as key-value object
    * @param body json request body
    * @param callback
    */
  def create(
    resource: String,
    params: js.Any,
    body: js.Any,
    callback: js.Function2[/* error */ js.Error, /* data */ js.Any, Unit]
  ): Unit = js.native
  /**
    *
    * @param resource name of resourse
    * @param params query string parameters as key-value object
    * @param callback
    */
  def delete(
    resource: String,
    params: js.Any,
    callback: js.Function2[/* error */ js.Error, /* data */ js.Any, Unit]
  ): Unit = js.native
  /**
    * GET request to the server
    * @param resource name of resourse
    * @param params query string parameters as key-value object
    * @param callback
    */
  def read(
    resource: String,
    params: js.Any,
    callback: js.Function2[/* error */ js.Error, /* data */ js.Any, Unit]
  ): Unit = js.native
  /**
    *
    * @param resource name of resourse
    * @param params query string parameters as key-value object
    * @param body json request body
    * @param callback
    */
  def update(
    resource: String,
    params: js.Any,
    body: js.Any,
    callback: js.Function2[/* error */ js.Error, /* data */ js.Any, Unit]
  ): Unit = js.native
}

object AnonCreate {
  @scala.inline
  def apply(
    create: (String, js.Any, js.Any, js.Function2[/* error */ js.Error, /* data */ js.Any, Unit]) => Unit,
    delete: (String, js.Any, js.Function2[/* error */ js.Error, /* data */ js.Any, Unit]) => Unit,
    read: (String, js.Any, js.Function2[/* error */ js.Error, /* data */ js.Any, Unit]) => Unit,
    update: (String, js.Any, js.Any, js.Function2[/* error */ js.Error, /* data */ js.Any, Unit]) => Unit
  ): AnonCreate = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction4(create), delete = js.Any.fromFunction3(delete), read = js.Any.fromFunction3(read), update = js.Any.fromFunction4(update))
    __obj.asInstanceOf[AnonCreate]
  }
  @scala.inline
  implicit class AnonCreateOps[Self <: AnonCreate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(
      value: (String, js.Any, js.Any, js.Function2[/* error */ js.Error, /* data */ js.Any, Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withDelete(value: (String, js.Any, js.Function2[/* error */ js.Error, /* data */ js.Any, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withRead(value: (String, js.Any, js.Function2[/* error */ js.Error, /* data */ js.Any, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withUpdate(
      value: (String, js.Any, js.Any, js.Function2[/* error */ js.Error, /* data */ js.Any, Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction4(value))
        ret
    }
  }
  
}

