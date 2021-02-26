package typingsSlinky.pulumiAws.inputMod.ssm

import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentAttachmentsSource extends StObject {
  
  /**
    * The key describing the location of an attachment to a document. Valid key types include: `SourceUrl` and `S3FileUrl`
    */
  var key: Input[String] = js.native
  
  /**
    * The name of the document attachment file
    */
  var name: js.UndefOr[Input[String]] = js.native
  
  /**
    * The value describing the location of an attachment to a document
    */
  var values: Input[js.Array[Input[String]]] = js.native
}
object DocumentAttachmentsSource {
  
  @scala.inline
  def apply(key: Input[String], values: Input[js.Array[Input[String]]]): DocumentAttachmentsSource = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentAttachmentsSource]
  }
  
  @scala.inline
  implicit class DocumentAttachmentsSourceMutableBuilder[Self <: DocumentAttachmentsSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: Input[String]): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setValues(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: Input[String]*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
