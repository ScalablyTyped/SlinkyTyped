package typingsSlinky.pulumiAws.inputMod.glue

import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassifierXmlClassifier extends StObject {
  
  /**
    * An identifier of the data format that the classifier matches.
    */
  var classification: Input[String] = js.native
  
  /**
    * The XML tag designating the element that contains each record in an XML document being parsed. Note that this cannot identify a self-closing element (closed by `/>`). An empty row element that contains only attributes can be parsed as long as it ends with a closing tag (for example, `<row item_a="A" item_b="B"></row>` is okay, but `<row item_a="A" item_b="B" />` is not).
    */
  var rowTag: Input[String] = js.native
}
object ClassifierXmlClassifier {
  
  @scala.inline
  def apply(classification: Input[String], rowTag: Input[String]): ClassifierXmlClassifier = {
    val __obj = js.Dynamic.literal(classification = classification.asInstanceOf[js.Any], rowTag = rowTag.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassifierXmlClassifier]
  }
  
  @scala.inline
  implicit class ClassifierXmlClassifierMutableBuilder[Self <: ClassifierXmlClassifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassification(value: Input[String]): Self = StObject.set(x, "classification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowTag(value: Input[String]): Self = StObject.set(x, "rowTag", value.asInstanceOf[js.Any])
  }
}
