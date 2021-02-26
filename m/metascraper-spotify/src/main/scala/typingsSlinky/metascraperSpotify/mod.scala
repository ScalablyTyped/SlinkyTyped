package typingsSlinky.metascraperSpotify

import typingsSlinky.metascraper.mod.Rule
import typingsSlinky.metascraperSpotify.anon.Url
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("metascraper-spotify", JSImport.Namespace)
  @js.native
  def apply(): Rule = js.native
  
  @JSImport("metascraper-spotify", "isValidUrl")
  @js.native
  def isValidUrl(config: Url): Boolean = js.native
}
