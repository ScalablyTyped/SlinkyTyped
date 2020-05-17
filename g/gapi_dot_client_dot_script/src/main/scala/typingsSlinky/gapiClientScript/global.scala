package typingsSlinky.gapiClientScript

import typingsSlinky.gapiClientScript.gapi.client.script.ScriptsResource
import typingsSlinky.gapiClientScript.gapiClientScriptStrings.script
import typingsSlinky.gapiClientScript.gapiClientScriptStrings.v1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object gapi extends js.Object {
    @js.native
    object client extends js.Object {
      val scripts: ScriptsResource = js.native
      /** Load Google Apps Script Execution API v1 */
      def load(name: script, version: v1): js.Thenable[Unit] = js.native
      def load(name: script, version: v1, callback: js.Function0[_]): Unit = js.native
    }
    
  }
  
}

