package typingsSlinky.resemblejs.mod

import org.scalajs.dom.raw.ImageData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResembleAnalysis extends js.Object {
  
  /**
    * Compare this image to another image, to get resemblance data
    */
  def compareTo(fileData: String): ResembleComparison = js.native
  def compareTo(fileData: ImageData): ResembleComparison = js.native
  
  /**
    * Run the analysis on this image and get the result
    */
  def onComplete(callback: js.Function1[/* result */ ResembleAnalysisResult, Unit]): Unit = js.native
}
