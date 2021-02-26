package typingsSlinky.relayRuntime

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.relayRuntime.relayNetworkTypesMod.PayloadData
import typingsSlinky.relayRuntime.relayStoreTypesMod.MutableRecordSource
import typingsSlinky.relayRuntime.relayStoreTypesMod.NormalizationSelector
import typingsSlinky.relayRuntime.relayStoreTypesMod.RelayResponsePayload
import typingsSlinky.relayRuntime.relayStoreTypesMod.RequestDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object relayResponseNormalizerMod {
  
  @JSImport("relay-runtime/lib/store/RelayResponseNormalizer", "normalize")
  @js.native
  def normalize(
    recordSource: MutableRecordSource,
    selector: NormalizationSelector,
    response: PayloadData,
    options: NormalizationOptions
  ): RelayResponsePayload = js.native
  
  type GetDataID = js.Function2[/* fieldValue */ StringDictionary[js.Any], /* typeName */ String, js.Any]
  
  @js.native
  trait NormalizationOptions extends StObject {
    
    def getDataID(fieldValue: StringDictionary[js.Any], typeName: String): js.Any = js.native
    @JSName("getDataID")
    var getDataID_Original: GetDataID = js.native
    
    var path: js.UndefOr[js.Array[String]] = js.native
    
    var request: RequestDescriptor = js.native
  }
}
