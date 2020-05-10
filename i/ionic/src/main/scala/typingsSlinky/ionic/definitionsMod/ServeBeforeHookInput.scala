package typingsSlinky.ionic.definitionsMod

import typingsSlinky.ionic.ionicStrings.serveColonbefore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServeBeforeHookInput extends HookInput {
  val name: serveColonbefore = js.native
  val serve: AngularServeOptions | IonicAngularServeOptions | Ionic1ServeOptions = js.native
}

object ServeBeforeHookInput {
  @scala.inline
  def apply(name: serveColonbefore, serve: AngularServeOptions | IonicAngularServeOptions | Ionic1ServeOptions): ServeBeforeHookInput = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], serve = serve.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServeBeforeHookInput]
  }
  @scala.inline
  implicit class ServeBeforeHookInputOps[Self <: ServeBeforeHookInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: serveColonbefore): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServe(value: AngularServeOptions | IonicAngularServeOptions | Ionic1ServeOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serve")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

