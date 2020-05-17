package typingsSlinky.ionic.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Platforms extends js.Object {
  var platforms: js.Array[String] = js.native
  var plugins: StringDictionary[js.Any] = js.native
}

object Platforms {
  @scala.inline
  def apply(platforms: js.Array[String], plugins: StringDictionary[js.Any]): Platforms = {
    val __obj = js.Dynamic.literal(platforms = platforms.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any])
    __obj.asInstanceOf[Platforms]
  }
  @scala.inline
  implicit class PlatformsOps[Self <: Platforms] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPlatforms(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platforms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlugins(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

