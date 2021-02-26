package typingsSlinky.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SeqMapTaskOutputInfo extends StObject {
  
  /** The sink to write the output value to. */
  var sink: js.UndefOr[Sink] = js.native
  
  /** The id of the TupleTag the user code will tag the output value by. */
  var tag: js.UndefOr[String] = js.native
}
object SeqMapTaskOutputInfo {
  
  @scala.inline
  def apply(): SeqMapTaskOutputInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeqMapTaskOutputInfo]
  }
  
  @scala.inline
  implicit class SeqMapTaskOutputInfoMutableBuilder[Self <: SeqMapTaskOutputInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSink(value: Sink): Self = StObject.set(x, "sink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSinkUndefined: Self = StObject.set(x, "sink", js.undefined)
    
    @scala.inline
    def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}
