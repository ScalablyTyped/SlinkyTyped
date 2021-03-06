package typingsSlinky.marko

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.marko.anon.AttributeGroups
import typingsSlinky.marko.anon.Name
import typingsSlinky.marko.tagMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object taglibLookupTaglibLookupMod {
  
  @JSImport("marko/src/compiler/taglib-lookup/TaglibLookup", JSImport.Default)
  @js.native
  class default () extends TaglibLookup
  
  @js.native
  trait Element extends StObject {
    
    var tagName: String = js.native
  }
  object Element {
    
    @scala.inline
    def apply(tagName: String): Element = {
      val __obj = js.Dynamic.literal(tagName = tagName.asInstanceOf[js.Any])
      __obj.asInstanceOf[Element]
    }
    
    @scala.inline
    implicit class ElementMutableBuilder[Self <: Element] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TaglibLookup extends StObject {
    
    def addTaglib(taglib: typingsSlinky.marko.taglibMod.default): Unit = js.native
    
    def forEachAttribute(
      tagName: String,
      callback: js.Function2[/* attrDef */ typingsSlinky.marko.attributeMod.default, /* tag */ ^, Unit]
    ): Unit = js.native
    
    def forEachNodeTransformer(node: js.Any, callback: js.Function1[/* trans */ typingsSlinky.marko.transformerMod.default, _]): Unit = js.native
    def forEachNodeTransformer(
      node: js.Any,
      callback: js.Function1[/* trans */ typingsSlinky.marko.transformerMod.default, _],
      thisObj: js.Any
    ): Unit = js.native
    
    def forEachTag(callback: js.Function1[/* tag */ ^, Unit | Boolean]): Unit = js.native
    
    def forEachTagTransformer(element: String, callback: js.Function1[/* trans */ typingsSlinky.marko.transformerMod.default, _]): Unit = js.native
    def forEachTagTransformer(
      element: String,
      callback: js.Function1[/* trans */ typingsSlinky.marko.transformerMod.default, _],
      thisObj: js.Any
    ): Unit = js.native
    def forEachTagTransformer(
      element: Element,
      callback: js.Function1[/* trans */ typingsSlinky.marko.transformerMod.default, _]
    ): Unit = js.native
    def forEachTagTransformer(
      element: Element,
      callback: js.Function1[/* trans */ typingsSlinky.marko.transformerMod.default, _],
      thisObj: js.Any
    ): Unit = js.native
    
    def forEachTemplateTransformer(callback: js.Function1[/* trans */ typingsSlinky.marko.transformerMod.default, _]): Unit = js.native
    def forEachTemplateTransformer(callback: js.Function1[/* trans */ typingsSlinky.marko.transformerMod.default, _], thisObj: js.Any): Unit = js.native
    
    def forEachTextTransformer(callback: js.Function1[/* trans */ typingsSlinky.marko.transformerMod.default, _]): Unit = js.native
    def forEachTextTransformer(callback: js.Function1[/* trans */ typingsSlinky.marko.transformerMod.default, _], thisObj: js.Any): Unit = js.native
    
    def getAttribute(element: String, attr: String): js.UndefOr[typingsSlinky.marko.attributeMod.default] = js.native
    def getAttribute(element: String, attr: Name): js.UndefOr[typingsSlinky.marko.attributeMod.default] = js.native
    def getAttribute(element: Element, attr: String): js.UndefOr[typingsSlinky.marko.attributeMod.default] = js.native
    def getAttribute(element: Element, attr: Name): js.UndefOr[typingsSlinky.marko.attributeMod.default] = js.native
    
    def getInputFiles(): js.Array[String] = js.native
    
    def getTag(element: String): js.UndefOr[^] = js.native
    def getTag(element: Element): js.UndefOr[^] = js.native
    
    def getTagsSorted(): js.Array[^] = js.native
    
    def hasTaglib(taglib: typingsSlinky.marko.taglibMod.default): Boolean = js.native
    
    var merged: AttributeGroups = js.native
    
    var taglibsById: StringDictionary[typingsSlinky.marko.taglibMod.default] = js.native
  }
}
