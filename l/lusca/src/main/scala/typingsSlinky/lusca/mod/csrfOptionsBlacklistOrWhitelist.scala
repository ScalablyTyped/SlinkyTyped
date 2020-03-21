package typingsSlinky.lusca.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.lusca.mod.csrfOptionsBlacklist
  - typingsSlinky.lusca.mod.csrfOptionsWhitelist
*/
trait csrfOptionsBlacklistOrWhitelist extends js.Object

object csrfOptionsBlacklistOrWhitelist {
  @scala.inline
  def csrfOptionsBlacklist(blacklist: js.Array[String] = null): csrfOptionsBlacklistOrWhitelist = {
    val __obj = js.Dynamic.literal()
    if (blacklist != null) __obj.updateDynamic("blacklist")(blacklist.asInstanceOf[js.Any])
    __obj.asInstanceOf[csrfOptionsBlacklistOrWhitelist]
  }
  @scala.inline
  def csrfOptionsWhitelist(whitelist: js.Array[String] = null): csrfOptionsBlacklistOrWhitelist = {
    val __obj = js.Dynamic.literal()
    if (whitelist != null) __obj.updateDynamic("whitelist")(whitelist.asInstanceOf[js.Any])
    __obj.asInstanceOf[csrfOptionsBlacklistOrWhitelist]
  }
}

