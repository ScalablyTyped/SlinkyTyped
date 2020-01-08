package typingsSlinky.atAwsDashSdkConfigDashResolver

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.atAwsDashSdkTypes.buildClientMod.ConfigurationDefinition
import typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/config-resolver", JSImport.Namespace)
@js.native
object atAwsDashSdkConfigDashResolverMod extends js.Object {
  def resolveConfiguration[T /* <: IndexedObject */, R /* <: T */, Input /* <: js.Object */, Output /* <: js.Object */, Stream](
    providedConfiguration: T,
    configurationDefinition: ConfigurationDefinition[T, R],
    middlewareStack: MiddlewareStack[Input, Output, Stream]
  ): R = js.native
  type IndexedObject = StringDictionary[js.Any]
}

