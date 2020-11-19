package typingsSlinky.awsSdkConfigResolver

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.awsSdkTypes.clientMod.ConfigurationDefinition
import typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/config-resolver", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def resolveConfiguration[T /* <: IndexedObject */, R /* <: T */, Input /* <: js.Object */, Output /* <: js.Object */, Stream](
    providedConfiguration: T,
    configurationDefinition: ConfigurationDefinition[T, R],
    middlewareStack: MiddlewareStack[Input, Output, Stream]
  ): R = js.native
  
  type IndexedObject = StringDictionary[js.Any]
}
