package typingsSlinky.expressUnless.mod

import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestHandler
  extends typingsSlinky.expressServeStaticCore.mod.RequestHandler[ParamsDictionary, js.Any, js.Any, Query] {
  
  var unless: js.UndefOr[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof unless */ js.Any
  ] = js.native
}
