package typingsSlinky.officeJsPreview.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////////////////////////////////////////////////
//////////////////////// End Visio APIs ////////////////////////
////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////
///////////////////// Begin PowerPoint APIs ////////////////////
////////////////////////////////////////////////////////////////
@JSGlobal("PowerPoint")
@js.native
object PowerPoint extends js.Object {
  
  /**
    * Creates and opens a new presentation. Optionally, the presentation can be pre-populated with a base64-encoded .pptx file.
    *
    * [Api set: PowerPointApi 1.1]
    *
    * @param base64File Optional. The base64-encoded .pptx file. The default value is null.
    */
  def createPresentation(): js.Promise[Unit] = js.native
  def createPresentation(base64File: String): js.Promise[Unit] = js.native
}
