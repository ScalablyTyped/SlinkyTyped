package typingsSlinky.beanstalkd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BeanstalkdProtocolReply extends js.Object {
  
  var args: js.Array[_] = js.native
  
  var reply: String = js.native
}
object BeanstalkdProtocolReply {
  
  @scala.inline
  def apply(args: js.Array[_], reply: String): BeanstalkdProtocolReply = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], reply = reply.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeanstalkdProtocolReply]
  }
  
  @scala.inline
  implicit class BeanstalkdProtocolReplyOps[Self <: BeanstalkdProtocolReply] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArgsVarargs(value: js.Any*): Self = this.set("args", js.Array(value :_*))
    
    @scala.inline
    def setArgs(value: js.Array[_]): Self = this.set("args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReply(value: String): Self = this.set("reply", value.asInstanceOf[js.Any])
  }
}
