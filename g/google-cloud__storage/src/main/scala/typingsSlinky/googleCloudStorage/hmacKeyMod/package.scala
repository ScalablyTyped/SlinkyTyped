package typingsSlinky.googleCloudStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object hmacKeyMod {
  
  type HmacKeyMetadataCallback = js.Function3[
    /* err */ js.Error | scala.Null, 
    /* metadata */ js.UndefOr[typingsSlinky.googleCloudStorage.hmacKeyMod.HmacKeyMetadata], 
    /* apiResponse */ js.UndefOr[typingsSlinky.googleCloudCommon.serviceObjectMod.Metadata], 
    scala.Unit
  ]
  
  type HmacKeyMetadataResponse = js.Tuple2[
    typingsSlinky.googleCloudStorage.hmacKeyMod.HmacKeyMetadata, 
    typingsSlinky.googleCloudCommon.serviceObjectMod.Metadata
  ]
}
