package typingsSlinky.googleCloudCommon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object utilMod {
  
  type AbortableDuplex = typingsSlinky.googleCloudCommon.utilMod.Duplexify with typingsSlinky.googleCloudCommon.utilMod.Abortable
  
  type BodyResponseCallback = js.Function3[
    /* err */ js.Error | typingsSlinky.googleCloudCommon.utilMod.ApiError | scala.Null, 
    /* body */ js.UndefOr[typingsSlinky.googleCloudCommon.utilMod.ResponseBody], 
    /* res */ js.UndefOr[typingsSlinky.teenyRequest.mod.Response[js.Any]], 
    scala.Unit
  ]
  
  type OnAuthenticatedCallback = js.Function2[
    /* err */ js.Error | scala.Null, 
    /* reqOpts */ js.UndefOr[typingsSlinky.googleCloudCommon.utilMod.DecorateRequestOptions], 
    scala.Unit
  ]
  
  type ResponseBody = js.Any
}
