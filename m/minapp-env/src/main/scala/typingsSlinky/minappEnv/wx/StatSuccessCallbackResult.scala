package typingsSlinky.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StatSuccessCallbackResult extends js.Object {
  
  /** [Stats](https://developers.weixin.qq.com/miniprogram/dev/api/file/Stats.html)|Object
    *
    * 当 recursive 为 false 时，res.stats 是一个 Stats 对象。当 recursive 为 true 且 path 是一个目录的路径时，res.stats 是一个 Object，key 以 path 为根路径的相对路径，value 是该路径对应的 Stats 对象。 */
  var stats: Stats | js.Object = js.native
}
object StatSuccessCallbackResult {
  
  @scala.inline
  def apply(stats: Stats | js.Object): StatSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(stats = stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatSuccessCallbackResult]
  }
  
  @scala.inline
  implicit class StatSuccessCallbackResultOps[Self <: StatSuccessCallbackResult] (val x: Self) extends AnyVal {
    
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
    def setStats(value: Stats | js.Object): Self = this.set("stats", value.asInstanceOf[js.Any])
  }
}
