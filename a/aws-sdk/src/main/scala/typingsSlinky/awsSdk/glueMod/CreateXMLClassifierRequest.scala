package typingsSlinky.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateXMLClassifierRequest extends StObject {
  
  /**
    * An identifier of the data format that the classifier matches.
    */
  var Classification: typingsSlinky.awsSdk.glueMod.Classification = js.native
  
  /**
    * The name of the classifier.
    */
  var Name: NameString = js.native
  
  /**
    * The XML tag designating the element that contains each record in an XML document being parsed. This can't identify a self-closing element (closed by /&gt;). An empty row element that contains only attributes can be parsed as long as it ends with a closing tag (for example, &lt;row item_a="A" item_b="B"&gt;&lt;/row&gt; is okay, but &lt;row item_a="A" item_b="B" /&gt; is not).
    */
  var RowTag: js.UndefOr[typingsSlinky.awsSdk.glueMod.RowTag] = js.native
}
object CreateXMLClassifierRequest {
  
  @scala.inline
  def apply(Classification: Classification, Name: NameString): CreateXMLClassifierRequest = {
    val __obj = js.Dynamic.literal(Classification = Classification.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateXMLClassifierRequest]
  }
  
  @scala.inline
  implicit class CreateXMLClassifierRequestMutableBuilder[Self <: CreateXMLClassifierRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassification(value: Classification): Self = StObject.set(x, "Classification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowTag(value: RowTag): Self = StObject.set(x, "RowTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowTagUndefined: Self = StObject.set(x, "RowTag", js.undefined)
  }
}
