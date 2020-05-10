package typingsSlinky.next.NodeJS

import typingsSlinky.next.nextStrings.development
import typingsSlinky.next.nextStrings.production
import typingsSlinky.next.nextStrings.test
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProcessEnv extends js.Object {
  val NODE_ENV: development | production | test = js.native
}

object ProcessEnv {
  @scala.inline
  def apply(NODE_ENV: development | production | test): ProcessEnv = {
    val __obj = js.Dynamic.literal(NODE_ENV = NODE_ENV.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessEnv]
  }
  @scala.inline
  implicit class ProcessEnvOps[Self <: ProcessEnv] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNODE_ENV(value: development | production | test): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NODE_ENV")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

