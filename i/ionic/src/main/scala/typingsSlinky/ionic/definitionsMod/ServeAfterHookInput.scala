package typingsSlinky.ionic.definitionsMod

import typingsSlinky.ionic.ionicStrings.serveColonafter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServeAfterHookInput extends HookInput {
  val name: serveColonafter = js.native
  val serve: (AngularServeOptions | IonicAngularServeOptions | Ionic1ServeOptions) with ServeDetails = js.native
}

object ServeAfterHookInput {
  @scala.inline
  def apply(
    name: serveColonafter,
    serve: (AngularServeOptions | IonicAngularServeOptions | Ionic1ServeOptions) with ServeDetails
  ): ServeAfterHookInput = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], serve = serve.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServeAfterHookInput]
  }
  @scala.inline
  implicit class ServeAfterHookInputOps[Self <: ServeAfterHookInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: serveColonafter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServe(value: (AngularServeOptions | IonicAngularServeOptions | Ionic1ServeOptions) with ServeDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serve")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

