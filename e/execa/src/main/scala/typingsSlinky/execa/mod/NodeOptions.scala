package typingsSlinky.execa.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeOptions[EncodingType] extends Options[EncodingType] {
  /**
  		List of [CLI options](https://nodejs.org/api/cli.html#cli_options) passed to the Node.js executable.
  		@default process.execArgv
  		*/
  val nodeOptions: js.UndefOr[js.Array[String]] = js.native
  /**
  		The Node.js executable to use.
  		@default process.execPath
  		*/
  val nodePath: js.UndefOr[String] = js.native
}

object NodeOptions {
  @scala.inline
  def apply[EncodingType](): NodeOptions[EncodingType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeOptions[EncodingType]]
  }
  @scala.inline
  implicit class NodeOptionsOps[Self[encodingtype] <: NodeOptions[encodingtype], EncodingType] (val x: Self[EncodingType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[EncodingType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[EncodingType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[EncodingType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[EncodingType] with Other]
    @scala.inline
    def withNodeOptions(value: js.Array[String]): Self[EncodingType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeOptions: Self[EncodingType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withNodePath(value: String): Self[EncodingType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodePath: Self[EncodingType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodePath")(js.undefined)
        ret
    }
  }
  
}

