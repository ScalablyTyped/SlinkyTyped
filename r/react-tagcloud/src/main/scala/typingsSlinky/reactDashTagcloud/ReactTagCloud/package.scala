package typingsSlinky.reactDashTagcloud

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ReactTagCloud {
  import slinky.core.ReactComponentClass

  type RendererFunction = js.Function4[
    /* tag */ js.Any, 
    /* size */ Double, 
    /* key */ String | Double, 
    /* handlers */ js.Any, 
    js.Any
  ]
  type TagCloudClass = ReactComponentClass[TagCloudProps]
}
