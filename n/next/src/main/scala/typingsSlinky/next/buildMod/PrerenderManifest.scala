package typingsSlinky.next.buildMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.next.apiUtilsMod.ApiPreviewProps
import typingsSlinky.next.nextNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrerenderManifest extends js.Object {
  var dynamicRoutes: StringDictionary[DynamicSsgRoute] = js.native
  var preview: ApiPreviewProps = js.native
  var routes: StringDictionary[SsgRoute] = js.native
  var version: `2` = js.native
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
  @scala.inline
  implicit class PrerenderManifestOps[Self <: PrerenderManifest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDynamicRoutes(value: StringDictionary[DynamicSsgRoute]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicRoutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreview(value: ApiPreviewProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preview")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoutes(value: StringDictionary[SsgRoute]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: `2`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

