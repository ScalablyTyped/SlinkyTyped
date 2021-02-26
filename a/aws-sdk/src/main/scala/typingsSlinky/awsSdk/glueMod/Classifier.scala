package typingsSlinky.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Classifier extends StObject {
  
  /**
    * A classifier for comma-separated values (CSV).
    */
  var CsvClassifier: js.UndefOr[typingsSlinky.awsSdk.glueMod.CsvClassifier] = js.native
  
  /**
    * A classifier that uses grok.
    */
  var GrokClassifier: js.UndefOr[typingsSlinky.awsSdk.glueMod.GrokClassifier] = js.native
  
  /**
    * A classifier for JSON content.
    */
  var JsonClassifier: js.UndefOr[typingsSlinky.awsSdk.glueMod.JsonClassifier] = js.native
  
  /**
    * A classifier for XML content.
    */
  var XMLClassifier: js.UndefOr[typingsSlinky.awsSdk.glueMod.XMLClassifier] = js.native
}
object Classifier {
  
  @scala.inline
  def apply(): Classifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Classifier]
  }
  
  @scala.inline
  implicit class ClassifierMutableBuilder[Self <: Classifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCsvClassifier(value: CsvClassifier): Self = StObject.set(x, "CsvClassifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCsvClassifierUndefined: Self = StObject.set(x, "CsvClassifier", js.undefined)
    
    @scala.inline
    def setGrokClassifier(value: GrokClassifier): Self = StObject.set(x, "GrokClassifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrokClassifierUndefined: Self = StObject.set(x, "GrokClassifier", js.undefined)
    
    @scala.inline
    def setJsonClassifier(value: JsonClassifier): Self = StObject.set(x, "JsonClassifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsonClassifierUndefined: Self = StObject.set(x, "JsonClassifier", js.undefined)
    
    @scala.inline
    def setXMLClassifier(value: XMLClassifier): Self = StObject.set(x, "XMLClassifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXMLClassifierUndefined: Self = StObject.set(x, "XMLClassifier", js.undefined)
  }
}
