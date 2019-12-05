package typingsSlinky.enhancedDashResolve.libUnsafeCachePluginMod

import typingsSlinky.enhancedDashResolve.libCommonDashTypesMod.ResolverRequest
import typingsSlinky.enhancedDashResolve.libConcordMod.Dictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("enhanced-resolve/lib/UnsafeCachePlugin", JSImport.Namespace)
@js.native
class ^ protected () extends UnsafeCachePlugin {
  def this(
    source: String,
    filterPredicate: js.Function1[/* request */ ResolverRequest, Boolean],
    cache: Dictionary[_],
    target: String
  ) = this()
  /* CompleteClass */
  override var cache: Dictionary[_] = js.native
  /* CompleteClass */
  override var source: String = js.native
  /* CompleteClass */
  override var target: String = js.native
  /* CompleteClass */
  @JSName("apply")
  override def apply(resolver: typingsSlinky.enhancedDashResolve.libResolverMod.^): Unit = js.native
  /* CompleteClass */
  override def filterPredicate(request: ResolverRequest): Boolean = js.native
}

