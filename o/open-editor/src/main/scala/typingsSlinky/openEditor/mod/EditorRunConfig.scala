package typingsSlinky.openEditor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditorRunConfig extends js.Object {
  /**
  		Arguments provided to the editor binary.
  		*/
  var arguments: js.Array[String] = js.native
  /**
  		Editor binary name.
  		*/
  var binary: String = js.native
  /**
  		A flag indicating whether the editor runs in the terminal.
  		*/
  var isTerminalEditor: Boolean = js.native
}

object EditorRunConfig {
  @scala.inline
  def apply(arguments: js.Array[String], binary: String, isTerminalEditor: Boolean): EditorRunConfig = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], binary = binary.asInstanceOf[js.Any], isTerminalEditor = isTerminalEditor.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorRunConfig]
  }
  @scala.inline
  implicit class EditorRunConfigOps[Self <: EditorRunConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArguments(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arguments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBinary(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsTerminalEditor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTerminalEditor")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

