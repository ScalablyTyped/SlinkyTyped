package typingsSlinky.redisInfo.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.redisInfo.anon.Calls
import typingsSlinky.redisInfo.anon.Expires
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeneralStats extends StObject {
  
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
  implicit class GeneralStatsMutableBuilder[Self <: GeneralStats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommands(value: StringDictionary[Calls]): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabases(value: NumberDictionary[Expires]): Self = StObject.set(x, "databases", value.asInstanceOf[js.Any])
  }
}
