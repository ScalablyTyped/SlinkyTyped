package typingsSlinky.c3.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.c3.mod.FormatFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `1` extends StObject {
  
  var format: StringDictionary[Boolean | FormatFunction] = js.native
}
object `1` {
  
  @scala.inline
  def apply(format: StringDictionary[Boolean | FormatFunction]): `1` = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`]
  }
  
  @scala.inline
  implicit class `1MutableBuilder`[Self <: `1`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormat(value: StringDictionary[Boolean | FormatFunction]): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
  }
}
