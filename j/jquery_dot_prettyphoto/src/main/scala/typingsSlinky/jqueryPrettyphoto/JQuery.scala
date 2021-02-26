package typingsSlinky.jqueryPrettyphoto

import typingsSlinky.jqueryPrettyphoto.scaronPrettyPhoto.PrettyPhotoSettings
import typingsSlinky.jqueryPrettyphoto.scaronPrettyPhoto.moduleJQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends StObject {
  
  /**
    * Initialises prettyPhoto
    */
  def prettyPhoto(): JQuery = js.native
  /**
    * Initialises prettyPhoto specificying overrides for the defaults
    * @param pp_settings custom prettyPhoto settings
    */
  def prettyPhoto(pp_settings: PrettyPhotoSettings): JQuery = js.native
  @JSName("prettyPhoto")
  var prettyPhoto_Original: moduleJQuery = js.native
}
