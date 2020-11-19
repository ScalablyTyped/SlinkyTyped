package typingsSlinky.firefoxWebextBrowser.anon

import typingsSlinky.firefoxWebextBrowser.browser.topSites.MostVisitedURL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeoftopSites extends js.Object {
  
  /* topSites functions */
  /** Gets a list of top sites. */
  def get(): js.Promise[js.Array[MostVisitedURL]] = js.native
  def get(options: IncludeBlocked): js.Promise[js.Array[MostVisitedURL]] = js.native
}
