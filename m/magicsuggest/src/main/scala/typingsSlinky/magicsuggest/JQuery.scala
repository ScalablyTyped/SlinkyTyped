package typingsSlinky.magicsuggest

import typingsSlinky.magicsuggest.MagicSuggest.Configuration
import typingsSlinky.magicsuggest.MagicSuggest.Instance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends js.Object {
  
  /**
    * Initialize MagicSuggest on this selector
    */
  def magicSuggest(): Instance = js.native
  def magicSuggest(configurationObject: Configuration): Instance = js.native
}
