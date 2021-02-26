package typingsSlinky.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceSplitShard extends StObject {
  
  /** DEPRECATED */
  var derivationMode: js.UndefOr[String] = js.native
  
  /** DEPRECATED */
  var source: js.UndefOr[Source] = js.native
}
object SourceSplitShard {
  
  @scala.inline
  def apply(): SourceSplitShard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceSplitShard]
  }
  
  @scala.inline
  implicit class SourceSplitShardMutableBuilder[Self <: SourceSplitShard] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDerivationMode(value: String): Self = StObject.set(x, "derivationMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDerivationModeUndefined: Self = StObject.set(x, "derivationMode", js.undefined)
    
    @scala.inline
    def setSource(value: Source): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
