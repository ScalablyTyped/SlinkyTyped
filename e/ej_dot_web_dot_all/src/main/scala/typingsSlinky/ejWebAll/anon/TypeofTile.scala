package typingsSlinky.ejWebAll.anon

import typingsSlinky.ejWebAll.ej.Tile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofTile extends StObject {
  
  /* static member */
  var Locale: js.Any = js.native
  
  /* static member */
  var fn: Tile = js.native
}
object TypeofTile {
  
  @scala.inline
  def apply(Locale: js.Any, fn: Tile): TypeofTile = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofTile]
  }
  
  @scala.inline
  implicit class TypeofTileMutableBuilder[Self <: TypeofTile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFn(value: Tile): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: js.Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
