package typingsSlinky.activexStdole

import typingsSlinky.activexStdole.activexStdoleStrings.FontChanged
import typingsSlinky.activexStdole.activexStdoleStrings.PropertyName
import typingsSlinky.activexStdole.stdole.StdFont
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActiveXObject extends StObject {
  
  def on(
    obj: StdFont,
    event: FontChanged,
    argNames: js.Array[PropertyName],
    handler: js.ThisFunction1[
      /* this */ StdFont, 
      /* parameter */ typingsSlinky.activexStdole.anon.PropertyName, 
      Unit
    ]
  ): Unit = js.native
}
object ActiveXObject {
  
  @scala.inline
  def apply(
    on: (StdFont, FontChanged, js.Array[PropertyName], js.ThisFunction1[
      /* this */ StdFont, 
      /* parameter */ typingsSlinky.activexStdole.anon.PropertyName, 
      Unit
    ]) => Unit
  ): ActiveXObject = {
    val __obj = js.Dynamic.literal(on = js.Any.fromFunction4(on))
    __obj.asInstanceOf[ActiveXObject]
  }
  
  @scala.inline
  implicit class ActiveXObjectMutableBuilder[Self <: ActiveXObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOn(
      value: (StdFont, FontChanged, js.Array[PropertyName], js.ThisFunction1[
          /* this */ StdFont, 
          /* parameter */ typingsSlinky.activexStdole.anon.PropertyName, 
          Unit
        ]) => Unit
    ): Self = StObject.set(x, "on", js.Any.fromFunction4(value))
  }
}
