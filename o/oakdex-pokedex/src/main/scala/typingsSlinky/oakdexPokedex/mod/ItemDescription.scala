package typingsSlinky.oakdexPokedex.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemDescription extends StObject {
  
  var games: js.Array[String] = js.native
  
  var translations: Translations = js.native
}
object ItemDescription {
  
  @scala.inline
  def apply(games: js.Array[String], translations: Translations): ItemDescription = {
    val __obj = js.Dynamic.literal(games = games.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemDescription]
  }
  
  @scala.inline
  implicit class ItemDescriptionMutableBuilder[Self <: ItemDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGames(value: js.Array[String]): Self = StObject.set(x, "games", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGamesVarargs(value: String*): Self = StObject.set(x, "games", js.Array(value :_*))
    
    @scala.inline
    def setTranslations(value: Translations): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
  }
}
