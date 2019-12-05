package typingsSlinky.restDashIo.libSrcSubResourceMod

import typingsSlinky.express.expressMod.Request
import typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import typingsSlinky.restDashIo.Anon_Id
import typingsSlinky.restDashIo.libSrcResourceMod.Resource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubResource extends Resource {
  def createFindQuery(req: Request[ParamsDictionary]): Anon_Id = js.native
  def createProjectionQuery(req: Request[ParamsDictionary]): js.Object = js.native
  def createPullQuery(req: Request[ParamsDictionary]): js.Object = js.native
  def createSubUpdateQuery(req: Request[ParamsDictionary]): js.Object = js.native
}

