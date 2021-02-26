package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.corePromise
import typingsSlinky.arcgisJsApi.esri.corePromiseConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object promiseMod extends Shortcut {
  
  @JSImport("esri/core/Promise", JSImport.Namespace)
  @js.native
  val ^ : corePromiseConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/core/Promise", JSImport.Namespace)
  @js.native
  class Class () extends corePromise
  
  type _To = corePromiseConstructor
  
  /* This means you don't have to write `^`, but can instead just say `promiseMod.foo` */
  override def _to: corePromiseConstructor = ^
}
