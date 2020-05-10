package typingsSlinky.jestTypes

import typingsSlinky.jestTypes.circusMod.DescribeBlock
import typingsSlinky.jestTypes.circusMod.Event
import typingsSlinky.jestTypes.jestTypesStrings.run_describe_start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDescribeBlockName extends Event {
  var describeBlock: DescribeBlock = js.native
  var name: run_describe_start = js.native
}

object AnonDescribeBlockName {
  @scala.inline
  def apply(describeBlock: DescribeBlock, name: run_describe_start): AnonDescribeBlockName = {
    val __obj = js.Dynamic.literal(describeBlock = describeBlock.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDescribeBlockName]
  }
  @scala.inline
  implicit class AnonDescribeBlockNameOps[Self <: AnonDescribeBlockName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescribeBlock(value: DescribeBlock): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("describeBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: run_describe_start): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

