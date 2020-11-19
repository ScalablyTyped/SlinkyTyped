package typingsSlinky.k6.htmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("k6/html", "MediaElement")
@js.native
abstract class MediaElement () extends Element {
  
  /** Contained <track> elements. */
  def textTracks(): js.Array[TrackElement] = js.native
}
