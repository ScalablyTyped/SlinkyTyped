package typingsSlinky.activexWord.anon

import typingsSlinky.activexWord.Word.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EndRecord extends StObject {
  
  var Cancel: Boolean = js.native
  
  val Doc: Document = js.native
  
  val EndRecord: Double = js.native
  
  val StartRecord: Double = js.native
}
object EndRecord {
  
  @scala.inline
  def apply(Cancel: Boolean, Doc: Document, EndRecord: Double, StartRecord: Double): EndRecord = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Doc = Doc.asInstanceOf[js.Any], EndRecord = EndRecord.asInstanceOf[js.Any], StartRecord = StartRecord.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndRecord]
  }
  
  @scala.inline
  implicit class EndRecordMutableBuilder[Self <: EndRecord] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: Boolean): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoc(value: Document): Self = StObject.set(x, "Doc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndRecord(value: Double): Self = StObject.set(x, "EndRecord", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartRecord(value: Double): Self = StObject.set(x, "StartRecord", value.asInstanceOf[js.Any])
  }
}
