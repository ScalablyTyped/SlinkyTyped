package typingsSlinky.monacoEditor.mod.languages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typescript {
  
  type CompilerOptionsValue = js.UndefOr[
    java.lang.String | scala.Double | scala.Boolean | (js.Array[scala.Double | java.lang.String]) | typingsSlinky.monacoEditor.mod.languages.typescript.MapLike[js.Array[java.lang.String]] | scala.Null
  ]
  
  type IExtraLibs = org.scalablytyped.runtime.StringDictionary[typingsSlinky.monacoEditor.mod.languages.typescript.IExtraLib]
  
  type MapLike[T] = org.scalablytyped.runtime.StringDictionary[T]
  
  @scala.inline
  def getJavaScriptWorker(): js.Promise[
    js.Function1[
      /* repeated */ typingsSlinky.monacoEditor.mod.Uri, 
      js.Promise[typingsSlinky.monacoEditor.mod.languages.typescript.TypeScriptWorker]
    ]
  ] = typingsSlinky.monacoEditor.mod.languages.typescript.^.asInstanceOf[js.Dynamic].applyDynamic("getJavaScriptWorker")().asInstanceOf[js.Promise[
    js.Function1[
      /* repeated */ typingsSlinky.monacoEditor.mod.Uri, 
      js.Promise[typingsSlinky.monacoEditor.mod.languages.typescript.TypeScriptWorker]
    ]
  ]]
  
  @scala.inline
  def getTypeScriptWorker(): js.Promise[
    js.Function1[
      /* repeated */ typingsSlinky.monacoEditor.mod.Uri, 
      js.Promise[typingsSlinky.monacoEditor.mod.languages.typescript.TypeScriptWorker]
    ]
  ] = typingsSlinky.monacoEditor.mod.languages.typescript.^.asInstanceOf[js.Dynamic].applyDynamic("getTypeScriptWorker")().asInstanceOf[js.Promise[
    js.Function1[
      /* repeated */ typingsSlinky.monacoEditor.mod.Uri, 
      js.Promise[typingsSlinky.monacoEditor.mod.languages.typescript.TypeScriptWorker]
    ]
  ]]
  
  @scala.inline
  def javascriptDefaults: typingsSlinky.monacoEditor.mod.languages.typescript.LanguageServiceDefaults = typingsSlinky.monacoEditor.mod.languages.typescript.^.asInstanceOf[js.Dynamic].selectDynamic("javascriptDefaults").asInstanceOf[typingsSlinky.monacoEditor.mod.languages.typescript.LanguageServiceDefaults]
  
  @scala.inline
  def typescriptDefaults: typingsSlinky.monacoEditor.mod.languages.typescript.LanguageServiceDefaults = typingsSlinky.monacoEditor.mod.languages.typescript.^.asInstanceOf[js.Dynamic].selectDynamic("typescriptDefaults").asInstanceOf[typingsSlinky.monacoEditor.mod.languages.typescript.LanguageServiceDefaults]
  
  @scala.inline
  def typescriptVersion: java.lang.String = typingsSlinky.monacoEditor.mod.languages.typescript.^.asInstanceOf[js.Dynamic].selectDynamic("typescriptVersion").asInstanceOf[java.lang.String]
}
