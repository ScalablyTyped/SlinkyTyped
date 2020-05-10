package typingsSlinky.readConfigFile.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadConfigResult[T] extends js.Object {
  val configFile: String | Null = js.native
  val result: T = js.native
}

object ReadConfigResult {
  @scala.inline
  def apply[T](result: T): ReadConfigResult[T] = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadConfigResult[T]]
  }
  @scala.inline
  implicit class ReadConfigResultOps[Self[t] <: ReadConfigResult[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withResult(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfigFile(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfigFileNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configFile")(null)
        ret
    }
  }
  
}

