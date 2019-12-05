package typingsSlinky.restDashIo

import typingsSlinky.express.expressMod.Request
import typingsSlinky.express.expressMod.Response
import typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import typingsSlinky.restDashIo.libSrcUserResourceMod.UserResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rest-io/lib/src/userResource", JSImport.Namespace)
@js.native
object libSrcUserResourceMod extends js.Object {
  @js.native
  trait UserResource
    extends typingsSlinky.restDashIo.libSrcAuthorizedResourceMod.default {
    def createRoleModel(): Unit = js.native
    def ensureBaseUserModel(model: js.Any): Unit = js.native
    def isSelf(req: Request[ParamsDictionary]): Boolean = js.native
    def login(req: Request[ParamsDictionary], res: Response): Unit = js.native
  }
  
  @js.native
  class default () extends UserResource
  
}

