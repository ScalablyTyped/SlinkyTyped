package typingsSlinky.jestTypes.anon

import typingsSlinky.jestTypes.circusMod.Event
import typingsSlinky.jestTypes.jestTypesStrings.run_describe_start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeBlockName extends Event {
  var describeBlock: typingsSlinky.jestTypes.circusMod.DescribeBlock = js.native
  var name: run_describe_start = js.native
}

object DescribeBlockName {
  @scala.inline
  def apply(describeBlock: typingsSlinky.jestTypes.circusMod.DescribeBlock, name: run_describe_start): DescribeBlockName = {
    val __obj = js.Dynamic.literal(describeBlock = describeBlock.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeBlockName]
  }
  @scala.inline
  implicit class DescribeBlockNameOps[Self <: DescribeBlockName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescribeBlock(value: typingsSlinky.jestTypes.circusMod.DescribeBlock): Self = {
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

