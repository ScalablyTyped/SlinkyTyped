package typingsSlinky.appBuilderLib.platformSpecificBuildOptionsMod

import typingsSlinky.appBuilderLib.appBuilderLibStrings.Editor
import typingsSlinky.appBuilderLib.appBuilderLibStrings.None
import typingsSlinky.appBuilderLib.appBuilderLibStrings.Shell
import typingsSlinky.appBuilderLib.appBuilderLibStrings.Viewer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Protocol extends js.Object {
  /**
    * The name. e.g. `IRC server URL`.
    */
  val name: String = js.native
  /**
    * *macOS-only* The app’s role with respect to the type.
    * @default Editor
    */
  val role: js.UndefOr[Editor | Viewer | Shell | None] = js.native
  /**
    * The schemes. e.g. `["irc", "ircs"]`.
    */
  val schemes: js.Array[String] = js.native
}

object Protocol {
  @scala.inline
  def apply(name: String, schemes: js.Array[String]): Protocol = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], schemes = schemes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Protocol]
  }
  @scala.inline
  implicit class ProtocolOps[Self <: Protocol] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSchemes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRole(value: Editor | Viewer | Shell | None): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(js.undefined)
        ret
    }
  }
  
}

