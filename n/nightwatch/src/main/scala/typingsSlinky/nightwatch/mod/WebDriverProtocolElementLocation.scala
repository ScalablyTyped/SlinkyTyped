package typingsSlinky.nightwatch.mod

import typingsSlinky.nightwatch.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebDriverProtocolElementLocation extends StObject {
  
  /**
    * Determine an element's location on the page. The point (0, 0) refers to the upper-left corner of the page.
    *
    * The element's coordinates are returned as a JSON object with x and y properties.
    */
  def elementIdLocation(id: String): this.type = js.native
  def elementIdLocation(
    id: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[X], Unit]
  ): this.type = js.native
  
  /**
    * Determine an element's location on the screen once it has been scrolled into view.
    */
  def elementIdLocationInView(id: String): this.type = js.native
  def elementIdLocationInView(
    id: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[X], Unit]
  ): this.type = js.native
}
