package typingsSlinky.atGoogleDashCloudStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcHmacKeyMod {
  import typingsSlinky.atGoogleDashCloudCommon.buildSrcServiceDashObjectMod.Metadata

  type HmacKeyMetadataCallback = js.Function3[
    /* err */ js.Error | Null, 
    /* metadata */ js.UndefOr[HmacKeyMetadata], 
    /* apiResponse */ js.UndefOr[Metadata], 
    Unit
  ]
  type HmacKeyMetadataResponse = js.Tuple2[HmacKeyMetadata, Metadata]
}
