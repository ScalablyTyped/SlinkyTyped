package typingsSlinky.marko.srcCompilerTaglibDashLookupTaglibLookupMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.marko.Anon_AttributeGroups
import typingsSlinky.marko.Anon_Name
import typingsSlinky.marko.srcCompilerTaglibDashLoaderTagMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaglibLookup extends js.Object {
  var merged: Anon_AttributeGroups = js.native
  var taglibsById: StringDictionary[typingsSlinky.marko.srcCompilerTaglibDashLoaderTaglibMod.default] = js.native
  def addTaglib(taglib: typingsSlinky.marko.srcCompilerTaglibDashLoaderTaglibMod.default): Unit = js.native
  def forEachAttribute(
    tagName: String,
    callback: js.Function2[
      /* attrDef */ typingsSlinky.marko.srcCompilerTaglibDashLoaderAttributeMod.default, 
      /* tag */ ^, 
      Unit
    ]
  ): Unit = js.native
  def forEachNodeTransformer(
    node: js.Any,
    callback: js.Function1[
      /* trans */ typingsSlinky.marko.srcCompilerTaglibDashLoaderTransformerMod.default, 
      _
    ]
  ): Unit = js.native
  def forEachNodeTransformer(
    node: js.Any,
    callback: js.Function1[
      /* trans */ typingsSlinky.marko.srcCompilerTaglibDashLoaderTransformerMod.default, 
      _
    ],
    thisObj: js.Any
  ): Unit = js.native
  def forEachTag(callback: js.Function1[/* tag */ ^, Unit | Boolean]): Unit = js.native
  def forEachTagTransformer(
    element: String,
    callback: js.Function1[
      /* trans */ typingsSlinky.marko.srcCompilerTaglibDashLoaderTransformerMod.default, 
      _
    ]
  ): Unit = js.native
  def forEachTagTransformer(
    element: String,
    callback: js.Function1[
      /* trans */ typingsSlinky.marko.srcCompilerTaglibDashLoaderTransformerMod.default, 
      _
    ],
    thisObj: js.Any
  ): Unit = js.native
  def forEachTagTransformer(
    element: Element,
    callback: js.Function1[
      /* trans */ typingsSlinky.marko.srcCompilerTaglibDashLoaderTransformerMod.default, 
      _
    ]
  ): Unit = js.native
  def forEachTagTransformer(
    element: Element,
    callback: js.Function1[
      /* trans */ typingsSlinky.marko.srcCompilerTaglibDashLoaderTransformerMod.default, 
      _
    ],
    thisObj: js.Any
  ): Unit = js.native
  def forEachTemplateTransformer(
    callback: js.Function1[
      /* trans */ typingsSlinky.marko.srcCompilerTaglibDashLoaderTransformerMod.default, 
      _
    ]
  ): Unit = js.native
  def forEachTemplateTransformer(
    callback: js.Function1[
      /* trans */ typingsSlinky.marko.srcCompilerTaglibDashLoaderTransformerMod.default, 
      _
    ],
    thisObj: js.Any
  ): Unit = js.native
  def forEachTextTransformer(
    callback: js.Function1[
      /* trans */ typingsSlinky.marko.srcCompilerTaglibDashLoaderTransformerMod.default, 
      _
    ]
  ): Unit = js.native
  def forEachTextTransformer(
    callback: js.Function1[
      /* trans */ typingsSlinky.marko.srcCompilerTaglibDashLoaderTransformerMod.default, 
      _
    ],
    thisObj: js.Any
  ): Unit = js.native
  def getAttribute(element: String, attr: String): js.UndefOr[typingsSlinky.marko.srcCompilerTaglibDashLoaderAttributeMod.default] = js.native
  def getAttribute(element: String, attr: Anon_Name): js.UndefOr[typingsSlinky.marko.srcCompilerTaglibDashLoaderAttributeMod.default] = js.native
  def getAttribute(element: Element, attr: String): js.UndefOr[typingsSlinky.marko.srcCompilerTaglibDashLoaderAttributeMod.default] = js.native
  def getAttribute(element: Element, attr: Anon_Name): js.UndefOr[typingsSlinky.marko.srcCompilerTaglibDashLoaderAttributeMod.default] = js.native
  def getInputFiles(): js.Array[String] = js.native
  def getTag(element: String): js.UndefOr[^] = js.native
  def getTag(element: Element): js.UndefOr[^] = js.native
  def getTagsSorted(): js.Array[^] = js.native
  def hasTaglib(taglib: typingsSlinky.marko.srcCompilerTaglibDashLoaderTaglibMod.default): Boolean = js.native
}

