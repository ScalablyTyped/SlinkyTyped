package typingsSlinky.activexLibreoffice.com_.sun.star.ucb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** extends {@link TransferInfo} structure to give some additional parameters for transfers. */
@js.native
trait TransferInfo2 extends TransferInfo {
  
  /** contains the MIME type of the source of the action */
  var MimeType: String = js.native
}
object TransferInfo2 {
  
  @scala.inline
  def apply(MimeType: String, MoveData: Boolean, NameClash: Double, NewTitle: String, SourceURL: String): TransferInfo2 = {
    val __obj = js.Dynamic.literal(MimeType = MimeType.asInstanceOf[js.Any], MoveData = MoveData.asInstanceOf[js.Any], NameClash = NameClash.asInstanceOf[js.Any], NewTitle = NewTitle.asInstanceOf[js.Any], SourceURL = SourceURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransferInfo2]
  }
  
  @scala.inline
  implicit class TransferInfo2MutableBuilder[Self <: TransferInfo2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMimeType(value: String): Self = StObject.set(x, "MimeType", value.asInstanceOf[js.Any])
  }
}
