package typingsSlinky.jestTypes.anon

import typingsSlinky.jestTypes.circusMod.AsyncEvent
import typingsSlinky.jestTypes.jestTypesStrings.run_describe_start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeBlockName extends AsyncEvent {
  
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
  implicit class DescribeBlockNameMutableBuilder[Self <: DescribeBlockName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescribeBlock(value: typingsSlinky.jestTypes.circusMod.DescribeBlock): Self = StObject.set(x, "describeBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: run_describe_start): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
