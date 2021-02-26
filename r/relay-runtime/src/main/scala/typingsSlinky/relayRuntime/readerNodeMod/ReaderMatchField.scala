package typingsSlinky.relayRuntime.readerNodeMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.relayRuntime.anon.FragmentName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.relayRuntime.readerNodeMod.ReaderSelection because Already inherited */ @js.native
trait ReaderMatchField extends ReaderField {
  
  // 'MatchField';
  val alias: js.UndefOr[String | Null] = js.native
  
  val args: js.UndefOr[js.Array[ReaderArgument] | Null] = js.native
  
  val kind: String = js.native
  
  val matchesByType: StringDictionary[FragmentName] = js.native
  
  val name: String = js.native
  
  val storageKey: js.UndefOr[String | Null] = js.native
}
object ReaderMatchField {
  
  @scala.inline
  def apply(kind: String, matchesByType: StringDictionary[FragmentName], name: String): ReaderMatchField = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], matchesByType = matchesByType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaderMatchField]
  }
  
  @scala.inline
  implicit class ReaderMatchFieldMutableBuilder[Self <: ReaderMatchField] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAliasNull: Self = StObject.set(x, "alias", null)
    
    @scala.inline
    def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
    
    @scala.inline
    def setArgs(value: js.Array[ReaderArgument]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgsNull: Self = StObject.set(x, "args", null)
    
    @scala.inline
    def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    @scala.inline
    def setArgsVarargs(value: ReaderArgument*): Self = StObject.set(x, "args", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchesByType(value: StringDictionary[FragmentName]): Self = StObject.set(x, "matchesByType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageKey(value: String): Self = StObject.set(x, "storageKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageKeyNull: Self = StObject.set(x, "storageKey", null)
    
    @scala.inline
    def setStorageKeyUndefined: Self = StObject.set(x, "storageKey", js.undefined)
  }
}
