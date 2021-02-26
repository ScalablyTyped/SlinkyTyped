package typingsSlinky.ddTrace

import typingsSlinky.ddTrace.ddTraceStrings.async_hooks
import typingsSlinky.ddTrace.ddTraceStrings.async_local_storage
import typingsSlinky.ddTrace.ddTraceStrings.async_resource
import typingsSlinky.ddTrace.ddTraceStrings.noop
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scopesMod {
  
  @JSImport("dd-trace/ext/scopes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("dd-trace/ext/scopes", "ASYNC_HOOKS")
  @js.native
  def ASYNC_HOOKS: async_hooks = js.native
  @scala.inline
  def ASYNC_HOOKS_=(x: async_hooks): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ASYNC_HOOKS")(x.asInstanceOf[js.Any])
  
  @JSImport("dd-trace/ext/scopes", "ASYNC_LOCAL_STORAGE")
  @js.native
  def ASYNC_LOCAL_STORAGE: async_local_storage = js.native
  @scala.inline
  def ASYNC_LOCAL_STORAGE_=(x: async_local_storage): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ASYNC_LOCAL_STORAGE")(x.asInstanceOf[js.Any])
  
  @JSImport("dd-trace/ext/scopes", "ASYNC_RESOURCE")
  @js.native
  def ASYNC_RESOURCE: async_resource = js.native
  @scala.inline
  def ASYNC_RESOURCE_=(x: async_resource): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ASYNC_RESOURCE")(x.asInstanceOf[js.Any])
  
  @JSImport("dd-trace/ext/scopes", "NOOP")
  @js.native
  def NOOP: noop = js.native
  @scala.inline
  def NOOP_=(x: noop): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NOOP")(x.asInstanceOf[js.Any])
}
