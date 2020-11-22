package typingsSlinky.ddTrace

import typingsSlinky.ddTrace.ddTraceStrings.async_hooks
import typingsSlinky.ddTrace.ddTraceStrings.async_local_storage
import typingsSlinky.ddTrace.ddTraceStrings.async_resource
import typingsSlinky.ddTrace.ddTraceStrings.noop
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dd-trace/ext/scopes", JSImport.Namespace)
@js.native
object scopesMod extends js.Object {
  
  var ASYNC_HOOKS: async_hooks = js.native
  
  var ASYNC_LOCAL_STORAGE: async_local_storage = js.native
  
  var ASYNC_RESOURCE: async_resource = js.native
  
  var NOOP: noop = js.native
}
