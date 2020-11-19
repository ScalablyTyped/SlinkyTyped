package typingsSlinky.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeSecurityConfigurationInput extends js.Object {
  
  /**
    * The name of the security configuration.
    */
  var Name: XmlString = js.native
}
object DescribeSecurityConfigurationInput {
  
  @scala.inline
  def apply(Name: XmlString): DescribeSecurityConfigurationInput = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSecurityConfigurationInput]
  }
  
  @scala.inline
  implicit class DescribeSecurityConfigurationInputOps[Self <: DescribeSecurityConfigurationInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setName(value: XmlString): Self = this.set("Name", value.asInstanceOf[js.Any])
  }
}
