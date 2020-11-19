package typingsSlinky.apolloServerPluginBase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type GraphQLRequestListenerDidResolveField = js.Function2[/* error */ js.Error | scala.Null, /* result */ js.UndefOr[js.Any], scala.Unit]
  
  type GraphQLRequestListenerExecutionDidEnd = js.Function1[/* err */ js.UndefOr[js.Error], scala.Unit]
  
  type GraphQLRequestListenerParsingDidEnd = js.Function1[/* err */ js.UndefOr[js.Error], scala.Unit]
  
  type GraphQLRequestListenerValidationDidEnd = js.Function1[/* err */ js.UndefOr[js.Array[js.Error]], scala.Unit]
}
