package typingsSlinky.jestTypes.anon

import typingsSlinky.jestTypes.circusMod.BlockMode
import typingsSlinky.jestTypes.circusMod.Event
import typingsSlinky.jestTypes.jestTypesStrings.finish_describe_definition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlockName extends Event {
  var blockName: typingsSlinky.jestTypes.circusMod.BlockName = js.native
  var mode: BlockMode = js.native
  var name: finish_describe_definition = js.native
}

object BlockName {
  @scala.inline
  def apply(
    blockName: typingsSlinky.jestTypes.circusMod.BlockName,
    mode: BlockMode,
    name: finish_describe_definition
  ): BlockName = {
    val __obj = js.Dynamic.literal(blockName = blockName.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockName]
  }
  @scala.inline
  implicit class BlockNameOps[Self <: BlockName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlockName(value: typingsSlinky.jestTypes.circusMod.BlockName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMode(value: BlockMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: finish_describe_definition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

