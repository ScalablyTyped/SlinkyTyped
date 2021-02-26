package typingsSlinky.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResultsStorage extends StObject {
  
  /** The root directory for test results. */
  var resultsStoragePath: js.UndefOr[FileReference] = js.native
  
  /** The path to the Xunit XML file. */
  var xunitXmlFile: js.UndefOr[FileReference] = js.native
}
object ResultsStorage {
  
  @scala.inline
  def apply(): ResultsStorage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResultsStorage]
  }
  
  @scala.inline
  implicit class ResultsStorageMutableBuilder[Self <: ResultsStorage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResultsStoragePath(value: FileReference): Self = StObject.set(x, "resultsStoragePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsStoragePathUndefined: Self = StObject.set(x, "resultsStoragePath", js.undefined)
    
    @scala.inline
    def setXunitXmlFile(value: FileReference): Self = StObject.set(x, "xunitXmlFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXunitXmlFileUndefined: Self = StObject.set(x, "xunitXmlFile", js.undefined)
  }
}
