package typingsSlinky.activexStdole

import typingsSlinky.activexStdole.activexStdoleStrings.FontChanged
import typingsSlinky.activexStdole.activexStdoleStrings.PropertyName
import typingsSlinky.activexStdole.stdole.StdFont
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActiveXObject extends js.Object {
  
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
  implicit class ActiveXObjectOps[Self <: ActiveXObject] (val x: Self) extends AnyVal {
    
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
    def setOn(
      value: (StdFont, FontChanged, js.Array[PropertyName], js.ThisFunction1[
          /* this */ StdFont, 
          /* parameter */ typingsSlinky.activexStdole.anon.PropertyName, 
          Unit
        ]) => Unit
    ): Self = this.set("on", js.Any.fromFunction4(value))
  }
}
