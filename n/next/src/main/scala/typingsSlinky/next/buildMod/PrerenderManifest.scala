package typingsSlinky.next.buildMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.next.apiUtilsMod.ApiPreviewProps
import typingsSlinky.next.nextNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrerenderManifest extends js.Object {
  var dynamicRoutes: StringDictionary[DynamicSsgRoute]
  var preview: ApiPreviewProps
  var routes: StringDictionary[SsgRoute]
  var version: `2`
}

object PrerenderManifest {
  @scala.inline
  def apply(
    dynamicRoutes: StringDictionary[DynamicSsgRoute],
    preview: ApiPreviewProps,
    routes: StringDictionary[SsgRoute],
    version: `2`
  ): PrerenderManifest = {
    val __obj = js.Dynamic.literal(dynamicRoutes = dynamicRoutes.asInstanceOf[js.Any], preview = preview.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrerenderManifest]
  }
}

