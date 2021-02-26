package typingsSlinky.fridaGum.ObjC

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetailedChooseSpecifier extends StObject {
  
  /**
    * Which class to look for instances of. E.g.: `ObjC.classes.UIButton`.
    */
  var `class`: Object = js.native
  
  /**
    * Whether you’re also interested in subclasses matching the given class selector.
    *
    * The default is to also include subclasses.
    */
  var subclasses: js.UndefOr[Boolean] = js.native
}
object DetailedChooseSpecifier {
  
  @scala.inline
  def apply(`class`: Object): DetailedChooseSpecifier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetailedChooseSpecifier]
  }
  
  @scala.inline
  implicit class DetailedChooseSpecifierMutableBuilder[Self <: DetailedChooseSpecifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClass(value: Object): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubclasses(value: Boolean): Self = StObject.set(x, "subclasses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubclassesUndefined: Self = StObject.set(x, "subclasses", js.undefined)
  }
}
