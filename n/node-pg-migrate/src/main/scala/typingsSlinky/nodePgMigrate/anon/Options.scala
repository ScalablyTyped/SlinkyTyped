package typingsSlinky.nodePgMigrate.anon

import typingsSlinky.nodePgMigrate.tablesTypesMod.LikeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends StObject {
  
  var options: js.UndefOr[LikeOptions] = js.native
  
  var table: typingsSlinky.nodePgMigrate.generalTypesMod.Name = js.native
}
object Options {
  
  @scala.inline
  def apply(table: typingsSlinky.nodePgMigrate.generalTypesMod.Name): Options = {
    val __obj = js.Dynamic.literal(table = table.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: LikeOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setTable(value: typingsSlinky.nodePgMigrate.generalTypesMod.Name): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
  }
}
