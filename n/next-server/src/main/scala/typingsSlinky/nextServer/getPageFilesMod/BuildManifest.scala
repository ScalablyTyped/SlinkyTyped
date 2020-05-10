package typingsSlinky.nextServer.getPageFilesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuildManifest extends js.Object {
  var devFiles: js.Array[String] = js.native
  var pages: StringDictionary[js.Array[String]] = js.native
}

object BuildManifest {
  @scala.inline
  def apply(devFiles: js.Array[String], pages: StringDictionary[js.Array[String]]): BuildManifest = {
    val __obj = js.Dynamic.literal(devFiles = devFiles.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildManifest]
  }
  @scala.inline
  implicit class BuildManifestOps[Self <: BuildManifest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDevFiles(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPages(value: StringDictionary[js.Array[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pages")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

