package typingsSlinky.openfin.notificationMod

import typingsSlinky.openfin.anon.Click
import typingsSlinky.openfin.baseMod.Base
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotificationModule extends Base {
  
  /**
    * Creates a new Notification.
    * @param { object } options
    * @return {_Notification}
    * @tutorial Notification.create
    * @static
    */
  def create(options: js.Any): Notification = js.native
  
  var events: Click = js.native
  
  var genNoteId: js.Any = js.native
  
  var nextNoteId: js.Any = js.native
}
