package typingsSlinky.electron.Electron

import typingsSlinky.electron.electronStrings.`app-cache`
import typingsSlinky.electron.electronStrings.`console-api`
import typingsSlinky.electron.electronStrings.deprecation
import typingsSlinky.electron.electronStrings.intervention
import typingsSlinky.electron.electronStrings.javascript
import typingsSlinky.electron.electronStrings.network
import typingsSlinky.electron.electronStrings.other
import typingsSlinky.electron.electronStrings.recommendation
import typingsSlinky.electron.electronStrings.rendering
import typingsSlinky.electron.electronStrings.security
import typingsSlinky.electron.electronStrings.storage
import typingsSlinky.electron.electronStrings.violation
import typingsSlinky.electron.electronStrings.worker
import typingsSlinky.electron.electronStrings.xml
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessageDetails extends StObject {
  
  /**
    * The log level, from 0 to 3. In order it matches `verbose`, `info`, `warning` and
    * `error`.
    */
  var level: Double = js.native
  
  /**
    * The line number of the source that triggered this console message
    */
  var lineNumber: Double = js.native
  
  /**
    * The actual console message
    */
  var message: String = js.native
  
  /**
    * The type of source for this message.  Can be `javascript`, `xml`, `network`,
    * `console-api`, `storage`, `app-cache`, `rendering`, `security`, `deprecation`,
    * `worker`, `violation`, `intervention`, `recommendation` or `other`.
    */
  var source: javascript | xml | network | `console-api` | storage | `app-cache` | rendering | security | deprecation | worker | violation | intervention | recommendation | other = js.native
  
  /**
    * The URL the message came from
    */
  var sourceUrl: String = js.native
  
  /**
    * The version ID of the service worker that sent the log message
    */
  var versionId: Double = js.native
}
object MessageDetails {
  
  @scala.inline
  def apply(
    level: Double,
    lineNumber: Double,
    message: String,
    source: javascript | xml | network | `console-api` | storage | `app-cache` | rendering | security | deprecation | worker | violation | intervention | recommendation | other,
    sourceUrl: String,
    versionId: Double
  ): MessageDetails = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], lineNumber = lineNumber.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], sourceUrl = sourceUrl.asInstanceOf[js.Any], versionId = versionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageDetails]
  }
  
  @scala.inline
  implicit class MessageDetailsMutableBuilder[Self <: MessageDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(
      value: javascript | xml | network | `console-api` | storage | `app-cache` | rendering | security | deprecation | worker | violation | intervention | recommendation | other
    ): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUrl(value: String): Self = StObject.set(x, "sourceUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionId(value: Double): Self = StObject.set(x, "versionId", value.asInstanceOf[js.Any])
  }
}
