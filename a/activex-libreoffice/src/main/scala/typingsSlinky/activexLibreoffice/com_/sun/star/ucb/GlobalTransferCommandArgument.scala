package typingsSlinky.activexLibreoffice.com_.sun.star.ucb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This struct contains information needed to transfer objects from one location to another. */
@js.native
trait GlobalTransferCommandArgument extends StObject {
  
  /**
    * describes how to act in case of title clashes while transferring the data.
    *
    * A title clash for instance occurs, if a file named "foo.txt" is to be transferred to a folder already containing another file named "foo.txt". Refer
    * to {@link NameClash} for possible values for this field.
    */
  var NameClash: Double = js.native
  
  /**
    * contains the title of the transferred object, if it is different from the original one.
    *
    * If this field is filled, for example, a file will be renamed while it is being transferred.
    */
  var NewTitle: String = js.native
  
  /** contains the action to perform ( COPY, MOVE, LINK ). */
  var Operation: TransferCommandOperation = js.native
  
  /** contains the URL of the source object. */
  var SourceURL: String = js.native
  
  /** contains the URL of the target folder. */
  var TargetURL: String = js.native
}
object GlobalTransferCommandArgument {
  
  @scala.inline
  def apply(
    NameClash: Double,
    NewTitle: String,
    Operation: TransferCommandOperation,
    SourceURL: String,
    TargetURL: String
  ): GlobalTransferCommandArgument = {
    val __obj = js.Dynamic.literal(NameClash = NameClash.asInstanceOf[js.Any], NewTitle = NewTitle.asInstanceOf[js.Any], Operation = Operation.asInstanceOf[js.Any], SourceURL = SourceURL.asInstanceOf[js.Any], TargetURL = TargetURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalTransferCommandArgument]
  }
  
  @scala.inline
  implicit class GlobalTransferCommandArgumentMutableBuilder[Self <: GlobalTransferCommandArgument] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNameClash(value: Double): Self = StObject.set(x, "NameClash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewTitle(value: String): Self = StObject.set(x, "NewTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperation(value: TransferCommandOperation): Self = StObject.set(x, "Operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceURL(value: String): Self = StObject.set(x, "SourceURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetURL(value: String): Self = StObject.set(x, "TargetURL", value.asInstanceOf[js.Any])
  }
}
