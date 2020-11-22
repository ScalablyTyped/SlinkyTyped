package typingsSlinky.expressServeStaticCore.mod

import typingsSlinky.expressServeStaticCore.expressServeStaticCoreStrings.all
import typingsSlinky.expressServeStaticCore.expressServeStaticCoreStrings.delete
import typingsSlinky.expressServeStaticCore.expressServeStaticCoreStrings.get
import typingsSlinky.expressServeStaticCore.expressServeStaticCoreStrings.head
import typingsSlinky.expressServeStaticCore.expressServeStaticCoreStrings.options
import typingsSlinky.expressServeStaticCore.expressServeStaticCoreStrings.patch
import typingsSlinky.expressServeStaticCore.expressServeStaticCoreStrings.post
import typingsSlinky.expressServeStaticCore.expressServeStaticCoreStrings.put
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRouterMatcher[T, Method /* <: all | get | post | put | delete | patch | options | head */] extends js.Object {
  
  def apply(path: PathParams, subApplication: Application): T = js.native
  // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
  def apply[P, ResBody, ReqBody, ReqQuery](
    path: PathParams,
    handlers: ((RequestHandler[P, ResBody, ReqBody, ReqQuery]) | (RequestHandlerParams[P, ResBody, ReqBody, ReqQuery]))*
  ): T = js.native
}
