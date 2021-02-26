package typingsSlinky.grommet.anon

import typingsSlinky.grommet.grommetStrings.Africa
import typingsSlinky.grommet.grommetStrings.Asia
import typingsSlinky.grommet.grommetStrings.Australia
import typingsSlinky.grommet.grommetStrings.Europe
import typingsSlinky.grommet.grommetStrings.`North America`
import typingsSlinky.grommet.grommetStrings.`South America`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Name extends StObject {
  
  var color: js.UndefOr[String | Dark] = js.native
  
  var name: Africa | Asia | Australia | Europe | (`North America`) | (`South America`) = js.native
  
  var onClick: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  
  var onHover: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
}
object Name {
  
  @scala.inline
  def apply(name: Africa | Asia | Australia | Europe | (`North America`) | (`South America`)): Name = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
  
  @scala.inline
  implicit class NameMutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String | Dark): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setName(value: Africa | Asia | Australia | Europe | (`North America`) | (`South America`)): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnClick(value: /* repeated */ js.Any => _): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    @scala.inline
    def setOnHover(value: /* repeated */ js.Any => _): Self = StObject.set(x, "onHover", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnHoverUndefined: Self = StObject.set(x, "onHover", js.undefined)
  }
}
