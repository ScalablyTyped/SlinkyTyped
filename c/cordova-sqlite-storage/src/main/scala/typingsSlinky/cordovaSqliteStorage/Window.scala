package typingsSlinky.cordovaSqliteStorage

import typingsSlinky.cordovaSqliteStorage.SQLitePlugin.SQLite
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Window extends StObject {
  
  var sqlitePlugin: SQLite = js.native
}
object Window {
  
  @scala.inline
  def apply(sqlitePlugin: SQLite): Window = {
    val __obj = js.Dynamic.literal(sqlitePlugin = sqlitePlugin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
  
  @scala.inline
  implicit class WindowMutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSqlitePlugin(value: SQLite): Self = StObject.set(x, "sqlitePlugin", value.asInstanceOf[js.Any])
  }
}
