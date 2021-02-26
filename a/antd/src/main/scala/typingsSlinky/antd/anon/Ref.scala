package typingsSlinky.antd.anon

import slinky.core.facade.ReactRef
import typingsSlinky.antd.selectMod.RefSelectProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ref extends StObject {
  
  var ref: js.UndefOr[
    (js.Function1[/* instance */ RefSelectProps | Null, Unit]) | ReactRef[RefSelectProps] | Null
  ] = js.native
}
object Ref {
  
  @scala.inline
  def apply(): Ref = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ref]
  }
  
  @scala.inline
  implicit class RefMutableBuilder[Self <: Ref] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRef(value: (js.Function1[/* instance */ RefSelectProps | Null, Unit]) | ReactRef[RefSelectProps]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefFunction1(value: /* instance */ RefSelectProps | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRefNull: Self = StObject.set(x, "ref", null)
    
    @scala.inline
    def setRefRefObject(value: ReactRef[RefSelectProps]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
  }
}
