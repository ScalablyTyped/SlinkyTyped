package typingsSlinky.forkTsCheckerWebpackPlugin.filesRegisterMod

import typingsSlinky.eslint.mod.CLIEngine.LintReport
import typingsSlinky.tslint.mod.RuleFailure
import typingsSlinky.typescript.mod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataShape extends js.Object {
  var eslints: js.Array[LintReport] = js.native
  var linted: Boolean = js.native
  var source: js.UndefOr[SourceFile] = js.native
  var tslints: js.Array[RuleFailure] = js.native
}

object DataShape {
  @scala.inline
  def apply(eslints: js.Array[LintReport], linted: Boolean, tslints: js.Array[RuleFailure]): DataShape = {
    val __obj = js.Dynamic.literal(eslints = eslints.asInstanceOf[js.Any], linted = linted.asInstanceOf[js.Any], tslints = tslints.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataShape]
  }
  @scala.inline
  implicit class DataShapeOps[Self <: DataShape] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEslints(value: js.Array[LintReport]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eslints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTslints(value: js.Array[RuleFailure]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tslints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: SourceFile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
  }
  
}

