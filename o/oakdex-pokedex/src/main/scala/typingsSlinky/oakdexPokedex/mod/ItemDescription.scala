package typingsSlinky.oakdexPokedex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemDescription extends js.Object {
  
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
  implicit class ItemDescriptionOps[Self <: ItemDescription] (val x: Self) extends AnyVal {
    
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
    def setGamesVarargs(value: String*): Self = this.set("games", js.Array(value :_*))
    
    @scala.inline
    def setGames(value: js.Array[String]): Self = this.set("games", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslations(value: Translations): Self = this.set("translations", value.asInstanceOf[js.Any])
  }
}
