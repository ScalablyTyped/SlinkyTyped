package typingsSlinky.minecraftScriptingTypesShared

import typingsSlinky.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.Equalssign
import typingsSlinky.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.EqualssignEqualssign
import typingsSlinky.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.ExclamationmarkEqualssign
import typingsSlinky.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.Greaterthansign
import typingsSlinky.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.GreaterthansignEqualssign
import typingsSlinky.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.Lessthansign
import typingsSlinky.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.LessthansignEqualssign
import typingsSlinky.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.LessthansignGreaterthansign
import typingsSlinky.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.equals
import typingsSlinky.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.not
import typingsSlinky.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.other
import typingsSlinky.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.parent
import typingsSlinky.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.player
import typingsSlinky.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.self
import typingsSlinky.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.target
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MinecraftFilter extends StObject {
  
  var all_of: js.UndefOr[js.Array[MinecraftFilter]] = js.native
  
  var any_of: js.UndefOr[js.Array[MinecraftFilter]] = js.native
  
  var domain: js.UndefOr[String] = js.native
  
  var operator: js.UndefOr[
    ExclamationmarkEqualssign | Lessthansign | LessthansignEqualssign | LessthansignGreaterthansign | Equalssign | EqualssignEqualssign | Greaterthansign | GreaterthansignEqualssign | equals | not
  ] = js.native
  
  var subject: js.UndefOr[other | parent | player | self | target] = js.native
  
  var test: js.UndefOr[String] = js.native
  
  var value: js.UndefOr[js.Any] = js.native
}
object MinecraftFilter {
  
  @scala.inline
  def apply(): MinecraftFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MinecraftFilter]
  }
  
  @scala.inline
  implicit class MinecraftFilterMutableBuilder[Self <: MinecraftFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAll_of(value: js.Array[MinecraftFilter]): Self = StObject.set(x, "all_of", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAll_ofUndefined: Self = StObject.set(x, "all_of", js.undefined)
    
    @scala.inline
    def setAll_ofVarargs(value: MinecraftFilter*): Self = StObject.set(x, "all_of", js.Array(value :_*))
    
    @scala.inline
    def setAny_of(value: js.Array[MinecraftFilter]): Self = StObject.set(x, "any_of", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAny_ofUndefined: Self = StObject.set(x, "any_of", js.undefined)
    
    @scala.inline
    def setAny_ofVarargs(value: MinecraftFilter*): Self = StObject.set(x, "any_of", js.Array(value :_*))
    
    @scala.inline
    def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    @scala.inline
    def setOperator(
      value: ExclamationmarkEqualssign | Lessthansign | LessthansignEqualssign | LessthansignGreaterthansign | Equalssign | EqualssignEqualssign | Greaterthansign | GreaterthansignEqualssign | equals | not
    ): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
    
    @scala.inline
    def setSubject(value: other | parent | player | self | target): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    @scala.inline
    def setTest(value: String): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
