package typingsSlinky.grammarkdown.diagnosticsMod

import typingsSlinky.grammarkdown.coreMod.Range
import typingsSlinky.grammarkdown.nodesMod.Node
import typingsSlinky.grammarkdown.nodesMod.SourceFile
import typingsSlinky.grammarkdown.tokensMod.SyntaxKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiagnosticInfo extends js.Object {
  var code: Double = js.native
  var diagnosticIndex: Double = js.native
  var formattedMessage: js.UndefOr[String] = js.native
  var message: String = js.native
  var messageArguments: js.UndefOr[js.Array[_]] = js.native
  var node: js.UndefOr[Node[SyntaxKind]] = js.native
  var pos: Double = js.native
  var range: js.UndefOr[Range] = js.native
  var sourceFile: js.UndefOr[SourceFile] = js.native
  var warning: Boolean = js.native
}

object DiagnosticInfo {
  @scala.inline
  def apply(code: Double, diagnosticIndex: Double, message: String, pos: Double, warning: Boolean): DiagnosticInfo = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], diagnosticIndex = diagnosticIndex.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagnosticInfo]
  }
  @scala.inline
  implicit class DiagnosticInfoOps[Self <: DiagnosticInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDiagnosticIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diagnosticIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPos(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWarning(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormattedMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formattedMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormattedMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formattedMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageArguments(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageArguments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageArguments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageArguments")(js.undefined)
        ret
    }
    @scala.inline
    def withNode(value: Node[SyntaxKind]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(js.undefined)
        ret
    }
    @scala.inline
    def withRange(value: Range): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceFile(value: SourceFile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceFile")(js.undefined)
        ret
    }
  }
  
}

