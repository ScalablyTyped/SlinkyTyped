package typingsSlinky.arcgisJsApi.global.esri

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.arcgisJsApi.esri.RequestOptions
import typingsSlinky.arcgisJsApi.esri.RequestResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.request")
@js.native
object request
  extends TopLevel[
      js.Function2[
        /* url */ String, 
        /* options */ js.UndefOr[RequestOptions], 
        js.Promise[RequestResponse]
      ]
    ]
