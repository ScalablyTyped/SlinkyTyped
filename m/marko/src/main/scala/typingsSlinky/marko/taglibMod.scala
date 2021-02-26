package typingsSlinky.marko

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.marko.tagMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object taglibMod {
  
  @JSImport("marko/src/compiler/taglib-loader/Taglib", JSImport.Default)
  @js.native
  class default protected () extends Taglib {
    def this(filePath: String) = this()
  }
  
  @js.native
  trait Taglib extends StObject {
    
    def addAttribute(attribute: typingsSlinky.marko.attributeMod.default): Unit = js.native
    
    def addImport(path: String): Unit = js.native
    
    def addTag(tag: ^): Unit = js.native
    
    def addTextTransformer(transformer: typingsSlinky.marko.transformerMod.default): Unit = js.native
    
    def addTransformer(transformer: typingsSlinky.marko.transformerMod.default): Unit = js.native
    
    var attributeGroups: StringDictionary[typingsSlinky.marko.attributeMod.default] = js.native
    
    var attributes: StringDictionary[typingsSlinky.marko.attributeMod.default] = js.native
    
    var dirname: String = js.native
    
    var filePath: String = js.native
    
    def forEachTag(callback: js.Function1[/* tag */ ^, Unit]): Unit = js.native
    def forEachTag(callback: js.Function1[/* tag */ ^, Unit], thisObj: js.Any): Unit = js.native
    
    def getAttribute(name: String): js.UndefOr[typingsSlinky.marko.attributeMod.default] = js.native
    
    var id: String = js.native
    
    var imports: js.Any = js.native
    
    var importsLookup: js.Any = js.native
    
    var inputFilesLookup: js.Any = js.native
    
    /** @deprecated */
    var path: String = js.native
    
    var patternAttributes: js.Array[typingsSlinky.marko.attributeMod.default] = js.native
    
    var tags: StringDictionary[^] = js.native
    
    var textTransformers: js.Array[typingsSlinky.marko.transformerMod.default] = js.native
    
    def toJSON(): js.Any = js.native
    
    var transformers: js.Array[typingsSlinky.marko.transformerMod.default] = js.native
  }
}
