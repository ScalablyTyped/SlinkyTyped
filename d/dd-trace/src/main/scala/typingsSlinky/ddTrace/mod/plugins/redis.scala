package typingsSlinky.ddTrace.mod.plugins

import typingsSlinky.ddTrace.mod.Analyzable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This plugin automatically instruments the
  * [redis](https://github.com/NodeRedis/node_redis) module.
  */
@js.native
trait redis
  extends Integration
     with Analyzable {
  
  /**
    * List of commands that should not be instrumented. Takes precedence over
    * whitelist if a command matches an entry in both.
    *
    * @default []
    */
  var blacklist: js.UndefOr[
    String | js.RegExp | (js.Function1[/* command */ String, Boolean]) | (js.Array[String | js.RegExp | (js.Function1[/* command */ String, Boolean])])
  ] = js.native
  
  /**
    * List of commands that should be instrumented.
    *
    * @default /^.*$/
    */
  var whitelist: js.UndefOr[
    String | js.RegExp | (js.Function1[/* command */ String, Boolean]) | (js.Array[String | js.RegExp | (js.Function1[/* command */ String, Boolean])])
  ] = js.native
}
object redis {
  
  @scala.inline
  def apply(): redis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[redis]
  }
  
  @scala.inline
  implicit class redisOps[Self <: redis] (val x: Self) extends AnyVal {
    
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
    def setBlacklistVarargs(value: (String | js.RegExp | (js.Function1[/* command */ String, Boolean]))*): Self = this.set("blacklist", js.Array(value :_*))
    
    @scala.inline
    def setBlacklistFunction1(value: /* command */ String => Boolean): Self = this.set("blacklist", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBlacklistRegExp(value: js.RegExp): Self = this.set("blacklist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlacklist(
      value: String | js.RegExp | (js.Function1[/* command */ String, Boolean]) | (js.Array[String | js.RegExp | (js.Function1[/* command */ String, Boolean])])
    ): Self = this.set("blacklist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlacklist: Self = this.set("blacklist", js.undefined)
    
    @scala.inline
    def setWhitelistVarargs(value: (String | js.RegExp | (js.Function1[/* command */ String, Boolean]))*): Self = this.set("whitelist", js.Array(value :_*))
    
    @scala.inline
    def setWhitelistFunction1(value: /* command */ String => Boolean): Self = this.set("whitelist", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWhitelistRegExp(value: js.RegExp): Self = this.set("whitelist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhitelist(
      value: String | js.RegExp | (js.Function1[/* command */ String, Boolean]) | (js.Array[String | js.RegExp | (js.Function1[/* command */ String, Boolean])])
    ): Self = this.set("whitelist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhitelist: Self = this.set("whitelist", js.undefined)
  }
}
