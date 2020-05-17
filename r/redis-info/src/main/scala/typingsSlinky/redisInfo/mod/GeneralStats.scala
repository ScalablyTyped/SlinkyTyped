package typingsSlinky.redisInfo.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.redisInfo.anon.Calls
import typingsSlinky.redisInfo.anon.Expires
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeneralStats extends js.Object {
  var commands: StringDictionary[Calls] = js.native
  var databases: NumberDictionary[Expires] = js.native
}

object GeneralStats {
  @scala.inline
  def apply(commands: StringDictionary[Calls], databases: NumberDictionary[Expires]): GeneralStats = {
    val __obj = js.Dynamic.literal(commands = commands.asInstanceOf[js.Any], databases = databases.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeneralStats]
  }
  @scala.inline
  implicit class GeneralStatsOps[Self <: GeneralStats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommands(value: StringDictionary[Calls]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commands")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDatabases(value: NumberDictionary[Expires]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("databases")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

