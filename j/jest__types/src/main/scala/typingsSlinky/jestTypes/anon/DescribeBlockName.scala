package typingsSlinky.jestTypes.anon

import typingsSlinky.jestTypes.circusMod.Event
import typingsSlinky.jestTypes.jestTypesStrings.run_describe_start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeBlockName extends Event {
  var describeBlock: typingsSlinky.jestTypes.circusMod.DescribeBlock
  var name: run_describe_start
}

object DescribeBlockName {
  @scala.inline
  def apply(describeBlock: typingsSlinky.jestTypes.circusMod.DescribeBlock, name: run_describe_start): DescribeBlockName = {
    val __obj = js.Dynamic.literal(describeBlock = describeBlock.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeBlockName]
  }
}

