package typingsSlinky.jestEnvironment.mod

import org.scalajs.dom.raw.Console
import typingsSlinky.jestTypes.configMod.Path
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  console  :std.Console,   docblockPragmas  :std.Record<string, string | std.Array<string>>,   testPath  :@jest/types.@jest/types.Config.Path}> */
@js.native
trait EnvironmentContext extends js.Object {
  var console: js.UndefOr[Console] = js.native
  var docblockPragmas: js.UndefOr[Record[String, String | js.Array[String]]] = js.native
  var testPath: js.UndefOr[Path] = js.native
}

object EnvironmentContext {
  @scala.inline
  def apply(): EnvironmentContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvironmentContext]
  }
  @scala.inline
  implicit class EnvironmentContextOps[Self <: EnvironmentContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConsole(value: Console): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("console")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConsole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("console")(js.undefined)
        ret
    }
    @scala.inline
    def withDocblockPragmas(value: Record[String, String | js.Array[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("docblockPragmas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocblockPragmas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("docblockPragmas")(js.undefined)
        ret
    }
    @scala.inline
    def withTestPath(value: Path): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTestPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testPath")(js.undefined)
        ret
    }
  }
  
}

