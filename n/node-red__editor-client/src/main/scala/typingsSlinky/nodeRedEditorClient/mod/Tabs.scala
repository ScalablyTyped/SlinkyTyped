package typingsSlinky.nodeRedEditorClient.mod

import typingsSlinky.nodeRedEditorClient.anon.AddButton
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tabs extends StObject {
  
  def create(options: AddButton): TabsInstance = js.native
}
object Tabs {
  
  @scala.inline
  def apply(create: AddButton => TabsInstance): Tabs = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
    __obj.asInstanceOf[Tabs]
  }
  
  @scala.inline
  implicit class TabsMutableBuilder[Self <: Tabs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreate(value: AddButton => TabsInstance): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
  }
}
