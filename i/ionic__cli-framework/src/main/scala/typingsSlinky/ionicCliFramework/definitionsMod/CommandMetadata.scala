package typingsSlinky.ionicCliFramework.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommandMetadata[I, O] extends Metadata {
  var exampleCommands: js.UndefOr[js.Array[String]] = js.native
  var inputs: js.UndefOr[js.Array[I]] = js.native
  var options: js.UndefOr[js.Array[O]] = js.native
}

object CommandMetadata {
  @scala.inline
  def apply[I, O](name: String, summary: String): CommandMetadata[I, O] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandMetadata[I, O]]
  }
  @scala.inline
  implicit class CommandMetadataOps[Self[i, o] <: CommandMetadata[i, o], I, O] (val x: Self[I, O]) extends AnyVal {
    @scala.inline
    def duplicate: Self[I, O] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[I, O]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[I, O]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[I, O]) with Other]
    @scala.inline
    def withExampleCommands(value: js.Array[String]): Self[I, O] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exampleCommands")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExampleCommands: Self[I, O] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exampleCommands")(js.undefined)
        ret
    }
    @scala.inline
    def withInputs(value: js.Array[I]): Self[I, O] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputs: Self[I, O] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputs")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: js.Array[O]): Self[I, O] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self[I, O] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
  }
  
}

