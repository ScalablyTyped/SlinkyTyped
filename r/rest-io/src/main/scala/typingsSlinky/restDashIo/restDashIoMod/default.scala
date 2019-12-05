package typingsSlinky.restDashIo.restDashIoMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.express.expressMod.Application
import typingsSlinky.restDashIo.Anon_ADMIN
import typingsSlinky.restDashIo.TypeofClassResource
import typingsSlinky.restDashIo.TypeofauthorizedResource
import typingsSlinky.restDashIo.libSrcAuthorizedSubResourceMod.ISubResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rest-io", JSImport.Default)
@js.native
class default protected () extends RestIO {
  def this(app: Application) = this()
  def this(app: Application, config: IRestIOConfig) = this()
}

/* static members */
@JSImport("rest-io", JSImport.Default)
@js.native
object default extends js.Object {
  var AuthorizedResource: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof authorizedResource.AuthorizedResource */ js.Any = js.native
  var AuthorizedSubResource: Instantiable1[
    /* subResDef */ ISubResource, 
    typingsSlinky.restDashIo.libSrcAuthorizedSubResourceMod.default
  ] = js.native
  var ROLES: Anon_ADMIN = js.native
  var Resource: TypeofClassResource = js.native
  var SubResource: Instantiable1[
    /* subResDef */ typingsSlinky.restDashIo.libSrcSubResourceMod.ISubResource, 
    typingsSlinky.restDashIo.libSrcSubResourceMod.default
  ] = js.native
  var UserResource: Instantiable0[typingsSlinky.restDashIo.libSrcUserResourceMod.default] = js.native
  var authorizedResource: TypeofauthorizedResource = js.native
}

