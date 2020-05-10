package typingsSlinky.nodeJose.mod.JWK

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JWEEncryptor extends js.Object {
  def `final`(): js.Promise[String] = js.native
  def update(input: js.Any): this.type = js.native
}

object JWEEncryptor {
  @scala.inline
  def apply(`final`: () => js.Promise[String], update: js.Any => JWEEncryptor): JWEEncryptor = {
    val __obj = js.Dynamic.literal(update = js.Any.fromFunction1(update))
    __obj.updateDynamic("final")(js.Any.fromFunction0(`final`))
    __obj.asInstanceOf[JWEEncryptor]
  }
  @scala.inline
  implicit class JWEEncryptorOps[Self <: JWEEncryptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFinal(value: () => js.Promise[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("final")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUpdate(value: js.Any => JWEEncryptor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

