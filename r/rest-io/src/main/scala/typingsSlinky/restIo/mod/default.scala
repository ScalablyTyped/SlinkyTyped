package typingsSlinky.restIo.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.express.mod.Application_
import typingsSlinky.restIo.AnonADMIN
import typingsSlinky.restIo.TypeofResource
import typingsSlinky.restIo.TypeofauthorizedResource
import typingsSlinky.restIo.authorizedSubResourceMod.ISubResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rest-io", JSImport.Default)
@js.native
class default protected () extends RestIO {
  def this(app: Application_) = this()
  def this(app: Application_, config: IRestIOConfig) = this()
}

/* static members */
@JSImport("rest-io", JSImport.Default)
@js.native
object default extends js.Object {
  var AuthorizedResource: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof authorizedResource.AuthorizedResource */ js.Any = js.native
  var AuthorizedSubResource: Instantiable1[
    /* subResDef */ ISubResource, 
    typingsSlinky.restIo.authorizedSubResourceMod.default
  ] = js.native
  var ROLES: AnonADMIN = js.native
  var Resource: TypeofResource = js.native
  var SubResource: Instantiable1[
    /* subResDef */ typingsSlinky.restIo.subResourceMod.ISubResource, 
    typingsSlinky.restIo.subResourceMod.default
  ] = js.native
  var UserResource: Instantiable0[typingsSlinky.restIo.userResourceMod.default] = js.native
  var authorizedResource: TypeofauthorizedResource = js.native
}

