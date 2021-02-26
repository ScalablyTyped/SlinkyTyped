package typingsSlinky.antDesignPro.anon

import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import typingsSlinky.react.mod.LegacyRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<bizcharts.bizcharts.GuideProps> */
@js.native
trait ReadonlyGuideProps extends StObject {
  
  val children: js.UndefOr[ReactElement] = js.native
  
  val key: js.UndefOr[typingsSlinky.react.mod.Key] = js.native
  
  val ref: js.UndefOr[LegacyRef[_]] = js.native
}
object ReadonlyGuideProps {
  
  @scala.inline
  def apply(): ReadonlyGuideProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlyGuideProps]
  }
  
  @scala.inline
  implicit class ReadonlyGuidePropsMutableBuilder[Self <: ReadonlyGuideProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setKey(value: typingsSlinky.react.mod.Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setRef(value: LegacyRef[_]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefFunction1(value: /* instance */ _ | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRefNull: Self = StObject.set(x, "ref", null)
    
    @scala.inline
    def setRefRefObject(value: ReactRef[_]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
  }
}
