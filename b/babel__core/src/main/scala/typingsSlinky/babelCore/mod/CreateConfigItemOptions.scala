package typingsSlinky.babelCore.mod

import typingsSlinky.babelCore.babelCoreStrings.plugin
import typingsSlinky.babelCore.babelCoreStrings.preset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateConfigItemOptions extends StObject {
  
  var dirname: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[preset | plugin] = js.native
}
object CreateConfigItemOptions {
  
  @scala.inline
  def apply(): CreateConfigItemOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateConfigItemOptions]
  }
  
  @scala.inline
  implicit class CreateConfigItemOptionsMutableBuilder[Self <: CreateConfigItemOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirname(value: String): Self = StObject.set(x, "dirname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirnameUndefined: Self = StObject.set(x, "dirname", js.undefined)
    
    @scala.inline
    def setType(value: preset | plugin): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
