package typingsSlinky.relayRuntime

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.relayRuntime.relayNetworkTypesMod.PayloadData
import typingsSlinky.relayRuntime.relayStoreTypesMod.MutableRecordSource
import typingsSlinky.relayRuntime.relayStoreTypesMod.NormalizationSelector
import typingsSlinky.relayRuntime.relayStoreTypesMod.RelayResponsePayload
import typingsSlinky.relayRuntime.relayStoreTypesMod.RequestDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("relay-runtime/lib/store/RelayResponseNormalizer", JSImport.Namespace)
@js.native
object relayResponseNormalizerMod extends js.Object {
  
  def normalize(
    recordSource: MutableRecordSource,
    selector: NormalizationSelector,
    response: PayloadData,
    options: NormalizationOptions
  ): RelayResponsePayload = js.native
  
  @js.native
  trait NormalizationOptions extends js.Object {
    
    def getDataID(fieldValue: StringDictionary[js.Any], typeName: String): js.Any = js.native
    @JSName("getDataID")
    var getDataID_Original: GetDataID = js.native
    
    var path: js.UndefOr[js.Array[String]] = js.native
    
    var request: RequestDescriptor = js.native
  }
  
  type GetDataID = js.Function2[/* fieldValue */ StringDictionary[js.Any], /* typeName */ String, js.Any]
}
